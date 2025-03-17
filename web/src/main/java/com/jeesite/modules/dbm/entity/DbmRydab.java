package com.jeesite.modules.dbm.entity;

import javax.validation.constraints.Size;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 人员档案表Entity
 * @author zhw
 * @version 2024-11-14
 */
@Table(name="dbm_rydab", alias="a", label="人员信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="rydab_ssgs", attrName="rydabSsgs", label="所属公司"),
		@Column(name="rydabt_ssbm", attrName="rydabtSsbm", label="所属部门"),
		@Column(name="rydabt_xm", attrName="rydabtXm", label="姓名"),
		@Column(name="rydabt_sfz", attrName="rydabtSfz", label="身份证"),
		@Column(name="rydabt_xb", attrName="rydabtXb", label="性别"),
		@Column(name="rydabt_rzrq", attrName="rydabtRzrq", label="入职日期", isUpdateForce=true),
		@Column(name="rydabt_lzrq", attrName="rydabtLzrq", label="离职日期", isUpdateForce=true),
		@Column(name="rydabt_zw", attrName="rydabtZw", label="职务"),
		@Column(name="rydabt_gw", attrName="rydabtGw", label="岗位"),
		@Column(name="rydabt_xl", attrName="rydabtXl", label="学历"),
		@Column(name="rydabt_zy", attrName="rydabtZy", label="专业"),
		@Column(name="rydabt_bz", attrName="rydabtBz", label="备注"),
	}, orderBy="a.id DESC"
)
public class DbmRydab extends DataEntity<DbmRydab> {
	
	private static final long serialVersionUID = 1L;
	private String rydabSsgs;		// 所属公司
	private String rydabtSsbm;		// 所属部门
	private String rydabtXm;		// 姓名
	private String rydabtSfz;		// 身份证
	private String rydabtXb;		// 性别
	private Date rydabtRzrq;		// 入职日期
	private Date rydabtLzrq;		// 离职日期
	private String rydabtZw;		// 职务
	private String rydabtGw;		// 岗位
	private String rydabtXl;		// 学历
	private String rydabtZy;		// 专业
	private String rydabtBz;		// 备注

	public DbmRydab() {
		this(null);
	}
	
	public DbmRydab(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="所属公司长度不能超过 100 个字符")
	public String getRydabSsgs() {
		return rydabSsgs;
	}

	public void setRydabSsgs(String rydabSsgs) {
		this.rydabSsgs = rydabSsgs;
	}
	
	@Size(min=0, max=100, message="所属部门长度不能超过 100 个字符")
	public String getRydabtSsbm() {
		return rydabtSsbm;
	}

	public void setRydabtSsbm(String rydabtSsbm) {
		this.rydabtSsbm = rydabtSsbm;
	}
	
	@Size(min=0, max=100, message="姓名长度不能超过 100 个字符")
	public String getRydabtXm() {
		return rydabtXm;
	}

	public void setRydabtXm(String rydabtXm) {
		this.rydabtXm = rydabtXm;
	}
	
	@Size(min=0, max=100, message="身份证长度不能超过 100 个字符")
	public String getRydabtSfz() {
		return rydabtSfz;
	}

	public void setRydabtSfz(String rydabtSfz) {
		this.rydabtSfz = rydabtSfz;
	}
	
	@Size(min=0, max=100, message="性别长度不能超过 100 个字符")
	public String getRydabtXb() {
		return rydabtXb;
	}

	public void setRydabtXb(String rydabtXb) {
		this.rydabtXb = rydabtXb;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getRydabtRzrq() {
		return rydabtRzrq;
	}

	public void setRydabtRzrq(Date rydabtRzrq) {
		this.rydabtRzrq = rydabtRzrq;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getRydabtLzrq() {
		return rydabtLzrq;
	}

	public void setRydabtLzrq(Date rydabtLzrq) {
		this.rydabtLzrq = rydabtLzrq;
	}
	
	@Size(min=0, max=100, message="职务长度不能超过 100 个字符")
	public String getRydabtZw() {
		return rydabtZw;
	}

	public void setRydabtZw(String rydabtZw) {
		this.rydabtZw = rydabtZw;
	}
	
	@Size(min=0, max=100, message="岗位长度不能超过 100 个字符")
	public String getRydabtGw() {
		return rydabtGw;
	}

	public void setRydabtGw(String rydabtGw) {
		this.rydabtGw = rydabtGw;
	}
	
	@Size(min=0, max=100, message="学历长度不能超过 100 个字符")
	public String getRydabtXl() {
		return rydabtXl;
	}

	public void setRydabtXl(String rydabtXl) {
		this.rydabtXl = rydabtXl;
	}
	
	@Size(min=0, max=100, message="专业长度不能超过 100 个字符")
	public String getRydabtZy() {
		return rydabtZy;
	}

	public void setRydabtZy(String rydabtZy) {
		this.rydabtZy = rydabtZy;
	}
	
	@Size(min=0, max=100, message="备注长度不能超过 100 个字符")
	public String getRydabtBz() {
		return rydabtBz;
	}

	public void setRydabtBz(String rydabtBz) {
		this.rydabtBz = rydabtBz;
	}
	
}