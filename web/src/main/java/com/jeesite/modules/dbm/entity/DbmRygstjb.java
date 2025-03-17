package com.jeesite.modules.dbm.entity;

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
 * 人员工时统计表Entity
 * @author zhw
 * @version 2024-11-14
 */
@Table(name="dbm_rygstjb", alias="a", label="人员工时统计表信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="rygstjb_xmmc", attrName="rygstjbXmmc", label="项目名称"),
		@Column(name="rygstjb_gszjt", attrName="rygstjbGszjt", label="工时总计", comment="工时总计(天)", isUpdateForce=true),
		@Column(name="rygstjb_ryzjr", attrName="rygstjbRyzjr", label="人员总计", comment="人员总计(人)", isUpdateForce=true),
		@Column(name="rygstjb_rq", attrName="rygstjbRq", label="日期"),
	}, orderBy="a.id DESC"
)
public class DbmRygstjb extends DataEntity<DbmRygstjb> {
	
	private static final long serialVersionUID = 1L;
	private String rygstjbXmmc;		// 项目名称
	private Double rygstjbGszjt;		// 工时总计(天)
	private Integer rygstjbRyzjr;		// 人员总计(人)
	private Date rygstjbRq;		// 日期

	public DbmRygstjb() {
		this(null);
	}
	
	public DbmRygstjb(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getRygstjbXmmc() {
		return rygstjbXmmc;
	}

	public void setRygstjbXmmc(String rygstjbXmmc) {
		this.rygstjbXmmc = rygstjbXmmc;
	}
	
	public Double getRygstjbGszjt() {
		return rygstjbGszjt;
	}

	public void setRygstjbGszjt(Double rygstjbGszjt) {
		this.rygstjbGszjt = rygstjbGszjt;
	}
	
	public Integer getRygstjbRyzjr() {
		return rygstjbRyzjr;
	}

	public void setRygstjbRyzjr(Integer rygstjbRyzjr) {
		this.rygstjbRyzjr = rygstjbRyzjr;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="日期不能为空")
	public Date getRygstjbRq() {
		return rygstjbRq;
	}

	public void setRygstjbRq(Date rygstjbRq) {
		this.rygstjbRq = rygstjbRq;
	}
	
}