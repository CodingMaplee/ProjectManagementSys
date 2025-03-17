package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 研发参与记录Entity
 * @author tjh
 * @version 2025-01-17
 */
@Table(name="core_yfcyjl", alias="a", label="研发参与记录信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="yfcyjl_xmbh", attrName="yfcyjlXmbh", label="项目编号"),
		@Column(name="yfcyjl_xmmc", attrName="yfcyjlXmmc", label="项目名称"),
		@Column(name="yfcyjl_cyry", attrName="yfcyjlCyry", label="参与人员"),
	}, orderBy="a.id DESC"
)
public class CoreYfcyjl extends DataEntity<CoreYfcyjl> {
	
	private static final long serialVersionUID = 1L;
	private String yfcyjlXmbh;		// 项目编号
	private String yfcyjlXmmc;		// 项目名称
	private String yfcyjlCyry;		// 参与人员

	public CoreYfcyjl() {
		this(null);
	}
	
	public CoreYfcyjl(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getYfcyjlXmbh() {
		return yfcyjlXmbh;
	}

	public void setYfcyjlXmbh(String yfcyjlXmbh) {
		this.yfcyjlXmbh = yfcyjlXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getYfcyjlXmmc() {
		return yfcyjlXmmc;
	}

	public void setYfcyjlXmmc(String yfcyjlXmmc) {
		this.yfcyjlXmmc = yfcyjlXmmc;
	}
	
	@Size(min=0, max=100, message="参与人员长度不能超过 100 个字符")
	public String getYfcyjlCyry() {
		return yfcyjlCyry;
	}

	public void setYfcyjlCyry(String yfcyjlCyry) {
		this.yfcyjlCyry = yfcyjlCyry;
	}
	
}