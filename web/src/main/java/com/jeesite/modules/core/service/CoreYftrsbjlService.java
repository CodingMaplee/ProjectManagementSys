package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreYftrsbjl;
import com.jeesite.modules.core.dao.CoreYftrsbjlDao;

/**
 * 研发投入设备记录Service
 * @author zhw
 * @version 2024-11-28
 */
@Service
public class CoreYftrsbjlService extends CrudService<CoreYftrsbjlDao, CoreYftrsbjl> {
	
	/**
	 * 获取单条数据
	 * @param coreYftrsbjl
	 * @return
	 */
	@Override
	public CoreYftrsbjl get(CoreYftrsbjl coreYftrsbjl) {
		return super.get(coreYftrsbjl);
	}
	
	/**
	 * 查询分页数据
	 * @param coreYftrsbjl 查询条件
	 * @param coreYftrsbjl page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreYftrsbjl> findPage(CoreYftrsbjl coreYftrsbjl) {
		return super.findPage(coreYftrsbjl);
	}
	
	/**
	 * 查询列表数据
	 * @param coreYftrsbjl
	 * @return
	 */
	@Override
	public List<CoreYftrsbjl> findList(CoreYftrsbjl coreYftrsbjl) {
		return super.findList(coreYftrsbjl);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreYftrsbjl
	 */
	@Override
	@Transactional
	public void save(CoreYftrsbjl coreYftrsbjl) {
		super.save(coreYftrsbjl);
	}
	
	/**
	 * 更新状态
	 * @param coreYftrsbjl
	 */
	@Override
	@Transactional
	public void updateStatus(CoreYftrsbjl coreYftrsbjl) {
		super.updateStatus(coreYftrsbjl);
	}
	
	/**
	 * 删除数据
	 * @param coreYftrsbjl
	 */
	@Override
	@Transactional
	public void delete(CoreYftrsbjl coreYftrsbjl) {
		super.delete(coreYftrsbjl);
	}
	
}