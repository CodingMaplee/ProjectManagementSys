package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 设备费用明细表Entity
 * @author tjh
 * @version 2025-01-12
 */
@Table(name="core_sbfymxb", alias="a", label="设备费用明细表信息", columns={
		@Column(name="id", attrName="id", label="序号", isPK=true),
		@Column(name="sbfymxb_xm", attrName="sbfymxbXm", label="项目"),
		@Column(name="sbfymxb_sb", attrName="sbfymxbSb", label="设备"),
		@Column(name="sbfymxb_bm", attrName="sbfymxbBm", label="部门"),
		@Column(name="sbfymxb_fy", attrName="sbfymxbFy", label="费用"),
	}, orderBy="a.id DESC"
)
public class CoreSbfymxb extends DataEntity<CoreSbfymxb> {
	
	private static final long serialVersionUID = 1L;
	private String sbfymxbXm;		// 项目
	private String sbfymxbSb;		// 设备
	private String sbfymxbBm;		// 部门
	private String sbfymxbFy;		// 费用

	public CoreSbfymxb() {
		this(null);
	}
	
	public CoreSbfymxb(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目长度不能超过 100 个字符")
	public String getSbfymxbXm() {
		return sbfymxbXm;
	}

	public void setSbfymxbXm(String sbfymxbXm) {
		this.sbfymxbXm = sbfymxbXm;
	}
	
	@Size(min=0, max=100, message="设备长度不能超过 100 个字符")
	public String getSbfymxbSb() {
		return sbfymxbSb;
	}

	public void setSbfymxbSb(String sbfymxbSb) {
		this.sbfymxbSb = sbfymxbSb;
	}
	
	@Size(min=0, max=100, message="部门长度不能超过 100 个字符")
	public String getSbfymxbBm() {
		return sbfymxbBm;
	}

	public void setSbfymxbBm(String sbfymxbBm) {
		this.sbfymxbBm = sbfymxbBm;
	}
	
	@Size(min=0, max=100, message="费用长度不能超过 100 个字符")
	public String getSbfymxbFy() {
		return sbfymxbFy;
	}

	public void setSbfymxbFy(String sbfymxbFy) {
		this.sbfymxbFy = sbfymxbFy;
	}
	
}