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
import com.jeesite.modules.core.entity.CoreZjlbghyjy;
import com.jeesite.modules.core.service.CoreZjlbghyjyService;

/**
 * 总经理办公会议纪要Controller
 * @author tjh
 * @version 2025-01-20
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreZjlbghyjy")
public class CoreZjlbghyjyController extends BaseController {

	@Autowired
	private CoreZjlbghyjyService coreZjlbghyjyService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreZjlbghyjy get(String id, boolean isNewRecord) {
		return coreZjlbghyjyService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreZjlbghyjy:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreZjlbghyjy coreZjlbghyjy, Model model) {
		model.addAttribute("coreZjlbghyjy", coreZjlbghyjy);
		return "modules/core/coreZjlbghyjyList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreZjlbghyjy:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreZjlbghyjy> listData(CoreZjlbghyjy coreZjlbghyjy, HttpServletRequest request, HttpServletResponse response) {
		coreZjlbghyjy.setPage(new Page<>(request, response));
		Page<CoreZjlbghyjy> page = coreZjlbghyjyService.findPage(coreZjlbghyjy);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreZjlbghyjy:view")
	@RequestMapping(value = "form")
	public String form(CoreZjlbghyjy coreZjlbghyjy, Model model) {
		model.addAttribute("coreZjlbghyjy", coreZjlbghyjy);
		return "modules/core/coreZjlbghyjyForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreZjlbghyjy:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreZjlbghyjy coreZjlbghyjy) {
		coreZjlbghyjyService.save(coreZjlbghyjy);
		return renderResult(Global.TRUE, text("保存总经理办公会议纪要成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreZjlbghyjy:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreZjlbghyjy coreZjlbghyjy) {
		coreZjlbghyjyService.delete(coreZjlbghyjy);
		return renderResult(Global.TRUE, text("删除总经理办公会议纪要成功！"));
	}
	
}