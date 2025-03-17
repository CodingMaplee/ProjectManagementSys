package com.jeesite.modules.dbm.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 人员工时核算表Entity
 * @author zhw
 * @version 2024-11-14
 */
@Table(name="dbm_rygshsb", alias="a", label="人员工时核算表信息", columns={
		@Column(name="id", attrName="id", label="编号", isPK=true),
		@Column(name="rygshsb_ygxm", attrName="rygshsbYgxm", label="员工姓名"),
		@Column(name="rygshsb_ssbm", attrName="rygshsbSsbm", label="所属部门"),
		@Column(name="rygshsb_cj", attrName="rygshsbCj", label="车间"),
		@Column(name="rygshsb_gssj", attrName="rygshsbGssj", label="工时时间", comment="工时时间(天)", isUpdateForce=true),
		@Column(name="rygshsb_qrqz", attrName="rygshsbQrqz", label="确认签字"),
		@Column(name="rygshsb_bz", attrName="rygshsbBz", label="备注"),
	}, orderBy="a.id DESC"
)
public class DbmRygshsb extends DataEntity<DbmRygshsb> {
	
	private static final long serialVersionUID = 1L;
	private String rygshsbYgxm;		// 员工姓名
	private String rygshsbSsbm;		// 所属部门
	private String rygshsbCj;		// 车间
	private Double rygshsbGssj;		// 工时时间(天)
	private String rygshsbQrqz;		// 确认签字
	private String rygshsbBz;		// 备注

	public DbmRygshsb() {
		this(null);
	}
	
	public DbmRygshsb(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="员工姓名长度不能超过 100 个字符")
	public String getRygshsbYgxm() {
		return rygshsbYgxm;
	}

	public void setRygshsbYgxm(String rygshsbYgxm) {
		this.rygshsbYgxm = rygshsbYgxm;
	}
	
	@Size(min=0, max=100, message="所属部门长度不能超过 100 个字符")
	public String getRygshsbSsbm() {
		return rygshsbSsbm;
	}

	public void setRygshsbSsbm(String rygshsbSsbm) {
		this.rygshsbSsbm = rygshsbSsbm;
	}
	
	@Size(min=0, max=100, message="车间长度不能超过 100 个字符")
	public String getRygshsbCj() {
		return rygshsbCj;
	}

	public void setRygshsbCj(String rygshsbCj) {
		this.rygshsbCj = rygshsbCj;
	}
	
	public Double getRygshsbGssj() {
		return rygshsbGssj;
	}

	public void setRygshsbGssj(Double rygshsbGssj) {
		this.rygshsbGssj = rygshsbGssj;
	}
	
	@Size(min=0, max=100, message="确认签字长度不能超过 100 个字符")
	public String getRygshsbQrqz() {
		return rygshsbQrqz;
	}

	public void setRygshsbQrqz(String rygshsbQrqz) {
		this.rygshsbQrqz = rygshsbQrqz;
	}
	
	@Size(min=0, max=100, message="备注长度不能超过 100 个字符")
	public String getRygshsbBz() {
		return rygshsbBz;
	}

	public void setRygshsbBz(String rygshsbBz) {
		this.rygshsbBz = rygshsbBz;
	}
	
}