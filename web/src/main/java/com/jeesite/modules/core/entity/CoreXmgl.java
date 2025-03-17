package com.jeesite.modules.core.entity;

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
 * 项目管理Entity
 * @author tjh
 * @version 2025-01-12
 */
@Table(name="core_xmgl", alias="a", label="项目管理信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="xmgl_xmbh", attrName="xmglXmbh", label="项目编号"),
		@Column(name="xmgl_xmmc", attrName="xmglXmmc", label="项目名称"),
		@Column(name="xmgl_xmzt", attrName="xmglXmzt", label="项目状态"),
		@Column(name="xmgl_kssj", attrName="xmglKssj", label="开始时间", isUpdateForce=true),
		@Column(name="xmgl_jssj", attrName="xmglJssj", label="结束时间", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class CoreXmgl extends DataEntity<CoreXmgl> {
	
	private static final long serialVersionUID = 1L;
	private String xmglXmbh;		// 项目编号
	private String xmglXmmc;		// 项目名称
	private String xmglXmzt;		// 项目状态
	private Date xmglKssj;		// 开始时间
	private Date xmglJssj;		// 结束时间

	public CoreXmgl() {
		this(null);
	}
	
	public CoreXmgl(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getXmglXmbh() {
		return xmglXmbh;
	}

	public void setXmglXmbh(String xmglXmbh) {
		this.xmglXmbh = xmglXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getXmglXmmc() {
		return xmglXmmc;
	}

	public void setXmglXmmc(String xmglXmmc) {
		this.xmglXmmc = xmglXmmc;
	}
	
	@Size(min=0, max=64, message="项目状态长度不能超过 64 个字符")
	public String getXmglXmzt() {
		return xmglXmzt;
	}

	public void setXmglXmzt(String xmglXmzt) {
		this.xmglXmzt = xmglXmzt;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getXmglKssj() {
		return xmglKssj;
	}

	public void setXmglKssj(Date xmglKssj) {
		this.xmglKssj = xmglKssj;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getXmglJssj() {
		return xmglJssj;
	}

	public void setXmglJssj(Date xmglJssj) {
		this.xmglJssj = xmglJssj;
	}
	
}