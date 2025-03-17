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
import com.jeesite.modules.core.entity.CoreYffyysmxb;
import com.jeesite.modules.core.service.CoreYffyysmxbService;
import com.jeesite.modules.MyAjaxJson;

/**
 * 研发费用预算明细表Controller
 * @author zhw
 * @version 2024-12-17
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreYffyysmxb")
public class CoreYffyysmxbController extends BaseController {

	@Autowired
	private CoreYffyysmxbService coreYffyysmxbService;

	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreYffyysmxb get(String id, boolean isNewRecord) {
		return coreYffyysmxbService.get(id, isNewRecord);
	}

	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreYffyysmxb coreYffyysmxb, Model model) {
		model.addAttribute("coreYffyysmxb", coreYffyysmxb);
		return "modules/core/coreYffyysmxbList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreYffyysmxb> listData(CoreYffyysmxb coreYffyysmxb, HttpServletRequest request, HttpServletResponse response) {
		coreYffyysmxb.setPage(new Page<>(request, response));
		Page<CoreYffyysmxb> page = coreYffyysmxbService.findPage(coreYffyysmxb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "form")
	public String form(CoreYffyysmxb coreYffyysmxb, Model model) {
		model.addAttribute("coreYffyysmxb", coreYffyysmxb);
		return "modules/core/coreYffyysmxbForm";
		// 如果存在ID，则说明是编辑模式
		//if (coreYffyysmxb.getId() != null && !coreYffyysmxb.getId().isEmpty()) {
		//	// 编辑模式，查询对应的明细表数据
		//	coreYffyysmxb = coreYffyysmxbService.get(coreYffyysmxb.getId());
		//} else {
		//	// 新建模式，初始化表单对象
		//	coreYffyysmxb = new CoreYffyysmxb();
		//}
		//model.addAttribute("coreYffyysmxb", coreYffyysmxb);
		//return "modules/core/coreYffyysmxbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreXmglxxb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreYffyysmxb coreYffyysmxb) {
		coreYffyysmxbService.save(coreYffyysmxb);
		return renderResult(Global.TRUE, text("保存研发费用预算明细表成功！"));
	}
	@RequiresPermissions("core:coreXmglxxb:edit")
	@RequestMapping(value = "save2")
	@ResponseBody
	public MyAjaxJson save(CoreYffyysmxb coreYffyysmxb, Model model) {
		// 保存逻辑
		coreYffyysmxbService.save(coreYffyysmxb);
		// 获取父表外键ID
		String xmglxxbYffyysmxbId = coreYffyysmxb.getId();
		// 返回保存成功的消息
		MyAjaxJson ajaxJson = new MyAjaxJson();
		ajaxJson.setSuccess(true);
		ajaxJson.setId(xmglxxbYffyysmxbId);
		ajaxJson.setMsg("保存成功");
		return ajaxJson;
	}
	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreXmglxxb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreYffyysmxb coreYffyysmxb) {
		coreYffyysmxbService.delete(coreYffyysmxb);
		return renderResult(Global.TRUE, text("删除研发费用预算明细表成功！"));
	}
	
}