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
import com.jeesite.modules.core.entity.CoreCggl;
import com.jeesite.modules.core.service.CoreCgglService;

/**
 * 成果管理Controller
 * @author zhw
 * @version 2024-11-28
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreCggl")
public class CoreCgglController extends BaseController {

	@Autowired
	private CoreCgglService coreCgglService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreCggl get(String id, boolean isNewRecord) {
		return coreCgglService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreCggl:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreCggl coreCggl, Model model) {
		model.addAttribute("coreCggl", coreCggl);
		return "modules/core/coreCgglList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreCggl:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreCggl> listData(CoreCggl coreCggl, HttpServletRequest request, HttpServletResponse response) {
		coreCggl.setPage(new Page<>(request, response));
		Page<CoreCggl> page = coreCgglService.findPage(coreCggl);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreCggl:view")
	@RequestMapping(value = "form")
	public String form(CoreCggl coreCggl, Model model) {
		model.addAttribute("coreCggl", coreCggl);
		return "modules/core/coreCgglForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreCggl:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreCggl coreCggl) {
		coreCgglService.save(coreCggl);
		return renderResult(Global.TRUE, text("保存成果管理成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreCggl:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreCggl coreCggl) {
		coreCgglService.delete(coreCggl);
		return renderResult(Global.TRUE, text("删除成果管理成功！"));
	}
	
}