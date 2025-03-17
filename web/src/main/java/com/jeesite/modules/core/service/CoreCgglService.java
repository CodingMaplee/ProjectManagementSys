package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreCggl;
import com.jeesite.modules.core.dao.CoreCgglDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 成果管理Service
 * @author zhw
 * @version 2024-11-28
 */
@Service
public class CoreCgglService extends CrudService<CoreCgglDao, CoreCggl> {
	
	/**
	 * 获取单条数据
	 * @param coreCggl
	 * @return
	 */
	@Override
	public CoreCggl get(CoreCggl coreCggl) {
		return super.get(coreCggl);
	}
	
	/**
	 * 查询分页数据
	 * @param coreCggl 查询条件
	 * @param coreCggl page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreCggl> findPage(CoreCggl coreCggl) {
		return super.findPage(coreCggl);
	}
	
	/**
	 * 查询列表数据
	 * @param coreCggl
	 * @return
	 */
	@Override
	public List<CoreCggl> findList(CoreCggl coreCggl) {
		return super.findList(coreCggl);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreCggl
	 */
	@Override
	@Transactional
	public void save(CoreCggl coreCggl) {
		super.save(coreCggl);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreCggl, coreCggl.getId(), "coreCggl_file");
	}
	
	/**
	 * 更新状态
	 * @param coreCggl
	 */
	@Override
	@Transactional
	public void updateStatus(CoreCggl coreCggl) {
		super.updateStatus(coreCggl);
	}
	
	/**
	 * 删除数据
	 * @param coreCggl
	 */
	@Override
	@Transactional
	public void delete(CoreCggl coreCggl) {
		super.delete(coreCggl);
	}
	
}