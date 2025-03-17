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
import com.jeesite.modules.core.entity.CoreYftrsbjl;
import com.jeesite.modules.core.service.CoreYftrsbjlService;

/**
 * 研发投入设备记录Controller
 * @author zhw
 * @version 2024-11-28
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreYftrsbjl")
public class CoreYftrsbjlController extends BaseController {

	@Autowired
	private CoreYftrsbjlService coreYftrsbjlService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreYftrsbjl get(String id, boolean isNewRecord) {
		return coreYftrsbjlService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreYftrsbjl:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreYftrsbjl coreYftrsbjl, Model model) {
		model.addAttribute("coreYftrsbjl", coreYftrsbjl);
		return "modules/core/coreYftrsbjlList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreYftrsbjl:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreYftrsbjl> listData(CoreYftrsbjl coreYftrsbjl, HttpServletRequest request, HttpServletResponse response) {
		coreYftrsbjl.setPage(new Page<>(request, response));
		Page<CoreYftrsbjl> page = coreYftrsbjlService.findPage(coreYftrsbjl);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreYftrsbjl:view")
	@RequestMapping(value = "form")
	public String form(CoreYftrsbjl coreYftrsbjl, Model model) {
		model.addAttribute("coreYftrsbjl", coreYftrsbjl);
		return "modules/core/coreYftrsbjlForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreYftrsbjl:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreYftrsbjl coreYftrsbjl) {
		coreYftrsbjlService.save(coreYftrsbjl);
		return renderResult(Global.TRUE, text("保存研发投入设备记录成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreYftrsbjl:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreYftrsbjl coreYftrsbjl) {
		coreYftrsbjlService.delete(coreYftrsbjl);
		return renderResult(Global.TRUE, text("删除研发投入设备记录成功！"));
	}
	
}