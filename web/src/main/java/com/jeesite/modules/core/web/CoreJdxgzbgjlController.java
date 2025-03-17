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
import com.jeesite.modules.core.entity.CoreJdxgzbgjl;
import com.jeesite.modules.core.service.CoreJdxgzbgjlService;

/**
 * 阶段性工作报告记录Controller
 * @author tjh
 * @version 2025-01-21
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreJdxgzbgjl")
public class CoreJdxgzbgjlController extends BaseController {

	@Autowired
	private CoreJdxgzbgjlService coreJdxgzbgjlService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreJdxgzbgjl get(String id, boolean isNewRecord) {
		return coreJdxgzbgjlService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreJdxgzbgjl:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreJdxgzbgjl coreJdxgzbgjl, Model model) {
		model.addAttribute("coreJdxgzbgjl", coreJdxgzbgjl);
		return "modules/core/coreJdxgzbgjlList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreJdxgzbgjl:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreJdxgzbgjl> listData(CoreJdxgzbgjl coreJdxgzbgjl, HttpServletRequest request, HttpServletResponse response) {
		coreJdxgzbgjl.setPage(new Page<>(request, response));
		Page<CoreJdxgzbgjl> page = coreJdxgzbgjlService.findPage(coreJdxgzbgjl);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreJdxgzbgjl:view")
	@RequestMapping(value = "form")
	public String form(CoreJdxgzbgjl coreJdxgzbgjl, Model model) {
		model.addAttribute("coreJdxgzbgjl", coreJdxgzbgjl);
		return "modules/core/coreJdxgzbgjlForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreJdxgzbgjl:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreJdxgzbgjl coreJdxgzbgjl) {
		coreJdxgzbgjlService.save(coreJdxgzbgjl);
		return renderResult(Global.TRUE, text("保存阶段性工作报告记录成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreJdxgzbgjl:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreJdxgzbgjl coreJdxgzbgjl) {
		coreJdxgzbgjlService.delete(coreJdxgzbgjl);
		return renderResult(Global.TRUE, text("删除阶段性工作报告记录成功！"));
	}
	
}