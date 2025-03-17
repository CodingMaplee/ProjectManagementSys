package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 可行性评估报告Entity
 * @author tjh
 * @version 2025-02-19
 */
@Table(name="core_kxxbg", alias="a", label="可行性评估报告信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="kxxbg_xmmc", attrName="kxxbgXmmc", label="项目名称"),
		@Column(name="kxxbg_rq", attrName="kxxbgRq", label="日期"),
		@Column(name="kxxbg_sjfasm", attrName="kxxbgSjfasm", label="设计方案说明", isQuery=false),
		@Column(name="kxxbg_kxxfxbkjsgyfxcldfm", attrName="kxxbgKxxfxbkjsgyfxcldfm", label="可行性分析", comment="可行性分析（包括技术、工艺、风险、材料等方面）", isQuery=false),
		@Column(name="kxxbg_xmzb", attrName="kxxbgXmzb", label="项目准备", isQuery=false),
		@Column(name="kxxbg_kfscyg", attrName="kxxbgKfscyg", label="开发时程预估", isQuery=false),
		@Column(name="kxxbg_yjcyyfry", attrName="kxxbgYjcyyfry", label="预计参与研发人员", isQuery=false),
		@Column(name="kxxbg_pz", attrName="kxxbgPz", label="批准", isQuery=false),
		@Column(name="kxxbg_sh", attrName="kxxbgSh", label="审核", isQuery=false),
	}, orderBy="a.id DESC"
)
public class CoreKxxbg extends DataEntity<CoreKxxbg> {
	
	private static final long serialVersionUID = 1L;
	private String kxxbgXmmc;		// 项目名称
	private String kxxbgRq;		// 日期
	private String kxxbgSjfasm;		// 设计方案说明
	private String kxxbgKxxfxbkjsgyfxcldfm;		// 可行性分析（包括技术、工艺、风险、材料等方面）
	private String kxxbgXmzb;		// 项目准备
	private String kxxbgKfscyg;		// 开发时程预估
	private String kxxbgYjcyyfry;		// 预计参与研发人员
	private String kxxbgPz;		// 批准
	private String kxxbgSh;		// 审核

	public CoreKxxbg() {
		this(null);
	}
	
	public CoreKxxbg(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getKxxbgXmmc() {
		return kxxbgXmmc;
	}

	public void setKxxbgXmmc(String kxxbgXmmc) {
		this.kxxbgXmmc = kxxbgXmmc;
	}
	
	@Size(min=0, max=100, message="日期长度不能超过 100 个字符")
	public String getKxxbgRq() {
		return kxxbgRq;
	}

	public void setKxxbgRq(String kxxbgRq) {
		this.kxxbgRq = kxxbgRq;
	}
	
	public String getKxxbgSjfasm() {
		return kxxbgSjfasm;
	}

	public void setKxxbgSjfasm(String kxxbgSjfasm) {
		this.kxxbgSjfasm = kxxbgSjfasm;
	}
	
	public String getKxxbgKxxfxbkjsgyfxcldfm() {
		return kxxbgKxxfxbkjsgyfxcldfm;
	}

	public void setKxxbgKxxfxbkjsgyfxcldfm(String kxxbgKxxfxbkjsgyfxcldfm) {
		this.kxxbgKxxfxbkjsgyfxcldfm = kxxbgKxxfxbkjsgyfxcldfm;
	}
	
	public String getKxxbgXmzb() {
		return kxxbgXmzb;
	}

	public void setKxxbgXmzb(String kxxbgXmzb) {
		this.kxxbgXmzb = kxxbgXmzb;
	}
	
	public String getKxxbgKfscyg() {
		return kxxbgKfscyg;
	}

	public void setKxxbgKfscyg(String kxxbgKfscyg) {
		this.kxxbgKfscyg = kxxbgKfscyg;
	}
	
	public String getKxxbgYjcyyfry() {
		return kxxbgYjcyyfry;
	}

	public void setKxxbgYjcyyfry(String kxxbgYjcyyfry) {
		this.kxxbgYjcyyfry = kxxbgYjcyyfry;
	}
	
	@Size(min=0, max=100, message="批准长度不能超过 100 个字符")
	public String getKxxbgPz() {
		return kxxbgPz;
	}

	public void setKxxbgPz(String kxxbgPz) {
		this.kxxbgPz = kxxbgPz;
	}
	
	@Size(min=0, max=100, message="审核长度不能超过 100 个字符")
	public String getKxxbgSh() {
		return kxxbgSh;
	}

	public void setKxxbgSh(String kxxbgSh) {
		this.kxxbgSh = kxxbgSh;
	}
	
}