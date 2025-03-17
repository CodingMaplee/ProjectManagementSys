package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreYjkfxmfyysb;
import com.jeesite.modules.core.dao.CoreYjkfxmfyysbDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 研究开发项目费用预算表Service
 * @author tjh
 * @version 2025-01-15
 */
@Service
public class CoreYjkfxmfyysbService extends CrudService<CoreYjkfxmfyysbDao, CoreYjkfxmfyysb> {
	
	/**
	 * 获取单条数据
	 * @param coreYjkfxmfyysb
	 * @return
	 */
	@Override
	public CoreYjkfxmfyysb get(CoreYjkfxmfyysb coreYjkfxmfyysb) {
		return super.get(coreYjkfxmfyysb);
	}
	
	/**
	 * 查询分页数据
	 * @param coreYjkfxmfyysb 查询条件
	 * @param coreYjkfxmfyysb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreYjkfxmfyysb> findPage(CoreYjkfxmfyysb coreYjkfxmfyysb) {
		return super.findPage(coreYjkfxmfyysb);
	}
	
	/**
	 * 查询列表数据
	 * @param coreYjkfxmfyysb
	 * @return
	 */
	@Override
	public List<CoreYjkfxmfyysb> findList(CoreYjkfxmfyysb coreYjkfxmfyysb) {
		return super.findList(coreYjkfxmfyysb);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreYjkfxmfyysb
	 */
	@Override
	@Transactional
	public void save(CoreYjkfxmfyysb coreYjkfxmfyysb) {
		super.save(coreYjkfxmfyysb);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreYjkfxmfyysb, coreYjkfxmfyysb.getId(), "coreYjkfxmfyysb_file");
	}
	
	/**
	 * 更新状态
	 * @param coreYjkfxmfyysb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreYjkfxmfyysb coreYjkfxmfyysb) {
		super.updateStatus(coreYjkfxmfyysb);
	}
	
	/**
	 * 删除数据
	 * @param coreYjkfxmfyysb
	 */
	@Override
	@Transactional
	public void delete(CoreYjkfxmfyysb coreYjkfxmfyysb) {
		super.delete(coreYjkfxmfyysb);
	}
	
}