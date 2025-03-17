package com.jeesite.modules.core.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreYjkfjghxmzdbzqkjzycymd;
import com.jeesite.modules.core.dao.CoreYjkfjghxmzdbzqkjzycymdDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 研究开发机构和项目组的编制情况 及主要成员名单Service
 * @author tjh
 * @version 2025-01-20
 */
@Service
public class CoreYjkfjghxmzdbzqkjzycymdService extends CrudService<CoreYjkfjghxmzdbzqkjzycymdDao, CoreYjkfjghxmzdbzqkjzycymd> {
	
	/**
	 * 获取单条数据
	 * @param coreYjkfjghxmzdbzqkjzycymd
	 * @return
	 */
	@Override
	public CoreYjkfjghxmzdbzqkjzycymd get(CoreYjkfjghxmzdbzqkjzycymd coreYjkfjghxmzdbzqkjzycymd) {
		return super.get(coreYjkfjghxmzdbzqkjzycymd);
	}
	
	/**
	 * 查询分页数据
	 * @param coreYjkfjghxmzdbzqkjzycymd 查询条件
	 * @param coreYjkfjghxmzdbzqkjzycymd page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreYjkfjghxmzdbzqkjzycymd> findPage(CoreYjkfjghxmzdbzqkjzycymd coreYjkfjghxmzdbzqkjzycymd) {
		return super.findPage(coreYjkfjghxmzdbzqkjzycymd);
	}
	
	/**
	 * 查询列表数据
	 * @param coreYjkfjghxmzdbzqkjzycymd
	 * @return
	 */
	@Override
	public List<CoreYjkfjghxmzdbzqkjzycymd> findList(CoreYjkfjghxmzdbzqkjzycymd coreYjkfjghxmzdbzqkjzycymd) {
		return super.findList(coreYjkfjghxmzdbzqkjzycymd);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param coreYjkfjghxmzdbzqkjzycymd
	 */
	@Override
	@Transactional
	public void save(CoreYjkfjghxmzdbzqkjzycymd coreYjkfjghxmzdbzqkjzycymd) {
		super.save(coreYjkfjghxmzdbzqkjzycymd);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreYjkfjghxmzdbzqkjzycymd, coreYjkfjghxmzdbzqkjzycymd.getId(), "coreYjkfjghxmzdbzqkjzycymd_file");
	}
	
	/**
	 * 更新状态
	 * @param coreYjkfjghxmzdbzqkjzycymd
	 */
	@Override
	@Transactional
	public void updateStatus(CoreYjkfjghxmzdbzqkjzycymd coreYjkfjghxmzdbzqkjzycymd) {
		super.updateStatus(coreYjkfjghxmzdbzqkjzycymd);
	}
	
	/**
	 * 删除数据
	 * @param coreYjkfjghxmzdbzqkjzycymd
	 */
	@Override
	@Transactional
	public void delete(CoreYjkfjghxmzdbzqkjzycymd coreYjkfjghxmzdbzqkjzycymd) {
		super.delete(coreYjkfjghxmzdbzqkjzycymd);
	}
	
}