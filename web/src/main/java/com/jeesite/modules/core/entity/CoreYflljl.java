package com.jeesite.modules.core.entity;

import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 研发领料记录Entity
 * @author zhw
 * @version 2024-11-29
 */
@Table(name="core_yflljl", alias="a", label="研发领料记录信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="yflljl_yfllrq", attrName="yflljlYfllrq", label="研发领料日期", isUpdateForce=true),
		@Column(name="yflljl_lyyfxmbh", attrName="yflljlLyyfxmbh", label="领用研发项目编号"),
		@Column(name="yflljl_lyyfxmmc", attrName="yflljlLyyfxmmc", label="领用研发项目名称"),
		@Column(name="yflljl_wllb", attrName="yflljlWllb", label="物料类别"),
		@Column(name="yflljl_wlmc", attrName="yflljlWlmc", label="物料名称"),
		@Column(name="yflljl_lysl", attrName="yflljlLysl", label="领用数量", isUpdateForce=true),
		@Column(name="yflljl_lyje", attrName="yflljlLyje", label="领用金额", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class CoreYflljl extends DataEntity<CoreYflljl> {
	
	private static final long serialVersionUID = 1L;
	private Date yflljlYfllrq;		// 研发领料日期
	private String yflljlLyyfxmbh;		// 领用研发项目编号
	private String yflljlLyyfxmmc;		// 领用研发项目名称
	private String yflljlWllb;		// 物料类别
	private String yflljlWlmc;		// 物料名称
	private Integer yflljlLysl;		// 领用数量
	private Double yflljlLyje;		// 领用金额

	public CoreYflljl() {
		this(null);
	}
	
	public CoreYflljl(String id){
		super(id);
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getYflljlYfllrq() {
		return yflljlYfllrq;
	}

	public void setYflljlYfllrq(Date yflljlYfllrq) {
		this.yflljlYfllrq = yflljlYfllrq;
	}
	
	@Size(min=0, max=100, message="领用研发项目编号长度不能超过 100 个字符")
	public String getYflljlLyyfxmbh() {
		return yflljlLyyfxmbh;
	}

	public void setYflljlLyyfxmbh(String yflljlLyyfxmbh) {
		this.yflljlLyyfxmbh = yflljlLyyfxmbh;
	}
	
	@Size(min=0, max=100, message="领用研发项目名称长度不能超过 100 个字符")
	public String getYflljlLyyfxmmc() {
		return yflljlLyyfxmmc;
	}

	public void setYflljlLyyfxmmc(String yflljlLyyfxmmc) {
		this.yflljlLyyfxmmc = yflljlLyyfxmmc;
	}
	
	@Size(min=0, max=100, message="物料类别长度不能超过 100 个字符")
	public String getYflljlWllb() {
		return yflljlWllb;
	}

	public void setYflljlWllb(String yflljlWllb) {
		this.yflljlWllb = yflljlWllb;
	}
	
	@Size(min=0, max=100, message="物料名称长度不能超过 100 个字符")
	public String getYflljlWlmc() {
		return yflljlWlmc;
	}

	public void setYflljlWlmc(String yflljlWlmc) {
		this.yflljlWlmc = yflljlWlmc;
	}
	
	public Integer getYflljlLysl() {
		return yflljlLysl;
	}

	public void setYflljlLysl(Integer yflljlLysl) {
		this.yflljlLysl = yflljlLysl;
	}
	
	public Double getYflljlLyje() {
		return yflljlLyje;
	}

	public void setYflljlLyje(Double yflljlLyje) {
		this.yflljlLyje = yflljlLyje;
	}
	
}