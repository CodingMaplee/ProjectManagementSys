package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 研究开发机构和项目组的编制情况 及主要成员名单Entity
 * @author tjh
 * @version 2025-01-20
 */
@Table(name="core_yjkfjghxmzdbzqkjzycymd", alias="a", label="研究开发机构和项目组的编制情况 及主要成员名单信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="yjkfjghxmzdbzqkjzycymd_xmbh", attrName="yjkfjghxmzdbzqkjzycymdXmbh", label="项目编号"),
		@Column(name="yjkfjghxmzdbzqkjzycymd_xmmc", attrName="yjkfjghxmzdbzqkjzycymdXmmc", label="项目名称"),
		@Column(name="yjkfjghxmzdbzqkjzycymd_yjkfjgjxmzdbzqk", attrName="yjkfjghxmzdbzqkjzycymdYjkfjgjxmzdbzqk", label="研究开发机构及项目组的编制情况", isQuery=false),
		@Column(name="yjkfjghxmzdbzqkjzycymd_xmzycyjfg", attrName="yjkfjghxmzdbzqkjzycymdXmzycyjfg", label="项目主要成员及分工", isQuery=false),
		@Column(name="yjkfjghxmzdbzqkjzycymd_yjkfxmzrymd", attrName="yjkfjghxmzdbzqkjzycymdYjkfxmzrymd", label="研究开发项目组人员名单", isQuery=false),
		@Column(name="yjkfjghxmzdbzqkjzycymd_xmzzh", attrName="yjkfjghxmzdbzqkjzycymdXmzzh", label="项目总指挥", isQuery=false),
		@Column(name="yjkfjghxmzdbzqkjzycymd_xmzd", attrName="yjkfjghxmzdbzqkjzycymdXmzd", label="项目指导", isQuery=false),
		@Column(name="yjkfjghxmzdbzqkjzycymd_xmjsfzr", attrName="yjkfjghxmzdbzqkjzycymdXmjsfzr", label="项目技术负责人", isQuery=false),
		@Column(name="yjkfjghxmzdbzqkjzycymd_xmcsyfry", attrName="yjkfjghxmzdbzqkjzycymdXmcsyfry", label="项目从事研发人员", isQuery=false),
	}, orderBy="a.id DESC"
)
public class CoreYjkfjghxmzdbzqkjzycymd extends DataEntity<CoreYjkfjghxmzdbzqkjzycymd> {
	
	private static final long serialVersionUID = 1L;
	private String yjkfjghxmzdbzqkjzycymdXmbh;		// 项目编号
	private String yjkfjghxmzdbzqkjzycymdXmmc;		// 项目名称
	private String yjkfjghxmzdbzqkjzycymdYjkfjgjxmzdbzqk;		// 研究开发机构及项目组的编制情况
	private String yjkfjghxmzdbzqkjzycymdXmzycyjfg;		// 项目主要成员及分工
	private String yjkfjghxmzdbzqkjzycymdYjkfxmzrymd;		// 研究开发项目组人员名单
	private String yjkfjghxmzdbzqkjzycymdXmzzh;		// 项目总指挥
	private String yjkfjghxmzdbzqkjzycymdXmzd;		// 项目指导
	private String yjkfjghxmzdbzqkjzycymdXmjsfzr;		// 项目技术负责人
	private String yjkfjghxmzdbzqkjzycymdXmcsyfry;		// 项目从事研发人员

	public CoreYjkfjghxmzdbzqkjzycymd() {
		this(null);
	}
	
