package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 委托费用明细表Entity
 * @author tjh
 * @version 2025-01-12
 */
@Table(name="core_wtfymxb", alias="a", label="委托费用明细表信息", columns={
		@Column(name="id", attrName="id", label="序号", isPK=true),
		@Column(name="wtfymxb_xm", attrName="wtfymxbXm", label="项目"),
		@Column(name="wtfymxb_bm", attrName="wtfymxbBm", label="部门"),
		@Column(name="wtfymxb_wtryxm", attrName="wtfymxbWtryxm", label="委托人员姓名"),
		@Column(name="wtfymxb_wtrydw", attrName="wtfymxbWtrydw", label="委托人员单位"),
		@Column(name="wtfymxb_wtfy", attrName="wtfymxbWtfy", label="委托费用", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class CoreWtfymxb extends DataEntity<CoreWtfymxb> {
	
	private static final long serialVersionUID = 1L;
	private String wtfymxbXm;		// 项目
	private String wtfymxbBm;		// 部门
	private String wtfymxbWtryxm;		// 委托人员姓名
	private String wtfymxbWtrydw;		// 委托人员单位
	private Double wtfymxbWtfy;		// 委托费用

	public CoreWtfymxb() {
		this(null);
	}
	
	public CoreWtfymxb(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目长度不能超过 100 个字符")
	public String getWtfymxbXm() {
		return wtfymxbXm;
	}

	public void setWtfymxbXm(String wtfymxbXm) {
		this.wtfymxbXm = wtfymxbXm;
	}
	
	@Size(min=0, max=100, message="部门长度不能超过 100 个字符")
	public String getWtfymxbBm() {
		return wtfymxbBm;
	}

	public void setWtfymxbBm(String wtfymxbBm) {
		this.wtfymxbBm = wtfymxbBm;
	}
	
	@Size(min=0, max=100, message="委托人员姓名长度不能超过 100 个字符")
	public String getWtfymxbWtryxm() {
		return wtfymxbWtryxm;
	}

	public void setWtfymxbWtryxm(String wtfymxbWtryxm) {
		this.wtfymxbWtryxm = wtfymxbWtryxm;
	}
	
	@Size(min=0, max=100, message="委托人员单位长度不能超过 100 个字符")
	public String getWtfymxbWtrydw() {
		return wtfymxbWtrydw;
	}

	public void setWtfymxbWtrydw(String wtfymxbWtrydw) {
		this.wtfymxbWtrydw = wtfymxbWtrydw;
	}
	
	public Double getWtfymxbWtfy() {
		return wtfymxbWtfy;
	}

	public void setWtfymxbWtfy(Double wtfymxbWtfy) {
		this.wtfymxbWtfy = wtfymxbWtfy;
	}
	
}