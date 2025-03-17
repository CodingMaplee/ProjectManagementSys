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
import com.jeesite.modules.core.entity.CoreDecscbg;
import com.jeesite.modules.core.service.CoreDecscbgService;

/**
 * 试产报告Controller
 * @author tjh
 * @version 2025-01-21
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreDecscbg")
public class CoreDecscbgController extends BaseController {

	@Autowired
	private CoreDecscbgService coreDecscbgService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreDecscbg get(String id, boolean isNewRecord) {
		return coreDecscbgService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreDecscbg:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreDecscbg coreDecscbg, Model model) {
		model.addAttribute("coreDecscbg", coreDecscbg);
		return "modules/core/coreDecscbgList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreDecscbg:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreDecscbg> listData(CoreDecscbg coreDecscbg, HttpServletRequest request, HttpServletResponse response) {
		coreDecscbg.setPage(new Page<>(request, response));
		Page<CoreDecscbg> page = coreDecscbgService.findPage(coreDecscbg);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreDecscbg:view")
	@RequestMapping(value = "form")
	public String form(CoreDecscbg coreDecscbg, Model model) {
		model.addAttribute("coreDecscbg", coreDecscbg);
		return "modules/core/coreDecscbgForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreDecscbg:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreDecscbg coreDecscbg) {
		coreDecscbgService.save(coreDecscbg);
		return renderResult(Global.TRUE, text("保存试产报告成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreDecscbg:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreDecscbg coreDecscbg) {
		coreDecscbgService.delete(coreDecscbg);
		return renderResult(Global.TRUE, text("删除试产报告成功！"));
	}
	
}