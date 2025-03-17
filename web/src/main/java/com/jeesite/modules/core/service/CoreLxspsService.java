package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreLxsps;
import com.jeesite.modules.core.dao.CoreLxspsDao;

/**
 * 立项审批书Service
 * @author tjh
 * @version 2025-01-19
 */
@Service
public class CoreLxspsService extends CrudService<CoreLxspsDao, CoreLxsps> {
	
	/**
	 * 获取单条数据
	 * @param coreLxsps
	 * @return
	 */
	@Override
	public CoreLxsps get(CoreLxsps coreLxsps) {
		return super.get(coreLxsps);
	}
	
	/**
	 * 查询分页数据
	 * @param coreLxsps 查询条件
	 * @param coreLxsps page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreLxsps> findPage(CoreLxsps coreLxsps) {
		return super.findPage(coreLxsps);
	}
	
	/**
	 * 查询列表数据
	 * @param coreLxsps
	 * @return
	 */
	@Override
	public List<CoreLxsps> findList(CoreLxsps coreLxsps) {
		return super.findList(coreLxsps);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreLxsps
	 */
	@Override
	@Transactional
	public void save(CoreLxsps coreLxsps) {
		super.save(coreLxsps);
	}
	
	/**
	 * 更新状态
	 * @param coreLxsps
	 */
	@Override
	@Transactional
	public void updateStatus(CoreLxsps coreLxsps) {
		super.updateStatus(coreLxsps);
	}
	
	/**
	 * 删除数据
	 * @param coreLxsps
	 */
	@Override
	@Transactional
	public void delete(CoreLxsps coreLxsps) {
		super.delete(coreLxsps);
	}
	
}