package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreLxjy;
import com.jeesite.modules.core.dao.CoreLxjyDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 立项决议Service
 * @author tjh
 * @version 2025-01-20
 */
@Service
public class CoreLxjyService extends CrudService<CoreLxjyDao, CoreLxjy> {
	
	/**
	 * 获取单条数据
	 * @param coreLxjy
	 * @return
	 */
	@Override
	public CoreLxjy get(CoreLxjy coreLxjy) {
		return super.get(coreLxjy);
	}
	
	/**
	 * 查询分页数据
	 * @param coreLxjy 查询条件
	 * @param coreLxjy page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreLxjy> findPage(CoreLxjy coreLxjy) {
		return super.findPage(coreLxjy);
	}
	
	/**
	 * 查询列表数据
	 * @param coreLxjy
	 * @return
	 */
	@Override
	public List<CoreLxjy> findList(CoreLxjy coreLxjy) {
		return super.findList(coreLxjy);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreLxjy
	 */
	@Override
	@Transactional
	public void save(CoreLxjy coreLxjy) {
		super.save(coreLxjy);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreLxjy, coreLxjy.getId(), "coreLxjy_file");
	}
	
	/**
	 * 更新状态
	 * @param coreLxjy
	 */
	@Override
	@Transactional
	public void updateStatus(CoreLxjy coreLxjy) {
		super.updateStatus(coreLxjy);
	}
	
	/**
	 * 删除数据
	 * @param coreLxjy
	 */
	@Override
	@Transactional
	public void delete(CoreLxjy coreLxjy) {
		super.delete(coreLxjy);
	}
	
}