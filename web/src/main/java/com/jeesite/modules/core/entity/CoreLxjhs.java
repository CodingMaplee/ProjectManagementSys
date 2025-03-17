package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 立项计划书Entity
 * @author tjh
 * @version 2025-01-20
 */
@Table(name="core_lxjhs", alias="a", label="立项计划书信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="lxjhs_xmbh", attrName="lxjhsXmbh", label="项目编号"),
		@Column(name="lxjhs_xmmc", attrName="lxjhsXmmc", label="项目名称"),
	}, orderBy="a.id DESC"
)
public class CoreLxjhs extends DataEntity<CoreLxjhs> {
	
	private static final long serialVersionUID = 1L;
	private String lxjhsXmbh;		// 项目编号
	private String lxjhsXmmc;		// 项目名称

	public CoreLxjhs() {
		this(null);
	}
	
	public CoreLxjhs(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getLxjhsXmbh() {
		return lxjhsXmbh;
	}

	public void setLxjhsXmbh(String lxjhsXmbh) {
		this.lxjhsXmbh = lxjhsXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getLxjhsXmmc() {
		return lxjhsXmmc;
	}

	public void setLxjhsXmmc(String lxjhsXmmc) {
		this.lxjhsXmmc = lxjhsXmmc;
	}
	
}