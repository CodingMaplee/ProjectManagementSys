package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreKxxbg;
import com.jeesite.modules.core.dao.CoreKxxbgDao;

/**
 * 可行性评估报告Service
 * @author tjh
 * @version 2025-02-19
 */
@Service
public class CoreKxxbgService extends CrudService<CoreKxxbgDao, CoreKxxbg> {
	
	/**
	 * 获取单条数据
	 * @param coreKxxbg
	 * @return
	 */
	@Override
	public CoreKxxbg get(CoreKxxbg coreKxxbg) {
		return super.get(coreKxxbg);
	}
	
	/**
	 * 查询分页数据
	 * @param coreKxxbg 查询条件
	 * @param coreKxxbg page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreKxxbg> findPage(CoreKxxbg coreKxxbg) {
		return super.findPage(coreKxxbg);
	}
	
	/**
	 * 查询列表数据
	 * @param coreKxxbg
	 * @return
	 */
	@Override
	public List<CoreKxxbg> findList(CoreKxxbg coreKxxbg) {
		return super.findList(coreKxxbg);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreKxxbg
	 */
	@Override
	@Transactional
	public void save(CoreKxxbg coreKxxbg) {
		super.save(coreKxxbg);
	}
	
	/**
	 * 更新状态
	 * @param coreKxxbg
	 */
	@Override
	@Transactional
	public void updateStatus(CoreKxxbg coreKxxbg) {
		super.updateStatus(coreKxxbg);
	}
	
	/**
	 * 删除数据
	 * @param coreKxxbg
	 */
	@Override
	@Transactional
	public void delete(CoreKxxbg coreKxxbg) {
		super.delete(coreKxxbg);
	}
	
}