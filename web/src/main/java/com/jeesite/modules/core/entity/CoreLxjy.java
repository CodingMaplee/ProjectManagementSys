package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 立项决议Entity
 * @author tjh
 * @version 2025-01-20
 */
@Table(name="core_lxjy", alias="a", label="立项决议信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="lxjy_xmbh", attrName="lxjyXmbh", label="项目编号"),
		@Column(name="lxjy_xmmc", attrName="lxjyXmmc", label="项目名称"),
	}, orderBy="a.id DESC"
)
public class CoreLxjy extends DataEntity<CoreLxjy> {
	
	private static final long serialVersionUID = 1L;
	private String lxjyXmbh;		// 项目编号
	private String lxjyXmmc;		// 项目名称

	public CoreLxjy() {
		this(null);
	}
	
	public CoreLxjy(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getLxjyXmbh() {
		return lxjyXmbh;
	}

	public void setLxjyXmbh(String lxjyXmbh) {
		this.lxjyXmbh = lxjyXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getLxjyXmmc() {
		return lxjyXmmc;
	}

	public void setLxjyXmmc(String lxjyXmmc) {
		this.lxjyXmmc = lxjyXmmc;
	}
	
}