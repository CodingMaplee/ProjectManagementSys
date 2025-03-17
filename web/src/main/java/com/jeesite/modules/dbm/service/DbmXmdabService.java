package com.jeesite.modules.dbm.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.dbm.entity.DbmXmdab;
import com.jeesite.modules.dbm.dao.DbmXmdabDao;

/**
 * 项目档案表Service
 * @author zhw
 * @version 2024-11-13
 */
@Service
public class DbmXmdabService extends CrudService<DbmXmdabDao, DbmXmdab> {
	
	/**
	 * 获取单条数据
	 * @param dbmXmdab
	 * @return
	 */
	@Override
	public DbmXmdab get(DbmXmdab dbmXmdab) {
		return super.get(dbmXmdab);
	}
	
	/**
	 * 查询分页数据
	 * @param dbmXmdab 查询条件
	 * @param dbmXmdab page 分页对象
	 * @return
	 */
	@Override
	public Page<DbmXmdab> findPage(DbmXmdab dbmXmdab) {
		return super.findPage(dbmXmdab);
	}
	
	/**
	 * 查询列表数据
	 * @param dbmXmdab
	 * @return
	 */
	@Override
	public List<DbmXmdab> findList(DbmXmdab dbmXmdab) {
		return super.findList(dbmXmdab);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param dbmXmdab
	 */
	@Override
	@Transactional
	public void save(DbmXmdab dbmXmdab) {
		super.save(dbmXmdab);
	}
	
	/**
	 * 更新状态
	 * @param dbmXmdab
	 */
	@Override
	@Transactional
	public void updateStatus(DbmXmdab dbmXmdab) {
		super.updateStatus(dbmXmdab);
	}
	
	/**
	 * 删除数据
	 * @param dbmXmdab
	 */
	@Override
	@Transactional
	public void delete(DbmXmdab dbmXmdab) {
		dbmXmdab.sqlMap().markIdDelete(); // 逻辑删除时标记ID值
		super.delete(dbmXmdab);
	}
	
}