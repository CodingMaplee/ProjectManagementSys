package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreXmgl;
import com.jeesite.modules.core.dao.CoreXmglDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 项目管理Service
 * @author tjh
 * @version 2025-01-12
 */
@Service
public class CoreXmglService extends CrudService<CoreXmglDao, CoreXmgl> {
	
	/**
	 * 获取单条数据
	 * @param coreXmgl
	 * @return
	 */
	@Override
	public CoreXmgl get(CoreXmgl coreXmgl) {
		return super.get(coreXmgl);
	}
	
	/**
	 * 查询分页数据
	 * @param coreXmgl 查询条件
	 * @param coreXmgl page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreXmgl> findPage(CoreXmgl coreXmgl) {
		return super.findPage(coreXmgl);
	}
	
	/**
	 * 查询列表数据
	 * @param coreXmgl
	 * @return
	 */
	@Override
	public List<CoreXmgl> findList(CoreXmgl coreXmgl) {
		return super.findList(coreXmgl);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreXmgl
	 */
	@Override
	@Transactional
	public void save(CoreXmgl coreXmgl) {
		super.save(coreXmgl);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreXmgl, coreXmgl.getId(), "coreXmgl_file");
	}
	
	/**
	 * 更新状态
	 * @param coreXmgl
	 */
	@Override
	@Transactional
	public void updateStatus(CoreXmgl coreXmgl) {
		super.updateStatus(coreXmgl);
	}
	
	/**
	 * 删除数据
	 * @param coreXmgl
	 */
	@Override
	@Transactional
	public void delete(CoreXmgl coreXmgl) {
		super.delete(coreXmgl);
	}
	
}