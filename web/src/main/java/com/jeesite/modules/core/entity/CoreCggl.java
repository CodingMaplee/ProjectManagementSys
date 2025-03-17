package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 成果管理Entity
 * @author zhw
 * @version 2024-11-28
 */
@Table(name="core_cggl", alias="a", label="成果管理信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="cggl_xmbh", attrName="cgglXmbh", label="项目编号"),
		@Column(name="cggl_cglb", attrName="cgglCglb", label="成果类别"),
		@Column(name="cggl_cgmc", attrName="cgglCgmc", label="成果名称"),
	}, orderBy="a.id DESC"
)
public class CoreCggl extends DataEntity<CoreCggl> {
	
	private static final long serialVersionUID = 1L;
	private String cgglXmbh;		// 项目编号
	private String cgglCglb;		// 成果类别
	private String cgglCgmc;		// 成果名称

	public CoreCggl() {
		this(null);
	}
	
	public CoreCggl(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getCgglXmbh() {
		return cgglXmbh;
	}

	public void setCgglXmbh(String cgglXmbh) {
		this.cgglXmbh = cgglXmbh;
	}
	
	@Size(min=0, max=100, message="成果类别长度不能超过 100 个字符")
	public String getCgglCglb() {
		return cgglCglb;
	}

	public void setCgglCglb(String cgglCglb) {
		this.cgglCglb = cgglCglb;
	}
	
	@Size(min=0, max=100, message="成果名称长度不能超过 100 个字符")
	public String getCgglCgmc() {
		return cgglCgmc;
	}

	public void setCgglCgmc(String cgglCgmc) {
		this.cgglCgmc = cgglCgmc;
	}
	
}