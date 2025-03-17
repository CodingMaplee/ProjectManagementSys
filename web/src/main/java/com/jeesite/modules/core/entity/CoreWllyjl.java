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
 * 物料领用记录Entity
 * @author zhw
 * @version 2024-11-29
 */
@Table(name="core_wllyjl", alias="a", label="物料领用记录信息", columns={
		@Column(name="id", attrName="id", label="领料单编号", isPK=true),
		@Column(name="wllyjl_llrq", attrName="wllyjlLlrq", label="领料日期", isUpdateForce=true),
		@Column(name="wllyjl_wllb", attrName="wllyjlWllb", label="物料类别"),
		@Column(name="wllyjl_wlmc", attrName="wllyjlWlmc", label="物料名称"),
		@Column(name="wllyjl_lysl", attrName="wllyjlLysl", label="领用数量", isUpdateForce=true),
		@Column(name="wllyjl_lyzje", attrName="wllyjlLyzje", label="领用总金额", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class CoreWllyjl extends DataEntity<CoreWllyjl> {
	
	private static final long serialVersionUID = 1L;
	private Date wllyjlLlrq;		// 领料日期
	private String wllyjlWllb;		// 物料类别
	private String wllyjlWlmc;		// 物料名称
	private Integer wllyjlLysl;		// 领用数量
	private Double wllyjlLyzje;		// 领用总金额

	public CoreWllyjl() {
		this(null);
	}
	
	public CoreWllyjl(String id){
		super(id);
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getWllyjlLlrq() {
		return wllyjlLlrq;
	}

	public void setWllyjlLlrq(Date wllyjlLlrq) {
		this.wllyjlLlrq = wllyjlLlrq;
	}
	
	@Size(min=0, max=100, message="物料类别长度不能超过 100 个字符")
	public String getWllyjlWllb() {
		return wllyjlWllb;
	}

	public void setWllyjlWllb(String wllyjlWllb) {
		this.wllyjlWllb = wllyjlWllb;
	}
	
	@Size(min=0, max=100, message="物料名称长度不能超过 100 个字符")
	public String getWllyjlWlmc() {
		return wllyjlWlmc;
	}

	public void setWllyjlWlmc(String wllyjlWlmc) {
		this.wllyjlWlmc = wllyjlWlmc;
	}
	
	public Integer getWllyjlLysl() {
		return wllyjlLysl;
	}

	public void setWllyjlLysl(Integer wllyjlLysl) {
		this.wllyjlLysl = wllyjlLysl;
	}
	
	public Double getWllyjlLyzje() {
		return wllyjlLyzje;
	}

	public void setWllyjlLyzje(Double wllyjlLyzje) {
		this.wllyjlLyzje = wllyjlLyzje;
	}
	
}