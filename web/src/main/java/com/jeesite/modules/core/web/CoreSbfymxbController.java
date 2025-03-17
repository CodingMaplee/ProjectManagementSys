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
import com.jeesite.modules.core.entity.CoreSbfymxb;
import com.jeesite.modules.core.service.CoreSbfymxbService;

/**
 * 设备费用明细表Controller
 * @author tjh
 * @version 2025-01-12
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreSbfymxb")
public class CoreSbfymxbController extends BaseController {

	@Autowired
	private CoreSbfymxbService coreSbfymxbService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreSbfymxb get(String id, boolean isNewRecord) {
		return coreSbfymxbService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreSbfymxb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreSbfymxb coreSbfymxb, Model model) {
		model.addAttribute("coreSbfymxb", coreSbfymxb);
		return "modules/core/coreSbfymxbList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreSbfymxb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreSbfymxb> listData(CoreSbfymxb coreSbfymxb, HttpServletRequest request, HttpServletResponse response) {
		coreSbfymxb.setPage(new Page<>(request, response));
		Page<CoreSbfymxb> page = coreSbfymxbService.findPage(coreSbfymxb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreSbfymxb:view")
	@RequestMapping(value = "form")
	public String form(CoreSbfymxb coreSbfymxb, Model model) {
		model.addAttribute("coreSbfymxb", coreSbfymxb);
		return "modules/core/coreSbfymxbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreSbfymxb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreSbfymxb coreSbfymxb) {
		coreSbfymxbService.save(coreSbfymxb);
		return renderResult(Global.TRUE, text("保存设备费用明细表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreSbfymxb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreSbfymxb coreSbfymxb) {
		coreSbfymxbService.delete(coreSbfymxb);
		return renderResult(Global.TRUE, text("删除设备费用明细表成功！"));
	}
	
}