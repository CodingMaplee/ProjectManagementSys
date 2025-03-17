package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreKjcxbg;
import com.jeesite.modules.core.dao.CoreKjcxbgDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 科技查新报告Service
 * @author tjh
 * @version 2025-01-20
 */
@Service
public class CoreKjcxbgService extends CrudService<CoreKjcxbgDao, CoreKjcxbg> {
	
	/**
	 * 获取单条数据
	 * @param coreKjcxbg
	 * @return
	 */
	@Override
	public CoreKjcxbg get(CoreKjcxbg coreKjcxbg) {
		return super.get(coreKjcxbg);
	}
	
	/**
	 * 查询分页数据
	 * @param coreKjcxbg 查询条件
	 * @param coreKjcxbg page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreKjcxbg> findPage(CoreKjcxbg coreKjcxbg) {
		return super.findPage(coreKjcxbg);
	}
	
	/**
	 * 查询列表数据
	 * @param coreKjcxbg
	 * @return
	 */
	@Override
	public List<CoreKjcxbg> findList(CoreKjcxbg coreKjcxbg) {
		return super.findList(coreKjcxbg);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreKjcxbg
	 */
	@Override
	@Transactional
	public void save(CoreKjcxbg coreKjcxbg) {
		super.save(coreKjcxbg);
		// 保存上传图片
		FileUploadUtils.saveFileUpload(coreKjcxbg, coreKjcxbg.getId(), "coreKjcxbg_image");
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreKjcxbg, coreKjcxbg.getId(), "coreKjcxbg_file");
	}
	
	/**
	 * 更新状态
	 * @param coreKjcxbg
	 */
	@Override
	@Transactional
	public void updateStatus(CoreKjcxbg coreKjcxbg) {
		super.updateStatus(coreKjcxbg);
	}
	
	/**
	 * 删除数据
	 * @param coreKjcxbg
	 */
	@Override
	@Transactional
	public void delete(CoreKjcxbg coreKjcxbg) {
		super.delete(coreKjcxbg);
	}
	
}