package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 设备工时统计表Entity
 * @author zhw
 * @version 2024-12-18
 */
@Table(name="core_sbgstjb", alias="a", label="设备工时统计表信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="sbgstjb_xmid", attrName="sbgstjbXmid", label="项目Id"),
		@Column(name="sbgstjb_zbid", attrName="sbgstjbZbid", label="周表Id"),
		@Column(name="sbgstjb_gzrq", attrName="sbgstjbGzrq", label="该周日期"),
		@Column(name="sbgstjb_gzzgs", attrName="sbgstjbGzzgs", label="该周总工时", isUpdateForce=true),
}, orderBy="a.id DESC"
)
public class CoreSbgstjb extends DataEntity<CoreSbgstjb> {

	private static final long serialVersionUID = 1L;
	private String sbgstjbXmid;		// 项目Id
	private String projectName;  // 项目名称
	private String projectCode;  // 项目名称
	private String sbgstjbZbid;		// 周表Id
	private String sbgstjbGzrq;		// 该周日期
	private Double sbgstjbGzzgs;		// 该周总工时

	public CoreSbgstjb() {
		this(null);
	}

	public CoreSbgstjb(String id){
		super(id);
	}

	@Size(min=0, max=64, message="项目Id长度不能超过 64 个字符")
	public String getSbgstjbXmid() {
		return sbgstjbXmid;
	}

	public void setSbgstjbXmid(String sbgstjbXmid) {
		this.sbgstjbXmid = sbgstjbXmid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getSbgstjbZbid() {
		return sbgstjbZbid;
	}

	public void setSbgstjbZbid(String sbgstjbZbid) {
		this.sbgstjbZbid = sbgstjbZbid;
	}

	@Size(min=0, max=100, message="该周日期长度不能超过 100 个字符")
	public String getSbgstjbGzrq() {
		return sbgstjbGzrq;
	}

	public void setSbgstjbGzrq(String sbgstjbGzrq) {
		this.sbgstjbGzrq = sbgstjbGzrq;
	}

	public Double getSbgstjbGzzgs() {
		return sbgstjbGzzgs;
	}

	public void setSbgstjbGzzgs(Double sbgstjbGzzgs) {
		this.sbgstjbGzzgs = sbgstjbGzzgs;
	}

}