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
import com.jeesite.modules.core.entity.CoreZscqgl;
import com.jeesite.modules.core.service.CoreZscqglService;

/**
 * 知识产权管理Controller
 * @author zhw
 * @version 2024-11-28
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreZscqgl")
public class CoreZscqglController extends BaseController {

	@Autowired
	private CoreZscqglService coreZscqglService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreZscqgl get(String id, boolean isNewRecord) {
		return coreZscqglService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreZscqgl:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreZscqgl coreZscqgl, Model model) {
		model.addAttribute("coreZscqgl", coreZscqgl);
		return "modules/core/coreZscqglList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreZscqgl:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreZscqgl> listData(CoreZscqgl coreZscqgl, HttpServletRequest request, HttpServletResponse response) {
		coreZscqgl.setPage(new Page<>(request, response));
		Page<CoreZscqgl> page = coreZscqglService.findPage(coreZscqgl);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreZscqgl:view")
	@RequestMapping(value = "form")
	public String form(CoreZscqgl coreZscqgl, Model model) {
		model.addAttribute("coreZscqgl", coreZscqgl);
		return "modules/core/coreZscqglForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreZscqgl:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreZscqgl coreZscqgl) {
		coreZscqglService.save(coreZscqgl);
		return renderResult(Global.TRUE, text("保存知识产权管理成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreZscqgl:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreZscqgl coreZscqgl) {
		coreZscqglService.delete(coreZscqgl);
		return renderResult(Global.TRUE, text("删除知识产权管理成功！"));
	}
	
}