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
import com.jeesite.modules.core.entity.CoreXmjts;
import com.jeesite.modules.core.service.CoreXmjtsService;

/**
 * 项目结题书Controller
 * @author tjh
 * @version 2025-01-20
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreXmjts")
public class CoreXmjtsController extends BaseController {

	@Autowired
	private CoreXmjtsService coreXmjtsService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreXmjts get(String id, boolean isNewRecord) {
		return coreXmjtsService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreXmjts:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreXmjts coreXmjts, Model model) {
		model.addAttribute("coreXmjts", coreXmjts);
		return "modules/core/coreXmjtsList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreXmjts:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreXmjts> listData(CoreXmjts coreXmjts, HttpServletRequest request, HttpServletResponse response) {
		coreXmjts.setPage(new Page<>(request, response));
		Page<CoreXmjts> page = coreXmjtsService.findPage(coreXmjts);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreXmjts:view")
	@RequestMapping(value = "form")
	public String form(CoreXmjts coreXmjts, Model model) {
		model.addAttribute("coreXmjts", coreXmjts);
		return "modules/core/coreXmjtsForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreXmjts:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreXmjts coreXmjts) {
		coreXmjtsService.save(coreXmjts);
		return renderResult(Global.TRUE, text("保存项目结题书成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreXmjts:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreXmjts coreXmjts) {
		coreXmjtsService.delete(coreXmjts);
		return renderResult(Global.TRUE, text("删除项目结题书成功！"));
	}
	
}