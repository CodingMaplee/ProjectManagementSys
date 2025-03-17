package com.jeesite.modules.dbm.web;

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
import com.alibaba.fastjson.JSONValidator;
import com.jeesite.common.codec.EncodeUtils;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.dbm.entity.DbmXmdab;
import com.jeesite.modules.dbm.service.DbmXmdabService;
/**
 * 项目档案表Controller
 * @author zhw
 * @version 2024-11-13
 */
@Controller
@RequestMapping(value = "${adminPath}/dbm/dbmXmdab")
public class DbmXmdabController extends BaseController {

	@Autowired
	private DbmXmdabService dbmXmdabService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public DbmXmdab get(String xmdabXmbh, boolean isNewRecord) {
		return dbmXmdabService.get(xmdabXmbh, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("dbm:dbmXmdab:view")
	@RequestMapping(value = {"list", ""})
	public String list(DbmXmdab dbmXmdab, Model model) {
		model.addAttribute("dbmXmdab", dbmXmdab);
		return "modules/dbm/dbmXmdabList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("dbm:dbmXmdab:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<DbmXmdab> listData(DbmXmdab dbmXmdab, HttpServletRequest request, HttpServletResponse response) {
		dbmXmdab.setPage(new Page<>(request, response));
		Page<DbmXmdab> page = dbmXmdabService.findPage(dbmXmdab);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("dbm:dbmXmdab:view")
	@RequestMapping(value = "form")
	public String form(DbmXmdab dbmXmdab, Model model) {
		model.addAttribute("dbmXmdab", dbmXmdab);
		return "modules/dbm/dbmXmdabForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("dbm:dbmXmdab:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated DbmXmdab dbmXmdab) {
		dbmXmdabService.save(dbmXmdab);
		return renderResult(Global.TRUE, text("保存项目档案表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("dbm:dbmXmdab:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(DbmXmdab dbmXmdab) {
		dbmXmdabService.delete(dbmXmdab);
		return renderResult(Global.TRUE, text("删除项目档案表成功！"));
	}
	
	/**
	 * 列表选择对话框
	 */
	@RequiresPermissions("dbm:dbmXmdab:view")
	@RequestMapping(value = "dbmXmdabSelect")
	public String dbmXmdabSelect(DbmXmdab dbmXmdab, String selectData, Model model) {
		String selectDataJson = EncodeUtils.decodeUrl(selectData);
		if (selectDataJson != null && JSONValidator.from(selectDataJson).validate()){
			model.addAttribute("selectData", selectDataJson);
		}
		model.addAttribute("dbmXmdab", dbmXmdab);
		return "modules/dbm/dbmXmdabSelect";
	}

}