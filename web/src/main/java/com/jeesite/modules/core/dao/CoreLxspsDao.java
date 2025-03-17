package com.jeesite.modules.core.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.core.entity.CoreLxsps;

/**
 * 立项审批书DAO接口
 * @author tjh
 * @version 2025-01-19
 */
@MyBatisDao
public interface CoreLxspsDao extends CrudDao<CoreLxsps> {
	
}