package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreWllyjl;
import com.jeesite.modules.core.dao.CoreWllyjlDao;

/**
 * 物料领用记录Service
 * @author zhw
 * @version 2024-11-29
 */
@Service
public class CoreWllyjlService extends CrudService<CoreWllyjlDao, CoreWllyjl> {
	
	/**
	 * 获取单条数据
	 * @param coreWllyjl
	 * @return
	 */
	@Override
	public CoreWllyjl get(CoreWllyjl coreWllyjl) {
		return super.get(coreWllyjl);
	}
	
	/**
	 * 查询分页数据
	 * @param coreWllyjl 查询条件
	 * @param coreWllyjl page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreWllyjl> findPage(CoreWllyjl coreWllyjl) {
		return super.findPage(coreWllyjl);
	}
	
	/**
	 * 查询列表数据
	 * @param coreWllyjl
	 * @return
	 */
	@Override
	public List<CoreWllyjl> findList(CoreWllyjl coreWllyjl) {
		return super.findList(coreWllyjl);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreWllyjl
	 */
	@Override
	@Transactional
	public void save(CoreWllyjl coreWllyjl) {
		super.save(coreWllyjl);
	}
	
	/**
	 * 更新状态
	 * @param coreWllyjl
	 */
	@Override
	@Transactional
	public void updateStatus(CoreWllyjl coreWllyjl) {
		super.updateStatus(coreWllyjl);
	}
	
	/**
	 * 删除数据
	 * @param coreWllyjl
	 */
	@Override
	@Transactional
	public void delete(CoreWllyjl coreWllyjl) {
		super.delete(coreWllyjl);
	}
	
}