package com.jeesite.modules.core.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jeesite.common.lang.DateUtils;
import com.jeesite.modules.sys.entity.EmpUser;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.core.entity.CoreYfgstmb;
import com.jeesite.modules.core.service.CoreYfgstmbService;

import java.io.IOException;
import com.jeesite.common.collect.ListUtils;
import com.jeesite.common.utils.excel.ExcelExport;
import com.jeesite.common.utils.excel.ExcelImport;
import org.apache.poi.ss.usermodel.Row;
import java.io.File;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * 研发工时条目表Controller
 * @author zhw
 * @version 2024-12-20
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreYfgstmb")
public class CoreYfgstmbController extends BaseController {

	@Autowired
	private CoreYfgstmbService coreYfgstmbService;

	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreYfgstmb get(String id, boolean isNewRecord) {
		return coreYfgstmbService.get(id, isNewRecord);
	}

	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreYfgstmb coreYfgstmb, Model model) {
		model.addAttribute("coreYfgstmb", coreYfgstmb);
		return "modules/core/coreYfgstmbList";
	}

	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreYfgstmb> listData(CoreYfgstmb coreYfgstmb, HttpServletRequest request, HttpServletResponse response) {
		coreYfgstmb.setPage(new Page<>(request, response));
		Page<CoreYfgstmb> page = coreYfgstmbService.findPage(coreYfgstmb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "form")
	public String form(CoreYfgstmb coreYfgstmb, Model model) {
		model.addAttribute("coreYfgstmb", coreYfgstmb);
		return "modules/core/coreYfgstmbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreXmglxxb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreYfgstmb coreYfgstmb) {
		coreYfgstmbService.save(coreYfgstmb);
		return renderResult(Global.TRUE, text("保存研发工时条目表成功！"));
	}

	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreXmglxxb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreYfgstmb coreYfgstmb) {
		coreYfgstmbService.delete(coreYfgstmb);
		return renderResult(Global.TRUE, text("删除研发工时条目表成功！"));
	}

	/**
	 * 导出工时条目表Excel
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping("/exportExcel")
	public void exportExcel(HttpServletResponse response,
							@RequestParam String currentDate,
							@RequestParam String projectName,
							@RequestParam String projectId) throws IOException {
		// 获取数据
		CoreYfgstmb coreYfgstmb = new CoreYfgstmb();  // 根据需要设置查询条件
		coreYfgstmb.setWeekStartDate(currentDate);
		coreYfgstmb.setProjectId(projectId);
		List<CoreYfgstmb> dataList = coreYfgstmbService.findList(coreYfgstmb);
		String fileName = "工时周记数据" + DateUtils.getDate("yyyyMMddHHmmss") + ".xlsx";

		// 设置日期和项目名称
		// 创建 ExcelExport 对象
		try(ExcelExport ee = new ExcelExport(currentDate+"    项目_"+projectName, CoreYfgstmb.class)){
			ee.setDataList(dataList);
			// 添加合计行
			Row footerRow = ee.addRow();
			ee.addCell(footerRow, 0, "合计");
			// 合计各列工时数据
			double totalMonday = dataList.stream()
					.mapToDouble(e -> e.getMondayHours() != null ? e.getMondayHours() : 0.0)
					.sum();
			double totalTuesday = dataList.stream()
					.mapToDouble(e -> e.getTuesdayHours() != null ? e.getTuesdayHours() : 0.0)
					.sum();
			double totalWednesday = dataList.stream()
					.mapToDouble(e -> e.getWednesdayHours() != null ? e.getWednesdayHours() : 0.0)
					.sum();
			double totalThursday = dataList.stream()
					.mapToDouble(e -> e.getThursdayHours() != null ? e.getThursdayHours() : 0.0)
					.sum();
			double totalFriday = dataList.stream()
					.mapToDouble(e -> e.getFridayHours() != null ? e.getFridayHours() : 0.0)
					.sum();
			double totalSaturday = dataList.stream()
					.mapToDouble(e -> e.getSaturdayHours() != null ? e.getSaturdayHours() : 0.0)
					.sum();
			double totalSunday = dataList.stream()
					.mapToDouble(e -> e.getSundayHours() != null ? e.getSundayHours() : 0.0)
					.sum();

			double totalOverall = totalMonday+totalTuesday+totalWednesday+
					totalThursday+totalFriday+totalSaturday+totalSunday;

			ee.addCell(footerRow, 1, totalMonday);
			ee.addCell(footerRow, 2, totalTuesday);
			ee.addCell(footerRow, 3, totalWednesday);
			ee.addCell(footerRow, 4, totalThursday);
			ee.addCell(footerRow, 5, totalFriday);
			ee.addCell(footerRow, 6, totalSaturday);
			ee.addCell(footerRow, 7, totalSunday);
			ee.addCell(footerRow, 8, totalOverall);

			// 输出到客户端
			ee.write(response, fileName);
		}


	}
}