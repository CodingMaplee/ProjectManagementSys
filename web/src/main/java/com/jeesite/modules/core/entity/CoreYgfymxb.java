package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 员工费用明细表Entity
 * @author tjh
 * @version 2025-01-12
 */
@Table(name="core_ygfymxb", alias="a", label="员工费用明细表信息", columns={
		@Column(name="id", attrName="id", label="序号", isPK=true),
		@Column(name="ygfymxb_xm", attrName="ygfymxbXm", label="项目"),
		@Column(name="ygfy_ygxm", attrName="ygfyYgxm", label="员工姓名"),
		@Column(name="ygfy_bm", attrName="ygfyBm", label="部门"),
		@Column(name="ygfymxb_gdxz", attrName="ygfymxbGdxz", label="固定薪资"),
		@Column(name="ygfymxb_jj", attrName="ygfymxbJj", label="奖金"),
	}, orderBy="a.id DESC"
)
public class CoreYgfymxb extends DataEntity<CoreYgfymxb> {
	
	private static final long serialVersionUID = 1L;
	private String ygfymxbXm;		// 项目
	private String ygfyYgxm;		// 员工姓名
	private String ygfyBm;		// 部门
	private String ygfymxbGdxz;		// 固定薪资
	private String ygfymxbJj;		// 奖金

	public CoreYgfymxb() {
		this(null);
	}
	
	public CoreYgfymxb(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目长度不能超过 100 个字符")
	public String getYgfymxbXm() {
		return ygfymxbXm;
	}

	public void setYgfymxbXm(String ygfymxbXm) {
		this.ygfymxbXm = ygfymxbXm;
	}
	
	@Size(min=0, max=100, message="员工姓名长度不能超过 100 个字符")
	public String getYgfyYgxm() {
		return ygfyYgxm;
	}

	public void setYgfyYgxm(String ygfyYgxm) {
		this.ygfyYgxm = ygfyYgxm;
	}
	
	@Size(min=0, max=100, message="部门长度不能超过 100 个字符")
	public String getYgfyBm() {
		return ygfyBm;
	}

	public void setYgfyBm(String ygfyBm) {
		this.ygfyBm = ygfyBm;
	}
	
	@Size(min=0, max=100, message="固定薪资长度不能超过 100 个字符")
	public String getYgfymxbGdxz() {
		return ygfymxbGdxz;
	}

	public void setYgfymxbGdxz(String ygfymxbGdxz) {
		this.ygfymxbGdxz = ygfymxbGdxz;
	}
	
	@Size(min=0, max=100, message="奖金长度不能超过 100 个字符")
	public String getYgfymxbJj() {
		return ygfymxbJj;
	}

	public void setYgfymxbJj(String ygfymxbJj) {
		this.ygfymxbJj = ygfymxbJj;
	}
	
}