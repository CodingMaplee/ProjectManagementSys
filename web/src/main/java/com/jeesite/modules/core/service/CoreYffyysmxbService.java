package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreYffyysmxb;
import com.jeesite.modules.core.dao.CoreYffyysmxbDao;

/**
 * 研发费用预算明细表Service
 * @author zhw
 * @version 2024-12-17
 */
@Service
public class CoreYffyysmxbService extends CrudService<CoreYffyysmxbDao, CoreYffyysmxb> {
	
	/**
	 * 获取单条数据
	 * @param coreYffyysmxb
	 * @return
	 */
	@Override
	public CoreYffyysmxb get(CoreYffyysmxb coreYffyysmxb) {
		return super.get(coreYffyysmxb);
	}
	
	/**
	 * 查询分页数据
	 * @param coreYffyysmxb 查询条件
	 * @param coreYffyysmxb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreYffyysmxb> findPage(CoreYffyysmxb coreYffyysmxb) {
		return super.findPage(coreYffyysmxb);
	}
	
	/**
	 * 查询列表数据
	 * @param coreYffyysmxb
	 * @return
	 */
	@Override
	public List<CoreYffyysmxb> findList(CoreYffyysmxb coreYffyysmxb) {
		return super.findList(coreYffyysmxb);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreYffyysmxb
	 */
	@Override
	@Transactional
	public void save(CoreYffyysmxb coreYffyysmxb) {
		super.save(coreYffyysmxb);
	}
	
	/**
	 * 更新状态
	 * @param coreYffyysmxb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreYffyysmxb coreYffyysmxb) {
		super.updateStatus(coreYffyysmxb);
	}
	
	/**
	 * 删除数据
	 * @param coreYffyysmxb
	 */
	@Override
	@Transactional
	public void delete(CoreYffyysmxb coreYffyysmxb) {
		super.delete(coreYffyysmxb);
	}
	
}