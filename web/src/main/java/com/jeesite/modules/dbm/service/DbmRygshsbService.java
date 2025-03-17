package com.jeesite.modules.dbm.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.dbm.entity.DbmRygshsb;
import com.jeesite.modules.dbm.dao.DbmRygshsbDao;

/**
 * 人员工时核算表Service
 * @author zhw
 * @version 2024-11-14
 */
@Service
public class DbmRygshsbService extends CrudService<DbmRygshsbDao, DbmRygshsb> {
	
	/**
	 * 获取单条数据
	 * @param dbmRygshsb
	 * @return
	 */
	@Override
	public DbmRygshsb get(DbmRygshsb dbmRygshsb) {
		return super.get(dbmRygshsb);
	}
	
	/**
	 * 查询分页数据
	 * @param dbmRygshsb 查询条件
	 * @param dbmRygshsb page 分页对象
	 * @return
	 */
	@Override
	public Page<DbmRygshsb> findPage(DbmRygshsb dbmRygshsb) {
		return super.findPage(dbmRygshsb);
	}
	
	/**
	 * 查询列表数据
	 * @param dbmRygshsb
	 * @return
	 */
	@Override
	public List<DbmRygshsb> findList(DbmRygshsb dbmRygshsb) {
		return super.findList(dbmRygshsb);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param dbmRygshsb
	 */
	@Override
	@Transactional
	public void save(DbmRygshsb dbmRygshsb) {
		super.save(dbmRygshsb);
	}
	
	/**
	 * 更新状态
	 * @param dbmRygshsb
	 */
	@Override
	@Transactional
	public void updateStatus(DbmRygshsb dbmRygshsb) {
		super.updateStatus(dbmRygshsb);
	}
	
	/**
	 * 删除数据
	 * @param dbmRygshsb
	 */
	@Override
	@Transactional
	public void delete(DbmRygshsb dbmRygshsb) {
		super.delete(dbmRygshsb);
	}
	
}