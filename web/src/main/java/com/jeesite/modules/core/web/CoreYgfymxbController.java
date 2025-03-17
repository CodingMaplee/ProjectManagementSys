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
import com.jeesite.modules.core.entity.CoreYgfymxb;
import com.jeesite.modules.core.service.CoreYgfymxbService;

/**
 * 员工费用明细表Controller
 * @author tjh
 * @version 2025-01-12
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreYgfymxb")
public class CoreYgfymxbController extends BaseController {

	@Autowired
	private CoreYgfymxbService coreYgfymxbService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreYgfymxb get(String id, boolean isNewRecord) {
		return coreYgfymxbService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreYgfymxb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreYgfymxb coreYgfymxb, Model model) {
		model.addAttribute("coreYgfymxb", coreYgfymxb);
		return "modules/core/coreYgfymxbList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreYgfymxb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreYgfymxb> listData(CoreYgfymxb coreYgfymxb, HttpServletRequest request, HttpServletResponse response) {
		coreYgfymxb.setPage(new Page<>(request, response));
		Page<CoreYgfymxb> page = coreYgfymxbService.findPage(coreYgfymxb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreYgfymxb:view")
	@RequestMapping(value = "form")
	public String form(CoreYgfymxb coreYgfymxb, Model model) {
		model.addAttribute("coreYgfymxb", coreYgfymxb);
		return "modules/core/coreYgfymxbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreYgfymxb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreYgfymxb coreYgfymxb) {
		coreYgfymxbService.save(coreYgfymxb);
		return renderResult(Global.TRUE, text("保存员工费用明细表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreYgfymxb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreYgfymxb coreYgfymxb) {
		coreYgfymxbService.delete(coreYgfymxb);
		return renderResult(Global.TRUE, text("删除员工费用明细表成功！"));
	}
	
}