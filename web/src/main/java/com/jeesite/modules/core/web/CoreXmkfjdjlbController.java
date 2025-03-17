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
import com.jeesite.modules.core.entity.CoreXmkfjdjlb;
import com.jeesite.modules.core.service.CoreXmkfjdjlbService;

/**
 * 项目开发进度记录表Controller
 * @author tjh
 * @version 2025-01-21
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreXmkfjdjlb")
public class CoreXmkfjdjlbController extends BaseController {

	@Autowired
	private CoreXmkfjdjlbService coreXmkfjdjlbService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreXmkfjdjlb get(String id, boolean isNewRecord) {
		return coreXmkfjdjlbService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreXmkfjdjlb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreXmkfjdjlb coreXmkfjdjlb, Model model) {
		model.addAttribute("coreXmkfjdjlb", coreXmkfjdjlb);
		return "modules/core/coreXmkfjdjlbList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreXmkfjdjlb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreXmkfjdjlb> listData(CoreXmkfjdjlb coreXmkfjdjlb, HttpServletRequest request, HttpServletResponse response) {
		coreXmkfjdjlb.setPage(new Page<>(request, response));
		Page<CoreXmkfjdjlb> page = coreXmkfjdjlbService.findPage(coreXmkfjdjlb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreXmkfjdjlb:view")
	@RequestMapping(value = "form")
	public String form(CoreXmkfjdjlb coreXmkfjdjlb, Model model) {
		model.addAttribute("coreXmkfjdjlb", coreXmkfjdjlb);
		return "modules/core/coreXmkfjdjlbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreXmkfjdjlb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreXmkfjdjlb coreXmkfjdjlb) {
		coreXmkfjdjlbService.save(coreXmkfjdjlb);
		return renderResult(Global.TRUE, text("保存项目开发进度记录表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreXmkfjdjlb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreXmkfjdjlb coreXmkfjdjlb) {
		coreXmkfjdjlbService.delete(coreXmkfjdjlb);
		return renderResult(Global.TRUE, text("删除项目开发进度记录表成功！"));
	}
	
}