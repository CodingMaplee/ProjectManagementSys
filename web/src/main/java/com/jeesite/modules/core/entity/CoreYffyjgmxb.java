package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 研发费用结构明细表Entity
 * @author tjh
 * @version 2025-01-15
 */
@Table(name="core_yffyjgmxb", alias="a", label="研发费用结构明细表信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="yffyjgmxb_xmbh", attrName="yffyjgmxbXmbh", label="项目编号"),
		@Column(name="yffyjgmxb_xmmc", attrName="yffyjgmxbXmmc", label="项目名称"),
	}, orderBy="a.id DESC"
)
public class CoreYffyjgmxb extends DataEntity<CoreYffyjgmxb> {
	
	private static final long serialVersionUID = 1L;
	private String yffyjgmxbXmbh;		// 项目编号
	private String yffyjgmxbXmmc;		// 项目名称

	public CoreYffyjgmxb() {
		this(null);
	}
	
	public CoreYffyjgmxb(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getYffyjgmxbXmbh() {
		return yffyjgmxbXmbh;
	}

	public void setYffyjgmxbXmbh(String yffyjgmxbXmbh) {
		this.yffyjgmxbXmbh = yffyjgmxbXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getYffyjgmxbXmmc() {
		return yffyjgmxbXmmc;
	}

	public void setYffyjgmxbXmmc(String yffyjgmxbXmmc) {
		this.yffyjgmxbXmmc = yffyjgmxbXmmc;
	}
	
}