package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 立项审批书Entity
 * @author tjh
 * @version 2025-01-19
 */
@Table(name="core_lxsps", alias="a", label="立项审批书信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="lxsps_xmmc", attrName="lxspsXmmc", label="项目名称"),
		@Column(name="lxsps_qzsj", attrName="lxspsQzsj", label="起止时间"),
		@Column(name="lxsps_lxdmdhyy", attrName="lxspsLxdmdhyy", label="立项的目的和意义", isQuery=false),
		@Column(name="lxsps_ssfa", attrName="lxspsSsfa", label="实施方案", isQuery=false),
		@Column(name="lxsps_yfbyj", attrName="lxspsYfbyj", label="研发部意见", isQuery=false),
		@Column(name="lxsps_gsyj", attrName="lxspsGsyj", label="公司意见", isQuery=false),
	}, orderBy="a.id DESC"
)
public class CoreLxsps extends DataEntity<CoreLxsps> {

	private static final long serialVersionUID = 1L;
	private String lxspsXmmc;		// 项目名称
	private String lxspsQzsj;		// 起止时间
	private String lxspsLxdmdhyy;		// 立项的目的和意义
	private String lxspsSsfa;		// 实施方案
	private String lxspsYfbyj;		// 研发部意见
	private String lxspsGsyj;		// 公司意见

	public CoreLxsps() {
		this(null);
	}

	public CoreLxsps(String id){
		super(id);
	}

	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getLxspsXmmc() {
		return lxspsXmmc;
	}

	public void setLxspsXmmc(String lxspsXmmc) {
		this.lxspsXmmc = lxspsXmmc;
	}

	public String getLxspsQzsj() {
		return lxspsQzsj;
	}

	public void setLxspsQzsj(String lxspsQzsj) {
		this.lxspsQzsj = lxspsQzsj;
	}

	public String getLxspsLxdmdhyy() {
		return lxspsLxdmdhyy;
	}

	public void setLxspsLxdmdhyy(String lxspsLxdmdhyy) {
		this.lxspsLxdmdhyy = lxspsLxdmdhyy;
	}

	public String getLxspsSsfa() {
		return lxspsSsfa;
	}

	public void setLxspsSsfa(String lxspsSsfa) {
		this.lxspsSsfa = lxspsSsfa;
	}

	public String getLxspsYfbyj() {
		return lxspsYfbyj;
	}

	public void setLxspsYfbyj(String lxspsYfbyj) {
		this.lxspsYfbyj = lxspsYfbyj;
	}

	public String getLxspsGsyj() {
		return lxspsGsyj;
	}

	public void setLxspsGsyj(String lxspsGsyj) {
		this.lxspsGsyj = lxspsGsyj;
	}

}