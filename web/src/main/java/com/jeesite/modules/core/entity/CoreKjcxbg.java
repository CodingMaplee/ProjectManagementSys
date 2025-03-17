package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 科技查新报告Entity
 * @author tjh
 * @version 2025-01-20
 */
@Table(name="core_kjcxbg", alias="a", label="科技查新报告信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="kjcxbg_bgbh", attrName="kjcxbgBgbh", label="报告编号", isQuery=false),
		@Column(name="kjcxbg_htbh", attrName="kjcxbgHtbh", label="合同编号", isQuery=false),
		@Column(name="kjcxbg_xmmc", attrName="kjcxbgXmmc", label="项目名称"),
		@Column(name="kjcxbg_wtr", attrName="kjcxbgWtr", label="委托人", isQuery=false),
		@Column(name="kjcxbg_wtrq", attrName="kjcxbgWtrq", label="委托日期", isQuery=false),
		@Column(name="kjcxbg_cxjg", attrName="kjcxbgCxjg", label="查新机构", isQuery=false),
		@Column(name="kjcxbg_cxwcrq", attrName="kjcxbgCxwcrq", label="查新完成日期", isQuery=false),
		@Column(name="kjcxbg_cxxmmc", attrName="kjcxbgCxxmmc", label="查新项目名称", isQuery=false),
		@Column(name="kjcxbg_jgmc", attrName="kjcxbgJgmc", label="机构名称", isQuery=false),
		@Column(name="kjcxbg_txdz", attrName="kjcxbgTxdz", label="通信地址", isQuery=false),
		@Column(name="kjcxbg_yzbm", attrName="kjcxbgYzbm", label="邮政编码", isQuery=false),
		@Column(name="kjcxbg_dzyx", attrName="kjcxbgDzyx", label="电子邮箱", isQuery=false),
		@Column(name="kjcxbg_fzr", attrName="kjcxbgFzr", label="负责人", isQuery=false),
		@Column(name="kjcxbg_dh", attrName="kjcxbgDh", label="电话", isQuery=false),
		@Column(name="kjcxbg_cz", attrName="kjcxbgCz", label="传真", isQuery=false),
		@Column(name="kjcxbg_lianxiren", attrName="kjcxbgLianxiren", label="联系人", isQuery=false),
		@Column(name="kjcxbg_dh1", attrName="kjcxbgDh1", label="电话1", isQuery=false),
		@Column(name="kjcxbg_dh2", attrName="kjcxbgDh2", label="电话2", isQuery=false),
		@Column(name="kjcxbg_cxmd", attrName="kjcxbgCxmd", label="查新目的", isQuery=false),
		@Column(name="kjcxbg_cxxmdkxjsyd", attrName="kjcxbgCxxmdkxjsyd", label="查新项目的科学技术要点", isQuery=false),
		@Column(name="kjcxbg_cxdycxyq", attrName="kjcxbgCxdycxyq", label="查新点与查新要求", isQuery=false),
		@Column(name="kjcxbg_gnwxjsfwyjjscl", attrName="kjcxbgGnwxjsfwyjjscl", label="国内文献检索范围以及检索策略", isQuery=false),
		@Column(name="kjcxbg_jsjg", attrName="kjcxbgJsjg", label="检索结果", isQuery=false),
		@Column(name="kjcxbg_gncxjl", attrName="kjcxbgGncxjl", label="国内查新结论", isQuery=false),
		@Column(name="kjcxbg_cxyshysm", attrName="kjcxbgCxyshysm", label="查新员审核员申明", isQuery=false),
		@Column(name="kjcxbg_lixiangren", attrName="kjcxbgLixiangren", label="立项人"),
		@Column(name="kjcxbg_lxsj", attrName="kjcxbgLxsj", label="立项时间"),
		@Column(name="kjcxbg_lxbm", attrName="kjcxbgLxbm", label="立项部门"),
	}, orderBy="a.id DESC"
)
public class CoreKjcxbg extends DataEntity<CoreKjcxbg> {
	
