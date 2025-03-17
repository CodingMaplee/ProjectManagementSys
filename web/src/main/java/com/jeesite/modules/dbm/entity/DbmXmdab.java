package com.jeesite.modules.dbm.entity;

import javax.validation.constraints.Size;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 项目档案表Entity
 * @author zhw
 * @version 2024-11-13
 */
@Table(name="dbm_xmdab", alias="a", label="项目档案表信息", columns={
		@Column(name="xmdab_xmbh", attrName="xmdabXmbh", label="项目编号", isPK=true),
		@Column(name="xmdab_xmmc", attrName="xmdabXmmc", label="项目名称"),
		@Column(name="xmdab_xmsx", attrName="xmdabXmsx", label="项目属性"),
		@Column(name="xmdab_xmzt", attrName="xmdabXmzt", label="项目状态"),
		@Column(name="xmdab_xmksrq", attrName="xmdabXmksrq", label="项目开始日期", isUpdateForce=true),
		@Column(name="xmdab_xmjsrq", attrName="xmdabXmjsrq", label="项目结束日期", isUpdateForce=true),
		@Column(name="xmdab_bz", attrName="xmdabBz", label="备注"),
	}, orderBy="a.xmdab_xmbh DESC"
)
public class DbmXmdab extends DataEntity<DbmXmdab> {
	
	private static final long serialVersionUID = 1L;
	private String xmdabXmbh;		// 项目编号
	private String xmdabXmmc;		// 项目名称
	private String xmdabXmsx;		// 项目属性
	private String xmdabXmzt;		// 项目状态
	private Date xmdabXmksrq;		// 项目开始日期
	private Date xmdabXmjsrq;		// 项目结束日期
	private String xmdabBz;		// 备注

	public DbmXmdab() {
		this(null);
	}
	
	public DbmXmdab(String id){
		super(id);
	}
	
	public String getXmdabXmbh() {
		return xmdabXmbh;
	}

	public void setXmdabXmbh(String xmdabXmbh) {
		this.xmdabXmbh = xmdabXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getXmdabXmmc() {
		return xmdabXmmc;
	}

	public void setXmdabXmmc(String xmdabXmmc) {
		this.xmdabXmmc = xmdabXmmc;
	}
	
	@Size(min=0, max=100, message="项目属性长度不能超过 100 个字符")
	public String getXmdabXmsx() {
		return xmdabXmsx;
	}

	public void setXmdabXmsx(String xmdabXmsx) {
		this.xmdabXmsx = xmdabXmsx;
	}
	
	@Size(min=0, max=100, message="项目状态长度不能超过 100 个字符")
	public String getXmdabXmzt() {
		return xmdabXmzt;
	}

	public void setXmdabXmzt(String xmdabXmzt) {
		this.xmdabXmzt = xmdabXmzt;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getXmdabXmksrq() {
		return xmdabXmksrq;
	}

	public void setXmdabXmksrq(Date xmdabXmksrq) {
		this.xmdabXmksrq = xmdabXmksrq;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getXmdabXmjsrq() {
		return xmdabXmjsrq;
	}

	public void setXmdabXmjsrq(Date xmdabXmjsrq) {
		this.xmdabXmjsrq = xmdabXmjsrq;
	}
	
	@Size(min=0, max=100, message="备注长度不能超过 100 个字符")
	public String getXmdabBz() {
		return xmdabBz;
	}

	public void setXmdabBz(String xmdabBz) {
		this.xmdabBz = xmdabBz;
	}
	
}