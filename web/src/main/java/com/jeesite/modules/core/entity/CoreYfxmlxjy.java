package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 研发项目立项决议Entity
 * @author tjh
 * @version 2025-01-20
 */
@Table(name="core_yfxmlxjy", alias="a", label="研发项目立项决议信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="yfxmlxjy_xmbh", attrName="yfxmlxjyXmbh", label="项目编号"),
		@Column(name="yfxmlxjy_xmmc", attrName="yfxmlxjyXmmc", label="项目名称"),
	}, orderBy="a.id DESC"
)
public class CoreYfxmlxjy extends DataEntity<CoreYfxmlxjy> {
	
	private static final long serialVersionUID = 1L;
	private String yfxmlxjyXmbh;		// 项目编号
	private String yfxmlxjyXmmc;		// 项目名称

	public CoreYfxmlxjy() {
		this(null);
	}
	
	public CoreYfxmlxjy(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getYfxmlxjyXmbh() {
		return yfxmlxjyXmbh;
	}

	public void setYfxmlxjyXmbh(String yfxmlxjyXmbh) {
		this.yfxmlxjyXmbh = yfxmlxjyXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getYfxmlxjyXmmc() {
		return yfxmlxjyXmmc;
	}

	public void setYfxmlxjyXmmc(String yfxmlxjyXmmc) {
		this.yfxmlxjyXmmc = yfxmlxjyXmmc;
	}
	
}