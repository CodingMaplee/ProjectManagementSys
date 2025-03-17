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
import com.jeesite.modules.core.entity.CoreYjkfjghxmzdbzqkjzycymd;
import com.jeesite.modules.core.service.CoreYjkfjghxmzdbzqkjzycymdService;

/**
 * 研究开发机构和项目组的编制情况 及主要成员名单Controller
 * @author tjh
 * @version 2025-01-20
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreYjkfjghxmzdbzqkjzycymd")
public class CoreYjkfjghxmzdbzqkjzycymdController extends BaseController {

	@Autowired
	private CoreYjkfjghxmzdbzqkjzycymdService coreYjkfjghxmzdbzqkjzycymdService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreYjkfjghxmzdbzqkjzycymd get(String id, boolean isNewRecord) {
		return coreYjkfjghxmzdbzqkjzycymdService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreYjkfjghxmzdbzqkjzycymd:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreYjkfjghxmzdbzqkjzycymd coreYjkfjghxmzdbzqkjzycymd, Model model) {
		model.addAttribute("coreYjkfjghxmzdbzqkjzycymd", coreYjkfjghxmzdbzqkjzycymd);
		return "modules/core/coreYjkfjghxmzdbzqkjzycymdList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreYjkfjghxmzdbzqkjzycymd:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreYjkfjghxmzdbzqkjzycymd> listData(CoreYjkfjghxmzdbzqkjzycymd coreYjkfjghxmzdbzqkjzycymd, HttpServletRequest request, HttpServletResponse response) {
		coreYjkfjghxmzdbzqkjzycymd.setPage(new Page<>(request, response));
		Page<CoreYjkfjghxmzdbzqkjzycymd> page = coreYjkfjghxmzdbzqkjzycymdService.findPage(coreYjkfjghxmzdbzqkjzycymd);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreYjkfjghxmzdbzqkjzycymd:view")
	@RequestMapping(value = "form")
	public String form(CoreYjkfjghxmzdbzqkjzycymd coreYjkfjghxmzdbzqkjzycymd, Model model) {
		model.addAttribute("coreYjkfjghxmzdbzqkjzycymd", coreYjkfjghxmzdbzqkjzycymd);
		return "modules/core/coreYjkfjghxmzdbzqkjzycymdForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreYjkfjghxmzdbzqkjzycymd:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreYjkfjghxmzdbzqkjzycymd coreYjkfjghxmzdbzqkjzycymd) {
		coreYjkfjghxmzdbzqkjzycymdService.save(coreYjkfjghxmzdbzqkjzycymd);
		return renderResult(Global.TRUE, text("保存研究开发机构和项目组的编制情况 及主要成员名单成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreYjkfjghxmzdbzqkjzycymd:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreYjkfjghxmzdbzqkjzycymd coreYjkfjghxmzdbzqkjzycymd) {
		coreYjkfjghxmzdbzqkjzycymdService.delete(coreYjkfjghxmzdbzqkjzycymd);
		return renderResult(Global.TRUE, text("删除研究开发机构和项目组的编制情况 及主要成员名单成功！"));
	}
	
}