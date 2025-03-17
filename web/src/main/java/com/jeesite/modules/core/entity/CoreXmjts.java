package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 项目结题书Entity
 * @author tjh
 * @version 2025-01-20
 */
@Table(name="core_xmjts", alias="a", label="项目结题书信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="xmjts_bh", attrName="xmjtsBh", label="编号"),
		@Column(name="xmjts_xmmc", attrName="xmjtsXmmc", label="项目名称"),
		@Column(name="xmjts_qzrq", attrName="xmjtsQzrq", label="起止日期"),
		@Column(name="xmjts_xmjj", attrName="xmjtsXmjj", label="项目简介", isQuery=false),
		@Column(name="xmjts_yjjfjs", attrName="xmjtsYjjfjs", label="研究经费决算", isQuery=false),
		@Column(name="xmjts_zyyjnr", attrName="xmjtsZyyjnr", label="主要研究内容", isQuery=false),
		@Column(name="xmjts_sfczwt", attrName="xmjtsSfczwt", label="是否存在问题", isQuery=false),
		@Column(name="xmjts_jtsqr", attrName="xmjtsJtsqr", label="结题申请人", isQuery=false),
		@Column(name="xmjts_jszgps", attrName="xmjtsJszgps", label="技术主管批示", isQuery=false),
		@Column(name="xmjts_cwfzrqr", attrName="xmjtsCwfzrqr", label="财务负责人确认", isQuery=false),
		@Column(name="xmjts_zjlqr", attrName="xmjtsZjlqr", label="总经理确认", isQuery=false),
	}, orderBy="a.id DESC"
)
public class CoreXmjts extends DataEntity<CoreXmjts> {
	
	private static final long serialVersionUID = 1L;
	private String xmjtsBh;		// 编号
	private String xmjtsXmmc;		// 项目名称
	private String xmjtsQzrq;		// 起止日期
	private String xmjtsXmjj;		// 项目简介
	private String xmjtsYjjfjs;		// 研究经费决算
	private String xmjtsZyyjnr;		// 主要研究内容
	private String xmjtsSfczwt;		// 是否存在问题
	private String xmjtsJtsqr;		// 结题申请人
	private String xmjtsJszgps;		// 技术主管批示
	private String xmjtsCwfzrqr;		// 财务负责人确认
	private String xmjtsZjlqr;		// 总经理确认

	public CoreXmjts() {
		this(null);
	}
	
	public CoreXmjts(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="编号长度不能超过 100 个字符")
	public String getXmjtsBh() {
		return xmjtsBh;
	}

	public void setXmjtsBh(String xmjtsBh) {
		this.xmjtsBh = xmjtsBh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getXmjtsXmmc() {
		return xmjtsXmmc;
	}

	public void setXmjtsXmmc(String xmjtsXmmc) {
		this.xmjtsXmmc = xmjtsXmmc;
	}
	
	@Size(min=0, max=100, message="起止日期长度不能超过 100 个字符")
	public String getXmjtsQzrq() {
		return xmjtsQzrq;
	}

	public void setXmjtsQzrq(String xmjtsQzrq) {
		this.xmjtsQzrq = xmjtsQzrq;
	}
	
	public String getXmjtsXmjj() {
		return xmjtsXmjj;
	}

	public void setXmjtsXmjj(String xmjtsXmjj) {
		this.xmjtsXmjj = xmjtsXmjj;
	}
	
	public String getXmjtsYjjfjs() {
		return xmjtsYjjfjs;
	}

	public void setXmjtsYjjfjs(String xmjtsYjjfjs) {
		this.xmjtsYjjfjs = xmjtsYjjfjs;
	}
	
	public String getXmjtsZyyjnr() {
		return xmjtsZyyjnr;
	}

	public void setXmjtsZyyjnr(String xmjtsZyyjnr) {
		this.xmjtsZyyjnr = xmjtsZyyjnr;
	}
	
	public String getXmjtsSfczwt() {
		return xmjtsSfczwt;
	}

	public void setXmjtsSfczwt(String xmjtsSfczwt) {
		this.xmjtsSfczwt = xmjtsSfczwt;
	}
	
	public String getXmjtsJtsqr() {
		return xmjtsJtsqr;
	}

	public void setXmjtsJtsqr(String xmjtsJtsqr) {
		this.xmjtsJtsqr = xmjtsJtsqr;
	}
	
	public String getXmjtsJszgps() {
		return xmjtsJszgps;
	}

	public void setXmjtsJszgps(String xmjtsJszgps) {
		this.xmjtsJszgps = xmjtsJszgps;
	}
	
	public String getXmjtsCwfzrqr() {
		return xmjtsCwfzrqr;
	}

	public void setXmjtsCwfzrqr(String xmjtsCwfzrqr) {
		this.xmjtsCwfzrqr = xmjtsCwfzrqr;
	}
	
	public String getXmjtsZjlqr() {
		return xmjtsZjlqr;
	}

	public void setXmjtsZjlqr(String xmjtsZjlqr) {
		this.xmjtsZjlqr = xmjtsZjlqr;
	}
	
}