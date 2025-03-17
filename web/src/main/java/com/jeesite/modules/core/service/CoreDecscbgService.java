package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreDecscbg;
import com.jeesite.modules.core.dao.CoreDecscbgDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 试产报告Service
 * @author tjh
 * @version 2025-01-21
 */
@Service
public class CoreDecscbgService extends CrudService<CoreDecscbgDao, CoreDecscbg> {
	
	/**
	 * 获取单条数据
	 * @param coreDecscbg
	 * @return
	 */
	@Override
	public CoreDecscbg get(CoreDecscbg coreDecscbg) {
		return super.get(coreDecscbg);
	}
	
	/**
	 * 查询分页数据
	 * @param coreDecscbg 查询条件
	 * @param coreDecscbg page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreDecscbg> findPage(CoreDecscbg coreDecscbg) {
		return super.findPage(coreDecscbg);
	}
	
	/**
	 * 查询列表数据
	 * @param coreDecscbg
	 * @return
	 */
	@Override
	public List<CoreDecscbg> findList(CoreDecscbg coreDecscbg) {
		return super.findList(coreDecscbg);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreDecscbg
	 */
	@Override
	@Transactional
	public void save(CoreDecscbg coreDecscbg) {
		super.save(coreDecscbg);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreDecscbg, coreDecscbg.getId(), "coreDecscbg_file");
	}
	
	/**
	 * 更新状态
	 * @param coreDecscbg
	 */
	@Override
	@Transactional
	public void updateStatus(CoreDecscbg coreDecscbg) {
		super.updateStatus(coreDecscbg);
	}
	
	/**
	 * 删除数据
	 * @param coreDecscbg
	 */
	@Override
	@Transactional
	public void delete(CoreDecscbg coreDecscbg) {
		super.delete(coreDecscbg);
	}
	
}