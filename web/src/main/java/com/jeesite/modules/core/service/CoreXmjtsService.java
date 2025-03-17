package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreXmjts;
import com.jeesite.modules.core.dao.CoreXmjtsDao;

/**
 * 项目结题书Service
 * @author tjh
 * @version 2025-01-20
 */
@Service
public class CoreXmjtsService extends CrudService<CoreXmjtsDao, CoreXmjts> {
	
	/**
	 * 获取单条数据
	 * @param coreXmjts
	 * @return
	 */
	@Override
	public CoreXmjts get(CoreXmjts coreXmjts) {
		return super.get(coreXmjts);
	}
	
	/**
	 * 查询分页数据
	 * @param coreXmjts 查询条件
	 * @param coreXmjts page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreXmjts> findPage(CoreXmjts coreXmjts) {
		return super.findPage(coreXmjts);
	}
	
	/**
	 * 查询列表数据
	 * @param coreXmjts
	 * @return
	 */
	@Override
	public List<CoreXmjts> findList(CoreXmjts coreXmjts) {
		return super.findList(coreXmjts);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreXmjts
	 */
	@Override
	@Transactional
	public void save(CoreXmjts coreXmjts) {
		super.save(coreXmjts);
	}
	
	/**
	 * 更新状态
	 * @param coreXmjts
	 */
	@Override
	@Transactional
	public void updateStatus(CoreXmjts coreXmjts) {
		super.updateStatus(coreXmjts);
	}
	
	/**
	 * 删除数据
	 * @param coreXmjts
	 */
	@Override
	@Transactional
	public void delete(CoreXmjts coreXmjts) {
		super.delete(coreXmjts);
	}
	
}