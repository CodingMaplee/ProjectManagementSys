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
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.dbm.entity.DbmSbdab;
import com.jeesite.modules.dbm.service.DbmSbdabService;

/**
 * 设备档案表Controller
 * @author zhw
 * @version 2024-10-31
 */
@Controller
@RequestMapping(value = "${adminPath}/dbm/dbmSbdab")
public class DbmSbdabController extends BaseController {

	@Autowired
	private DbmSbdabService dbmSbdabService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public DbmSbdab get(String sbdabZcbm, boolean isNewRecord) {
		return dbmSbdabService.get(sbdabZcbm, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("dbm:dbmSbdab:view")
	@RequestMapping(value = {"list", ""})
	public String list(DbmSbdab dbmSbdab, Model model) {
		model.addAttribute("dbmSbdab", dbmSbdab);
		return "modules/dbm/dbmSbdabList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("dbm:dbmSbdab:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<DbmSbdab> listData(DbmSbdab dbmSbdab, HttpServletRequest request, HttpServletResponse response) {
		dbmSbdab.setPage(new Page<>(request, response));
		Page<DbmSbdab> page = dbmSbdabService.findPage(dbmSbdab);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("dbm:dbmSbdab:view")
	@RequestMapping(value = "form")
	public String form(DbmSbdab dbmSbdab, Model model) {
		model.addAttribute("dbmSbdab", dbmSbdab);
		return "modules/dbm/dbmSbdabForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("dbm:dbmSbdab:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated DbmSbdab dbmSbdab) {
		dbmSbdabService.save(dbmSbdab);
		return renderResult(Global.TRUE, text("保存设备档案表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("dbm:dbmSbdab:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(DbmSbdab dbmSbdab) {
		dbmSbdabService.delete(dbmSbdab);
		return renderResult(Global.TRUE, text("删除设备档案表成功！"));
	}
	
}