package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreYffyjjkcyhmxb;
import com.jeesite.modules.core.dao.CoreYffyjjkcyhmxbDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 研发费用加计扣除优惠明细表Service
 * @author tjh
 * @version 2025-01-20
 */
@Service
public class CoreYffyjjkcyhmxbService extends CrudService<CoreYffyjjkcyhmxbDao, CoreYffyjjkcyhmxb> {
	
	/**
	 * 获取单条数据
	 * @param coreYffyjjkcyhmxb
	 * @return
	 */
	@Override
	public CoreYffyjjkcyhmxb get(CoreYffyjjkcyhmxb coreYffyjjkcyhmxb) {
		return super.get(coreYffyjjkcyhmxb);
	}
	
	/**
	 * 查询分页数据
	 * @param coreYffyjjkcyhmxb 查询条件
	 * @param coreYffyjjkcyhmxb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreYffyjjkcyhmxb> findPage(CoreYffyjjkcyhmxb coreYffyjjkcyhmxb) {
		return super.findPage(coreYffyjjkcyhmxb);
	}
	
	/**
	 * 查询列表数据
	 * @param coreYffyjjkcyhmxb
	 * @return
	 */
	@Override
	public List<CoreYffyjjkcyhmxb> findList(CoreYffyjjkcyhmxb coreYffyjjkcyhmxb) {
		return super.findList(coreYffyjjkcyhmxb);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreYffyjjkcyhmxb
	 */
	@Override
	@Transactional
	public void save(CoreYffyjjkcyhmxb coreYffyjjkcyhmxb) {
		super.save(coreYffyjjkcyhmxb);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreYffyjjkcyhmxb, coreYffyjjkcyhmxb.getId(), "coreYffyjjkcyhmxb_file");
	}
	
	/**
	 * 更新状态
	 * @param coreYffyjjkcyhmxb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreYffyjjkcyhmxb coreYffyjjkcyhmxb) {
		super.updateStatus(coreYffyjjkcyhmxb);
	}
	
	/**
	 * 删除数据
	 * @param coreYffyjjkcyhmxb
	 */
	@Override
	@Transactional
	public void delete(CoreYffyjjkcyhmxb coreYffyjjkcyhmxb) {
		super.delete(coreYffyjjkcyhmxb);
	}
	
}