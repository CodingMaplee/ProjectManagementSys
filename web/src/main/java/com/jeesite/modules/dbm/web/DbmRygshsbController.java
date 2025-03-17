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
import com.jeesite.modules.dbm.entity.DbmRygshsb;
import com.jeesite.modules.dbm.service.DbmRygshsbService;

/**
 * 人员工时核算表Controller
 * @author zhw
 * @version 2024-11-14
 */
@Controller
@RequestMapping(value = "${adminPath}/dbm/dbmRygshsb")
public class DbmRygshsbController extends BaseController {

	@Autowired
	private DbmRygshsbService dbmRygshsbService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public DbmRygshsb get(String id, boolean isNewRecord) {
		return dbmRygshsbService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("dbm:dbmRygshsb:view")
	@RequestMapping(value = {"list", ""})
	public String list(DbmRygshsb dbmRygshsb, Model model) {
		model.addAttribute("dbmRygshsb", dbmRygshsb);
		return "modules/dbm/dbmRygshsbList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("dbm:dbmRygshsb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<DbmRygshsb> listData(DbmRygshsb dbmRygshsb, HttpServletRequest request, HttpServletResponse response) {
		dbmRygshsb.setPage(new Page<>(request, response));
		Page<DbmRygshsb> page = dbmRygshsbService.findPage(dbmRygshsb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("dbm:dbmRygshsb:view")
	@RequestMapping(value = "form")
	public String form(DbmRygshsb dbmRygshsb, Model model) {
		model.addAttribute("dbmRygshsb", dbmRygshsb);
		return "modules/dbm/dbmRygshsbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("dbm:dbmRygshsb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated DbmRygshsb dbmRygshsb) {
		dbmRygshsbService.save(dbmRygshsb);
		return renderResult(Global.TRUE, text("保存人员工时核算表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("dbm:dbmRygshsb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(DbmRygshsb dbmRygshsb) {
		dbmRygshsbService.delete(dbmRygshsb);
		return renderResult(Global.TRUE, text("删除人员工时核算表成功！"));
	}
	
}