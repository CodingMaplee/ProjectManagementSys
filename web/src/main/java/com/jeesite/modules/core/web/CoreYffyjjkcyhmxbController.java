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
import com.jeesite.modules.core.entity.CoreYffyjjkcyhmxb;
import com.jeesite.modules.core.service.CoreYffyjjkcyhmxbService;

/**
 * 研发费用加计扣除优惠明细表Controller
 * @author tjh
 * @version 2025-01-20
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreYffyjjkcyhmxb")
public class CoreYffyjjkcyhmxbController extends BaseController {

	@Autowired
	private CoreYffyjjkcyhmxbService coreYffyjjkcyhmxbService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreYffyjjkcyhmxb get(String id, boolean isNewRecord) {
		return coreYffyjjkcyhmxbService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreYffyjjkcyhmxb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreYffyjjkcyhmxb coreYffyjjkcyhmxb, Model model) {
		model.addAttribute("coreYffyjjkcyhmxb", coreYffyjjkcyhmxb);
		return "modules/core/coreYffyjjkcyhmxbList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreYffyjjkcyhmxb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreYffyjjkcyhmxb> listData(CoreYffyjjkcyhmxb coreYffyjjkcyhmxb, HttpServletRequest request, HttpServletResponse response) {
		coreYffyjjkcyhmxb.setPage(new Page<>(request, response));
		Page<CoreYffyjjkcyhmxb> page = coreYffyjjkcyhmxbService.findPage(coreYffyjjkcyhmxb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreYffyjjkcyhmxb:view")
	@RequestMapping(value = "form")
	public String form(CoreYffyjjkcyhmxb coreYffyjjkcyhmxb, Model model) {
		model.addAttribute("coreYffyjjkcyhmxb", coreYffyjjkcyhmxb);
		return "modules/core/coreYffyjjkcyhmxbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreYffyjjkcyhmxb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreYffyjjkcyhmxb coreYffyjjkcyhmxb) {
		coreYffyjjkcyhmxbService.save(coreYffyjjkcyhmxb);
		return renderResult(Global.TRUE, text("保存研发费用加计扣除优惠明细表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreYffyjjkcyhmxb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreYffyjjkcyhmxb coreYffyjjkcyhmxb) {
		coreYffyjjkcyhmxbService.delete(coreYffyjjkcyhmxb);
		return renderResult(Global.TRUE, text("删除研发费用加计扣除优惠明细表成功！"));
	}
	
}