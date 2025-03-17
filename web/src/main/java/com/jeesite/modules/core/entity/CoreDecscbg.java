package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 试产报告Entity
 * @author tjh
 * @version 2025-01-21
 */
@Table(name="core_decscbg", alias="a", label="试产报告信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="decscbg_xmbh", attrName="decscbgXmbh", label="项目编号"),
		@Column(name="decscbg_xmmc", attrName="decscbgXmmc", label="项目名称"),
		@Column(name="decscbg_scrq", attrName="decscbgScrq", label="试产日期", isQuery=false),
		@Column(name="decscbg_scdw", attrName="decscbgScdw", label="试产单位", isQuery=false),
		@Column(name="decscbg_sclx", attrName="decscbgSclx", label="试产类型", isQuery=false),
		@Column(name="decscbg_cpmc", attrName="decscbgCpmc", label="产品名称", isQuery=false),
		@Column(name="decscbg_cplh", attrName="decscbgCplh", label="成品料号", isQuery=false),
		@Column(name="decscbg_scsl", attrName="decscbgScsl", label="试产数量", isQuery=false),
		@Column(name="decscbg_wtd1", attrName="decscbgWtd1", label="问题点1", isQuery=false),
		@Column(name="decscbg_wtd2", attrName="decscbgWtd2", label="问题点2", isQuery=false),
		@Column(name="decscbg_wtd3", attrName="decscbgWtd3", label="问题点3", isQuery=false),
		@Column(name="decscbg_wtd4", attrName="decscbgWtd4", label="问题点4", isQuery=false),
		@Column(name="decscbg_wtd5", attrName="decscbgWtd5", label="问题点5", isQuery=false),
		@Column(name="decscbg_wtd6", attrName="decscbgWtd6", label="问题点6", isQuery=false),
		@Column(name="decscbg_wtd7", attrName="decscbgWtd7", label="问题点7", isQuery=false),
		@Column(name="decscbg_wtd8", attrName="decscbgWtd8", label="问题点8", isQuery=false),
		@Column(name="decscbg_wtd9", attrName="decscbgWtd9", label="问题点9", isQuery=false),
		@Column(name="decscbg_wtd10", attrName="decscbgWtd10", label="问题点10", isQuery=false),
		@Column(name="decscbg_yyfx1", attrName="decscbgYyfx1", label="原因分析1", isQuery=false),
		@Column(name="decscbg_yyfx2", attrName="decscbgYyfx2", label="原因分析2", isQuery=false),
		@Column(name="decscbg_yyfx3", attrName="decscbgYyfx3", label="原因分析3", isQuery=false),
		@Column(name="decscbg_yyfx4", attrName="decscbgYyfx4", label="原因分析4", isQuery=false),
		@Column(name="decscbg_yyfx5", attrName="decscbgYyfx5", label="原因分析5", isQuery=false),
		@Column(name="decscbg_yyfx6", attrName="decscbgYyfx6", label="原因分析6", isQuery=false),
		@Column(name="decscbg_yyfx7", attrName="decscbgYyfx7", label="原因分析7", isQuery=false),
		@Column(name="decscbg_yyfx8", attrName="decscbgYyfx8", label="原因分析8", isQuery=false),
		@Column(name="decscbg_yyfx9", attrName="decscbgYyfx9", label="原因分析9", isQuery=false),
		@Column(name="decscbg_yyfx10", attrName="decscbgYyfx10", label="原因分析10", isQuery=false),
		@Column(name="decscbg_jjfa1", attrName="decscbgJjfa1", label="解决方案1", isQuery=false),
		@Column(name="decscbg_jjfa2", attrName="decscbgJjfa2", label="解决方案2", isQuery=false),
		@Column(name="decscbg_jjfa3", attrName="decscbgJjfa3", label="解决方案3", isQuery=false),
		@Column(name="decscbg_jjfa4", attrName="decscbgJjfa4", label="解决方案4", isQuery=false),
		@Column(name="decscbg_jjfa5", attrName="decscbgJjfa5", label="解决方案5", isQuery=false),
		@Column(name="decscbg_jjfa6", attrName="decscbgJjfa6", label="解决方案6", isQuery=false),
		@Column(name="decscbg_jjfa7", attrName="decscbgJjfa7", label="解决方案7", isQuery=false),
		@Column(name="decscbg_jjfa8", attrName="decscbgJjfa8", label="解决方案8", isQuery=false),
		@Column(name="decscbg_jjfa9", attrName="decscbgJjfa9", label="解决方案9", isQuery=false),
		@Column(name="decscbg_jjfa10", attrName="decscbgJjfa10", label="解决方案10", isQuery=false),
		@Column(name="decscbg_yjwcsj1", attrName="decscbgYjwcsj1", label="预计完成时间1", isQuery=false),
		@Column(name="decscbg_yjwcsj2", attrName="decscbgYjwcsj2", label="预计完成时间2", isQuery=false),
		@Column(name="decscbg_yjwcsj3", attrName="decscbgYjwcsj3", label="预计完成时间3", isQuery=false),
		@Column(name="decscbg_yjwcsj4", attrName="decscbgYjwcsj4", label="预计完成时间4", isQuery=false),
		@Column(name="decscbg_yjwcsj5", attrName="decscbgYjwcsj5", label="预计完成时间5", isQuery=false),
		@Column(name="decscbg_yjwcsj6", attrName="decscbgYjwcsj6", label="预计完成时间6", isQuery=false),
		@Column(name="decscbg_yjwcsj7", attrName="decscbgYjwcsj7", label="预计完成时间7", isQuery=false),
		@Column(name="decscbg_yjwcsj8", attrName="decscbgYjwcsj8", label="预计完成时间8", isQuery=false),
		@Column(name="decscbg_yjwcsj9", attrName="decscbgYjwcsj9", label="预计完成时间9", isQuery=false),
		@Column(name="decscbg_yjwcsj10", attrName="decscbgYjwcsj10", label="预计完成时间10", isQuery=false),
		@Column(name="decscbg_sjwcsj1", attrName="decscbgSjwcsj1", label="实际完成时间1", isQuery=false),
		@Column(name="decscbg_sjwcsj2", attrName="decscbgSjwcsj2", label="实际完成时间2", isQuery=false),
		@Column(name="decscbg_sjwcsj3", attrName="decscbgSjwcsj3", label="实际完成时间3", isQuery=false),
		@Column(name="decscbg_sjwcsj4", attrName="decscbgSjwcsj4", label="实际完成时间4", isQuery=false),
		@Column(name="decscbg_sjwcsj5", attrName="decscbgSjwcsj5", label="实际完成时间5", isQuery=false),
		@Column(name="decscbg_sjwcsj6", attrName="decscbgSjwcsj6", label="实际完成时间6", isQuery=false),
		@Column(name="decscbg_sjwcsj7", attrName="decscbgSjwcsj7", label="实际完成时间7", isQuery=false),
		@Column(name="decscbg_sjwcsj8", attrName="decscbgSjwcsj8", label="实际完成时间8", isQuery=false),
		@Column(name="decscbg_sjwcsj9", attrName="decscbgSjwcsj9", label="实际完成时间9", isQuery=false),
		@Column(name="decscbg_sjwcsj10", attrName="decscbgSjwcsj10", label="实际完成时间10", isQuery=false),
		@Column(name="decscbg_jg1", attrName="decscbgJg1", label="结果1", isQuery=false),
		@Column(name="decscbg_jg2", attrName="decscbgJg2", label="结果2", isQuery=false),
		@Column(name="decscbg_jg3", attrName="decscbgJg3", label="结果3", isQuery=false),
		@Column(name="decscbg_jg4", attrName="decscbgJg4", label="结果4", isQuery=false),
		@Column(name="decscbg_jg5", attrName="decscbgJg5", label="结果5", isQuery=false),
		@Column(name="decscbg_jg6", attrName="decscbgJg6", label="结果6", isQuery=false),
		@Column(name="decscbg_jg7", attrName="decscbgJg7", label="结果7", isQuery=false),
		@Column(name="decscbg_jg8", attrName="decscbgJg8", label="结果8", isQuery=false),
		@Column(name="decscbg_jg9", attrName="decscbgJg9", label="结果9", isQuery=false),
		@Column(name="decscbg_jg10", attrName="decscbgJg10", label="结果10", isQuery=false),
		@Column(name="decscbg_fzr1", attrName="decscbgFzr1", label="负责人1", isQuery=false),
		@Column(name="decscbg_fzr2", attrName="decscbgFzr2", label="负责人2", isQuery=false),
		@Column(name="decscbg_fzr3", attrName="decscbgFzr3", label="负责人3", isQuery=false),
		@Column(name="decscbg_fzr4", attrName="decscbgFzr4", label="负责人4", isQuery=false),
		@Column(name="decscbg_fzr5", attrName="decscbgFzr5", label="负责人5", isQuery=false),
		@Column(name="decscbg_fzr6", attrName="decscbgFzr6", label="负责人6", isQuery=false),
		@Column(name="decscbg_fzr7", attrName="decscbgFzr7", label="负责人7", isQuery=false),
		@Column(name="decscbg_fzr8", attrName="decscbgFzr8", label="负责人8", isQuery=false),
		@Column(name="decscbg_fzr9", attrName="decscbgFzr9", label="负责人9", isQuery=false),
		@Column(name="decscbg_fzr10", attrName="decscbgFzr10", label="负责人10", isQuery=false),
		@Column(name="decscbg_cpbls", attrName="decscbgCpbls", label="成品不良数", isQuery=false),
		@Column(name="decscbg_hgcps", attrName="decscbgHgcps", label="合格成品数", isQuery=false),
		@Column(name="decscbg_schgl", attrName="decscbgSchgl", label="试产合格率", isQuery=false),
		@Column(name="decscbg_bz", attrName="decscbgBz", label="备注", isQuery=false),
		@Column(name="decscbg_pz", attrName="decscbgPz", label="批准", isQuery=false),
		@Column(name="decscbg_sh", attrName="decscbgSh", label="审核", isQuery=false),
		@Column(name="decscbg_zd", attrName="decscbgZd", label="制定", isQuery=false),
	}, orderBy="a.id DESC"
)
public class CoreDecscbg extends DataEntity<CoreDecscbg> {
	
