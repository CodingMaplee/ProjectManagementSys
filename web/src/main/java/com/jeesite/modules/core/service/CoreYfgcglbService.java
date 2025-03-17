package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreYfgcglb;
import com.jeesite.modules.core.dao.CoreYfgcglbDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 研发过程管理表Service
 * @author zhw
 * @version 2024-12-23
 */
@Service
public class CoreYfgcglbService extends CrudService<CoreYfgcglbDao, CoreYfgcglb> {
	
	/**
	 * 获取单条数据
	 * @param coreYfgcglb
	 * @return
	 */
	@Override
	public CoreYfgcglb get(CoreYfgcglb coreYfgcglb) {
		return super.get(coreYfgcglb);
	}
	
	/**
	 * 查询分页数据
	 * @param coreYfgcglb 查询条件
	 * @param coreYfgcglb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreYfgcglb> findPage(CoreYfgcglb coreYfgcglb) {
		return super.findPage(coreYfgcglb);
	}
	
	/**
	 * 查询列表数据
	 * @param coreYfgcglb
	 * @return
	 */
	@Override
	public List<CoreYfgcglb> findList(CoreYfgcglb coreYfgcglb) {
		return super.findList(coreYfgcglb);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreYfgcglb
	 */
	@Override
	@Transactional
	public void save(CoreYfgcglb coreYfgcglb) {
		super.save(coreYfgcglb);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreYfgcglb, coreYfgcglb.getId(), "coreYfgcglb_file");
	}
	
	/**
	 * 更新状态
	 * @param coreYfgcglb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreYfgcglb coreYfgcglb) {
		super.updateStatus(coreYfgcglb);
	}
	
	/**
	 * 删除数据
	 * @param coreYfgcglb
	 */
	@Override
	@Transactional
	public void delete(CoreYfgcglb coreYfgcglb) {
		super.delete(coreYfgcglb);
	}
	
}