	public CoreYjkfjghxmzdbzqkjzycymd(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getYjkfjghxmzdbzqkjzycymdXmbh() {
		return yjkfjghxmzdbzqkjzycymdXmbh;
	}

	public void setYjkfjghxmzdbzqkjzycymdXmbh(String yjkfjghxmzdbzqkjzycymdXmbh) {
		this.yjkfjghxmzdbzqkjzycymdXmbh = yjkfjghxmzdbzqkjzycymdXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getYjkfjghxmzdbzqkjzycymdXmmc() {
		return yjkfjghxmzdbzqkjzycymdXmmc;
	}

	public void setYjkfjghxmzdbzqkjzycymdXmmc(String yjkfjghxmzdbzqkjzycymdXmmc) {
		this.yjkfjghxmzdbzqkjzycymdXmmc = yjkfjghxmzdbzqkjzycymdXmmc;
	}
	
	public String getYjkfjghxmzdbzqkjzycymdYjkfjgjxmzdbzqk() {
		return yjkfjghxmzdbzqkjzycymdYjkfjgjxmzdbzqk;
	}

	public void setYjkfjghxmzdbzqkjzycymdYjkfjgjxmzdbzqk(String yjkfjghxmzdbzqkjzycymdYjkfjgjxmzdbzqk) {
		this.yjkfjghxmzdbzqkjzycymdYjkfjgjxmzdbzqk = yjkfjghxmzdbzqkjzycymdYjkfjgjxmzdbzqk;
	}
	
	@Size(min=0, max=100, message="项目主要成员及分工长度不能超过 100 个字符")
	public String getYjkfjghxmzdbzqkjzycymdXmzycyjfg() {
		return yjkfjghxmzdbzqkjzycymdXmzycyjfg;
	}

	public void setYjkfjghxmzdbzqkjzycymdXmzycyjfg(String yjkfjghxmzdbzqkjzycymdXmzycyjfg) {
		this.yjkfjghxmzdbzqkjzycymdXmzycyjfg = yjkfjghxmzdbzqkjzycymdXmzycyjfg;
	}
	
	@Size(min=0, max=100, message="研究开发项目组人员名单长度不能超过 100 个字符")
	public String getYjkfjghxmzdbzqkjzycymdYjkfxmzrymd() {
		return yjkfjghxmzdbzqkjzycymdYjkfxmzrymd;
	}

	public void setYjkfjghxmzdbzqkjzycymdYjkfxmzrymd(String yjkfjghxmzdbzqkjzycymdYjkfxmzrymd) {
		this.yjkfjghxmzdbzqkjzycymdYjkfxmzrymd = yjkfjghxmzdbzqkjzycymdYjkfxmzrymd;
	}
	
	@Size(min=0, max=100, message="项目总指挥长度不能超过 100 个字符")
	public String getYjkfjghxmzdbzqkjzycymdXmzzh() {
		return yjkfjghxmzdbzqkjzycymdXmzzh;
	}

	public void setYjkfjghxmzdbzqkjzycymdXmzzh(String yjkfjghxmzdbzqkjzycymdXmzzh) {
		this.yjkfjghxmzdbzqkjzycymdXmzzh = yjkfjghxmzdbzqkjzycymdXmzzh;
	}
	
	@Size(min=0, max=100, message="项目指导长度不能超过 100 个字符")
	public String getYjkfjghxmzdbzqkjzycymdXmzd() {
		return yjkfjghxmzdbzqkjzycymdXmzd;
	}

	public void setYjkfjghxmzdbzqkjzycymdXmzd(String yjkfjghxmzdbzqkjzycymdXmzd) {
		this.yjkfjghxmzdbzqkjzycymdXmzd = yjkfjghxmzdbzqkjzycymdXmzd;
	}
	
	@Size(min=0, max=100, message="项目技术负责人长度不能超过 100 个字符")
	public String getYjkfjghxmzdbzqkjzycymdXmjsfzr() {
		return yjkfjghxmzdbzqkjzycymdXmjsfzr;
	}

	public void setYjkfjghxmzdbzqkjzycymdXmjsfzr(String yjkfjghxmzdbzqkjzycymdXmjsfzr) {
		this.yjkfjghxmzdbzqkjzycymdXmjsfzr = yjkfjghxmzdbzqkjzycymdXmjsfzr;
	}
	
	@Size(min=0, max=100, message="项目从事研发人员长度不能超过 100 个字符")
	public String getYjkfjghxmzdbzqkjzycymdXmcsyfry() {
		return yjkfjghxmzdbzqkjzycymdXmcsyfry;
	}

	public void setYjkfjghxmzdbzqkjzycymdXmcsyfry(String yjkfjghxmzdbzqkjzycymdXmcsyfry) {
		this.yjkfjghxmzdbzqkjzycymdXmcsyfry = yjkfjghxmzdbzqkjzycymdXmcsyfry;
	}
	
}