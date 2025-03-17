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
import com.jeesite.modules.core.entity.CoreLxjhs;
import com.jeesite.modules.core.service.CoreLxjhsService;

/**
 * 立项计划书Controller
 * @author tjh
 * @version 2025-01-20
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreLxjhs")
public class CoreLxjhsController extends BaseController {

	@Autowired
	private CoreLxjhsService coreLxjhsService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreLxjhs get(String id, boolean isNewRecord) {
		return coreLxjhsService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreLxjhs:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreLxjhs coreLxjhs, Model model) {
		model.addAttribute("coreLxjhs", coreLxjhs);
		return "modules/core/coreLxjhsList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreLxjhs:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreLxjhs> listData(CoreLxjhs coreLxjhs, HttpServletRequest request, HttpServletResponse response) {
		coreLxjhs.setPage(new Page<>(request, response));
		Page<CoreLxjhs> page = coreLxjhsService.findPage(coreLxjhs);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreLxjhs:view")
	@RequestMapping(value = "form")
	public String form(CoreLxjhs coreLxjhs, Model model) {
		model.addAttribute("coreLxjhs", coreLxjhs);
		return "modules/core/coreLxjhsForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreLxjhs:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreLxjhs coreLxjhs) {
		coreLxjhsService.save(coreLxjhs);
		return renderResult(Global.TRUE, text("保存立项计划书成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreLxjhs:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreLxjhs coreLxjhs) {
		coreLxjhsService.delete(coreLxjhs);
		return renderResult(Global.TRUE, text("删除立项计划书成功！"));
	}
	
}