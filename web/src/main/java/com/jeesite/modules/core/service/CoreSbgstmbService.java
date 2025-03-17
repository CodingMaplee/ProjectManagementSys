package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreSbgstmb;
import com.jeesite.modules.core.dao.CoreSbgstmbDao;

/**
 * 设备工时条目表Service
 * @author zhw
 * @version 2024-12-20
 */
@Service
public class CoreSbgstmbService extends CrudService<CoreSbgstmbDao, CoreSbgstmb> {

	/**
	 * 获取单条数据
	 * @param coreSbgstmb
	 * @return
	 */
	@Override
	public CoreSbgstmb get(CoreSbgstmb coreSbgstmb) {
		return super.get(coreSbgstmb);
	}

	/**
	 * 查询分页数据
	 * @param coreSbgstmb 查询条件
	 * @param coreSbgstmb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreSbgstmb> findPage(CoreSbgstmb coreSbgstmb) {
		return super.findPage(coreSbgstmb);
	}

	/**
	 * 查询列表数据
	 * @param coreSbgstmb
	 * @return
	 */
	@Override
	public List<CoreSbgstmb> findList(CoreSbgstmb coreSbgstmb) {
		return super.findList(coreSbgstmb);
	}

	/**
	 * 保存数据（插入或更新）
	 * @param coreSbgstmb
	 */
	@Override
	@Transactional
	public void save(CoreSbgstmb coreSbgstmb) {
		super.save(coreSbgstmb);
	}

	/**
	 * 更新状态
	 * @param coreSbgstmb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreSbgstmb coreSbgstmb) {
		super.updateStatus(coreSbgstmb);
	}

	/**
	 * 删除数据
	 * @param coreSbgstmb
	 */
	@Override
	@Transactional
	public void delete(CoreSbgstmb coreSbgstmb) {
		super.delete(coreSbgstmb);
	}

}