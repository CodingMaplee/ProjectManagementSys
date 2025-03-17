package com.jeesite.modules.core.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;
import com.jeesite.modules.dbm.entity.DbmRydab;
import com.jeesite.common.utils.excel.annotation.ExcelField;  // 导入 ExcelField 注解
/**
 * 研发工时条目表Entity
 * @author zhw
 * @version 2024-12-20
 */
@Table(name="core_yfgstmb", alias="a", label="研发工时条目表信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="project_id", attrName="projectId", label="项目Id"),
		@Column(name="employee_id", attrName="employeeId", label="人员Id"),
		@Column(name="week_start_date", attrName="weekStartDate", label="该周开始日期"),
		@Column(name="monday_hours", attrName="mondayHours", label="周一工时", isUpdateForce=true),
		@Column(name="tuesday_hours", attrName="tuesdayHours", label="周二工时", isUpdateForce=true),
		@Column(name="wednesday_hours", attrName="wednesdayHours", label="周三工时", isUpdateForce=true),
		@Column(name="thursday_hours", attrName="thursdayHours", label="周四工时", isUpdateForce=true),
		@Column(name="friday_hours", attrName="fridayHours", label="周五工时", isUpdateForce=true),
		@Column(name="saturday_hours", attrName="saturdayHours", label="周六工时", isUpdateForce=true),
		@Column(name="sunday_hours", attrName="sundayHours", label="周日工时", isUpdateForce=true),
		@Column(name="total_hours", attrName="totalHours", label="工时小计", isUpdateForce=true),
}, orderBy="a.id DESC"
)
public class CoreYfgstmb extends DataEntity<CoreYfgstmb> {

	private static final long serialVersionUID = 1L;
	private String projectId;		// 项目Id
	@ExcelField(title="人员Id")
	private String employeeId;		// 人员
	private String weekStartDate;		// 该周开始日期
	@ExcelField(title="周一工时")
	private Double mondayHours;		// 周一工时
	@ExcelField(title="周二工时")
	private Double tuesdayHours;		// 周二工时
	@ExcelField(title="周三工时")
	private Double wednesdayHours;		// 周三工时
	@ExcelField(title="周四工时")
	private Double thursdayHours;		// 周四工时
	@ExcelField(title="周五工时")
	private Double fridayHours;		// 周五工时
	@ExcelField(title="周六工时")
	private Double saturdayHours;		// 周六工时
	@ExcelField(title="周日工时")
	private Double sundayHours;		// 周日工时
	@ExcelField(title="工时小计")
	private Double totalHours;		// 工时小计

	public CoreYfgstmb() {
		this(null);
	}

	public CoreYfgstmb(String id){
		super(id);
	}

	@NotBlank(message="项目Id不能为空")
	@Size(min=0, max=64, message="项目Id长度不能超过 64 个字符")
	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	@Size(min=0, max=64, message="人员Id长度不能超过 64 个字符")
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Size(min=0, max=100, message="该周开始日期长度不能超过 100 个字符")
	public String getWeekStartDate() {
		return weekStartDate;
	}

	public void setWeekStartDate(String weekStartDate) {
		this.weekStartDate = weekStartDate;
	}

	public Double getMondayHours() {
		return mondayHours;
	}

	public void setMondayHours(Double mondayHours) {
		this.mondayHours = mondayHours;
	}

	public Double getTuesdayHours() {
		return tuesdayHours;
	}

	public void setTuesdayHours(Double tuesdayHours) {
		this.tuesdayHours = tuesdayHours;
	}

	public Double getWednesdayHours() {
		return wednesdayHours;
	}

	public void setWednesdayHours(Double wednesdayHours) {
		this.wednesdayHours = wednesdayHours;
	}

	public Double getThursdayHours() {
		return thursdayHours;
	}

	public void setThursdayHours(Double thursdayHours) {
		this.thursdayHours = thursdayHours;
	}

	public Double getFridayHours() {
		return fridayHours;
	}

	public void setFridayHours(Double fridayHours) {
		this.fridayHours = fridayHours;
	}

	public Double getSaturdayHours() {
		return saturdayHours;
	}

	public void setSaturdayHours(Double saturdayHours) {
		this.saturdayHours = saturdayHours;
	}

	public Double getSundayHours() {
		return sundayHours;
	}

	public void setSundayHours(Double sundayHours) {
		this.sundayHours = sundayHours;
	}

	public Double getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(Double totalHours) {
		this.totalHours = totalHours;
	}

}