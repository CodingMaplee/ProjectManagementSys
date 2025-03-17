package com.jeesite.modules.core.entity;

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
 * 研发过程管理表Entity
 * @author zhw
 * @version 2024-12-23
 */
@Table(name="core_yfgcglb", alias="a", label="研发过程管理表信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="yfgcglb_xmid", attrName="yfgcglbXmid", label="项目Id"),
		@Column(name="yfgcglb_sj", attrName="yfgcglbSj", label="时间", isUpdateForce=true),
		@Column(name="yfgcglb_gcsj", attrName="yfgcglbGcsj", label="过程事件"),
		@Column(name="yfgcglb_bz", attrName="yfgcglbBz", label="备注"),
	}, orderBy="a.id DESC"
)
public class CoreYfgcglb extends DataEntity<CoreYfgcglb> {
	
	private static final long serialVersionUID = 1L;
	private String yfgcglbXmid;		// 项目Id
	private Date yfgcglbSj;		// 时间
	private String yfgcglbGcsj;		// 过程事件
	private String yfgcglbBz;		// 备注

	public CoreYfgcglb() {
		this(null);
	}
	
	public CoreYfgcglb(String id){
		super(id);
	}
	
	@Size(min=0, max=64, message="项目Id长度不能超过 64 个字符")
	public String getYfgcglbXmid() {
		return yfgcglbXmid;
	}

	public void setYfgcglbXmid(String yfgcglbXmid) {
		this.yfgcglbXmid = yfgcglbXmid;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getYfgcglbSj() {
		return yfgcglbSj;
	}

	public void setYfgcglbSj(Date yfgcglbSj) {
		this.yfgcglbSj = yfgcglbSj;
	}
	
	@Size(min=0, max=100, message="过程事件长度不能超过 100 个字符")
	public String getYfgcglbGcsj() {
		return yfgcglbGcsj;
	}

	public void setYfgcglbGcsj(String yfgcglbGcsj) {
		this.yfgcglbGcsj = yfgcglbGcsj;
	}
	
	@Size(min=0, max=100, message="备注长度不能超过 100 个字符")
	public String getYfgcglbBz() {
		return yfgcglbBz;
	}

	public void setYfgcglbBz(String yfgcglbBz) {
		this.yfgcglbBz = yfgcglbBz;
	}
	
}