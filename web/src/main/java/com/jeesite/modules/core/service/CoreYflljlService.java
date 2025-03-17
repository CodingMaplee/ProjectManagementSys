package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreYflljl;
import com.jeesite.modules.core.dao.CoreYflljlDao;

/**
 * 研发领料记录Service
 * @author zhw
 * @version 2024-11-29
 */
@Service
public class CoreYflljlService extends CrudService<CoreYflljlDao, CoreYflljl> {
	
	/**
	 * 获取单条数据
	 * @param coreYflljl
	 * @return
	 */
	@Override
	public CoreYflljl get(CoreYflljl coreYflljl) {
		return super.get(coreYflljl);
	}
	
	/**
	 * 查询分页数据
	 * @param coreYflljl 查询条件
	 * @param coreYflljl page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreYflljl> findPage(CoreYflljl coreYflljl) {
		return super.findPage(coreYflljl);
	}
	
	/**
	 * 查询列表数据
	 * @param coreYflljl
	 * @return
	 */
	@Override
	public List<CoreYflljl> findList(CoreYflljl coreYflljl) {
		return super.findList(coreYflljl);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreYflljl
	 */
	@Override
	@Transactional
	public void save(CoreYflljl coreYflljl) {
		super.save(coreYflljl);
	}
	
	/**
	 * 更新状态
	 * @param coreYflljl
	 */
	@Override
	@Transactional
	public void updateStatus(CoreYflljl coreYflljl) {
		super.updateStatus(coreYflljl);
	}
	
	/**
	 * 删除数据
	 * @param coreYflljl
	 */
	@Override
	@Transactional
	public void delete(CoreYflljl coreYflljl) {
		super.delete(coreYflljl);
	}
	
}