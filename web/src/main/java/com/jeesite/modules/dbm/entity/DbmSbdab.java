package com.jeesite.modules.dbm.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 设备档案表Entity
 * @author zhw
 * @version 2024-10-31
 */
@Table(name="dbm_sbdab", alias="a", label="设备档案表信息", columns={
		@Column(name="sbdab_zcbm", attrName="sbdabZcbm", label="资产编码", isPK=true),
		@Column(name="sbdab_sbmc", attrName="sbdabSbmc", label="设备名称"),
		@Column(name="sbdab_ggxh", attrName="sbdabGgxh", label="规格型号"),
	}, orderBy="a.sbdab_zcbm DESC"
)
public class DbmSbdab extends DataEntity<DbmSbdab> {
	
	private static final long serialVersionUID = 1L;
	private String sbdabZcbm;		// 资产编码
	private String sbdabSbmc;		// 设备名称
	private String sbdabGgxh;		// 规格型号

	public DbmSbdab() {
		this(null);
	}
	
	public DbmSbdab(String id){
		super(id);
	}
	
	public String getSbdabZcbm() {
		return sbdabZcbm;
	}

	public void setSbdabZcbm(String sbdabZcbm) {
		this.sbdabZcbm = sbdabZcbm;
	}
	
	@Size(min=0, max=100, message="设备名称长度不能超过 100 个字符")
	public String getSbdabSbmc() {
		return sbdabSbmc;
	}

	public void setSbdabSbmc(String sbdabSbmc) {
		this.sbdabSbmc = sbdabSbmc;
	}
	
	@Size(min=0, max=100, message="规格型号长度不能超过 100 个字符")
	public String getSbdabGgxh() {
		return sbdabGgxh;
	}

	public void setSbdabGgxh(String sbdabGgxh) {
		this.sbdabGgxh = sbdabGgxh;
	}
	
}