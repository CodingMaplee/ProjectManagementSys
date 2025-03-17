package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreSbfymxb;
import com.jeesite.modules.core.dao.CoreSbfymxbDao;

/**
 * 设备费用明细表Service
 * @author tjh
 * @version 2025-01-12
 */
@Service
public class CoreSbfymxbService extends CrudService<CoreSbfymxbDao, CoreSbfymxb> {
	
	/**
	 * 获取单条数据
	 * @param coreSbfymxb
	 * @return
	 */
	@Override
	public CoreSbfymxb get(CoreSbfymxb coreSbfymxb) {
		return super.get(coreSbfymxb);
	}
	
	/**
	 * 查询分页数据
	 * @param coreSbfymxb 查询条件
	 * @param coreSbfymxb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreSbfymxb> findPage(CoreSbfymxb coreSbfymxb) {
		return super.findPage(coreSbfymxb);
	}
	
	/**
	 * 查询列表数据
	 * @param coreSbfymxb
	 * @return
	 */
	@Override
	public List<CoreSbfymxb> findList(CoreSbfymxb coreSbfymxb) {
		return super.findList(coreSbfymxb);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreSbfymxb
	 */
	@Override
	@Transactional
	public void save(CoreSbfymxb coreSbfymxb) {
		super.save(coreSbfymxb);
	}
	
	/**
	 * 更新状态
	 * @param coreSbfymxb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreSbfymxb coreSbfymxb) {
		super.updateStatus(coreSbfymxb);
	}
	
	/**
	 * 删除数据
	 * @param coreSbfymxb
	 */
	@Override
	@Transactional
	public void delete(CoreSbfymxb coreSbfymxb) {
		super.delete(coreSbfymxb);
	}
	
}