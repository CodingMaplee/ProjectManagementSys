package com.jeesite.modules.core.web;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestParam;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.core.entity.CoreXmglxxb;
import com.jeesite.modules.core.service.CoreXmglxxbService;

import com.jeesite.modules.core.entity.CoreYffyysmxb;
import com.jeesite.modules.core.service.CoreYffyysmxbService;
import java.util.Map;
import java.util.HashMap;
/**
 * 项目管理信息表Controller
 * @author zhw
 * @version 2024-12-17
 */
@Controller
@RequestMapping(value = "${adminPath}/core/coreXmglxxb")
public class CoreXmglxxbController extends BaseController {

	@Autowired
	private CoreXmglxxbService coreXmglxxbService;
	private CoreYffyysmxbService coreYffyysmxbService;
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public CoreXmglxxb get(String id, boolean isNewRecord) {
		return coreXmglxxbService.get(id, isNewRecord);
	}

	/**
	 * 查询列表
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = {"list", ""})
	public String list(CoreXmglxxb coreXmglxxb, Model model) {
		model.addAttribute("coreXmglxxb", coreXmglxxb);
		return "modules/core/coreXmglxxbList";
	}

	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<CoreXmglxxb> listData(CoreXmglxxb coreXmglxxb, HttpServletRequest request, HttpServletResponse response) {
		coreXmglxxb.setPage(new Page<>(request, response));
		Page<CoreXmglxxb> page = coreXmglxxbService.findPage(coreXmglxxb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "form")
	public String form(CoreXmglxxb coreXmglxxb, Model model) {
		model.addAttribute("coreXmglxxb", coreXmglxxb);
		return "modules/core/coreXmglxxbForm";
	}
	/**
	 * 根据项目ID查询关联的人员信息
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "getEmployees")
	@ResponseBody
	public List<Map<String, String>> getEmployees(String projectId) {
		List<Map<String, String>> result = new ArrayList<>();
		// 根据项目ID查找预算明细记录
		CoreXmglxxb coreXmglxxb = coreXmglxxbService.get(projectId);

		// 如果没有找到记录，返回空列表
		if (coreXmglxxb == null) {
			return result;
		}

		// 获取人员信息字段（假设是存储为逗号分隔的字符串）
		String employees = coreXmglxxb.getGcglXmry(); // 假设字段名为 employeeNames

		// 将逗号分隔的字符串解析为 List
		if (employees != null && !employees.isEmpty()) {
			String[] names = employees.split(",");
			for(int i = 0; i< names.length; i++) {
				Map<String, String> entry = new HashMap<>();
				entry.put("id", names[i]);       // 下拉框的值
				entry.put("text", names[i]);     // 下拉框的显示名称
				result.add(entry);
			}
			return result;
		}

		// 如果字段为空，则返回空列表
		return result;
	}
	/**
	 * 获取项目名称通过项目ID
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "getProjectNameById")
	@ResponseBody
	public String getProjectNameById(@RequestParam String projectId) {
		// 调用服务层方法获取项目名称
		return coreXmglxxbService.getProjectNameById(projectId);
	}
	/**
	 * 获取项目名称通过项目ID
	 */
	@RequiresPermissions("core:coreXmglxxb:view")
	@RequestMapping(value = "getProjectCodeById")
	@ResponseBody
	public String getProjectCodeById(@RequestParam String projectId) {
		// 调用服务层方法获取项目名称
		return coreXmglxxbService.getProjectCodeById(projectId);
	}
	/**
	 * 保存数据
	 */
	@RequiresPermissions("core:coreXmglxxb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated CoreXmglxxb coreXmglxxb) {
		//coreXmglxxbService.save(coreXmglxxb);
		//return renderResult(Global.TRUE, text("保存项目管理信息表成功！"));
		// 检查是否已有预算明细记录
		// 检查是否已有预算明细记录???????????????????
		//if (coreXmglxxb.getXmglxxbYffyysmxb() == null || coreXmglxxb.getXmglxxbYffyysmxb().isEmpty()) {
		//	// 创建新的预算明细记录
		//	CoreYffyysmxb coreYffyysmxb = new CoreYffyysmxb();
		//	coreYffyysmxb.setYffyysmxbKfxmmc(coreXmglxxb.getGcglXmmc()); // 设置项目名称
		//	coreYffyysmxb.setYffyysmxbYffyyszje(coreXmglxxb.getXmglxxbYffyyszje()); // 设置预算总金额，视需求而定

		//	// 保存预算明细
		//	coreYffyysmxbService.save(coreYffyysmxb);

		//	// 设置项目管理信息的外键为新创建的预算明细表主键
		//	coreXmglxxb.setXmglxxbYffyysmxb(coreYffyysmxb.getId());
		//}

		// 保存项目管理信息
		coreXmglxxbService.save(coreXmglxxb);

		return renderResult(Global.TRUE, text("保存项目管理信息成功！"));
	}

	/**
	 * 删除数据
	 */
	@RequiresPermissions("core:coreXmglxxb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(CoreXmglxxb coreXmglxxb) {
		coreXmglxxbService.delete(coreXmglxxb);
		return renderResult(Global.TRUE, text("删除项目管理信息表成功！"));
	}

}