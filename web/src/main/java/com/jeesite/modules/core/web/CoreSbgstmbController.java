package com.jeesite.modules.core.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jeesite.common.lang.DateUtils;
import com.jeesite.common.utils.excel.ExcelExport;
import com.jeesite.modules.core.entity.CoreSbgstmb;
import org.apache.poi.ss.usermodel.Row;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.core.entity.CoreSbgstmb;
import com.jeesite.modules.core.service.CoreSbgstmbService;

/**
 * 设备工时条目表Controller
 * @author zhw
 * @version 2024-12-20
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreSbgstmb")
public class CoreSbgstmbController extends BaseController {

	@Autowired
	private CoreSbgstmbService coreSbgstmbService;

	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreSbgstmb get(String id, boolean isNewRecord) {
		return coreSbgstmbService.get(id, isNewRecord);
	}

	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreSbgstmb coreSbgstmb, Model model) {
		model.addAttribute("coreSbgstmb", coreSbgstmb);
		return "modules/core/coreSbgstmbList";
	}

	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreSbgstmb> listData(CoreSbgstmb coreSbgstmb, HttpServletRequest request, HttpServletResponse response) {
		coreSbgstmb.setPage(new Page<>(request, response));
		Page<CoreSbgstmb> page = coreSbgstmbService.findPage(coreSbgstmb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "form")
	public String form(CoreSbgstmb coreSbgstmb, Model model) {
		model.addAttribute("coreSbgstmb", coreSbgstmb);
		return "modules/core/coreSbgstmbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreXmglxxb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreSbgstmb coreSbgstmb) {
		coreSbgstmbService.save(coreSbgstmb);
		return renderResult(Global.TRUE, text("保存设备工时条目表成功！"));
	}

	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreXmglxxb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreSbgstmb coreSbgstmb) {
		coreSbgstmbService.delete(coreSbgstmb);
		return renderResult(Global.TRUE, text("删除设备工时条目表成功！"));
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
		CoreSbgstmb coreSbgstmb = new CoreSbgstmb();  // 根据需要设置查询条件
		coreSbgstmb.setWeekStartDate(currentDate);
		coreSbgstmb.setProjectId(projectId);
		List<CoreSbgstmb> dataList = coreSbgstmbService.findList(coreSbgstmb);
		String fileName = "工时周记数据" + DateUtils.getDate("yyyyMMddHHmmss") + ".xlsx";

		// 设置日期和项目名称
		// 创建 ExcelExport 对象
		try(ExcelExport ee = new ExcelExport(currentDate+"    项目_"+projectName, CoreSbgstmb.class)){
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