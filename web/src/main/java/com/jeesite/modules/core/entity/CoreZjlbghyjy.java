package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 总经理办公会议纪要Entity
 * @author tjh
 * @version 2025-01-20
 */
@Table(name="core_zjlbghyjy", alias="a", label="总经理办公会议纪要信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="zjlbghyjy_xmbh", attrName="zjlbghyjyXmbh", label="项目编号"),
		@Column(name="zjlbghyjy_xmmc", attrName="zjlbghyjyXmmc", label="项目名称"),
	}, orderBy="a.id DESC"
)
public class CoreZjlbghyjy extends DataEntity<CoreZjlbghyjy> {
	
	private static final long serialVersionUID = 1L;
	private String zjlbghyjyXmbh;		// 项目编号
	private String zjlbghyjyXmmc;		// 项目名称

	public CoreZjlbghyjy() {
		this(null);
	}
	
	public CoreZjlbghyjy(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getZjlbghyjyXmbh() {
		return zjlbghyjyXmbh;
	}

	public void setZjlbghyjyXmbh(String zjlbghyjyXmbh) {
		this.zjlbghyjyXmbh = zjlbghyjyXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getZjlbghyjyXmmc() {
		return zjlbghyjyXmmc;
	}

	public void setZjlbghyjyXmmc(String zjlbghyjyXmmc) {
		this.zjlbghyjyXmmc = zjlbghyjyXmmc;
	}
	
}