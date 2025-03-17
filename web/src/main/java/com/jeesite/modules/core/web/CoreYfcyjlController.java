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
import com.jeesite.modules.core.entity.CoreYfcyjl;
import com.jeesite.modules.core.service.CoreYfcyjlService;

/**
 * 研发参与记录Controller
 * @author tjh
 * @version 2025-01-17
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreYfcyjl")
public class CoreYfcyjlController extends BaseController {

	@Autowired
	private CoreYfcyjlService coreYfcyjlService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreYfcyjl get(String id, boolean isNewRecord) {
		return coreYfcyjlService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreYfcyjl:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreYfcyjl coreYfcyjl, Model model) {
		model.addAttribute("coreYfcyjl", coreYfcyjl);
		return "modules/core/coreYfcyjlList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreYfcyjl:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreYfcyjl> listData(CoreYfcyjl coreYfcyjl, HttpServletRequest request, HttpServletResponse response) {
		coreYfcyjl.setPage(new Page<>(request, response));
		Page<CoreYfcyjl> page = coreYfcyjlService.findPage(coreYfcyjl);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreYfcyjl:view")
	@RequestMapping(value = "form")
	public String form(CoreYfcyjl coreYfcyjl, Model model) {
		model.addAttribute("coreYfcyjl", coreYfcyjl);
		return "modules/core/coreYfcyjlForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreYfcyjl:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreYfcyjl coreYfcyjl) {
		coreYfcyjlService.save(coreYfcyjl);
		return renderResult(Global.TRUE, text("保存研发参与记录成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreYfcyjl:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreYfcyjl coreYfcyjl) {
		coreYfcyjlService.delete(coreYfcyjl);
		return renderResult(Global.TRUE, text("删除研发参与记录成功！"));
	}
	
}