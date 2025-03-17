package com.jeesite.modules.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.core.entity.CoreXmglxxb;
import com.jeesite.modules.core.dao.CoreXmglxxbDao;
import com.jeesite.modules.file.utils.FileUploadUtils;

/**
 * 项目管理信息表Service
 * @author zhw
 * @version 2024-12-17
 */
@Service
public class CoreXmglxxbService extends CrudService<CoreXmglxxbDao, CoreXmglxxb> {
	@Autowired
	private CoreXmglxxbDao coreXmglxxbDao;  // 注入 DAO
	/**
	 * 根据项目ID获取项目名称
	 * @param projectId 项目ID
	 * @return 项目名称
	 */
	public String getProjectNameById(String projectId) {
		CoreXmglxxb coreXmglxxb = coreXmglxxbDao.get(projectId);  // 通过项目ID查询项目对象
		return (coreXmglxxb != null) ? coreXmglxxb.getGcglXmmc() : "";  // 返回项目名称
	}
	/**
	 * 根据项目ID获取项目Code
	 * @param projectId 项目ID
	 * @return 项目Code
	 */
	public String getProjectCodeById(String projectId) {
		CoreXmglxxb coreXmglxxb = coreXmglxxbDao.get(projectId);  // 通过项目ID查询项目对象
		return (coreXmglxxb != null) ? coreXmglxxb.getGcglXmbh() : "";  // 返回项目名称
	}

	/**
	 * 获取单条数据
	 * @param coreXmglxxb
	 * @return
	 */
	@Override
	public CoreXmglxxb get(CoreXmglxxb coreXmglxxb) {
		return super.get(coreXmglxxb);
	}

	/**
	 * 查询分页数据
	 * @param coreXmglxxb 查询条件
	 * @param coreXmglxxb page 分页对象
	 * @return
	 */
	@Override
	public Page<CoreXmglxxb> findPage(CoreXmglxxb coreXmglxxb) {
		return super.findPage(coreXmglxxb);
	}

	/**
	 * 查询列表数据
	 * @param coreXmglxxb
	 * @return
	 */
	@Override
	public List<CoreXmglxxb> findList(CoreXmglxxb coreXmglxxb) {
		return super.findList(coreXmglxxb);
	}

	/**
	 * 保存数据（插入或更新）
	 * @param coreXmglxxb
	 */
	@Override
	@Transactional
	public void save(CoreXmglxxb coreXmglxxb) {
		super.save(coreXmglxxb);
		// 保存上传附件
		FileUploadUtils.saveFileUpload(coreXmglxxb, coreXmglxxb.getId(), "coreXmglxxb_file");
	}

	/**
	 * 更新状态
	 * @param coreXmglxxb
	 */
	@Override
	@Transactional
	public void updateStatus(CoreXmglxxb coreXmglxxb) {
		super.updateStatus(coreXmglxxb);
	}

	/**
	 * 删除数据
	 * @param coreXmglxxb
	 */
	@Override
	@Transactional
	public void delete(CoreXmglxxb coreXmglxxb) {
		super.delete(coreXmglxxb);
	}

}