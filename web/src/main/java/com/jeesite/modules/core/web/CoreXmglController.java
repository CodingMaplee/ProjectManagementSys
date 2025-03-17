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
import com.jeesite.modules.core.entity.CoreXmgl;
import com.jeesite.modules.core.service.CoreXmglService;

/**
 * 项目管理Controller
 * @author tjh
 * @version 2025-01-12
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreXmgl")
public class CoreXmglController extends BaseController {

	@Autowired
	private CoreXmglService coreXmglService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreXmgl get(String id, boolean isNewRecord) {
		return coreXmglService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreXmgl:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreXmgl coreXmgl, Model model) {
		model.addAttribute("coreXmgl", coreXmgl);
		return "modules/core/coreXmglList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreXmgl:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreXmgl> listData(CoreXmgl coreXmgl, HttpServletRequest request, HttpServletResponse response) {
		coreXmgl.setPage(new Page<>(request, response));
		Page<CoreXmgl> page = coreXmglService.findPage(coreXmgl);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreXmgl:view")
	@RequestMapping(value = "form")
	public String form(CoreXmgl coreXmgl, Model model) {
		model.addAttribute("coreXmgl", coreXmgl);
		return "modules/core/coreXmglForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreXmgl:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreXmgl coreXmgl) {
		coreXmglService.save(coreXmgl);
		return renderResult(Global.TRUE, text("保存项目管理成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreXmgl:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreXmgl coreXmgl) {
		coreXmglService.delete(coreXmgl);
		return renderResult(Global.TRUE, text("删除项目管理成功！"));
	}
	
}