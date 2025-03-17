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
import com.jeesite.modules.core.entity.CoreWtfymxb;
import com.jeesite.modules.core.service.CoreWtfymxbService;

/**
 * 委托费用明细表Controller
 * @author tjh
 * @version 2025-01-12
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreWtfymxb")
public class CoreWtfymxbController extends BaseController {

	@Autowired
	private CoreWtfymxbService coreWtfymxbService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreWtfymxb get(String id, boolean isNewRecord) {
		return coreWtfymxbService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreWtfymxb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreWtfymxb coreWtfymxb, Model model) {
		model.addAttribute("coreWtfymxb", coreWtfymxb);
		return "modules/core/coreWtfymxbList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreWtfymxb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreWtfymxb> listData(CoreWtfymxb coreWtfymxb, HttpServletRequest request, HttpServletResponse response) {
		coreWtfymxb.setPage(new Page<>(request, response));
		Page<CoreWtfymxb> page = coreWtfymxbService.findPage(coreWtfymxb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreWtfymxb:view")
	@RequestMapping(value = "form")
	public String form(CoreWtfymxb coreWtfymxb, Model model) {
		model.addAttribute("coreWtfymxb", coreWtfymxb);
		return "modules/core/coreWtfymxbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreWtfymxb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreWtfymxb coreWtfymxb) {
		coreWtfymxbService.save(coreWtfymxb);
		return renderResult(Global.TRUE, text("保存委托费用明细表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreWtfymxb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreWtfymxb coreWtfymxb) {
		coreWtfymxbService.delete(coreWtfymxb);
		return renderResult(Global.TRUE, text("删除委托费用明细表成功！"));
	}
	
}