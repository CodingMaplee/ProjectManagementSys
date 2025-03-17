package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreJdxgzbgjl;
import com.jeesite.modules.core.dao.CoreJdxgzbgjlDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 阶段性工作报告记录Service
 * @author tjh
 * @version 2025-01-21
 */
@Service
public class CoreJdxgzbgjlService extends CrudService<CoreJdxgzbgjlDao, CoreJdxgzbgjl> {
	
	/**
	 * 获取单条数据
	 * @param coreJdxgzbgjl
	 * @return
	 */
	@Override
	public CoreJdxgzbgjl get(CoreJdxgzbgjl coreJdxgzbgjl) {
		return super.get(coreJdxgzbgjl);
	}
	
	/**
	 * 查询分页数据
	 * @param coreJdxgzbgjl 查询条件
	 * @param coreJdxgzbgjl page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreJdxgzbgjl> findPage(CoreJdxgzbgjl coreJdxgzbgjl) {
		return super.findPage(coreJdxgzbgjl);
	}
	
	/**
	 * 查询列表数据
	 * @param coreJdxgzbgjl
	 * @return
	 */
	@Override
	public List<CoreJdxgzbgjl> findList(CoreJdxgzbgjl coreJdxgzbgjl) {
		return super.findList(coreJdxgzbgjl);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreJdxgzbgjl
	 */
	@Override
	@Transactional
	public void save(CoreJdxgzbgjl coreJdxgzbgjl) {
		super.save(coreJdxgzbgjl);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreJdxgzbgjl, coreJdxgzbgjl.getId(), "coreJdxgzbgjl_file");
	}
	
	/**
	 * 更新状态
	 * @param coreJdxgzbgjl
	 */
	@Override
	@Transactional
	public void updateStatus(CoreJdxgzbgjl coreJdxgzbgjl) {
		super.updateStatus(coreJdxgzbgjl);
	}
	
	/**
	 * 删除数据
	 * @param coreJdxgzbgjl
	 */
	@Override
	@Transactional
	public void delete(CoreJdxgzbgjl coreJdxgzbgjl) {
		super.delete(coreJdxgzbgjl);
	}
	
}