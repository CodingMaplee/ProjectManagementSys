package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 研发投入设备记录Entity
 * @author zhw
 * @version 2024-11-28
 */
@Table(name="core_yftrsbjl", alias="a", label="研发投入设备记录信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="yftrsbjl_xmbh", attrName="yftrsbjlXmbh", label="项目编号"),
		@Column(name="yftrsbjl_xmmc", attrName="yftrsbjlXmmc", label="项目名称"),
		@Column(name="yftrsbjl_cyyfsb", attrName="yftrsbjlCyyfsb", label="参与研发设备"),
		@Column(name="yftrsbjl_cyfzsb", attrName="yftrsbjlCyfzsb", label="参与辅助设备"),
	}, orderBy="a.id DESC"
)
public class CoreYftrsbjl extends DataEntity<CoreYftrsbjl> {
	
	private static final long serialVersionUID = 1L;
	private String yftrsbjlXmbh;		// 项目编号
	private String yftrsbjlXmmc;		// 项目名称
	private String yftrsbjlCyyfsb;		// 参与研发设备
	private String yftrsbjlCyfzsb;		// 参与辅助设备

	public CoreYftrsbjl() {
		this(null);
	}
	
	public CoreYftrsbjl(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getYftrsbjlXmbh() {
		return yftrsbjlXmbh;
	}

	public void setYftrsbjlXmbh(String yftrsbjlXmbh) {
		this.yftrsbjlXmbh = yftrsbjlXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getYftrsbjlXmmc() {
		return yftrsbjlXmmc;
	}

	public void setYftrsbjlXmmc(String yftrsbjlXmmc) {
		this.yftrsbjlXmmc = yftrsbjlXmmc;
	}
	
	@Size(min=0, max=100, message="参与研发设备长度不能超过 100 个字符")
	public String getYftrsbjlCyyfsb() {
		return yftrsbjlCyyfsb;
	}

	public void setYftrsbjlCyyfsb(String yftrsbjlCyyfsb) {
		this.yftrsbjlCyyfsb = yftrsbjlCyyfsb;
	}
	
	@Size(min=0, max=100, message="参与辅助设备长度不能超过 100 个字符")
	public String getYftrsbjlCyfzsb() {
		return yftrsbjlCyfzsb;
	}

	public void setYftrsbjlCyfzsb(String yftrsbjlCyfzsb) {
		this.yftrsbjlCyfzsb = yftrsbjlCyfzsb;
	}
	
}