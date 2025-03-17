package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 加计扣除优惠明细表Entity
 * @author tjh
 * @version 2025-01-12
 */
@Table(name="core_jjkcyhmxb", alias="a", label="加计扣除优惠明细表信息", columns={
		@Column(name="id", attrName="id", label="序号", isPK=true),
		@Column(name="jjkcyhmxb_xm", attrName="jjkcyhmxbXm", label="项目"),
		@Column(name="jjkcyhmxb_xmxh", attrName="jjkcyhmxbXmxh", label="项目序号"),
	}, orderBy="a.id DESC"
)
public class CoreJjkcyhmxb extends DataEntity<CoreJjkcyhmxb> {
	
	private static final long serialVersionUID = 1L;
	private String jjkcyhmxbXm;		// 项目
	private String jjkcyhmxbXmxh;		// 项目序号

	public CoreJjkcyhmxb() {
		this(null);
	}
	
	public CoreJjkcyhmxb(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目长度不能超过 100 个字符")
	public String getJjkcyhmxbXm() {
		return jjkcyhmxbXm;
	}

	public void setJjkcyhmxbXm(String jjkcyhmxbXm) {
		this.jjkcyhmxbXm = jjkcyhmxbXm;
	}
	
	@Size(min=0, max=100, message="项目序号长度不能超过 100 个字符")
	public String getJjkcyhmxbXmxh() {
		return jjkcyhmxbXmxh;
	}

	public void setJjkcyhmxbXmxh(String jjkcyhmxbXmxh) {
		this.jjkcyhmxbXmxh = jjkcyhmxbXmxh;
	}
	
}