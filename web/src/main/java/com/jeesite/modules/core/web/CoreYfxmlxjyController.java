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
import com.jeesite.modules.core.entity.CoreYfxmlxjy;
import com.jeesite.modules.core.service.CoreYfxmlxjyService;

/**
 * 研发项目立项决议Controller
 * @author tjh
 * @version 2025-01-20
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreYfxmlxjy")
public class CoreYfxmlxjyController extends BaseController {

	@Autowired
	private CoreYfxmlxjyService coreYfxmlxjyService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreYfxmlxjy get(String id, boolean isNewRecord) {
		return coreYfxmlxjyService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreYfxmlxjy:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreYfxmlxjy coreYfxmlxjy, Model model) {
		model.addAttribute("coreYfxmlxjy", coreYfxmlxjy);
		return "modules/core/coreYfxmlxjyList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreYfxmlxjy:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreYfxmlxjy> listData(CoreYfxmlxjy coreYfxmlxjy, HttpServletRequest request, HttpServletResponse response) {
		coreYfxmlxjy.setPage(new Page<>(request, response));
		Page<CoreYfxmlxjy> page = coreYfxmlxjyService.findPage(coreYfxmlxjy);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreYfxmlxjy:view")
	@RequestMapping(value = "form")
	public String form(CoreYfxmlxjy coreYfxmlxjy, Model model) {
		model.addAttribute("coreYfxmlxjy", coreYfxmlxjy);
		return "modules/core/coreYfxmlxjyForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreYfxmlxjy:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreYfxmlxjy coreYfxmlxjy) {
		coreYfxmlxjyService.save(coreYfxmlxjy);
		return renderResult(Global.TRUE, text("保存研发项目立项决议成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreYfxmlxjy:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreYfxmlxjy coreYfxmlxjy) {
		coreYfxmlxjyService.delete(coreYfxmlxjy);
		return renderResult(Global.TRUE, text("删除研发项目立项决议成功！"));
	}
	
}