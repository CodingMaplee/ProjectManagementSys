package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 知识产权管理Entity
 * @author zhw
 * @version 2024-11-28
 */
@Table(name="core_zscqgl", alias="a", label="知识产权管理信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="zscqgl_xmbh", attrName="zscqglXmbh", label="项目编号"),
		@Column(name="zscqgl_zscqlb", attrName="zscqglZscqlb", label="知识产权类别"),
		@Column(name="zscqgl_zscqmc", attrName="zscqglZscqmc", label="知识产权名称"),
	}, orderBy="a.id DESC"
)
public class CoreZscqgl extends DataEntity<CoreZscqgl> {
	
	private static final long serialVersionUID = 1L;
	private String zscqglXmbh;		// 项目编号
	private String zscqglZscqlb;		// 知识产权类别
	private String zscqglZscqmc;		// 知识产权名称

	public CoreZscqgl() {
		this(null);
	}
	
	public CoreZscqgl(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getZscqglXmbh() {
		return zscqglXmbh;
	}

	public void setZscqglXmbh(String zscqglXmbh) {
		this.zscqglXmbh = zscqglXmbh;
	}
	
	@Size(min=0, max=100, message="知识产权类别长度不能超过 100 个字符")
	public String getZscqglZscqlb() {
		return zscqglZscqlb;
	}

	public void setZscqglZscqlb(String zscqglZscqlb) {
		this.zscqglZscqlb = zscqglZscqlb;
	}
	
	@Size(min=0, max=100, message="知识产权名称长度不能超过 100 个字符")
	public String getZscqglZscqmc() {
		return zscqglZscqmc;
	}

	public void setZscqglZscqmc(String zscqglZscqmc) {
		this.zscqglZscqmc = zscqglZscqmc;
	}
	
}