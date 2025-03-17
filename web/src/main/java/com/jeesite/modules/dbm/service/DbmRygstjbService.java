package com.jeesite.modules.dbm.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.dbm.entity.DbmRygstjb;
import com.jeesite.modules.dbm.dao.DbmRygstjbDao;

/**
 * 人员工时统计表Service
 * @author zhw
 * @version 2024-11-14
 */
@Service
public class DbmRygstjbService extends CrudService<DbmRygstjbDao, DbmRygstjb> {
	
	/**
	 * 获取单条数据
	 * @param dbmRygstjb
	 * @return
	 */
	@Override
	public DbmRygstjb get(DbmRygstjb dbmRygstjb) {
		return super.get(dbmRygstjb);
	}
	
	/**
	 * 查询分页数据
	 * @param dbmRygstjb 查询条件
	 * @param dbmRygstjb page 分页对象
	 * @return
	 */
	@Override
	public Page<DbmRygstjb> findPage(DbmRygstjb dbmRygstjb) {
		return super.findPage(dbmRygstjb);
	}
	
	/**
	 * 查询列表数据
	 * @param dbmRygstjb
	 * @return
	 */
	@Override
	public List<DbmRygstjb> findList(DbmRygstjb dbmRygstjb) {
		return super.findList(dbmRygstjb);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param dbmRygstjb
	 */
	@Override
	@Transactional
	public void save(DbmRygstjb dbmRygstjb) {
		super.save(dbmRygstjb);
	}
	
	/**
	 * 更新状态
	 * @param dbmRygstjb
	 */
	@Override
	@Transactional
	public void updateStatus(DbmRygstjb dbmRygstjb) {
		super.updateStatus(dbmRygstjb);
	}
	
	/**
	 * 删除数据
	 * @param dbmRygstjb
	 */
	@Override
	@Transactional
	public void delete(DbmRygstjb dbmRygstjb) {
		super.delete(dbmRygstjb);
	}
	
}