package com.jeesite.modules.core.dao;

import org.apache.ibatis.annotations.Select;
import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.core.entity.CoreXmglxxb;

/**
 * 项目管理信息表DAO接口
 * @author zhw
 * @version 2024-12-17
 */
@MyBatisDao
public interface CoreXmglxxbDao extends CrudDao<CoreXmglxxb> {
    @Select("SELECT * FROM core_xmglxxb WHERE id = #{id}")
    CoreXmglxxb get(String id);  // 根据ID查询项目信息
}