	private static final long serialVersionUID = 1L;
	private String decscbgXmbh;		// 项目编号
	private String decscbgXmmc;		// 项目名称
	private String decscbgScrq;		// 试产日期
	private String decscbgScdw;		// 试产单位
	private String decscbgSclx;		// 试产类型
	private String decscbgCpmc;		// 产品名称
	private String decscbgCplh;		// 成品料号
	private String decscbgScsl;		// 试产数量
	private String decscbgWtd1;		// 问题点1
	private String decscbgWtd2;		// 问题点2
	private String decscbgWtd3;		// 问题点3
	private String decscbgWtd4;		// 问题点4
	private String decscbgWtd5;		// 问题点5
	private String decscbgWtd6;		// 问题点6
	private String decscbgWtd7;		// 问题点7
	private String decscbgWtd8;		// 问题点8
	private String decscbgWtd9;		// 问题点9
	private String decscbgWtd10;		// 问题点10
	private String decscbgYyfx1;		// 原因分析1
	private String decscbgYyfx2;		// 原因分析2
	private String decscbgYyfx3;		// 原因分析3
	private String decscbgYyfx4;		// 原因分析4
	private String decscbgYyfx5;		// 原因分析5
	private String decscbgYyfx6;		// 原因分析6
	private String decscbgYyfx7;		// 原因分析7
	private String decscbgYyfx8;		// 原因分析8
	private String decscbgYyfx9;		// 原因分析9
	private String decscbgYyfx10;		// 原因分析10
	private String decscbgJjfa1;		// 解决方案1
	private String decscbgJjfa2;		// 解决方案2
	private String decscbgJjfa3;		// 解决方案3
	private String decscbgJjfa4;		// 解决方案4
	private String decscbgJjfa5;		// 解决方案5
	private String decscbgJjfa6;		// 解决方案6
	private String decscbgJjfa7;		// 解决方案7
	private String decscbgJjfa8;		// 解决方案8
	private String decscbgJjfa9;		// 解决方案9
	private String decscbgJjfa10;		// 解决方案10
	private String decscbgYjwcsj1;		// 预计完成时间1
	private String decscbgYjwcsj2;		// 预计完成时间2
	private String decscbgYjwcsj3;		// 预计完成时间3
	private String decscbgYjwcsj4;		// 预计完成时间4
	private String decscbgYjwcsj5;		// 预计完成时间5
	private String decscbgYjwcsj6;		// 预计完成时间6
	private String decscbgYjwcsj7;		// 预计完成时间7
	private String decscbgYjwcsj8;		// 预计完成时间8
	private String decscbgYjwcsj9;		// 预计完成时间9
	private String decscbgYjwcsj10;		// 预计完成时间10
	private String decscbgSjwcsj1;		// 实际完成时间1
	private String decscbgSjwcsj2;		// 实际完成时间2
	private String decscbgSjwcsj3;		// 实际完成时间3
	private String decscbgSjwcsj4;		// 实际完成时间4
	private String decscbgSjwcsj5;		// 实际完成时间5
	private String decscbgSjwcsj6;		// 实际完成时间6
	private String decscbgSjwcsj7;		// 实际完成时间7
	private String decscbgSjwcsj8;		// 实际完成时间8
	private String decscbgSjwcsj9;		// 实际完成时间9
	private String decscbgSjwcsj10;		// 实际完成时间10
	private String decscbgJg1;		// 结果1
	private String decscbgJg2;		// 结果2
	private String decscbgJg3;		// 结果3
	private String decscbgJg4;		// 结果4
	private String decscbgJg5;		// 结果5
	private String decscbgJg6;		// 结果6
	private String decscbgJg7;		// 结果7
	private String decscbgJg8;		// 结果8
	private String decscbgJg9;		// 结果9
	private String decscbgJg10;		// 结果10
	private String decscbgFzr1;		// 负责人1
	private String decscbgFzr2;		// 负责人2
	private String decscbgFzr3;		// 负责人3
	private String decscbgFzr4;		// 负责人4
	private String decscbgFzr5;		// 负责人5
	private String decscbgFzr6;		// 负责人6
	private String decscbgFzr7;		// 负责人7
	private String decscbgFzr8;		// 负责人8
	private String decscbgFzr9;		// 负责人9
	private String decscbgFzr10;		// 负责人10
	private String decscbgCpbls;		// 成品不良数
	private String decscbgHgcps;		// 合格成品数
	private String decscbgSchgl;		// 试产合格率
	private String decscbgBz;		// 备注
	private String decscbgPz;		// 批准
	private String decscbgSh;		// 审核
	private String decscbgZd;		// 制定

