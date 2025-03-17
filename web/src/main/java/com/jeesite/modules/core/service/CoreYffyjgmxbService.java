package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreYffyjgmxb;
import com.jeesite.modules.core.dao.CoreYffyjgmxbDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 研发费用结构明细表Service
 * @author tjh
 * @version 2025-01-15
 */
@Service
public class CoreYffyjgmxbService extends CrudService<CoreYffyjgmxbDao, CoreYffyjgmxb> {
	
	/**
	 * 获取单条数据
	 * @param coreYffyjgmxb
	 * @return
	 */
	@Override
	public CoreYffyjgmxb get(CoreYffyjgmxb coreYffyjgmxb) {
		return super.get(coreYffyjgmxb);
	}
	
	/**
	 * 查询分页数据
	 * @param coreYffyjgmxb 查询条件
	 * @param coreYffyjgmxb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreYffyjgmxb> findPage(CoreYffyjgmxb coreYffyjgmxb) {
		return super.findPage(coreYffyjgmxb);
	}
	
	/**
	 * 查询列表数据
	 * @param coreYffyjgmxb
	 * @return
	 */
	@Override
	public List<CoreYffyjgmxb> findList(CoreYffyjgmxb coreYffyjgmxb) {
		return super.findList(coreYffyjgmxb);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreYffyjgmxb
	 */
	@Override
	@Transactional
	public void save(CoreYffyjgmxb coreYffyjgmxb) {
		super.save(coreYffyjgmxb);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreYffyjgmxb, coreYffyjgmxb.getId(), "coreYffyjgmxb_file");
	}
	
	/**
	 * 更新状态
	 * @param coreYffyjgmxb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreYffyjgmxb coreYffyjgmxb) {
		super.updateStatus(coreYffyjgmxb);
	}
	
	/**
	 * 删除数据
	 * @param coreYffyjgmxb
	 */
	@Override
	@Transactional
	public void delete(CoreYffyjgmxb coreYffyjgmxb) {
		super.delete(coreYffyjgmxb);
	}
	
}