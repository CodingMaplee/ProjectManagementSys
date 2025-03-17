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
import com.jeesite.modules.core.entity.CoreWllyjl;
import com.jeesite.modules.core.service.CoreWllyjlService;

/**
 * 物料领用记录Controller
 * @author zhw
 * @version 2024-11-29
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreWllyjl")
public class CoreWllyjlController extends BaseController {

	@Autowired
	private CoreWllyjlService coreWllyjlService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreWllyjl get(String id, boolean isNewRecord) {
		return coreWllyjlService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreWllyjl:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreWllyjl coreWllyjl, Model model) {
		model.addAttribute("coreWllyjl", coreWllyjl);
		return "modules/core/coreWllyjlList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreWllyjl:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreWllyjl> listData(CoreWllyjl coreWllyjl, HttpServletRequest request, HttpServletResponse response) {
		coreWllyjl.setPage(new Page<>(request, response));
		Page<CoreWllyjl> page = coreWllyjlService.findPage(coreWllyjl);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreWllyjl:view")
	@RequestMapping(value = "form")
	public String form(CoreWllyjl coreWllyjl, Model model) {
		model.addAttribute("coreWllyjl", coreWllyjl);
		return "modules/core/coreWllyjlForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreWllyjl:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreWllyjl coreWllyjl) {
		coreWllyjlService.save(coreWllyjl);
		return renderResult(Global.TRUE, text("保存物料领用记录成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreWllyjl:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreWllyjl coreWllyjl) {
		coreWllyjlService.delete(coreWllyjl);
		return renderResult(Global.TRUE, text("删除物料领用记录成功！"));
	}
	
}