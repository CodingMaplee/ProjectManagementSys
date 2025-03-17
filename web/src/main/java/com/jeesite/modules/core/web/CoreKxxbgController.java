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
import com.jeesite.modules.core.entity.CoreKxxbg;
import com.jeesite.modules.core.service.CoreKxxbgService;

/**
 * 可行性评估报告Controller
 * @author tjh
 * @version 2025-02-19
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreKxxbg")
public class CoreKxxbgController extends BaseController {

	@Autowired
	private CoreKxxbgService coreKxxbgService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreKxxbg get(String id, boolean isNewRecord) {
		return coreKxxbgService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreKxxbg:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreKxxbg coreKxxbg, Model model) {
		model.addAttribute("coreKxxbg", coreKxxbg);
		return "modules/core/coreKxxbgList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreKxxbg:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreKxxbg> listData(CoreKxxbg coreKxxbg, HttpServletRequest request, HttpServletResponse response) {
		coreKxxbg.setPage(new Page<>(request, response));
		Page<CoreKxxbg> page = coreKxxbgService.findPage(coreKxxbg);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreKxxbg:view")
	@RequestMapping(value = "form")
	public String form(CoreKxxbg coreKxxbg, Model model) {
		model.addAttribute("coreKxxbg", coreKxxbg);
		return "modules/core/coreKxxbgForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreKxxbg:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreKxxbg coreKxxbg) {
		coreKxxbgService.save(coreKxxbg);
		return renderResult(Global.TRUE, text("保存可行性评估报告成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreKxxbg:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreKxxbg coreKxxbg) {
		coreKxxbgService.delete(coreKxxbg);
		return renderResult(Global.TRUE, text("删除可行性评估报告成功！"));
	}
	
}