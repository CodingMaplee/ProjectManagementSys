package com.jeesite.modules.dbm.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.dbm.entity.DbmSbdab;
import com.jeesite.modules.dbm.dao.DbmSbdabDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 设备档案表Service
 * @author zhw
 * @version 2024-10-31
 */
@Service
public class DbmSbdabService extends CrudService<DbmSbdabDao, DbmSbdab> {
	
	/**
	 * 获取单条数据
	 * @param dbmSbdab
	 * @return
	 */
	@Override
	public DbmSbdab get(DbmSbdab dbmSbdab) {
		return super.get(dbmSbdab);
	}
	
	/**
	 * 查询分页数据
	 * @param dbmSbdab 查询条件
	 * @param dbmSbdab page 分页对象
	 * @return
	 */
	@Override
	public Page<DbmSbdab> findPage(DbmSbdab dbmSbdab) {
		return super.findPage(dbmSbdab);
	}
	
	/**
	 * 查询列表数据
	 * @param dbmSbdab
	 * @return
	 */
	@Override
	public List<DbmSbdab> findList(DbmSbdab dbmSbdab) {
		return super.findList(dbmSbdab);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param dbmSbdab
	 */
	@Override
	@Transactional
	public void save(DbmSbdab dbmSbdab) {
		super.save(dbmSbdab);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(dbmSbdab, dbmSbdab.getId(), "dbmSbdab_file");
	}
	
	/**
	 * 更新状态
	 * @param dbmSbdab
	 */
	@Override
	@Transactional
	public void updateStatus(DbmSbdab dbmSbdab) {
		super.updateStatus(dbmSbdab);
	}
	
	/**
	 * 删除数据
	 * @param dbmSbdab
	 */
	@Override
	@Transactional
	public void delete(DbmSbdab dbmSbdab) {
		dbmSbdab.sqlMap().markIdDelete(); // 逻辑删除时标记ID值
		super.delete(dbmSbdab);
	}
	
}