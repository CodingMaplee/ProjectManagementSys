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
import com.jeesite.modules.dbm.entity.DbmRygstjb;
import com.jeesite.modules.dbm.service.DbmRygstjbService;

/**
 * 人员工时统计表Controller
 * @author zhw
 * @version 2024-11-14
 */
@Controller
@RequestMapping(value = "${adminPath}/dbm/dbmRygstjb")
public class DbmRygstjbController extends BaseController {

	@Autowired
	private DbmRygstjbService dbmRygstjbService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public DbmRygstjb get(String id, boolean isNewRecord) {
		return dbmRygstjbService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("dbm:dbmRygstjb:view")
	@RequestMapping(value = {"list", ""})
	public String list(DbmRygstjb dbmRygstjb, Model model) {
		model.addAttribute("dbmRygstjb", dbmRygstjb);
		return "modules/dbm/dbmRygstjbList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("dbm:dbmRygstjb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<DbmRygstjb> listData(DbmRygstjb dbmRygstjb, HttpServletRequest request, HttpServletResponse response) {
		dbmRygstjb.setPage(new Page<>(request, response));
		Page<DbmRygstjb> page = dbmRygstjbService.findPage(dbmRygstjb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("dbm:dbmRygstjb:view")
	@RequestMapping(value = "form")
	public String form(DbmRygstjb dbmRygstjb, Model model) {
		model.addAttribute("dbmRygstjb", dbmRygstjb);
		return "modules/dbm/dbmRygstjbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("dbm:dbmRygstjb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated DbmRygstjb dbmRygstjb) {
		dbmRygstjbService.save(dbmRygstjb);
		return renderResult(Global.TRUE, text("保存人员工时统计表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("dbm:dbmRygstjb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(DbmRygstjb dbmRygstjb) {
		dbmRygstjbService.delete(dbmRygstjb);
		return renderResult(Global.TRUE, text("删除人员工时统计表成功！"));
	}
	
}