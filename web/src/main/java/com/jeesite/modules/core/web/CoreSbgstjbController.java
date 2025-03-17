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
import com.jeesite.modules.core.entity.CoreSbgstjb;
import com.jeesite.modules.core.service.CoreSbgstjbService;
import com.jeesite.modules.core.service.CoreXmglxxbService;
/**
 * 研发工时统计表Controller
 * @author zhw
 * @version 2024-12-18
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreSbgstjb")
public class CoreSbgstjbController extends BaseController {

	@Autowired
	private CoreSbgstjbService coreSbgstjbService;
	@Autowired
	private CoreXmglxxbService coreXmglxxbService;
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreSbgstjb get(String id, boolean isNewRecord) {
		return coreSbgstjbService.get(id, isNewRecord);
	}

	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreSbgstjb coreSbgstjb, Model model) {
		model.addAttribute("coreSbgstjb", coreSbgstjb);
		return "modules/core/coreSbgstjbList";
	}

	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreSbgstjb> listData(CoreSbgstjb coreSbgstjb, HttpServletRequest request, HttpServletResponse response) {
		coreSbgstjb.setPage(new Page<>(request, response));
		Page<CoreSbgstjb> page = coreSbgstjbService.findPage(coreSbgstjb);

		// 在返回的数据中添加项目名称
		for (CoreSbgstjb record : page.getList()) {
			String projectName = coreXmglxxbService.getProjectNameById(record.getSbgstjbXmid()); // 假设有此方法
			String projectCode = coreXmglxxbService.getProjectCodeById(record.getSbgstjbXmid()); // 假设有此方法

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
	public String form(CoreSbgstjb coreSbgstjb, Model model) {
		model.addAttribute("coreSbgstjb", coreSbgstjb);
		return "modules/core/coreSbgstjbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreXmglxxb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreSbgstjb coreSbgstjb) {
		coreSbgstjbService.save(coreSbgstjb);
		return renderResult(Global.TRUE, text("保存研发工时统计表成功！"));
	}

	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreXmglxxb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreSbgstjb coreSbgstjb) {
		coreSbgstjbService.delete(coreSbgstjb);
		return renderResult(Global.TRUE, text("删除研发工时统计表成功！"));
	}

}