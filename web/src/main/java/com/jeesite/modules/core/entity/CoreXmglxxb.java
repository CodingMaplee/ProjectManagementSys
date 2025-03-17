package com.jeesite.modules.core.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 项目管理信息表Entity
 * @author zhw
 * @version 2024-12-17
 */
@Table(name="core_xmglxxb", alias="a", label="项目管理信息表信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="gcgl_xmbh", attrName="gcglXmbh", label="项目编号"),
		@Column(name="gcgl_xmmc", attrName="gcglXmmc", label="项目名称"),
		@Column(name="gcgl_xmzt", attrName="gcglXmzt", label="项目状态"),
		@Column(name="gcgl_kssj", attrName="gcglKssj", label="开始时间"),
		@Column(name="gcgl_jssj", attrName="gcglJssj", label="结束时间"),
		@Column(name="gcgl_xmfzr", attrName="gcglXmfzr", label="项目负责人"),
		@Column(name="gcgl_xmry", attrName="gcglXmry", label="项目人员"),
		@Column(name="gcgl_xmyfsb", attrName="gcglXmyfsb", label="项目研发设备"),
		@Column(name="xmglxxb_yffyyszje", attrName="xmglxxbYffyyszje", label="研发费用预算总金额"),
		@Column(name="xmglxxb_yffyysmxb", attrName="xmglxxbYffyysmxb", label="研发费用预算明细表"),
}, orderBy="a.id DESC"
)
public class CoreXmglxxb extends DataEntity<CoreXmglxxb> {
	private static final long serialVersionUID = 1L;
	private String gcglXmbh;		// 项目编号
	private String gcglXmmc;		// 项目名称
	private String gcglXmzt;		// 项目状态
	private Date gcglKssj;		// 开始时间
	private Date gcglJssj;		// 结束时间
	private String gcglXmfzr;		// 项目负责人
	private String gcglXmry;		// 项目人员
	private String gcglXmyfsb;		// 项目研发设备
	private Double xmglxxbYffyyszje;		// 研发费用预算总金额
	private String xmglxxbYffyysmxb;		// 研发费用预算明细表

	public CoreXmglxxb() {
		this(null);
	}

	public CoreXmglxxb(String id){
		super(id);
	}

	@NotBlank(message="项目编号不能为空")
	@Size(min=0, max=64, message="项目编号长度不能超过 64 个字符")
	public String getGcglXmbh() {
		return gcglXmbh;
	}

	public void setGcglXmbh(String gcglXmbh) {
		this.gcglXmbh = gcglXmbh;
	}

	@NotBlank(message="项目名称不能为空")
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getGcglXmmc() {
		return gcglXmmc;
	}

	public void setGcglXmmc(String gcglXmmc) {
		this.gcglXmmc = gcglXmmc;
	}

	@NotBlank(message="项目状态不能为空")
	@Size(min=0, max=100, message="项目状态长度不能超过 100 个字符")
	public String getGcglXmzt() {
		return gcglXmzt;
	}

	public void setGcglXmzt(String gcglXmzt) {
		this.gcglXmzt = gcglXmzt;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="开始时间不能为空")
	public Date getGcglKssj() {
		return gcglKssj;
	}

	public void setGcglKssj(Date gcglKssj) {
		this.gcglKssj = gcglKssj;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="结束时间不能为空")
	public Date getGcglJssj() {
		return gcglJssj;
	}

	public void setGcglJssj(Date gcglJssj) {
		this.gcglJssj = gcglJssj;
	}

	@NotBlank(message="项目负责人不能为空")
	@Size(min=0, max=100, message="项目负责人长度不能超过 100 个字符")
	public String getGcglXmfzr() {
		return gcglXmfzr;
	}

	public void setGcglXmfzr(String gcglXmfzr) {
		this.gcglXmfzr = gcglXmfzr;
	}

	@Size(min=0, max=100, message="项目人员长度不能超过 100 个字符")
	public String getGcglXmry() {
		return gcglXmry;
	}

	public void setGcglXmry(String gcglXmry) {
		this.gcglXmry = gcglXmry;
	}

	@Size(min=0, max=100, message="项目研发设备长度不能超过 100 个字符")
	public String getGcglXmyfsb() {
		return gcglXmyfsb;
	}

	public void setGcglXmyfsb(String gcglXmyfsb) {
		this.gcglXmyfsb = gcglXmyfsb;
	}

	@NotNull(message="研发费用预算总金额不能为空")
	public Double getXmglxxbYffyyszje() {
		return xmglxxbYffyyszje;
	}

	public void setXmglxxbYffyyszje(Double xmglxxbYffyyszje) {
		this.xmglxxbYffyyszje = xmglxxbYffyyszje;
	}

	public String getXmglxxbYffyysmxb() {
		return xmglxxbYffyysmxb;
	}

	public void setXmglxxbYffyysmxb(String xmglxxbYffyysmxb) {
		this.xmglxxbYffyysmxb = xmglxxbYffyysmxb;
	}

}