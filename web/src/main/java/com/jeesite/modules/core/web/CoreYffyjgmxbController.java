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
import com.jeesite.modules.core.entity.CoreYffyjgmxb;
import com.jeesite.modules.core.service.CoreYffyjgmxbService;

/**
 * 研发费用结构明细表Controller
 * @author tjh
 * @version 2025-01-15
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreYffyjgmxb")
public class CoreYffyjgmxbController extends BaseController {

	@Autowired
	private CoreYffyjgmxbService coreYffyjgmxbService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreYffyjgmxb get(String id, boolean isNewRecord) {
		return coreYffyjgmxbService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreYffyjgmxb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreYffyjgmxb coreYffyjgmxb, Model model) {
		model.addAttribute("coreYffyjgmxb", coreYffyjgmxb);
		return "modules/core/coreYffyjgmxbList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreYffyjgmxb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreYffyjgmxb> listData(CoreYffyjgmxb coreYffyjgmxb, HttpServletRequest request, HttpServletResponse response) {
		coreYffyjgmxb.setPage(new Page<>(request, response));
		Page<CoreYffyjgmxb> page = coreYffyjgmxbService.findPage(coreYffyjgmxb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreYffyjgmxb:view")
	@RequestMapping(value = "form")
	public String form(CoreYffyjgmxb coreYffyjgmxb, Model model) {
		model.addAttribute("coreYffyjgmxb", coreYffyjgmxb);
		return "modules/core/coreYffyjgmxbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreYffyjgmxb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreYffyjgmxb coreYffyjgmxb) {
		coreYffyjgmxbService.save(coreYffyjgmxb);
		return renderResult(Global.TRUE, text("保存研发费用结构明细表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreYffyjgmxb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreYffyjgmxb coreYffyjgmxb) {
		coreYffyjgmxbService.delete(coreYffyjgmxb);
		return renderResult(Global.TRUE, text("删除研发费用结构明细表成功！"));
	}
	
}