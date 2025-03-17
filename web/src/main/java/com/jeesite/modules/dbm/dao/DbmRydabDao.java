package com.jeesite.modules.dbm.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.dbm.entity.DbmRydab;

/**
 * 人员档案表DAO接口
 * @author zhw
 * @version 2024-11-14
 */
@MyBatisDao
public interface DbmRydabDao extends CrudDao<DbmRydab> {
	
}