	private static final long serialVersionUID = 1L;
	private String kjcxbgBgbh;		// 报告编号
	private String kjcxbgHtbh;		// 合同编号
	private String kjcxbgXmmc;		// 项目名称
	private String kjcxbgWtr;		// 委托人
	private String kjcxbgWtrq;		// 委托日期
	private String kjcxbgCxjg;		// 查新机构
	private String kjcxbgCxwcrq;		// 查新完成日期
	private String kjcxbgCxxmmc;		// 查新项目名称
	private String kjcxbgJgmc;		// 机构名称
	private String kjcxbgTxdz;		// 通信地址
	private String kjcxbgYzbm;		// 邮政编码
	private String kjcxbgDzyx;		// 电子邮箱
	private String kjcxbgFzr;		// 负责人
	private String kjcxbgDh;		// 电话
	private String kjcxbgCz;		// 传真
	private String kjcxbgLianxiren;		// 联系人
	private String kjcxbgDh1;		// 电话1
	private String kjcxbgDh2;		// 电话2
	private String kjcxbgCxmd;		// 查新目的
	private String kjcxbgCxxmdkxjsyd;		// 查新项目的科学技术要点
	private String kjcxbgCxdycxyq;		// 查新点与查新要求
	private String kjcxbgGnwxjsfwyjjscl;		// 国内文献检索范围以及检索策略
	private String kjcxbgJsjg;		// 检索结果
	private String kjcxbgGncxjl;		// 国内查新结论
	private String kjcxbgCxyshysm;		// 查新员审核员申明
	private String kjcxbgLixiangren;		// 立项人
	private String kjcxbgLxsj;		// 立项时间
	private String kjcxbgLxbm;		// 立项部门

	public CoreKjcxbg() {
		this(null);
	}
	
	public CoreKjcxbg(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="报告编号长度不能超过 100 个字符")
	public String getKjcxbgBgbh() {
		return kjcxbgBgbh;
	}

	public void setKjcxbgBgbh(String kjcxbgBgbh) {
		this.kjcxbgBgbh = kjcxbgBgbh;
	}
	
	@Size(min=0, max=100, message="合同编号长度不能超过 100 个字符")
	public String getKjcxbgHtbh() {
		return kjcxbgHtbh;
	}

