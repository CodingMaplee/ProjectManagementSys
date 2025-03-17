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
import com.jeesite.modules.core.entity.CoreLxsps;
import com.jeesite.modules.core.service.CoreLxspsService;

/**
 * 立项审批书Controller
 * @author tjh
 * @version 2025-01-19
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreLxsps")
public class CoreLxspsController extends BaseController {

	@Autowired
	private CoreLxspsService coreLxspsService;

	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreLxsps get(String id, boolean isNewRecord) {
		return coreLxspsService.get(id, isNewRecord);
	}

	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreLxsps:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreLxsps coreLxsps, Model model) {
		model.addAttribute("coreLxsps", coreLxsps);
		return "modules/core/coreLxspsList";
	}

	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreLxsps:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreLxsps> listData(CoreLxsps coreLxsps, HttpServletRequest request, HttpServletResponse response) {
		coreLxsps.setPage(new Page<>(request, response));
		Page<CoreLxsps> page = coreLxspsService.findPage(coreLxsps);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreLxsps:view")
	@RequestMapping(value = "form")
	public String form(CoreLxsps coreLxsps, Model model) {
		model.addAttribute("coreLxsps", coreLxsps);
		return "modules/core/coreLxspsForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreLxsps:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreLxsps coreLxsps) {
		coreLxspsService.save(coreLxsps);
		return renderResult(Global.TRUE, text("保存立项审批书成功！"));
	}

	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreLxsps:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreLxsps coreLxsps) {
		coreLxspsService.delete(coreLxsps);
		return renderResult(Global.TRUE, text("删除立项审批书成功！"));
	}

}