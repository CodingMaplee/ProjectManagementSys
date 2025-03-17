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
import com.jeesite.modules.dbm.entity.DbmRydab;
import com.jeesite.modules.dbm.service.DbmRydabService;

/**
 * 人员档案表Controller
 * @author zhw
 * @version 2024-11-14
 */
@Controller
@RequestMapping(value = "${adminPath}/dbm/dbmRydab")
public class DbmRydabController extends BaseController {

	@Autowired
	private DbmRydabService dbmRydabService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public DbmRydab get(String id, boolean isNewRecord) {
		return dbmRydabService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("dbm:dbmRydab:view")
	@RequestMapping(value = {"list", ""})
	public String list(DbmRydab dbmRydab, Model model) {
		model.addAttribute("dbmRydab", dbmRydab);
		return "modules/dbm/dbmRydabList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("dbm:dbmRydab:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<DbmRydab> listData(DbmRydab dbmRydab, HttpServletRequest request, HttpServletResponse response) {
		dbmRydab.setPage(new Page<>(request, response));
		Page<DbmRydab> page = dbmRydabService.findPage(dbmRydab);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("dbm:dbmRydab:view")
	@RequestMapping(value = "form")
	public String form(DbmRydab dbmRydab, Model model) {
		model.addAttribute("dbmRydab", dbmRydab);
		return "modules/dbm/dbmRydabForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("dbm:dbmRydab:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated DbmRydab dbmRydab) {
		dbmRydabService.save(dbmRydab);
		return renderResult(Global.TRUE, text("保存人员成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("dbm:dbmRydab:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(DbmRydab dbmRydab) {
		dbmRydabService.delete(dbmRydab);
		return renderResult(Global.TRUE, text("删除人员成功！"));
	}
	
}