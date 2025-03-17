package com.jeesite.modules.core.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.jeesite.modules.core.entity.CoreYfgstjb;
import com.jeesite.modules.core.service.CoreYfgstjbService;
import com.jeesite.modules.core.service.CoreXmglxxbService;

/**
 * 研发工时统计表Controller
 * @author zhw
 * @version 2024-12-18
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreYfgstjb")
public class CoreYfgstjbController extends BaseController {

	@Autowired
	private CoreYfgstjbService coreYfgstjbService;
	@Autowired
	private CoreXmglxxbService coreXmglxxbService;
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreYfgstjb get(String id, boolean isNewRecord) {
		return coreYfgstjbService.get(id, isNewRecord);
	}

	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreYfgstjb coreYfgstjb, Model model) {
		model.addAttribute("coreYfgstjb", coreYfgstjb);
		return "modules/core/coreYfgstjbList";
	}

	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreYfgstjb> listData(CoreYfgstjb coreYfgstjb, HttpServletRequest request, HttpServletResponse response) {
		coreYfgstjb.setPage(new Page<>(request, response));
		Page<CoreYfgstjb> page = coreYfgstjbService.findPage(coreYfgstjb);

		// 在返回的数据中添加项目名称
		for (CoreYfgstjb record : page.getList()) {
			String projectName = coreXmglxxbService.getProjectNameById(record.getYfgstjbXmid()); // 假设有此方法
			String projectCode = coreXmglxxbService.getProjectCodeById(record.getYfgstjbXmid()); // 假设有此方法

			record.setProjectName(projectName);  // 为每个记录添加项目名称字段
			record.setProjectCode(projectCode);
		}
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "form")
	public String form(CoreYfgstjb coreYfgstjb, Model model) {
		model.addAttribute("coreYfgstjb", coreYfgstjb);
		return "modules/core/coreYfgstjbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreXmglxxb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreYfgstjb coreYfgstjb) {
		// 获取前端传来的开始日期和结束日期
		String startDate = coreYfgstjb.getYfgstjbGzrqStart(); // 起始日期（周一）
		String endDate = coreYfgstjb.getYfgstjbGzrqEnd(); // 结束日期（周日）
		String projectId = coreYfgstjb.getYfgstjbXmid(); // 项目ID

		if (startDate != null && endDate != null) {
			// 检查日期范围是否有重叠


			// 拼接日期范围并赋值给 yfgstjbGzrq 字段
			String dateRange = startDate + " - " + endDate;
			coreYfgstjb.setYfgstjbGzrq(dateRange);  // 赋值给隐藏字段
		}
		coreYfgstjbService.save(coreYfgstjb);
		return renderResult(Global.TRUE, text("保存研发工时统计表成功！"));
	}

	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreXmglxxb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreYfgstjb coreYfgstjb) {
		coreYfgstjbService.delete(coreYfgstjb);
		return renderResult(Global.TRUE, text("删除研发工时统计表成功！"));
	}


}