package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 研发工时统计表Entity
 * @author zhw
 * @version 2024-12-18
 */
@Table(name="core_yfgstjb", alias="a", label="研发工时统计表信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="yfgstjb_xmid", attrName="yfgstjbXmid", label="项目Id"),
		@Column(name="yfgstjb_zbid", attrName="yfgstjbZbid", label="周表Id"),
		@Column(name="yfgstjb_gzrq", attrName="yfgstjbGzrq", label="该周日期"),
		@Column(name="yfgstjb_gzzgs", attrName="yfgstjbGzzgs", label="该周总工时", isUpdateForce=true),
}, orderBy="a.id DESC"
)
public class CoreYfgstjb extends DataEntity<CoreYfgstjb> {

	private static final long serialVersionUID = 1L;
	private String yfgstjbXmid;		// 项目Id
	private String projectName;  // 项目名称
	private String projectCode;  // 项目名称
	private String yfgstjbZbid;		// 周表Id
	private String yfgstjbGzrq;		// 该周日期
	private String yfgstjbGzrqStart;
	private String yfgstjbGzrqEnd;
	private Double yfgstjbGzzgs;		// 该周总工时

	public CoreYfgstjb() {
		this(null);
	}

	public CoreYfgstjb(String id){
		super(id);
	}

	@Size(min=0, max=64, message="项目Id长度不能超过 64 个字符")
	public String getYfgstjbXmid() {
		return yfgstjbXmid;
	}

	public void setYfgstjbXmid(String yfgstjbXmid) {
		this.yfgstjbXmid = yfgstjbXmid;
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

	public String getYfgstjbZbid() {
		return yfgstjbZbid;
	}

	public void setYfgstjbZbid(String yfgstjbZbid) {
		this.yfgstjbZbid = yfgstjbZbid;
	}

	@Size(min=0, max=100, message="该周日期长度不能超过 100 个字符")
	public String getYfgstjbGzrq() {
		return yfgstjbGzrq;
	}

	public void setYfgstjbGzrq(String yfgstjbGzrq) {
		this.yfgstjbGzrq = yfgstjbGzrq;
	}

	public String getYfgstjbGzrqStart() { return yfgstjbGzrqStart; }

	public void setYfgstjbGzrqStart(String yfgstjbGzrqStart) {
		this.yfgstjbGzrqStart = yfgstjbGzrqStart;
	}

	public String getYfgstjbGzrqEnd() {
		return yfgstjbGzrqEnd;
	}

	public void setYfgstjbGzrqEnd(String yfgstjbGzrqEnd) {
		this.yfgstjbGzrqEnd = yfgstjbGzrqEnd;
	}

	public Double getYfgstjbGzzgs() {
		return yfgstjbGzzgs;
	}

	public void setYfgstjbGzzgs(Double yfgstjbGzzgs) {
		this.yfgstjbGzzgs = yfgstjbGzzgs;
	}

}