	public CoreDecscbg() {
		this(null);
	}
	
	public CoreDecscbg(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getDecscbgXmbh() {
		return decscbgXmbh;
	}

	public void setDecscbgXmbh(String decscbgXmbh) {
		this.decscbgXmbh = decscbgXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getDecscbgXmmc() {
		return decscbgXmmc;
	}

	public void setDecscbgXmmc(String decscbgXmmc) {
		this.decscbgXmmc = decscbgXmmc;
	}
	
	@Size(min=0, max=100, message="试产日期长度不能超过 100 个字符")
	public String getDecscbgScrq() {
		return decscbgScrq;
	}

	public void setDecscbgScrq(String decscbgScrq) {
		this.decscbgScrq = decscbgScrq;
	}
	
	@Size(min=0, max=100, message="试产单位长度不能超过 100 个字符")
	public String getDecscbgScdw() {
		return decscbgScdw;
	}

	public void setDecscbgScdw(String decscbgScdw) {
		this.decscbgScdw = decscbgScdw;
	}
	
	@Size(min=0, max=100, message="试产类型长度不能超过 100 个字符")
	public String getDecscbgSclx() {
		return decscbgSclx;
	}

	public void setDecscbgSclx(String decscbgSclx) {
		this.decscbgSclx = decscbgSclx;
	}
	
	@Size(min=0, max=100, message="产品名称长度不能超过 100 个字符")
	public String getDecscbgCpmc() {
		return decscbgCpmc;
	}

	public void setDecscbgCpmc(String decscbgCpmc) {
		this.decscbgCpmc = decscbgCpmc;
	}
	
	@Size(min=0, max=100, message="成品料号长度不能超过 100 个字符")
	public String getDecscbgCplh() {
		return decscbgCplh;
	}

	public void setDecscbgCplh(String decscbgCplh) {
		this.decscbgCplh = decscbgCplh;
	}
	
	@Size(min=0, max=100, message="试产数量长度不能超过 100 个字符")
	public String getDecscbgScsl() {
		return decscbgScsl;
	}

	public void setDecscbgScsl(String decscbgScsl) {
		this.decscbgScsl = decscbgScsl;
	}
	
	@Size(min=0, max=100, message="问题点1长度不能超过 100 个字符")
	public String getDecscbgWtd1() {
		return decscbgWtd1;
	}

	public void setDecscbgWtd1(String decscbgWtd1) {
		this.decscbgWtd1 = decscbgWtd1;
	}
	
	@Size(min=0, max=100, message="问题点2长度不能超过 100 个字符")
	public String getDecscbgWtd2() {
		return decscbgWtd2;
	}

	public void setDecscbgWtd2(String decscbgWtd2) {
		this.decscbgWtd2 = decscbgWtd2;
	}
	
	@Size(min=0, max=100, message="问题点3长度不能超过 100 个字符")
	public String getDecscbgWtd3() {
		return decscbgWtd3;
	}

	public void setDecscbgWtd3(String decscbgWtd3) {
		this.decscbgWtd3 = decscbgWtd3;
	}
	
	@Size(min=0, max=100, message="问题点4长度不能超过 100 个字符")
	public String getDecscbgWtd4() {
		return decscbgWtd4;
	}

	public void setDecscbgWtd4(String decscbgWtd4) {
		this.decscbgWtd4 = decscbgWtd4;
	}
	
	@Size(min=0, max=100, message="问题点5长度不能超过 100 个字符")
	public String getDecscbgWtd5() {
		return decscbgWtd5;
	}

	public void setDecscbgWtd5(String decscbgWtd5) {
		this.decscbgWtd5 = decscbgWtd5;
	}
	
	@Size(min=0, max=100, message="问题点6长度不能超过 100 个字符")
	public String getDecscbgWtd6() {
		return decscbgWtd6;
	}

	public void setDecscbgWtd6(String decscbgWtd6) {
		this.decscbgWtd6 = decscbgWtd6;
	}
	
	@Size(min=0, max=100, message="问题点7长度不能超过 100 个字符")
	public String getDecscbgWtd7() {
		return decscbgWtd7;
	}

	public void setDecscbgWtd7(String decscbgWtd7) {
		this.decscbgWtd7 = decscbgWtd7;
	}
	
	@Size(min=0, max=100, message="问题点8长度不能超过 100 个字符")
	public String getDecscbgWtd8() {
		return decscbgWtd8;
	}

	public void setDecscbgWtd8(String decscbgWtd8) {
		this.decscbgWtd8 = decscbgWtd8;
	}
	
	@Size(min=0, max=100, message="问题点9长度不能超过 100 个字符")
	public String getDecscbgWtd9() {
		return decscbgWtd9;
	}

	public void setDecscbgWtd9(String decscbgWtd9) {
		this.decscbgWtd9 = decscbgWtd9;
	}
	
	@Size(min=0, max=100, message="问题点10长度不能超过 100 个字符")
	public String getDecscbgWtd10() {
		return decscbgWtd10;
	}

	public void setDecscbgWtd10(String decscbgWtd10) {
		this.decscbgWtd10 = decscbgWtd10;
	}
	
	@Size(min=0, max=100, message="原因分析1长度不能超过 100 个字符")
	public String getDecscbgYyfx1() {
		return decscbgYyfx1;
	}

	public void setDecscbgYyfx1(String decscbgYyfx1) {
		this.decscbgYyfx1 = decscbgYyfx1;
	}
	
	@Size(min=0, max=100, message="原因分析2长度不能超过 100 个字符")
	public String getDecscbgYyfx2() {
		return decscbgYyfx2;
	}

	public void setDecscbgYyfx2(String decscbgYyfx2) {
		this.decscbgYyfx2 = decscbgYyfx2;
	}
	
	@Size(min=0, max=100, message="原因分析3长度不能超过 100 个字符")
	public String getDecscbgYyfx3() {
		return decscbgYyfx3;
	}

	public void setDecscbgYyfx3(String decscbgYyfx3) {
		this.decscbgYyfx3 = decscbgYyfx3;
	}
	
	@Size(min=0, max=100, message="原因分析4长度不能超过 100 个字符")
	public String getDecscbgYyfx4() {
		return decscbgYyfx4;
	}

	public void setDecscbgYyfx4(String decscbgYyfx4) {
		this.decscbgYyfx4 = decscbgYyfx4;
	}
	
	@Size(min=0, max=100, message="原因分析5长度不能超过 100 个字符")
	public String getDecscbgYyfx5() {
		return decscbgYyfx5;
	}

	public void setDecscbgYyfx5(String decscbgYyfx5) {
		this.decscbgYyfx5 = decscbgYyfx5;
	}
	
	@Size(min=0, max=100, message="原因分析6长度不能超过 100 个字符")
	public String getDecscbgYyfx6() {
		return decscbgYyfx6;
	}

	public void setDecscbgYyfx6(String decscbgYyfx6) {
		this.decscbgYyfx6 = decscbgYyfx6;
	}
	
	@Size(min=0, max=100, message="原因分析7长度不能超过 100 个字符")
	public String getDecscbgYyfx7() {
		return decscbgYyfx7;
	}

	public void setDecscbgYyfx7(String decscbgYyfx7) {
		this.decscbgYyfx7 = decscbgYyfx7;
	}
	
	@Size(min=0, max=100, message="原因分析8长度不能超过 100 个字符")
	public String getDecscbgYyfx8() {
		return decscbgYyfx8;
	}

	public void setDecscbgYyfx8(String decscbgYyfx8) {
		this.decscbgYyfx8 = decscbgYyfx8;
	}
	
	@Size(min=0, max=100, message="原因分析9长度不能超过 100 个字符")
	public String getDecscbgYyfx9() {
		return decscbgYyfx9;
	}

	public void setDecscbgYyfx9(String decscbgYyfx9) {
		this.decscbgYyfx9 = decscbgYyfx9;
	}
	
	@Size(min=0, max=100, message="原因分析10长度不能超过 100 个字符")
	public String getDecscbgYyfx10() {
		return decscbgYyfx10;
	}

	public void setDecscbgYyfx10(String decscbgYyfx10) {
		this.decscbgYyfx10 = decscbgYyfx10;
	}
	
	@Size(min=0, max=100, message="解决方案1长度不能超过 100 个字符")
	public String getDecscbgJjfa1() {
		return decscbgJjfa1;
	}

	public void setDecscbgJjfa1(String decscbgJjfa1) {
		this.decscbgJjfa1 = decscbgJjfa1;
	}
	
	@Size(min=0, max=100, message="解决方案2长度不能超过 100 个字符")
	public String getDecscbgJjfa2() {
		return decscbgJjfa2;
	}

	public void setDecscbgJjfa2(String decscbgJjfa2) {
		this.decscbgJjfa2 = decscbgJjfa2;
	}
	
	@Size(min=0, max=100, message="解决方案3长度不能超过 100 个字符")
	public String getDecscbgJjfa3() {
		return decscbgJjfa3;
	}

	public void setDecscbgJjfa3(String decscbgJjfa3) {
		this.decscbgJjfa3 = decscbgJjfa3;
	}
	
	@Size(min=0, max=100, message="解决方案4长度不能超过 100 个字符")
	public String getDecscbgJjfa4() {
		return decscbgJjfa4;
	}

	public void setDecscbgJjfa4(String decscbgJjfa4) {
		this.decscbgJjfa4 = decscbgJjfa4;
	}
	
	@Size(min=0, max=100, message="解决方案5长度不能超过 100 个字符")
	public String getDecscbgJjfa5() {
		return decscbgJjfa5;
	}

	public void setDecscbgJjfa5(String decscbgJjfa5) {
		this.decscbgJjfa5 = decscbgJjfa5;
	}
	
	@Size(min=0, max=100, message="解决方案6长度不能超过 100 个字符")
	public String getDecscbgJjfa6() {
		return decscbgJjfa6;
	}

	public void setDecscbgJjfa6(String decscbgJjfa6) {
		this.decscbgJjfa6 = decscbgJjfa6;
	}
	
	@Size(min=0, max=100, message="解决方案7长度不能超过 100 个字符")
	public String getDecscbgJjfa7() {
		return decscbgJjfa7;
	}

	public void setDecscbgJjfa7(String decscbgJjfa7) {
		this.decscbgJjfa7 = decscbgJjfa7;
	}
	
	@Size(min=0, max=100, message="解决方案8长度不能超过 100 个字符")
	public String getDecscbgJjfa8() {
		return decscbgJjfa8;
	}

	public void setDecscbgJjfa8(String decscbgJjfa8) {
		this.decscbgJjfa8 = decscbgJjfa8;
	}
	
	@Size(min=0, max=100, message="解决方案9长度不能超过 100 个字符")
	public String getDecscbgJjfa9() {
		return decscbgJjfa9;
	}

	public void setDecscbgJjfa9(String decscbgJjfa9) {
		this.decscbgJjfa9 = decscbgJjfa9;
	}
	
	@Size(min=0, max=100, message="解决方案10长度不能超过 100 个字符")
	public String getDecscbgJjfa10() {
		return decscbgJjfa10;
	}

	public void setDecscbgJjfa10(String decscbgJjfa10) {
		this.decscbgJjfa10 = decscbgJjfa10;
	}
	
	@Size(min=0, max=100, message="预计完成时间1长度不能超过 100 个字符")
	public String getDecscbgYjwcsj1() {
		return decscbgYjwcsj1;
	}

	public void setDecscbgYjwcsj1(String decscbgYjwcsj1) {
		this.decscbgYjwcsj1 = decscbgYjwcsj1;
	}
	
	@Size(min=0, max=100, message="预计完成时间2长度不能超过 100 个字符")
	public String getDecscbgYjwcsj2() {
		return decscbgYjwcsj2;
	}

	public void setDecscbgYjwcsj2(String decscbgYjwcsj2) {
		this.decscbgYjwcsj2 = decscbgYjwcsj2;
	}
	
	@Size(min=0, max=100, message="预计完成时间3长度不能超过 100 个字符")
	public String getDecscbgYjwcsj3() {
		return decscbgYjwcsj3;
	}

	public void setDecscbgYjwcsj3(String decscbgYjwcsj3) {
		this.decscbgYjwcsj3 = decscbgYjwcsj3;
	}
	
	@Size(min=0, max=100, message="预计完成时间4长度不能超过 100 个字符")
	public String getDecscbgYjwcsj4() {
		return decscbgYjwcsj4;
	}

	public void setDecscbgYjwcsj4(String decscbgYjwcsj4) {
		this.decscbgYjwcsj4 = decscbgYjwcsj4;
	}
	
	@Size(min=0, max=100, message="预计完成时间5长度不能超过 100 个字符")
	public String getDecscbgYjwcsj5() {
		return decscbgYjwcsj5;
	}

	public void setDecscbgYjwcsj5(String decscbgYjwcsj5) {
		this.decscbgYjwcsj5 = decscbgYjwcsj5;
	}
	
	@Size(min=0, max=100, message="预计完成时间6长度不能超过 100 个字符")
	public String getDecscbgYjwcsj6() {
		return decscbgYjwcsj6;
	}

	public void setDecscbgYjwcsj6(String decscbgYjwcsj6) {
		this.decscbgYjwcsj6 = decscbgYjwcsj6;
	}
	
	@Size(min=0, max=100, message="预计完成时间7长度不能超过 100 个字符")
	public String getDecscbgYjwcsj7() {
		return decscbgYjwcsj7;
	}

	public void setDecscbgYjwcsj7(String decscbgYjwcsj7) {
		this.decscbgYjwcsj7 = decscbgYjwcsj7;
	}
	
	@Size(min=0, max=100, message="预计完成时间8长度不能超过 100 个字符")
	public String getDecscbgYjwcsj8() {
		return decscbgYjwcsj8;
	}

	public void setDecscbgYjwcsj8(String decscbgYjwcsj8) {
		this.decscbgYjwcsj8 = decscbgYjwcsj8;
	}
	
	@Size(min=0, max=100, message="预计完成时间9长度不能超过 100 个字符")
	public String getDecscbgYjwcsj9() {
		return decscbgYjwcsj9;
	}

	public void setDecscbgYjwcsj9(String decscbgYjwcsj9) {
		this.decscbgYjwcsj9 = decscbgYjwcsj9;
	}
	
	@Size(min=0, max=100, message="预计完成时间10长度不能超过 100 个字符")
	public String getDecscbgYjwcsj10() {
		return decscbgYjwcsj10;
	}

	public void setDecscbgYjwcsj10(String decscbgYjwcsj10) {
		this.decscbgYjwcsj10 = decscbgYjwcsj10;
	}
	
	@Size(min=0, max=100, message="实际完成时间1长度不能超过 100 个字符")
	public String getDecscbgSjwcsj1() {
		return decscbgSjwcsj1;
	}

	public void setDecscbgSjwcsj1(String decscbgSjwcsj1) {
		this.decscbgSjwcsj1 = decscbgSjwcsj1;
	}
	
	@Size(min=0, max=100, message="实际完成时间2长度不能超过 100 个字符")
	public String getDecscbgSjwcsj2() {
		return decscbgSjwcsj2;
	}

	public void setDecscbgSjwcsj2(String decscbgSjwcsj2) {
		this.decscbgSjwcsj2 = decscbgSjwcsj2;
	}
	
	@Size(min=0, max=100, message="实际完成时间3长度不能超过 100 个字符")
	public String getDecscbgSjwcsj3() {
		return decscbgSjwcsj3;
	}

	public void setDecscbgSjwcsj3(String decscbgSjwcsj3) {
		this.decscbgSjwcsj3 = decscbgSjwcsj3;
	}
	
	@Size(min=0, max=100, message="实际完成时间4长度不能超过 100 个字符")
	public String getDecscbgSjwcsj4() {
		return decscbgSjwcsj4;
	}

	public void setDecscbgSjwcsj4(String decscbgSjwcsj4) {
		this.decscbgSjwcsj4 = decscbgSjwcsj4;
	}
	
	@Size(min=0, max=100, message="实际完成时间5长度不能超过 100 个字符")
	public String getDecscbgSjwcsj5() {
		return decscbgSjwcsj5;
	}

	public void setDecscbgSjwcsj5(String decscbgSjwcsj5) {
		this.decscbgSjwcsj5 = decscbgSjwcsj5;
	}
	
	@Size(min=0, max=100, message="实际完成时间6长度不能超过 100 个字符")
	public String getDecscbgSjwcsj6() {
		return decscbgSjwcsj6;
	}

	public void setDecscbgSjwcsj6(String decscbgSjwcsj6) {
		this.decscbgSjwcsj6 = decscbgSjwcsj6;
	}
	
	@Size(min=0, max=100, message="实际完成时间7长度不能超过 100 个字符")
	public String getDecscbgSjwcsj7() {
		return decscbgSjwcsj7;
	}

	public void setDecscbgSjwcsj7(String decscbgSjwcsj7) {
		this.decscbgSjwcsj7 = decscbgSjwcsj7;
	}
	
	@Size(min=0, max=100, message="实际完成时间8长度不能超过 100 个字符")
	public String getDecscbgSjwcsj8() {
		return decscbgSjwcsj8;
	}

	public void setDecscbgSjwcsj8(String decscbgSjwcsj8) {
		this.decscbgSjwcsj8 = decscbgSjwcsj8;
	}
	
	@Size(min=0, max=100, message="实际完成时间9长度不能超过 100 个字符")
	public String getDecscbgSjwcsj9() {
		return decscbgSjwcsj9;
	}

	public void setDecscbgSjwcsj9(String decscbgSjwcsj9) {
		this.decscbgSjwcsj9 = decscbgSjwcsj9;
	}
	
	@Size(min=0, max=100, message="实际完成时间10长度不能超过 100 个字符")
	public String getDecscbgSjwcsj10() {
		return decscbgSjwcsj10;
	}

	public void setDecscbgSjwcsj10(String decscbgSjwcsj10) {
		this.decscbgSjwcsj10 = decscbgSjwcsj10;
	}
	
	@Size(min=0, max=100, message="结果1长度不能超过 100 个字符")
	public String getDecscbgJg1() {
		return decscbgJg1;
	}

	public void setDecscbgJg1(String decscbgJg1) {
		this.decscbgJg1 = decscbgJg1;
	}
	
	@Size(min=0, max=100, message="结果2长度不能超过 100 个字符")
	public String getDecscbgJg2() {
		return decscbgJg2;
	}

	public void setDecscbgJg2(String decscbgJg2) {
		this.decscbgJg2 = decscbgJg2;
	}
	
	@Size(min=0, max=100, message="结果3长度不能超过 100 个字符")
	public String getDecscbgJg3() {
		return decscbgJg3;
	}

	public void setDecscbgJg3(String decscbgJg3) {
		this.decscbgJg3 = decscbgJg3;
	}
	
	@Size(min=0, max=100, message="结果4长度不能超过 100 个字符")
	public String getDecscbgJg4() {
		return decscbgJg4;
	}

	public void setDecscbgJg4(String decscbgJg4) {
		this.decscbgJg4 = decscbgJg4;
	}
	
	@Size(min=0, max=100, message="结果5长度不能超过 100 个字符")
	public String getDecscbgJg5() {
		return decscbgJg5;
	}

	public void setDecscbgJg5(String decscbgJg5) {
		this.decscbgJg5 = decscbgJg5;
	}
	
	@Size(min=0, max=100, message="结果6长度不能超过 100 个字符")
	public String getDecscbgJg6() {
		return decscbgJg6;
	}

	public void setDecscbgJg6(String decscbgJg6) {
		this.decscbgJg6 = decscbgJg6;
	}
	
	@Size(min=0, max=100, message="结果7长度不能超过 100 个字符")
	public String getDecscbgJg7() {
		return decscbgJg7;
	}

	public void setDecscbgJg7(String decscbgJg7) {
		this.decscbgJg7 = decscbgJg7;
	}
	
	@Size(min=0, max=100, message="结果8长度不能超过 100 个字符")
	public String getDecscbgJg8() {
		return decscbgJg8;
	}

	public void setDecscbgJg8(String decscbgJg8) {
		this.decscbgJg8 = decscbgJg8;
	}
	
	@Size(min=0, max=100, message="结果9长度不能超过 100 个字符")
	public String getDecscbgJg9() {
		return decscbgJg9;
	}

	public void setDecscbgJg9(String decscbgJg9) {
		this.decscbgJg9 = decscbgJg9;
	}
	
	@Size(min=0, max=100, message="结果10长度不能超过 100 个字符")
	public String getDecscbgJg10() {
		return decscbgJg10;
	}

	public void setDecscbgJg10(String decscbgJg10) {
		this.decscbgJg10 = decscbgJg10;
	}
	
	@Size(min=0, max=100, message="负责人1长度不能超过 100 个字符")
	public String getDecscbgFzr1() {
		return decscbgFzr1;
	}

	public void setDecscbgFzr1(String decscbgFzr1) {
		this.decscbgFzr1 = decscbgFzr1;
	}
	
	@Size(min=0, max=100, message="负责人2长度不能超过 100 个字符")
	public String getDecscbgFzr2() {
		return decscbgFzr2;
	}

	public void setDecscbgFzr2(String decscbgFzr2) {
		this.decscbgFzr2 = decscbgFzr2;
	}
	
	@Size(min=0, max=100, message="负责人3长度不能超过 100 个字符")
	public String getDecscbgFzr3() {
		return decscbgFzr3;
	}

	public void setDecscbgFzr3(String decscbgFzr3) {
		this.decscbgFzr3 = decscbgFzr3;
	}
	
	@Size(min=0, max=100, message="负责人4长度不能超过 100 个字符")
	public String getDecscbgFzr4() {
		return decscbgFzr4;
	}

	public void setDecscbgFzr4(String decscbgFzr4) {
		this.decscbgFzr4 = decscbgFzr4;
	}
	
	@Size(min=0, max=100, message="负责人5长度不能超过 100 个字符")
	public String getDecscbgFzr5() {
		return decscbgFzr5;
	}

	public void setDecscbgFzr5(String decscbgFzr5) {
		this.decscbgFzr5 = decscbgFzr5;
	}
	
	@Size(min=0, max=100, message="负责人6长度不能超过 100 个字符")
	public String getDecscbgFzr6() {
		return decscbgFzr6;
	}

	public void setDecscbgFzr6(String decscbgFzr6) {
		this.decscbgFzr6 = decscbgFzr6;
	}
	
	@Size(min=0, max=100, message="负责人7长度不能超过 100 个字符")
	public String getDecscbgFzr7() {
		return decscbgFzr7;
	}

	public void setDecscbgFzr7(String decscbgFzr7) {
		this.decscbgFzr7 = decscbgFzr7;
	}
	
	@Size(min=0, max=100, message="负责人8长度不能超过 100 个字符")
	public String getDecscbgFzr8() {
		return decscbgFzr8;
	}

	public void setDecscbgFzr8(String decscbgFzr8) {
		this.decscbgFzr8 = decscbgFzr8;
	}
	
	@Size(min=0, max=100, message="负责人9长度不能超过 100 个字符")
	public String getDecscbgFzr9() {
		return decscbgFzr9;
	}

	public void setDecscbgFzr9(String decscbgFzr9) {
		this.decscbgFzr9 = decscbgFzr9;
	}
	
	@Size(min=0, max=100, message="负责人10长度不能超过 100 个字符")
	public String getDecscbgFzr10() {
		return decscbgFzr10;
	}

	public void setDecscbgFzr10(String decscbgFzr10) {
		this.decscbgFzr10 = decscbgFzr10;
	}
	
	@Size(min=0, max=100, message="成品不良数长度不能超过 100 个字符")
	public String getDecscbgCpbls() {
		return decscbgCpbls;
	}

	public void setDecscbgCpbls(String decscbgCpbls) {
		this.decscbgCpbls = decscbgCpbls;
	}
	
	@Size(min=0, max=100, message="合格成品数长度不能超过 100 个字符")
	public String getDecscbgHgcps() {
		return decscbgHgcps;
	}

	public void setDecscbgHgcps(String decscbgHgcps) {
		this.decscbgHgcps = decscbgHgcps;
	}
	
	@Size(min=0, max=100, message="试产合格率长度不能超过 100 个字符")
	public String getDecscbgSchgl() {
		return decscbgSchgl;
	}

	public void setDecscbgSchgl(String decscbgSchgl) {
		this.decscbgSchgl = decscbgSchgl;
	}
	
	@Size(min=0, max=100, message="备注长度不能超过 100 个字符")
	public String getDecscbgBz() {
		return decscbgBz;
	}

	public void setDecscbgBz(String decscbgBz) {
		this.decscbgBz = decscbgBz;
	}
	
	@Size(min=0, max=100, message="批准长度不能超过 100 个字符")
	public String getDecscbgPz() {
		return decscbgPz;
	}

	public void setDecscbgPz(String decscbgPz) {
		this.decscbgPz = decscbgPz;
	}
	
	@Size(min=0, max=100, message="审核长度不能超过 100 个字符")
	public String getDecscbgSh() {
		return decscbgSh;
	}

	public void setDecscbgSh(String decscbgSh) {
		this.decscbgSh = decscbgSh;
	}
	
	@Size(min=0, max=100, message="制定长度不能超过 100 个字符")
	public String getDecscbgZd() {
		return decscbgZd;
	}

	public void setDecscbgZd(String decscbgZd) {
		this.decscbgZd = decscbgZd;
	}
	
}