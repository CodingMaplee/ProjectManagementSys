package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreYfxmlxjy;
import com.jeesite.modules.core.dao.CoreYfxmlxjyDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 研发项目立项决议Service
 * @author tjh
 * @version 2025-01-20
 */
@Service
public class CoreYfxmlxjyService extends CrudService<CoreYfxmlxjyDao, CoreYfxmlxjy> {
	
	/**
	 * 获取单条数据
	 * @param coreYfxmlxjy
	 * @return
	 */
	@Override
	public CoreYfxmlxjy get(CoreYfxmlxjy coreYfxmlxjy) {
		return super.get(coreYfxmlxjy);
	}
	
	/**
	 * 查询分页数据
	 * @param coreYfxmlxjy 查询条件
	 * @param coreYfxmlxjy page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreYfxmlxjy> findPage(CoreYfxmlxjy coreYfxmlxjy) {
		return super.findPage(coreYfxmlxjy);
	}
	
	/**
	 * 查询列表数据
	 * @param coreYfxmlxjy
	 * @return
	 */
	@Override
	public List<CoreYfxmlxjy> findList(CoreYfxmlxjy coreYfxmlxjy) {
		return super.findList(coreYfxmlxjy);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreYfxmlxjy
	 */
	@Override
	@Transactional
	public void save(CoreYfxmlxjy coreYfxmlxjy) {
		super.save(coreYfxmlxjy);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreYfxmlxjy, coreYfxmlxjy.getId(), "coreYfxmlxjy_file");
	}
	
	/**
	 * 更新状态
	 * @param coreYfxmlxjy
	 */
	@Override
	@Transactional
	public void updateStatus(CoreYfxmlxjy coreYfxmlxjy) {
		super.updateStatus(coreYfxmlxjy);
	}
	
	/**
	 * 删除数据
	 * @param coreYfxmlxjy
	 */
	@Override
	@Transactional
	public void delete(CoreYfxmlxjy coreYfxmlxjy) {
		super.delete(coreYfxmlxjy);
	}
	
}