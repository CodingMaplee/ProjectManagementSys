package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreJjkcyhmxb;
import com.jeesite.modules.core.dao.CoreJjkcyhmxbDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 加计扣除优惠明细表Service
 * @author tjh
 * @version 2025-01-12
 */
@Service
public class CoreJjkcyhmxbService extends CrudService<CoreJjkcyhmxbDao, CoreJjkcyhmxb> {
	
	/**
	 * 获取单条数据
	 * @param coreJjkcyhmxb
	 * @return
	 */
	@Override
	public CoreJjkcyhmxb get(CoreJjkcyhmxb coreJjkcyhmxb) {
		return super.get(coreJjkcyhmxb);
	}
	
	/**
	 * 查询分页数据
	 * @param coreJjkcyhmxb 查询条件
	 * @param coreJjkcyhmxb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreJjkcyhmxb> findPage(CoreJjkcyhmxb coreJjkcyhmxb) {
		return super.findPage(coreJjkcyhmxb);
	}
	
	/**
	 * 查询列表数据
	 * @param coreJjkcyhmxb
	 * @return
	 */
	@Override
	public List<CoreJjkcyhmxb> findList(CoreJjkcyhmxb coreJjkcyhmxb) {
		return super.findList(coreJjkcyhmxb);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreJjkcyhmxb
	 */
	@Override
	@Transactional
	public void save(CoreJjkcyhmxb coreJjkcyhmxb) {
		super.save(coreJjkcyhmxb);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreJjkcyhmxb, coreJjkcyhmxb.getId(), "coreJjkcyhmxb_file");
	}
	
	/**
	 * 更新状态
	 * @param coreJjkcyhmxb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreJjkcyhmxb coreJjkcyhmxb) {
		super.updateStatus(coreJjkcyhmxb);
	}
	
	/**
	 * 删除数据
	 * @param coreJjkcyhmxb
	 */
	@Override
	@Transactional
	public void delete(CoreJjkcyhmxb coreJjkcyhmxb) {
		super.delete(coreJjkcyhmxb);
	}
	
}