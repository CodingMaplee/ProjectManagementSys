package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreSbgstjb;
import com.jeesite.modules.core.dao.CoreSbgstjbDao;

/**
 * 设备工时统计表Service
 * @author zhw
 * @version 2024-12-18
 */
@Service
public class CoreSbgstjbService extends CrudService<CoreSbgstjbDao, CoreSbgstjb> {

	/**
	 * 获取单条数据
	 * @param coreSbgstjb
	 * @return
	 */
	@Override
	public CoreSbgstjb get(CoreSbgstjb coreSbgstjb) {
		return super.get(coreSbgstjb);
	}

	/**
	 * 查询分页数据
	 * @param coreSbgstjb 查询条件
	 * @param coreSbgstjb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreSbgstjb> findPage(CoreSbgstjb coreSbgstjb) {
		return super.findPage(coreSbgstjb);
	}

	/**
	 * 查询列表数据
	 * @param coreSbgstjb
	 * @return
	 */
	@Override
	public List<CoreSbgstjb> findList(CoreSbgstjb coreSbgstjb) {
		return super.findList(coreSbgstjb);
	}

	/**
	 * 保存数据（插入或更新）
	 * @param coreSbgstjb
	 */
	@Override
	@Transactional
	public void save(CoreSbgstjb coreSbgstjb) {
		super.save(coreSbgstjb);
	}

	/**
	 * 更新状态
	 * @param coreSbgstjb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreSbgstjb coreSbgstjb) {
		super.updateStatus(coreSbgstjb);
	}

	/**
	 * 删除数据
	 * @param coreSbgstjb
	 */
	@Override
	@Transactional
	public void delete(CoreSbgstjb coreSbgstjb) {
		super.delete(coreSbgstjb);
	}

}