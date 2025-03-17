package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreLxjhs;
import com.jeesite.modules.core.dao.CoreLxjhsDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 立项计划书Service
 * @author tjh
 * @version 2025-01-20
 */
@Service
public class CoreLxjhsService extends CrudService<CoreLxjhsDao, CoreLxjhs> {
	
	/**
	 * 获取单条数据
	 * @param coreLxjhs
	 * @return
	 */
	@Override
	public CoreLxjhs get(CoreLxjhs coreLxjhs) {
		return super.get(coreLxjhs);
	}
	
	/**
	 * 查询分页数据
	 * @param coreLxjhs 查询条件
	 * @param coreLxjhs page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreLxjhs> findPage(CoreLxjhs coreLxjhs) {
		return super.findPage(coreLxjhs);
	}
	
	/**
	 * 查询列表数据
	 * @param coreLxjhs
	 * @return
	 */
	@Override
	public List<CoreLxjhs> findList(CoreLxjhs coreLxjhs) {
		return super.findList(coreLxjhs);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreLxjhs
	 */
	@Override
	@Transactional
	public void save(CoreLxjhs coreLxjhs) {
		super.save(coreLxjhs);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreLxjhs, coreLxjhs.getId(), "coreLxjhs_file");
	}
	
	/**
	 * 更新状态
	 * @param coreLxjhs
	 */
	@Override
	@Transactional
	public void updateStatus(CoreLxjhs coreLxjhs) {
		super.updateStatus(coreLxjhs);
	}
	
	/**
	 * 删除数据
	 * @param coreLxjhs
	 */
	@Override
	@Transactional
	public void delete(CoreLxjhs coreLxjhs) {
		super.delete(coreLxjhs);
	}
	
}