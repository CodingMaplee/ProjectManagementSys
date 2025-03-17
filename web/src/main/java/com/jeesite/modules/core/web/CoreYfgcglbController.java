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
import com.jeesite.modules.core.entity.CoreYfgcglb;
import com.jeesite.modules.core.service.CoreYfgcglbService;

/**
 * 研发过程管理表Controller
 * @author zhw
 * @version 2024-12-23
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreYfgcglb")
public class CoreYfgcglbController extends BaseController {

	@Autowired
	private CoreYfgcglbService coreYfgcglbService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreYfgcglb get(String id, boolean isNewRecord) {
		return coreYfgcglbService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreYfgcglb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreYfgcglb coreYfgcglb, Model model) {
		model.addAttribute("coreYfgcglb", coreYfgcglb);
		return "modules/core/coreYfgcglbList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreYfgcglb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreYfgcglb> listData(CoreYfgcglb coreYfgcglb, HttpServletRequest request, HttpServletResponse response) {
		coreYfgcglb.setPage(new Page<>(request, response));
		Page<CoreYfgcglb> page = coreYfgcglbService.findPage(coreYfgcglb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreYfgcglb:view")
	@RequestMapping(value = "form")
	public String form(CoreYfgcglb coreYfgcglb, Model model) {
		model.addAttribute("coreYfgcglb", coreYfgcglb);
		return "modules/core/coreYfgcglbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreYfgcglb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreYfgcglb coreYfgcglb) {
		coreYfgcglbService.save(coreYfgcglb);
		return renderResult(Global.TRUE, text("保存研发过程管理表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreYfgcglb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreYfgcglb coreYfgcglb) {
		coreYfgcglbService.delete(coreYfgcglb);
		return renderResult(Global.TRUE, text("删除研发过程管理表成功！"));
	}
	
}