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
import com.jeesite.modules.core.entity.CoreLxjy;
import com.jeesite.modules.core.service.CoreLxjyService;

/**
 * 立项决议Controller
 * @author tjh
 * @version 2025-01-20
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreLxjy")
public class CoreLxjyController extends BaseController {

	@Autowired
	private CoreLxjyService coreLxjyService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreLxjy get(String id, boolean isNewRecord) {
		return coreLxjyService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreLxjy:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreLxjy coreLxjy, Model model) {
		model.addAttribute("coreLxjy", coreLxjy);
		return "modules/core/coreLxjyList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreLxjy:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreLxjy> listData(CoreLxjy coreLxjy, HttpServletRequest request, HttpServletResponse response) {
		coreLxjy.setPage(new Page<>(request, response));
		Page<CoreLxjy> page = coreLxjyService.findPage(coreLxjy);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreLxjy:view")
	@RequestMapping(value = "form")
	public String form(CoreLxjy coreLxjy, Model model) {
		model.addAttribute("coreLxjy", coreLxjy);
		return "modules/core/coreLxjyForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreLxjy:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreLxjy coreLxjy) {
		coreLxjyService.save(coreLxjy);
		return renderResult(Global.TRUE, text("保存立项决议成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreLxjy:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreLxjy coreLxjy) {
		coreLxjyService.delete(coreLxjy);
		return renderResult(Global.TRUE, text("删除立项决议成功！"));
	}
	
}