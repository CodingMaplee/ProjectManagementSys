package com.jeesite.modules.dbm.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.dbm.entity.DbmRydab;
import com.jeesite.modules.dbm.dao.DbmRydabDao;

/**
 * 人员档案表Service
 * @author zhw
 * @version 2024-11-14
 */
@Service
public class DbmRydabService extends CrudService<DbmRydabDao, DbmRydab> {
	
	/**
	 * 获取单条数据
	 * @param dbmRydab
	 * @return
	 */
	@Override
	public DbmRydab get(DbmRydab dbmRydab) {
		return super.get(dbmRydab);
	}
	
	/**
	 * 查询分页数据
	 * @param dbmRydab 查询条件
	 * @param dbmRydab page 分页对象
	 * @return
	 */
	@Override
	public Page<DbmRydab> findPage(DbmRydab dbmRydab) {
		return super.findPage(dbmRydab);
	}
	
	/**
	 * 查询列表数据
	 * @param dbmRydab
	 * @return
	 */
	@Override
	public List<DbmRydab> findList(DbmRydab dbmRydab) {
		return super.findList(dbmRydab);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param dbmRydab
	 */
	@Override
	@Transactional
	public void save(DbmRydab dbmRydab) {
		super.save(dbmRydab);
	}
	
	/**
	 * 更新状态
	 * @param dbmRydab
	 */
	@Override
	@Transactional
	public void updateStatus(DbmRydab dbmRydab) {
		super.updateStatus(dbmRydab);
	}
	
	/**
	 * 删除数据
	 * @param dbmRydab
	 */
	@Override
	@Transactional
	public void delete(DbmRydab dbmRydab) {
		super.delete(dbmRydab);
	}
	
}