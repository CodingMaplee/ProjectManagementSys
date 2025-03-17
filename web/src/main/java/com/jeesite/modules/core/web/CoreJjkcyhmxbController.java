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
import com.jeesite.modules.core.entity.CoreJjkcyhmxb;
import com.jeesite.modules.core.service.CoreJjkcyhmxbService;

/**
 * 加计扣除优惠明细表Controller
 * @author tjh
 * @version 2025-01-12
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreJjkcyhmxb")
public class CoreJjkcyhmxbController extends BaseController {

	@Autowired
	private CoreJjkcyhmxbService coreJjkcyhmxbService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreJjkcyhmxb get(String id, boolean isNewRecord) {
		return coreJjkcyhmxbService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreJjkcyhmxb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreJjkcyhmxb coreJjkcyhmxb, Model model) {
		model.addAttribute("coreJjkcyhmxb", coreJjkcyhmxb);
		return "modules/core/coreJjkcyhmxbList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreJjkcyhmxb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreJjkcyhmxb> listData(CoreJjkcyhmxb coreJjkcyhmxb, HttpServletRequest request, HttpServletResponse response) {
		coreJjkcyhmxb.setPage(new Page<>(request, response));
		Page<CoreJjkcyhmxb> page = coreJjkcyhmxbService.findPage(coreJjkcyhmxb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreJjkcyhmxb:view")
	@RequestMapping(value = "form")
	public String form(CoreJjkcyhmxb coreJjkcyhmxb, Model model) {
		model.addAttribute("coreJjkcyhmxb", coreJjkcyhmxb);
		return "modules/core/coreJjkcyhmxbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreJjkcyhmxb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreJjkcyhmxb coreJjkcyhmxb) {
		coreJjkcyhmxbService.save(coreJjkcyhmxb);
		return renderResult(Global.TRUE, text("保存加计扣除优惠明细表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreJjkcyhmxb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreJjkcyhmxb coreJjkcyhmxb) {
		coreJjkcyhmxbService.delete(coreJjkcyhmxb);
		return renderResult(Global.TRUE, text("删除加计扣除优惠明细表成功！"));
	}
	
}