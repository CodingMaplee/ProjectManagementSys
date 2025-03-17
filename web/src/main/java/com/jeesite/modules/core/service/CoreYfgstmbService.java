package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreYfgstmb;
import com.jeesite.modules.core.dao.CoreYfgstmbDao;

/**
 * 研发工时条目表Service
 * @author zhw
 * @version 2024-12-20
 */
@Service
public class CoreYfgstmbService extends CrudService<CoreYfgstmbDao, CoreYfgstmb> {

	/**
	 * 获取单条数据
	 * @param coreYfgstmb
	 * @return
	 */
	@Override
	public CoreYfgstmb get(CoreYfgstmb coreYfgstmb) {
		return super.get(coreYfgstmb);
	}

	/**
	 * 查询分页数据
	 * @param coreYfgstmb 查询条件
	 * @param coreYfgstmb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreYfgstmb> findPage(CoreYfgstmb coreYfgstmb) {
		return super.findPage(coreYfgstmb);
	}

	/**
	 * 查询列表数据
	 * @param coreYfgstmb
	 * @return
	 */
	@Override
	public List<CoreYfgstmb> findList(CoreYfgstmb coreYfgstmb) {
		return super.findList(coreYfgstmb);
	}

	/**
	 * 保存数据（插入或更新）
	 * @param coreYfgstmb
	 */
	@Override
	@Transactional
	public void save(CoreYfgstmb coreYfgstmb) {
		super.save(coreYfgstmb);
	}

	/**
	 * 更新状态
	 * @param coreYfgstmb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreYfgstmb coreYfgstmb) {
		super.updateStatus(coreYfgstmb);
	}

	/**
	 * 删除数据
	 * @param coreYfgstmb
	 */
	@Override
	@Transactional
	public void delete(CoreYfgstmb coreYfgstmb) {
		super.delete(coreYfgstmb);
	}

}