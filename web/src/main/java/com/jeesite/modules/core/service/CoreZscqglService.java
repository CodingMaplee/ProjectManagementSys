package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreZscqgl;
import com.jeesite.modules.core.dao.CoreZscqglDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 知识产权管理Service
 * @author zhw
 * @version 2024-11-28
 */
@Service
public class CoreZscqglService extends CrudService<CoreZscqglDao, CoreZscqgl> {
	
	/**
	 * 获取单条数据
	 * @param coreZscqgl
	 * @return
	 */
	@Override
	public CoreZscqgl get(CoreZscqgl coreZscqgl) {
		return super.get(coreZscqgl);
	}
	
	/**
	 * 查询分页数据
	 * @param coreZscqgl 查询条件
	 * @param coreZscqgl page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreZscqgl> findPage(CoreZscqgl coreZscqgl) {
		return super.findPage(coreZscqgl);
	}
	
	/**
	 * 查询列表数据
	 * @param coreZscqgl
	 * @return
	 */
	@Override
	public List<CoreZscqgl> findList(CoreZscqgl coreZscqgl) {
		return super.findList(coreZscqgl);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreZscqgl
	 */
	@Override
	@Transactional
	public void save(CoreZscqgl coreZscqgl) {
		super.save(coreZscqgl);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreZscqgl, coreZscqgl.getId(), "coreZscqgl_file");
	}
	
	/**
	 * 更新状态
	 * @param coreZscqgl
	 */
	@Override
	@Transactional
	public void updateStatus(CoreZscqgl coreZscqgl) {
		super.updateStatus(coreZscqgl);
	}
	
	/**
	 * 删除数据
	 * @param coreZscqgl
	 */
	@Override
	@Transactional
	public void delete(CoreZscqgl coreZscqgl) {
		super.delete(coreZscqgl);
	}
	
}