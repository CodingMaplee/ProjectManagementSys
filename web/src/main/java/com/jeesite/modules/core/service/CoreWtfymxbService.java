package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreWtfymxb;
import com.jeesite.modules.core.dao.CoreWtfymxbDao;

/**
 * 委托费用明细表Service
 * @author tjh
 * @version 2025-01-12
 */
@Service
public class CoreWtfymxbService extends CrudService<CoreWtfymxbDao, CoreWtfymxb> {
	
	/**
	 * 获取单条数据
	 * @param coreWtfymxb
	 * @return
	 */
	@Override
	public CoreWtfymxb get(CoreWtfymxb coreWtfymxb) {
		return super.get(coreWtfymxb);
	}
	
	/**
	 * 查询分页数据
	 * @param coreWtfymxb 查询条件
	 * @param coreWtfymxb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreWtfymxb> findPage(CoreWtfymxb coreWtfymxb) {
		return super.findPage(coreWtfymxb);
	}
	
	/**
	 * 查询列表数据
	 * @param coreWtfymxb
	 * @return
	 */
	@Override
	public List<CoreWtfymxb> findList(CoreWtfymxb coreWtfymxb) {
		return super.findList(coreWtfymxb);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreWtfymxb
	 */
	@Override
	@Transactional
	public void save(CoreWtfymxb coreWtfymxb) {
		super.save(coreWtfymxb);
	}
	
	/**
	 * 更新状态
	 * @param coreWtfymxb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreWtfymxb coreWtfymxb) {
		super.updateStatus(coreWtfymxb);
	}
	
	/**
	 * 删除数据
	 * @param coreWtfymxb
	 */
	@Override
	@Transactional
	public void delete(CoreWtfymxb coreWtfymxb) {
		super.delete(coreWtfymxb);
	}
	
}