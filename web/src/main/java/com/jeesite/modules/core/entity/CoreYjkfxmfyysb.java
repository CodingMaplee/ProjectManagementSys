package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 研究开发项目费用预算表Entity
 * @author tjh
 * @version 2025-01-15
 */
@Table(name="core_yjkfxmfyysb", alias="a", label="研究开发项目费用预算表信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="yjkfxmfyysb_xmbh", attrName="yjkfxmfyysbXmbh", label="项目编号"),
		@Column(name="yjkfxmfyysb_xmmc", attrName="yjkfxmfyysbXmmc", label="项目名称"),
	}, orderBy="a.id DESC"
)
public class CoreYjkfxmfyysb extends DataEntity<CoreYjkfxmfyysb> {
	
	private static final long serialVersionUID = 1L;
	private String yjkfxmfyysbXmbh;		// 项目编号
	private String yjkfxmfyysbXmmc;		// 项目名称

	public CoreYjkfxmfyysb() {
		this(null);
	}
	
	public CoreYjkfxmfyysb(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getYjkfxmfyysbXmbh() {
		return yjkfxmfyysbXmbh;
	}

	public void setYjkfxmfyysbXmbh(String yjkfxmfyysbXmbh) {
		this.yjkfxmfyysbXmbh = yjkfxmfyysbXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getYjkfxmfyysbXmmc() {
		return yjkfxmfyysbXmmc;
	}

	public void setYjkfxmfyysbXmmc(String yjkfxmfyysbXmmc) {
		this.yjkfxmfyysbXmmc = yjkfxmfyysbXmmc;
	}
	
}