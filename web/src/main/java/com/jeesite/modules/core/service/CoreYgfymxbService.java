package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreYgfymxb;
import com.jeesite.modules.core.dao.CoreYgfymxbDao;

/**
 * 员工费用明细表Service
 * @author tjh
 * @version 2025-01-12
 */
@Service
public class CoreYgfymxbService extends CrudService<CoreYgfymxbDao, CoreYgfymxb> {
	
	/**
	 * 获取单条数据
	 * @param coreYgfymxb
	 * @return
	 */
	@Override
	public CoreYgfymxb get(CoreYgfymxb coreYgfymxb) {
		return super.get(coreYgfymxb);
	}
	
	/**
	 * 查询分页数据
	 * @param coreYgfymxb 查询条件
	 * @param coreYgfymxb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreYgfymxb> findPage(CoreYgfymxb coreYgfymxb) {
		return super.findPage(coreYgfymxb);
	}
	
	/**
	 * 查询列表数据
	 * @param coreYgfymxb
	 * @return
	 */
	@Override
	public List<CoreYgfymxb> findList(CoreYgfymxb coreYgfymxb) {
		return super.findList(coreYgfymxb);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreYgfymxb
	 */
	@Override
	@Transactional
	public void save(CoreYgfymxb coreYgfymxb) {
		super.save(coreYgfymxb);
	}
	
	/**
	 * 更新状态
	 * @param coreYgfymxb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreYgfymxb coreYgfymxb) {
		super.updateStatus(coreYgfymxb);
	}
	
	/**
	 * 删除数据
	 * @param coreYgfymxb
	 */
	@Override
	@Transactional
	public void delete(CoreYgfymxb coreYgfymxb) {
		super.delete(coreYgfymxb);
	}
	
}