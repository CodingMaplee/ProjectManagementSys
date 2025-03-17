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
import com.jeesite.modules.core.entity.CoreYjkfxmfyysb;
import com.jeesite.modules.core.service.CoreYjkfxmfyysbService;

/**
 * 研究开发项目费用预算表Controller
 * @author tjh
 * @version 2025-01-15
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreYjkfxmfyysb")
public class CoreYjkfxmfyysbController extends BaseController {

	@Autowired
	private CoreYjkfxmfyysbService coreYjkfxmfyysbService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreYjkfxmfyysb get(String id, boolean isNewRecord) {
		return coreYjkfxmfyysbService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreYjkfxmfyysb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreYjkfxmfyysb coreYjkfxmfyysb, Model model) {
		model.addAttribute("coreYjkfxmfyysb", coreYjkfxmfyysb);
		return "modules/core/coreYjkfxmfyysbList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreYjkfxmfyysb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreYjkfxmfyysb> listData(CoreYjkfxmfyysb coreYjkfxmfyysb, HttpServletRequest request, HttpServletResponse response) {
		coreYjkfxmfyysb.setPage(new Page<>(request, response));
		Page<CoreYjkfxmfyysb> page = coreYjkfxmfyysbService.findPage(coreYjkfxmfyysb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreYjkfxmfyysb:view")
	@RequestMapping(value = "form")
	public String form(CoreYjkfxmfyysb coreYjkfxmfyysb, Model model) {
		model.addAttribute("coreYjkfxmfyysb", coreYjkfxmfyysb);
		return "modules/core/coreYjkfxmfyysbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreYjkfxmfyysb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreYjkfxmfyysb coreYjkfxmfyysb) {
		coreYjkfxmfyysbService.save(coreYjkfxmfyysb);
		return renderResult(Global.TRUE, text("保存研究开发项目费用预算表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreYjkfxmfyysb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreYjkfxmfyysb coreYjkfxmfyysb) {
		coreYjkfxmfyysbService.delete(coreYjkfxmfyysb);
		return renderResult(Global.TRUE, text("删除研究开发项目费用预算表成功！"));
	}
	
}