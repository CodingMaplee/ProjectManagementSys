package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreZjlbghyjy;
import com.jeesite.modules.core.dao.CoreZjlbghyjyDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 总经理办公会议纪要Service
 * @author tjh
 * @version 2025-01-20
 */
@Service
public class CoreZjlbghyjyService extends CrudService<CoreZjlbghyjyDao, CoreZjlbghyjy> {
	
	/**
	 * 获取单条数据
	 * @param coreZjlbghyjy
	 * @return
	 */
	@Override
	public CoreZjlbghyjy get(CoreZjlbghyjy coreZjlbghyjy) {
		return super.get(coreZjlbghyjy);
	}
	
	/**
	 * 查询分页数据
	 * @param coreZjlbghyjy 查询条件
	 * @param coreZjlbghyjy page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreZjlbghyjy> findPage(CoreZjlbghyjy coreZjlbghyjy) {
		return super.findPage(coreZjlbghyjy);
	}
	
	/**
	 * 查询列表数据
	 * @param coreZjlbghyjy
	 * @return
	 */
	@Override
	public List<CoreZjlbghyjy> findList(CoreZjlbghyjy coreZjlbghyjy) {
		return super.findList(coreZjlbghyjy);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreZjlbghyjy
	 */
	@Override
	@Transactional
	public void save(CoreZjlbghyjy coreZjlbghyjy) {
		super.save(coreZjlbghyjy);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreZjlbghyjy, coreZjlbghyjy.getId(), "coreZjlbghyjy_file");
	}
	
	/**
	 * 更新状态
	 * @param coreZjlbghyjy
	 */
	@Override
	@Transactional
	public void updateStatus(CoreZjlbghyjy coreZjlbghyjy) {
		super.updateStatus(coreZjlbghyjy);
	}
	
	/**
	 * 删除数据
	 * @param coreZjlbghyjy
	 */
	@Override
	@Transactional
	public void delete(CoreZjlbghyjy coreZjlbghyjy) {
		super.delete(coreZjlbghyjy);
	}
	
}