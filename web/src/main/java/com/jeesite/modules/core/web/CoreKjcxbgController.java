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
import com.jeesite.modules.core.entity.CoreKjcxbg;
import com.jeesite.modules.core.service.CoreKjcxbgService;

/**
 * 科技查新报告Controller
 * @author tjh
 * @version 2025-01-20
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreKjcxbg")
public class CoreKjcxbgController extends BaseController {

	@Autowired
	private CoreKjcxbgService coreKjcxbgService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreKjcxbg get(String id, boolean isNewRecord) {
		return coreKjcxbgService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreKjcxbg:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreKjcxbg coreKjcxbg, Model model) {
		model.addAttribute("coreKjcxbg", coreKjcxbg);
		return "modules/core/coreKjcxbgList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreKjcxbg:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreKjcxbg> listData(CoreKjcxbg coreKjcxbg, HttpServletRequest request, HttpServletResponse response) {
		coreKjcxbg.setPage(new Page<>(request, response));
		Page<CoreKjcxbg> page = coreKjcxbgService.findPage(coreKjcxbg);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreKjcxbg:view")
	@RequestMapping(value = "form")
	public String form(CoreKjcxbg coreKjcxbg, Model model) {
		model.addAttribute("coreKjcxbg", coreKjcxbg);
		return "modules/core/coreKjcxbgForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreKjcxbg:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreKjcxbg coreKjcxbg) {
		coreKjcxbgService.save(coreKjcxbg);
		return renderResult(Global.TRUE, text("保存科技查新报告成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreKjcxbg:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreKjcxbg coreKjcxbg) {
		coreKjcxbgService.delete(coreKjcxbg);
		return renderResult(Global.TRUE, text("删除科技查新报告成功！"));
	}
	
}