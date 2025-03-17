package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreYfcyjl;
import com.jeesite.modules.core.dao.CoreYfcyjlDao;

/**
 * 研发参与记录Service
 * @author tjh
 * @version 2025-01-17
 */
@Service
public class CoreYfcyjlService extends CrudService<CoreYfcyjlDao, CoreYfcyjl> {
	
	/**
	 * 获取单条数据
	 * @param coreYfcyjl
	 * @return
	 */
	@Override
	public CoreYfcyjl get(CoreYfcyjl coreYfcyjl) {
		return super.get(coreYfcyjl);
	}
	
	/**
	 * 查询分页数据
	 * @param coreYfcyjl 查询条件
	 * @param coreYfcyjl page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreYfcyjl> findPage(CoreYfcyjl coreYfcyjl) {
		return super.findPage(coreYfcyjl);
	}
	
	/**
	 * 查询列表数据
	 * @param coreYfcyjl
	 * @return
	 */
	@Override
	public List<CoreYfcyjl> findList(CoreYfcyjl coreYfcyjl) {
		return super.findList(coreYfcyjl);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreYfcyjl
	 */
	@Override
	@Transactional
	public void save(CoreYfcyjl coreYfcyjl) {
		super.save(coreYfcyjl);
	}
	
	/**
	 * 更新状态
	 * @param coreYfcyjl
	 */
	@Override
	@Transactional
	public void updateStatus(CoreYfcyjl coreYfcyjl) {
		super.updateStatus(coreYfcyjl);
	}
	
	/**
	 * 删除数据
	 * @param coreYfcyjl
	 */
	@Override
	@Transactional
	public void delete(CoreYfcyjl coreYfcyjl) {
		super.delete(coreYfcyjl);
	}
	
}