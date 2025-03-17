package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreYfgstjb;
import com.jeesite.modules.core.dao.CoreYfgstjbDao;

/**
 * 研发工时统计表Service
 * @author zhw
 * @version 2024-12-18
 */
@Service
public class CoreYfgstjbService extends CrudService<CoreYfgstjbDao, CoreYfgstjb> {

	/**
	 * 获取单条数据
	 * @param coreYfgstjb
	 * @return
	 */
	@Override
	public CoreYfgstjb get(CoreYfgstjb coreYfgstjb) {
		return super.get(coreYfgstjb);
	}

	/**
	 * 查询分页数据
	 * @param coreYfgstjb 查询条件
	 * @param coreYfgstjb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreYfgstjb> findPage(CoreYfgstjb coreYfgstjb) {
		return super.findPage(coreYfgstjb);
	}

	/**
	 * 查询列表数据
	 * @param coreYfgstjb
	 * @return
	 */
	@Override
	public List<CoreYfgstjb> findList(CoreYfgstjb coreYfgstjb) {
		return super.findList(coreYfgstjb);
	}

	/**
	 * 保存数据（插入或更新）
	 * @param coreYfgstjb
	 */
	@Override
	@Transactional
	public void save(CoreYfgstjb coreYfgstjb) {
		super.save(coreYfgstjb);
	}

	/**
	 * 更新状态
	 * @param coreYfgstjb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreYfgstjb coreYfgstjb) {
		super.updateStatus(coreYfgstjb);
	}

	/**
	 * 删除数据
	 * @param coreYfgstjb
	 */
	@Override
	@Transactional
	public void delete(CoreYfgstjb coreYfgstjb) {
		super.delete(coreYfgstjb);
	}

}