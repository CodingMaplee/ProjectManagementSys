package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreXmkfjdjlb;
import com.jeesite.modules.core.dao.CoreXmkfjdjlbDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 项目开发进度记录表Service
 * @author tjh
 * @version 2025-01-21
 */
@Service
public class CoreXmkfjdjlbService extends CrudService<CoreXmkfjdjlbDao, CoreXmkfjdjlb> {
	
	/**
	 * 获取单条数据
	 * @param coreXmkfjdjlb
	 * @return
	 */
	@Override
	public CoreXmkfjdjlb get(CoreXmkfjdjlb coreXmkfjdjlb) {
		return super.get(coreXmkfjdjlb);
	}
	
	/**
	 * 查询分页数据
	 * @param coreXmkfjdjlb 查询条件
	 * @param coreXmkfjdjlb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreXmkfjdjlb> findPage(CoreXmkfjdjlb coreXmkfjdjlb) {
		return super.findPage(coreXmkfjdjlb);
	}
	
	/**
	 * 查询列表数据
	 * @param coreXmkfjdjlb
	 * @return
	 */
	@Override
	public List<CoreXmkfjdjlb> findList(CoreXmkfjdjlb coreXmkfjdjlb) {
		return super.findList(coreXmkfjdjlb);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreXmkfjdjlb
	 */
	@Override
	@Transactional
	public void save(CoreXmkfjdjlb coreXmkfjdjlb) {
		super.save(coreXmkfjdjlb);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreXmkfjdjlb, coreXmkfjdjlb.getId(), "coreXmkfjdjlb_file");
	}
	
	/**
	 * 更新状态
	 * @param coreXmkfjdjlb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreXmkfjdjlb coreXmkfjdjlb) {
		super.updateStatus(coreXmkfjdjlb);
	}
	
	/**
	 * 删除数据
	 * @param coreXmkfjdjlb
	 */
	@Override
	@Transactional
	public void delete(CoreXmkfjdjlb coreXmkfjdjlb) {
		super.delete(coreXmkfjdjlb);
	}
	
}