	public void setKjcxbgHtbh(String kjcxbgHtbh) {
		this.kjcxbgHtbh = kjcxbgHtbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getKjcxbgXmmc() {
		return kjcxbgXmmc;
	}

	public void setKjcxbgXmmc(String kjcxbgXmmc) {
		this.kjcxbgXmmc = kjcxbgXmmc;
	}
	
	@Size(min=0, max=100, message="委托人长度不能超过 100 个字符")
	public String getKjcxbgWtr() {
		return kjcxbgWtr;
	}

	public void setKjcxbgWtr(String kjcxbgWtr) {
		this.kjcxbgWtr = kjcxbgWtr;
	}
	
	@Size(min=0, max=100, message="委托日期长度不能超过 100 个字符")
	public String getKjcxbgWtrq() {
		return kjcxbgWtrq;
	}

	public void setKjcxbgWtrq(String kjcxbgWtrq) {
		this.kjcxbgWtrq = kjcxbgWtrq;
	}
	
	@Size(min=0, max=100, message="查新机构长度不能超过 100 个字符")
	public String getKjcxbgCxjg() {
		return kjcxbgCxjg;
	}

	public void setKjcxbgCxjg(String kjcxbgCxjg) {
		this.kjcxbgCxjg = kjcxbgCxjg;
	}
	
	@Size(min=0, max=100, message="查新完成日期长度不能超过 100 个字符")
	public String getKjcxbgCxwcrq() {
		return kjcxbgCxwcrq;
	}

	public void setKjcxbgCxwcrq(String kjcxbgCxwcrq) {
		this.kjcxbgCxwcrq = kjcxbgCxwcrq;
	}
	
	@Size(min=0, max=100, message="查新项目名称长度不能超过 100 个字符")
	public String getKjcxbgCxxmmc() {
		return kjcxbgCxxmmc;
	}

	public void setKjcxbgCxxmmc(String kjcxbgCxxmmc) {
		this.kjcxbgCxxmmc = kjcxbgCxxmmc;
	}
	
	@Size(min=0, max=100, message="机构名称长度不能超过 100 个字符")
	public String getKjcxbgJgmc() {
		return kjcxbgJgmc;
	}

	public void setKjcxbgJgmc(String kjcxbgJgmc) {
		this.kjcxbgJgmc = kjcxbgJgmc;
	}
	
	@Size(min=0, max=100, message="通信地址长度不能超过 100 个字符")
	public String getKjcxbgTxdz() {
		return kjcxbgTxdz;
	}

	public void setKjcxbgTxdz(String kjcxbgTxdz) {
		this.kjcxbgTxdz = kjcxbgTxdz;
	}
	
	@Size(min=0, max=100, message="邮政编码长度不能超过 100 个字符")
	public String getKjcxbgYzbm() {
		return kjcxbgYzbm;
	}

	public void setKjcxbgYzbm(String kjcxbgYzbm) {
		this.kjcxbgYzbm = kjcxbgYzbm;
	}
	
	@Size(min=0, max=100, message="电子邮箱长度不能超过 100 个字符")
	public String getKjcxbgDzyx() {
		return kjcxbgDzyx;
	}

	public void setKjcxbgDzyx(String kjcxbgDzyx) {
		this.kjcxbgDzyx = kjcxbgDzyx;
	}
	
	@Size(min=0, max=100, message="负责人长度不能超过 100 个字符")
	public String getKjcxbgFzr() {
		return kjcxbgFzr;
	}

	public void setKjcxbgFzr(String kjcxbgFzr) {
		this.kjcxbgFzr = kjcxbgFzr;
	}
	
	@Size(min=0, max=100, message="电话长度不能超过 100 个字符")
	public String getKjcxbgDh() {
		return kjcxbgDh;
	}

	public void setKjcxbgDh(String kjcxbgDh) {
		this.kjcxbgDh = kjcxbgDh;
	}
	
	@Size(min=0, max=100, message="传真长度不能超过 100 个字符")
	public String getKjcxbgCz() {
		return kjcxbgCz;
	}

	public void setKjcxbgCz(String kjcxbgCz) {
		this.kjcxbgCz = kjcxbgCz;
	}
	
	@Size(min=0, max=100, message="联系人长度不能超过 100 个字符")
	public String getKjcxbgLianxiren() {
		return kjcxbgLianxiren;
	}

	public void setKjcxbgLianxiren(String kjcxbgLianxiren) {
		this.kjcxbgLianxiren = kjcxbgLianxiren;
	}
	
	@Size(min=0, max=100, message="电话1长度不能超过 100 个字符")
	public String getKjcxbgDh1() {
		return kjcxbgDh1;
	}

	public void setKjcxbgDh1(String kjcxbgDh1) {
		this.kjcxbgDh1 = kjcxbgDh1;
	}
	
	@Size(min=0, max=100, message="电话2长度不能超过 100 个字符")
	public String getKjcxbgDh2() {
		return kjcxbgDh2;
	}

	public void setKjcxbgDh2(String kjcxbgDh2) {
		this.kjcxbgDh2 = kjcxbgDh2;
	}
	
	public String getKjcxbgCxmd() {
		return kjcxbgCxmd;
	}

	public void setKjcxbgCxmd(String kjcxbgCxmd) {
		this.kjcxbgCxmd = kjcxbgCxmd;
	}
	
	public String getKjcxbgCxxmdkxjsyd() {
		return kjcxbgCxxmdkxjsyd;
	}

	public void setKjcxbgCxxmdkxjsyd(String kjcxbgCxxmdkxjsyd) {
		this.kjcxbgCxxmdkxjsyd = kjcxbgCxxmdkxjsyd;
	}
	
	public String getKjcxbgCxdycxyq() {
		return kjcxbgCxdycxyq;
	}

	public void setKjcxbgCxdycxyq(String kjcxbgCxdycxyq) {
		this.kjcxbgCxdycxyq = kjcxbgCxdycxyq;
	}
	
	public String getKjcxbgGnwxjsfwyjjscl() {
		return kjcxbgGnwxjsfwyjjscl;
	}

	public void setKjcxbgGnwxjsfwyjjscl(String kjcxbgGnwxjsfwyjjscl) {
		this.kjcxbgGnwxjsfwyjjscl = kjcxbgGnwxjsfwyjjscl;
	}
	
	public String getKjcxbgJsjg() {
		return kjcxbgJsjg;
	}

	public void setKjcxbgJsjg(String kjcxbgJsjg) {
		this.kjcxbgJsjg = kjcxbgJsjg;
	}
	
	public String getKjcxbgGncxjl() {
		return kjcxbgGncxjl;
	}

	public void setKjcxbgGncxjl(String kjcxbgGncxjl) {
		this.kjcxbgGncxjl = kjcxbgGncxjl;
	}
	
	public String getKjcxbgCxyshysm() {
		return kjcxbgCxyshysm;
	}

	public void setKjcxbgCxyshysm(String kjcxbgCxyshysm) {
		this.kjcxbgCxyshysm = kjcxbgCxyshysm;
	}
	
	@Size(min=0, max=100, message="立项人长度不能超过 100 个字符")
	public String getKjcxbgLixiangren() {
		return kjcxbgLixiangren;
	}

	public void setKjcxbgLixiangren(String kjcxbgLixiangren) {
		this.kjcxbgLixiangren = kjcxbgLixiangren;
	}
	
	@Size(min=0, max=100, message="立项时间长度不能超过 100 个字符")
	public String getKjcxbgLxsj() {
		return kjcxbgLxsj;
	}

	public void setKjcxbgLxsj(String kjcxbgLxsj) {
		this.kjcxbgLxsj = kjcxbgLxsj;
	}
	
	@Size(min=0, max=100, message="立项部门长度不能超过 100 个字符")
	public String getKjcxbgLxbm() {
		return kjcxbgLxbm;
	}

	public void setKjcxbgLxbm(String kjcxbgLxbm) {
		this.kjcxbgLxbm = kjcxbgLxbm;
	}
	
}