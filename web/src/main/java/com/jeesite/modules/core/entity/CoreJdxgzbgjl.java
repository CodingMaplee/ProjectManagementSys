package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 阶段性工作报告记录Entity
 * @author tjh
 * @version 2025-01-21
 */
@Table(name="core_jdxgzbgjl", alias="a", label="阶段性工作报告记录信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="jdxgzbgjl_xmbh", attrName="jdxgzbgjlXmbh", label="项目编号"),
		@Column(name="jdxgzbgjl_xmmc", attrName="jdxgzbgjlXmmc", label="项目名称"),
		@Column(name="jdxgzbgjl_qj", attrName="jdxgzbgjlQj", label="期间", isQuery=false),
		@Column(name="jdxgzbgjl_ztms", attrName="jdxgzbgjlZtms", label="总体描述", isQuery=false),
		@Column(name="jdxgzbgjl_jtxmgzap", attrName="jdxgzbgjlJtxmgzap", label="具体项目工作安排", isQuery=false),
		@Column(name="jdxgzbgjl_jcjg", attrName="jdxgzbgjlJcjg", label="检查结果", isQuery=false),
		@Column(name="jdxgzbgjl_bz", attrName="jdxgzbgjlBz", label="备注", isQuery=false),
		@Column(name="jdxgzbgjl_z", attrName="jdxgzbgjlZ", label="注", isQuery=false),
		@Column(name="jdxgzbgjl_jyrq", attrName="jdxgzbgjlJyrq", label="检验日期", isQuery=false),
		@Column(name="jdxgzbgjl_jyr", attrName="jdxgzbgjlJyr", label="检验人", isQuery=false),
		@Column(name="jdxgzbgjl_shr", attrName="jdxgzbgjlShr", label="审核人", isQuery=false),
	}, orderBy="a.id DESC"
)
public class CoreJdxgzbgjl extends DataEntity<CoreJdxgzbgjl> {
	
	private static final long serialVersionUID = 1L;
	private String jdxgzbgjlXmbh;		// 项目编号
	private String jdxgzbgjlXmmc;		// 项目名称
	private String jdxgzbgjlQj;		// 期间
	private String jdxgzbgjlZtms;		// 总体描述
	private String jdxgzbgjlJtxmgzap;		// 具体项目工作安排
	private String jdxgzbgjlJcjg;		// 检查结果
	private String jdxgzbgjlBz;		// 备注
	private String jdxgzbgjlZ;		// 注
	private String jdxgzbgjlJyrq;		// 检验日期
	private String jdxgzbgjlJyr;		// 检验人
	private String jdxgzbgjlShr;		// 审核人

	public CoreJdxgzbgjl() {
		this(null);
	}
	
	public CoreJdxgzbgjl(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getJdxgzbgjlXmbh() {
		return jdxgzbgjlXmbh;
	}

	public void setJdxgzbgjlXmbh(String jdxgzbgjlXmbh) {
		this.jdxgzbgjlXmbh = jdxgzbgjlXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getJdxgzbgjlXmmc() {
		return jdxgzbgjlXmmc;
	}

	public void setJdxgzbgjlXmmc(String jdxgzbgjlXmmc) {
		this.jdxgzbgjlXmmc = jdxgzbgjlXmmc;
	}
	
	@Size(min=0, max=100, message="期间长度不能超过 100 个字符")
	public String getJdxgzbgjlQj() {
		return jdxgzbgjlQj;
	}

	public void setJdxgzbgjlQj(String jdxgzbgjlQj) {
		this.jdxgzbgjlQj = jdxgzbgjlQj;
	}
	
	@Size(min=0, max=100, message="总体描述长度不能超过 100 个字符")
	public String getJdxgzbgjlZtms() {
		return jdxgzbgjlZtms;
	}

	public void setJdxgzbgjlZtms(String jdxgzbgjlZtms) {
		this.jdxgzbgjlZtms = jdxgzbgjlZtms;
	}
	
	@Size(min=0, max=100, message="具体项目工作安排长度不能超过 100 个字符")
	public String getJdxgzbgjlJtxmgzap() {
		return jdxgzbgjlJtxmgzap;
	}

	public void setJdxgzbgjlJtxmgzap(String jdxgzbgjlJtxmgzap) {
		this.jdxgzbgjlJtxmgzap = jdxgzbgjlJtxmgzap;
	}
	
	@Size(min=0, max=100, message="检查结果长度不能超过 100 个字符")
	public String getJdxgzbgjlJcjg() {
		return jdxgzbgjlJcjg;
	}

	public void setJdxgzbgjlJcjg(String jdxgzbgjlJcjg) {
		this.jdxgzbgjlJcjg = jdxgzbgjlJcjg;
	}
	
	@Size(min=0, max=100, message="备注长度不能超过 100 个字符")
	public String getJdxgzbgjlBz() {
		return jdxgzbgjlBz;
	}

	public void setJdxgzbgjlBz(String jdxgzbgjlBz) {
		this.jdxgzbgjlBz = jdxgzbgjlBz;
	}
	
	@Size(min=0, max=100, message="注长度不能超过 100 个字符")
	public String getJdxgzbgjlZ() {
		return jdxgzbgjlZ;
	}

	public void setJdxgzbgjlZ(String jdxgzbgjlZ) {
		this.jdxgzbgjlZ = jdxgzbgjlZ;
	}
	
	@Size(min=0, max=100, message="检验日期长度不能超过 100 个字符")
	public String getJdxgzbgjlJyrq() {
		return jdxgzbgjlJyrq;
	}

	public void setJdxgzbgjlJyrq(String jdxgzbgjlJyrq) {
		this.jdxgzbgjlJyrq = jdxgzbgjlJyrq;
	}
	
	@Size(min=0, max=100, message="检验人长度不能超过 100 个字符")
	public String getJdxgzbgjlJyr() {
		return jdxgzbgjlJyr;
	}

	public void setJdxgzbgjlJyr(String jdxgzbgjlJyr) {
		this.jdxgzbgjlJyr = jdxgzbgjlJyr;
	}
	
	@Size(min=0, max=100, message="审核人长度不能超过 100 个字符")
	public String getJdxgzbgjlShr() {
		return jdxgzbgjlShr;
	}

	public void setJdxgzbgjlShr(String jdxgzbgjlShr) {
		this.jdxgzbgjlShr = jdxgzbgjlShr;
	}
	
}