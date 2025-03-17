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
import com.jeesite.modules.core.entity.CoreYflljl;
import com.jeesite.modules.core.service.CoreYflljlService;

/**
 * 研发领料记录Controller
 * @author zhw
 * @version 2024-11-29
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreYflljl")
public class CoreYflljlController extends BaseController {

	@Autowired
	private CoreYflljlService coreYflljlService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreYflljl get(String id, boolean isNewRecord) {
		return coreYflljlService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreYflljl:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreYflljl coreYflljl, Model model) {
		model.addAttribute("coreYflljl", coreYflljl);
		return "modules/core/coreYflljlList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreYflljl:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreYflljl> listData(CoreYflljl coreYflljl, HttpServletRequest request, HttpServletResponse response) {
		coreYflljl.setPage(new Page<>(request, response));
		Page<CoreYflljl> page = coreYflljlService.findPage(coreYflljl);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreYflljl:view")
	@RequestMapping(value = "form")
	public String form(CoreYflljl coreYflljl, Model model) {
		model.addAttribute("coreYflljl", coreYflljl);
		return "modules/core/coreYflljlForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreYflljl:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreYflljl coreYflljl) {
		coreYflljlService.save(coreYflljl);
		return renderResult(Global.TRUE, text("保存研发领料记录成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreYflljl:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreYflljl coreYflljl) {
		coreYflljlService.delete(coreYflljl);
		return renderResult(Global.TRUE, text("删除研发领料记录成功！"));
	}
	
}