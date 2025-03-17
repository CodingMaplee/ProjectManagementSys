package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 项目开发进度记录表Entity
 * @author tjh
 * @version 2025-01-21
 */
@Table(name="core_xmkfjdjlb", alias="a", label="项目开发进度记录表信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="xmkfjdjlb_xmbh", attrName="xmkfjdjlbXmbh", label="项目编号"),
		@Column(name="xmkfjdjlb_xmmc", attrName="xmkfjdjlbXmmc", label="项目名称"),
		@Column(name="xmkfjdjlb_rq1", attrName="xmkfjdjlbRq1", label="日期1", isQuery=false),
		@Column(name="xmkfjdjlb_rq2", attrName="xmkfjdjlbRq2", label="日期2", isQuery=false),
		@Column(name="xmkfjdjlb_rq3", attrName="xmkfjdjlbRq3", label="日期3", isQuery=false),
		@Column(name="xmkfjdjlb_rq4", attrName="xmkfjdjlbRq4", label="日期4", isQuery=false),
		@Column(name="xmkfjdjlb_rq5", attrName="xmkfjdjlbRq5", label="日期5", isQuery=false),
		@Column(name="xmkfjdjlb_rq6", attrName="xmkfjdjlbRq6", label="日期6", isQuery=false),
		@Column(name="xmkfjdjlb_rq7", attrName="xmkfjdjlbRq7", label="日期7", isQuery=false),
		@Column(name="xmkfjdjlb_rq8", attrName="xmkfjdjlbRq8", label="日期8", isQuery=false),
		@Column(name="xmkfjdjlb_rq9", attrName="xmkfjdjlbRq9", label="日期9", isQuery=false),
		@Column(name="xmkfjdjlb_rq10", attrName="xmkfjdjlbRq10", label="日期10", isQuery=false),
		@Column(name="xmkfjdjlb_rq11", attrName="xmkfjdjlbRq11", label="日期11", isQuery=false),
		@Column(name="xmkfjdjlb_rq12", attrName="xmkfjdjlbRq12", label="日期12", isQuery=false),
		@Column(name="xmkfjdjlb_rq13", attrName="xmkfjdjlbRq13", label="日期13", isQuery=false),
		@Column(name="xmkfjdjlb_rq14", attrName="xmkfjdjlbRq14", label="日期14", isQuery=false),
		@Column(name="xmkfjdjlb_rq15", attrName="xmkfjdjlbRq15", label="日期15", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq1", attrName="xmkfjdjlbLxsq1", label="立项申请1", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq2", attrName="xmkfjdjlbLxsq2", label="立项申请2", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq3", attrName="xmkfjdjlbLxsq3", label="立项申请3", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq4", attrName="xmkfjdjlbLxsq4", label="立项申请4", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq5", attrName="xmkfjdjlbLxsq5", label="立项申请5", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq6", attrName="xmkfjdjlbLxsq6", label="立项申请6", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq7", attrName="xmkfjdjlbLxsq7", label="立项申请7", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq8", attrName="xmkfjdjlbLxsq8", label="立项申请8", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq9", attrName="xmkfjdjlbLxsq9", label="立项申请9", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq10", attrName="xmkfjdjlbLxsq10", label="立项申请10", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq11", attrName="xmkfjdjlbLxsq11", label="立项申请11", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq12", attrName="xmkfjdjlbLxsq12", label="立项申请12", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq13", attrName="xmkfjdjlbLxsq13", label="立项申请13", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq14", attrName="xmkfjdjlbLxsq14", label="立项申请14", isQuery=false),
		@Column(name="xmkfjdjlb_lxsq15", attrName="xmkfjdjlbLxsq15", label="立项申请15", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg1", attrName="xmkfjdjlbKxxpgbg1", label="可行性评估报告1", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg2", attrName="xmkfjdjlbKxxpgbg2", label="可行性评估报告2", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg3", attrName="xmkfjdjlbKxxpgbg3", label="可行性评估报告3", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg4", attrName="xmkfjdjlbKxxpgbg4", label="可行性评估报告4", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg5", attrName="xmkfjdjlbKxxpgbg5", label="可行性评估报告5", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg6", attrName="xmkfjdjlbKxxpgbg6", label="可行性评估报告6", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg7", attrName="xmkfjdjlbKxxpgbg7", label="可行性评估报告7", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg8", attrName="xmkfjdjlbKxxpgbg8", label="可行性评估报告8", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg9", attrName="xmkfjdjlbKxxpgbg9", label="可行性评估报告9", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg10", attrName="xmkfjdjlbKxxpgbg10", label="可行性评估报告10", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg11", attrName="xmkfjdjlbKxxpgbg11", label="可行性评估报告11", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg12", attrName="xmkfjdjlbKxxpgbg12", label="可行性评估报告12", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg13", attrName="xmkfjdjlbKxxpgbg13", label="可行性评估报告13", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg14", attrName="xmkfjdjlbKxxpgbg14", label="可行性评估报告14", isQuery=false),
		@Column(name="xmkfjdjlb_kxxpgbg15", attrName="xmkfjdjlbKxxpgbg15", label="可行性评估报告15", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy1", attrName="xmkfjdjlbLxjy1", label="立项决议1", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy2", attrName="xmkfjdjlbLxjy2", label="立项决议2", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy3", attrName="xmkfjdjlbLxjy3", label="立项决议3", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy4", attrName="xmkfjdjlbLxjy4", label="立项决议4", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy5", attrName="xmkfjdjlbLxjy5", label="立项决议5", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy6", attrName="xmkfjdjlbLxjy6", label="立项决议6", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy7", attrName="xmkfjdjlbLxjy7", label="立项决议7", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy8", attrName="xmkfjdjlbLxjy8", label="立项决议8", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy9", attrName="xmkfjdjlbLxjy9", label="立项决议9", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy10", attrName="xmkfjdjlbLxjy10", label="立项决议10", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy11", attrName="xmkfjdjlbLxjy11", label="立项决议11", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy12", attrName="xmkfjdjlbLxjy12", label="立项决议12", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy13", attrName="xmkfjdjlbLxjy13", label="立项决议13", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy14", attrName="xmkfjdjlbLxjy14", label="立项决议14", isQuery=false),
		@Column(name="xmkfjdjlb_lxjy15", attrName="xmkfjdjlbLxjy15", label="立项决议15", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl1", attrName="xmkfjdjlbJdxhbjl1", label="阶段性汇报记录1", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl2", attrName="xmkfjdjlbJdxhbjl2", label="阶段性汇报记录2", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl3", attrName="xmkfjdjlbJdxhbjl3", label="阶段性汇报记录3", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl4", attrName="xmkfjdjlbJdxhbjl4", label="阶段性汇报记录4", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl5", attrName="xmkfjdjlbJdxhbjl5", label="阶段性汇报记录5", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl6", attrName="xmkfjdjlbJdxhbjl6", label="阶段性汇报记录6", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl7", attrName="xmkfjdjlbJdxhbjl7", label="阶段性汇报记录7", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl8", attrName="xmkfjdjlbJdxhbjl8", label="阶段性汇报记录8", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl9", attrName="xmkfjdjlbJdxhbjl9", label="阶段性汇报记录9", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl10", attrName="xmkfjdjlbJdxhbjl10", label="阶段性汇报记录10", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl11", attrName="xmkfjdjlbJdxhbjl11", label="阶段性汇报记录11", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl12", attrName="xmkfjdjlbJdxhbjl12", label="阶段性汇报记录12", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl13", attrName="xmkfjdjlbJdxhbjl13", label="阶段性汇报记录13", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl14", attrName="xmkfjdjlbJdxhbjl14", label="阶段性汇报记录14", isQuery=false),
		@Column(name="xmkfjdjlb_jdxhbjl15", attrName="xmkfjdjlbJdxhbjl15", label="阶段性汇报记录15", isQuery=false),
		@Column(name="xmkfjdjlb_scbg1", attrName="xmkfjdjlbScbg1", label="试产报告1", isQuery=false),
		@Column(name="xmkfjdjlb_scbg2", attrName="xmkfjdjlbScbg2", label="试产报告2", isQuery=false),
		@Column(name="xmkfjdjlb_scbg3", attrName="xmkfjdjlbScbg3", label="试产报告3", isQuery=false),
		@Column(name="xmkfjdjlb_scbg4", attrName="xmkfjdjlbScbg4", label="试产报告4", isQuery=false),
		@Column(name="xmkfjdjlb_scbg5", attrName="xmkfjdjlbScbg5", label="试产报告5", isQuery=false),
		@Column(name="xmkfjdjlb_scbg6", attrName="xmkfjdjlbScbg6", label="试产报告6", isQuery=false),
		@Column(name="xmkfjdjlb_scbg7", attrName="xmkfjdjlbScbg7", label="试产报告7", isQuery=false),
		@Column(name="xmkfjdjlb_scbg8", attrName="xmkfjdjlbScbg8", label="试产报告8", isQuery=false),
		@Column(name="xmkfjdjlb_scbg9", attrName="xmkfjdjlbScbg9", label="试产报告9", isQuery=false),
		@Column(name="xmkfjdjlb_scbg10", attrName="xmkfjdjlbScbg10", label="试产报告10", isQuery=false),
		@Column(name="xmkfjdjlb_scbg11", attrName="xmkfjdjlbScbg11", label="试产报告11", isQuery=false),
		@Column(name="xmkfjdjlb_scbg12", attrName="xmkfjdjlbScbg12", label="试产报告12", isQuery=false),
		@Column(name="xmkfjdjlb_scbg13", attrName="xmkfjdjlbScbg13", label="试产报告13", isQuery=false),
		@Column(name="xmkfjdjlb_scbg14", attrName="xmkfjdjlbScbg14", label="试产报告14", isQuery=false),
		@Column(name="xmkfjdjlb_scbg15", attrName="xmkfjdjlbScbg15", label="试产报告15", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg1", attrName="xmkfjdjlbJtbg1", label="结题报告1", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg2", attrName="xmkfjdjlbJtbg2", label="结题报告2", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg3", attrName="xmkfjdjlbJtbg3", label="结题报告3", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg4", attrName="xmkfjdjlbJtbg4", label="结题报告4", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg5", attrName="xmkfjdjlbJtbg5", label="结题报告5", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg6", attrName="xmkfjdjlbJtbg6", label="结题报告6", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg7", attrName="xmkfjdjlbJtbg7", label="结题报告7", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg8", attrName="xmkfjdjlbJtbg8", label="结题报告8", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg9", attrName="xmkfjdjlbJtbg9", label="结题报告9", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg10", attrName="xmkfjdjlbJtbg10", label="结题报告10", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg11", attrName="xmkfjdjlbJtbg11", label="结题报告11", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg12", attrName="xmkfjdjlbJtbg12", label="结题报告12", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg13", attrName="xmkfjdjlbJtbg13", label="结题报告13", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg14", attrName="xmkfjdjlbJtbg14", label="结题报告14", isQuery=false),
		@Column(name="xmkfjdjlb_jtbg15", attrName="xmkfjdjlbJtbg15", label="结题报告15", isQuery=false),
		@Column(name="xmkfjdjlb_bz1", attrName="xmkfjdjlbBz1", label="备注1", isQuery=false),
		@Column(name="xmkfjdjlb_bz2", attrName="xmkfjdjlbBz2", label="备注2", isQuery=false),
		@Column(name="xmkfjdjlb_bz3", attrName="xmkfjdjlbBz3", label="备注3", isQuery=false),
		@Column(name="xmkfjdjlb_bz4", attrName="xmkfjdjlbBz4", label="备注4", isQuery=false),
		@Column(name="xmkfjdjlb_bz5", attrName="xmkfjdjlbBz5", label="备注5", isQuery=false),
		@Column(name="xmkfjdjlb_bz6", attrName="xmkfjdjlbBz6", label="备注6", isQuery=false),
		@Column(name="xmkfjdjlb_bz7", attrName="xmkfjdjlbBz7", label="备注7", isQuery=false),
		@Column(name="xmkfjdjlb_bz8", attrName="xmkfjdjlbBz8", label="备注8", isQuery=false),
		@Column(name="xmkfjdjlb_bz9", attrName="xmkfjdjlbBz9", label="备注9", isQuery=false),
		@Column(name="xmkfjdjlb_bz10", attrName="xmkfjdjlbBz10", label="备注10", isQuery=false),
		@Column(name="xmkfjdjlb_bz11", attrName="xmkfjdjlbBz11", label="备注11", isQuery=false),
		@Column(name="xmkfjdjlb_bz12", attrName="xmkfjdjlbBz12", label="备注12", isQuery=false),
		@Column(name="xmkfjdjlb_bz13", attrName="xmkfjdjlbBz13", label="备注13", isQuery=false),
		@Column(name="xmkfjdjlb_bz14", attrName="xmkfjdjlbBz14", label="备注14", isQuery=false),
		@Column(name="xmkfjdjlb_bz15", attrName="xmkfjdjlbBz15", label="备注15", isQuery=false),
		@Column(name="xmkfjdjlb_zb", attrName="xmkfjdjlbZb", label="制表", isQuery=false),
		@Column(name="xmkfjdjlb_sh", attrName="xmkfjdjlbSh", label="审核", isQuery=false),
	}, orderBy="a.id DESC"
)
public class CoreXmkfjdjlb extends DataEntity<CoreXmkfjdjlb> {
	
	private static final long serialVersionUID = 1L;
	private String xmkfjdjlbXmbh;		// 项目编号
	private String xmkfjdjlbXmmc;		// 项目名称
	private String xmkfjdjlbRq1;		// 日期1
	private String xmkfjdjlbRq2;		// 日期2
	private String xmkfjdjlbRq3;		// 日期3
	private String xmkfjdjlbRq4;		// 日期4
	private String xmkfjdjlbRq5;		// 日期5
	private String xmkfjdjlbRq6;		// 日期6
	private String xmkfjdjlbRq7;		// 日期7
	private String xmkfjdjlbRq8;		// 日期8
	private String xmkfjdjlbRq9;		// 日期9
	private String xmkfjdjlbRq10;		// 日期10
	private String xmkfjdjlbRq11;		// 日期11
	private String xmkfjdjlbRq12;		// 日期12
	private String xmkfjdjlbRq13;		// 日期13
	private String xmkfjdjlbRq14;		// 日期14
	private String xmkfjdjlbRq15;		// 日期15
	private String xmkfjdjlbLxsq1;		// 立项申请1
	private String xmkfjdjlbLxsq2;		// 立项申请2
	private String xmkfjdjlbLxsq3;		// 立项申请3
	private String xmkfjdjlbLxsq4;		// 立项申请4
	private String xmkfjdjlbLxsq5;		// 立项申请5
	private String xmkfjdjlbLxsq6;		// 立项申请6
	private String xmkfjdjlbLxsq7;		// 立项申请7
	private String xmkfjdjlbLxsq8;		// 立项申请8
	private String xmkfjdjlbLxsq9;		// 立项申请9
	private String xmkfjdjlbLxsq10;		// 立项申请10
	private String xmkfjdjlbLxsq11;		// 立项申请11
	private String xmkfjdjlbLxsq12;		// 立项申请12
	private String xmkfjdjlbLxsq13;		// 立项申请13
	private String xmkfjdjlbLxsq14;		// 立项申请14
	private String xmkfjdjlbLxsq15;		// 立项申请15
	private String xmkfjdjlbKxxpgbg1;		// 可行性评估报告1
	private String xmkfjdjlbKxxpgbg2;		// 可行性评估报告2
	private String xmkfjdjlbKxxpgbg3;		// 可行性评估报告3
	private String xmkfjdjlbKxxpgbg4;		// 可行性评估报告4
	private String xmkfjdjlbKxxpgbg5;		// 可行性评估报告5
	private String xmkfjdjlbKxxpgbg6;		// 可行性评估报告6
	private String xmkfjdjlbKxxpgbg7;		// 可行性评估报告7
	private String xmkfjdjlbKxxpgbg8;		// 可行性评估报告8
	private String xmkfjdjlbKxxpgbg9;		// 可行性评估报告9
	private String xmkfjdjlbKxxpgbg10;		// 可行性评估报告10
	private String xmkfjdjlbKxxpgbg11;		// 可行性评估报告11
	private String xmkfjdjlbKxxpgbg12;		// 可行性评估报告12
	private String xmkfjdjlbKxxpgbg13;		// 可行性评估报告13
	private String xmkfjdjlbKxxpgbg14;		// 可行性评估报告14
	private String xmkfjdjlbKxxpgbg15;		// 可行性评估报告15
	private String xmkfjdjlbLxjy1;		// 立项决议1
	private String xmkfjdjlbLxjy2;		// 立项决议2
	private String xmkfjdjlbLxjy3;		// 立项决议3
	private String xmkfjdjlbLxjy4;		// 立项决议4
	private String xmkfjdjlbLxjy5;		// 立项决议5
	private String xmkfjdjlbLxjy6;		// 立项决议6
	private String xmkfjdjlbLxjy7;		// 立项决议7
	private String xmkfjdjlbLxjy8;		// 立项决议8
	private String xmkfjdjlbLxjy9;		// 立项决议9
	private String xmkfjdjlbLxjy10;		// 立项决议10
	private String xmkfjdjlbLxjy11;		// 立项决议11
	private String xmkfjdjlbLxjy12;		// 立项决议12
	private String xmkfjdjlbLxjy13;		// 立项决议13
	private String xmkfjdjlbLxjy14;		// 立项决议14
	private String xmkfjdjlbLxjy15;		// 立项决议15
	private String xmkfjdjlbJdxhbjl1;		// 阶段性汇报记录1
	private String xmkfjdjlbJdxhbjl2;		// 阶段性汇报记录2
	private String xmkfjdjlbJdxhbjl3;		// 阶段性汇报记录3
	private String xmkfjdjlbJdxhbjl4;		// 阶段性汇报记录4
	private String xmkfjdjlbJdxhbjl5;		// 阶段性汇报记录5
	private String xmkfjdjlbJdxhbjl6;		// 阶段性汇报记录6
	private String xmkfjdjlbJdxhbjl7;		// 阶段性汇报记录7
	private String xmkfjdjlbJdxhbjl8;		// 阶段性汇报记录8
	private String xmkfjdjlbJdxhbjl9;		// 阶段性汇报记录9
	private String xmkfjdjlbJdxhbjl10;		// 阶段性汇报记录10
	private String xmkfjdjlbJdxhbjl11;		// 阶段性汇报记录11
	private String xmkfjdjlbJdxhbjl12;		// 阶段性汇报记录12
	private String xmkfjdjlbJdxhbjl13;		// 阶段性汇报记录13
	private String xmkfjdjlbJdxhbjl14;		// 阶段性汇报记录14
	private String xmkfjdjlbJdxhbjl15;		// 阶段性汇报记录15
	private String xmkfjdjlbScbg1;		// 试产报告1
	private String xmkfjdjlbScbg2;		// 试产报告2
	private String xmkfjdjlbScbg3;		// 试产报告3
	private String xmkfjdjlbScbg4;		// 试产报告4
	private String xmkfjdjlbScbg5;		// 试产报告5
	private String xmkfjdjlbScbg6;		// 试产报告6
	private String xmkfjdjlbScbg7;		// 试产报告7
	private String xmkfjdjlbScbg8;		// 试产报告8
	private String xmkfjdjlbScbg9;		// 试产报告9
	private String xmkfjdjlbScbg10;		// 试产报告10
	private String xmkfjdjlbScbg11;		// 试产报告11
	private String xmkfjdjlbScbg12;		// 试产报告12
	private String xmkfjdjlbScbg13;		// 试产报告13
	private String xmkfjdjlbScbg14;		// 试产报告14
	private String xmkfjdjlbScbg15;		// 试产报告15
	private String xmkfjdjlbJtbg1;		// 结题报告1
	private String xmkfjdjlbJtbg2;		// 结题报告2
	private String xmkfjdjlbJtbg3;		// 结题报告3
	private String xmkfjdjlbJtbg4;		// 结题报告4
	private String xmkfjdjlbJtbg5;		// 结题报告5
	private String xmkfjdjlbJtbg6;		// 结题报告6
	private String xmkfjdjlbJtbg7;		// 结题报告7
	private String xmkfjdjlbJtbg8;		// 结题报告8
	private String xmkfjdjlbJtbg9;		// 结题报告9
	private String xmkfjdjlbJtbg10;		// 结题报告10
	private String xmkfjdjlbJtbg11;		// 结题报告11
	private String xmkfjdjlbJtbg12;		// 结题报告12
	private String xmkfjdjlbJtbg13;		// 结题报告13
	private String xmkfjdjlbJtbg14;		// 结题报告14
	private String xmkfjdjlbJtbg15;		// 结题报告15
	private String xmkfjdjlbBz1;		// 备注1
	private String xmkfjdjlbBz2;		// 备注2
	private String xmkfjdjlbBz3;		// 备注3
	private String xmkfjdjlbBz4;		// 备注4
	private String xmkfjdjlbBz5;		// 备注5
	private String xmkfjdjlbBz6;		// 备注6
	private String xmkfjdjlbBz7;		// 备注7
	private String xmkfjdjlbBz8;		// 备注8
	private String xmkfjdjlbBz9;		// 备注9
	private String xmkfjdjlbBz10;		// 备注10
	private String xmkfjdjlbBz11;		// 备注11
	private String xmkfjdjlbBz12;		// 备注12
	private String xmkfjdjlbBz13;		// 备注13
	private String xmkfjdjlbBz14;		// 备注14
	private String xmkfjdjlbBz15;		// 备注15
	private String xmkfjdjlbZb;		// 制表
	private String xmkfjdjlbSh;		// 审核

	public CoreXmkfjdjlb() {
		this(null);
	}
	
	public CoreXmkfjdjlb(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getXmkfjdjlbXmbh() {
		return xmkfjdjlbXmbh;
	}

	public void setXmkfjdjlbXmbh(String xmkfjdjlbXmbh) {
		this.xmkfjdjlbXmbh = xmkfjdjlbXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getXmkfjdjlbXmmc() {
		return xmkfjdjlbXmmc;
	}

	public void setXmkfjdjlbXmmc(String xmkfjdjlbXmmc) {
		this.xmkfjdjlbXmmc = xmkfjdjlbXmmc;
	}
	
	@Size(min=0, max=100, message="日期1长度不能超过 100 个字符")
	public String getXmkfjdjlbRq1() {
		return xmkfjdjlbRq1;
	}

	public void setXmkfjdjlbRq1(String xmkfjdjlbRq1) {
		this.xmkfjdjlbRq1 = xmkfjdjlbRq1;
	}
	
	@Size(min=0, max=100, message="日期2长度不能超过 100 个字符")
	public String getXmkfjdjlbRq2() {
		return xmkfjdjlbRq2;
	}

	public void setXmkfjdjlbRq2(String xmkfjdjlbRq2) {
		this.xmkfjdjlbRq2 = xmkfjdjlbRq2;
	}
	
	@Size(min=0, max=100, message="日期3长度不能超过 100 个字符")
	public String getXmkfjdjlbRq3() {
		return xmkfjdjlbRq3;
	}

	public void setXmkfjdjlbRq3(String xmkfjdjlbRq3) {
		this.xmkfjdjlbRq3 = xmkfjdjlbRq3;
	}
	
	@Size(min=0, max=100, message="日期4长度不能超过 100 个字符")
	public String getXmkfjdjlbRq4() {
		return xmkfjdjlbRq4;
	}

	public void setXmkfjdjlbRq4(String xmkfjdjlbRq4) {
		this.xmkfjdjlbRq4 = xmkfjdjlbRq4;
	}
	
	@Size(min=0, max=100, message="日期5长度不能超过 100 个字符")
	public String getXmkfjdjlbRq5() {
		return xmkfjdjlbRq5;
	}

	public void setXmkfjdjlbRq5(String xmkfjdjlbRq5) {
		this.xmkfjdjlbRq5 = xmkfjdjlbRq5;
	}
	
	@Size(min=0, max=100, message="日期6长度不能超过 100 个字符")
	public String getXmkfjdjlbRq6() {
		return xmkfjdjlbRq6;
	}

	public void setXmkfjdjlbRq6(String xmkfjdjlbRq6) {
		this.xmkfjdjlbRq6 = xmkfjdjlbRq6;
	}
	
	@Size(min=0, max=100, message="日期7长度不能超过 100 个字符")
	public String getXmkfjdjlbRq7() {
		return xmkfjdjlbRq7;
	}

	public void setXmkfjdjlbRq7(String xmkfjdjlbRq7) {
		this.xmkfjdjlbRq7 = xmkfjdjlbRq7;
	}
	
	@Size(min=0, max=100, message="日期8长度不能超过 100 个字符")
	public String getXmkfjdjlbRq8() {
		return xmkfjdjlbRq8;
	}

	public void setXmkfjdjlbRq8(String xmkfjdjlbRq8) {
		this.xmkfjdjlbRq8 = xmkfjdjlbRq8;
	}
	
	@Size(min=0, max=100, message="日期9长度不能超过 100 个字符")
	public String getXmkfjdjlbRq9() {
		return xmkfjdjlbRq9;
	}

	public void setXmkfjdjlbRq9(String xmkfjdjlbRq9) {
		this.xmkfjdjlbRq9 = xmkfjdjlbRq9;
	}
	
	@Size(min=0, max=100, message="日期10长度不能超过 100 个字符")
	public String getXmkfjdjlbRq10() {
		return xmkfjdjlbRq10;
	}

	public void setXmkfjdjlbRq10(String xmkfjdjlbRq10) {
		this.xmkfjdjlbRq10 = xmkfjdjlbRq10;
	}
	
	@Size(min=0, max=100, message="日期11长度不能超过 100 个字符")
	public String getXmkfjdjlbRq11() {
		return xmkfjdjlbRq11;
	}

	public void setXmkfjdjlbRq11(String xmkfjdjlbRq11) {
		this.xmkfjdjlbRq11 = xmkfjdjlbRq11;
	}
	
	@Size(min=0, max=100, message="日期12长度不能超过 100 个字符")
	public String getXmkfjdjlbRq12() {
		return xmkfjdjlbRq12;
	}

	public void setXmkfjdjlbRq12(String xmkfjdjlbRq12) {
		this.xmkfjdjlbRq12 = xmkfjdjlbRq12;
	}
	
	@Size(min=0, max=100, message="日期13长度不能超过 100 个字符")
	public String getXmkfjdjlbRq13() {
		return xmkfjdjlbRq13;
	}

	public void setXmkfjdjlbRq13(String xmkfjdjlbRq13) {
		this.xmkfjdjlbRq13 = xmkfjdjlbRq13;
	}
	
	@Size(min=0, max=100, message="日期14长度不能超过 100 个字符")
	public String getXmkfjdjlbRq14() {
		return xmkfjdjlbRq14;
	}

	public void setXmkfjdjlbRq14(String xmkfjdjlbRq14) {
		this.xmkfjdjlbRq14 = xmkfjdjlbRq14;
	}
	
	@Size(min=0, max=100, message="日期15长度不能超过 100 个字符")
	public String getXmkfjdjlbRq15() {
		return xmkfjdjlbRq15;
	}

	public void setXmkfjdjlbRq15(String xmkfjdjlbRq15) {
		this.xmkfjdjlbRq15 = xmkfjdjlbRq15;
	}
	
	@Size(min=0, max=100, message="立项申请1长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq1() {
		return xmkfjdjlbLxsq1;
	}

	public void setXmkfjdjlbLxsq1(String xmkfjdjlbLxsq1) {
		this.xmkfjdjlbLxsq1 = xmkfjdjlbLxsq1;
	}
	
	@Size(min=0, max=100, message="立项申请2长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq2() {
		return xmkfjdjlbLxsq2;
	}

	public void setXmkfjdjlbLxsq2(String xmkfjdjlbLxsq2) {
		this.xmkfjdjlbLxsq2 = xmkfjdjlbLxsq2;
	}
	
	@Size(min=0, max=100, message="立项申请3长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq3() {
		return xmkfjdjlbLxsq3;
	}

	public void setXmkfjdjlbLxsq3(String xmkfjdjlbLxsq3) {
		this.xmkfjdjlbLxsq3 = xmkfjdjlbLxsq3;
	}
	
	@Size(min=0, max=100, message="立项申请4长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq4() {
		return xmkfjdjlbLxsq4;
	}

	public void setXmkfjdjlbLxsq4(String xmkfjdjlbLxsq4) {
		this.xmkfjdjlbLxsq4 = xmkfjdjlbLxsq4;
	}
	
	@Size(min=0, max=100, message="立项申请5长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq5() {
		return xmkfjdjlbLxsq5;
	}

	public void setXmkfjdjlbLxsq5(String xmkfjdjlbLxsq5) {
		this.xmkfjdjlbLxsq5 = xmkfjdjlbLxsq5;
	}
	
	@Size(min=0, max=100, message="立项申请6长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq6() {
		return xmkfjdjlbLxsq6;
	}

	public void setXmkfjdjlbLxsq6(String xmkfjdjlbLxsq6) {
		this.xmkfjdjlbLxsq6 = xmkfjdjlbLxsq6;
	}
	
	@Size(min=0, max=100, message="立项申请7长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq7() {
		return xmkfjdjlbLxsq7;
	}

	public void setXmkfjdjlbLxsq7(String xmkfjdjlbLxsq7) {
		this.xmkfjdjlbLxsq7 = xmkfjdjlbLxsq7;
	}
	
	@Size(min=0, max=100, message="立项申请8长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq8() {
		return xmkfjdjlbLxsq8;
	}

	public void setXmkfjdjlbLxsq8(String xmkfjdjlbLxsq8) {
		this.xmkfjdjlbLxsq8 = xmkfjdjlbLxsq8;
	}
	
	@Size(min=0, max=100, message="立项申请9长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq9() {
		return xmkfjdjlbLxsq9;
	}

	public void setXmkfjdjlbLxsq9(String xmkfjdjlbLxsq9) {
		this.xmkfjdjlbLxsq9 = xmkfjdjlbLxsq9;
	}
	
	@Size(min=0, max=100, message="立项申请10长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq10() {
		return xmkfjdjlbLxsq10;
	}

	public void setXmkfjdjlbLxsq10(String xmkfjdjlbLxsq10) {
		this.xmkfjdjlbLxsq10 = xmkfjdjlbLxsq10;
	}
	
	@Size(min=0, max=100, message="立项申请11长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq11() {
		return xmkfjdjlbLxsq11;
	}

	public void setXmkfjdjlbLxsq11(String xmkfjdjlbLxsq11) {
		this.xmkfjdjlbLxsq11 = xmkfjdjlbLxsq11;
	}
	
	@Size(min=0, max=100, message="立项申请12长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq12() {
		return xmkfjdjlbLxsq12;
	}

	public void setXmkfjdjlbLxsq12(String xmkfjdjlbLxsq12) {
		this.xmkfjdjlbLxsq12 = xmkfjdjlbLxsq12;
	}
	
	@Size(min=0, max=100, message="立项申请13长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq13() {
		return xmkfjdjlbLxsq13;
	}

	public void setXmkfjdjlbLxsq13(String xmkfjdjlbLxsq13) {
		this.xmkfjdjlbLxsq13 = xmkfjdjlbLxsq13;
	}
	
	@Size(min=0, max=100, message="立项申请14长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq14() {
		return xmkfjdjlbLxsq14;
	}

	public void setXmkfjdjlbLxsq14(String xmkfjdjlbLxsq14) {
		this.xmkfjdjlbLxsq14 = xmkfjdjlbLxsq14;
	}
	
	@Size(min=0, max=100, message="立项申请15长度不能超过 100 个字符")
	public String getXmkfjdjlbLxsq15() {
		return xmkfjdjlbLxsq15;
	}

	public void setXmkfjdjlbLxsq15(String xmkfjdjlbLxsq15) {
		this.xmkfjdjlbLxsq15 = xmkfjdjlbLxsq15;
	}
	
	@Size(min=0, max=100, message="可行性评估报告1长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg1() {
		return xmkfjdjlbKxxpgbg1;
	}

	public void setXmkfjdjlbKxxpgbg1(String xmkfjdjlbKxxpgbg1) {
		this.xmkfjdjlbKxxpgbg1 = xmkfjdjlbKxxpgbg1;
	}
	
	@Size(min=0, max=100, message="可行性评估报告2长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg2() {
		return xmkfjdjlbKxxpgbg2;
	}

	public void setXmkfjdjlbKxxpgbg2(String xmkfjdjlbKxxpgbg2) {
		this.xmkfjdjlbKxxpgbg2 = xmkfjdjlbKxxpgbg2;
	}
	
	@Size(min=0, max=100, message="可行性评估报告3长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg3() {
		return xmkfjdjlbKxxpgbg3;
	}

	public void setXmkfjdjlbKxxpgbg3(String xmkfjdjlbKxxpgbg3) {
		this.xmkfjdjlbKxxpgbg3 = xmkfjdjlbKxxpgbg3;
	}
	
	@Size(min=0, max=100, message="可行性评估报告4长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg4() {
		return xmkfjdjlbKxxpgbg4;
	}

	public void setXmkfjdjlbKxxpgbg4(String xmkfjdjlbKxxpgbg4) {
		this.xmkfjdjlbKxxpgbg4 = xmkfjdjlbKxxpgbg4;
	}
	
	@Size(min=0, max=100, message="可行性评估报告5长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg5() {
		return xmkfjdjlbKxxpgbg5;
	}

	public void setXmkfjdjlbKxxpgbg5(String xmkfjdjlbKxxpgbg5) {
		this.xmkfjdjlbKxxpgbg5 = xmkfjdjlbKxxpgbg5;
	}
	
	@Size(min=0, max=100, message="可行性评估报告6长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg6() {
		return xmkfjdjlbKxxpgbg6;
	}

	public void setXmkfjdjlbKxxpgbg6(String xmkfjdjlbKxxpgbg6) {
		this.xmkfjdjlbKxxpgbg6 = xmkfjdjlbKxxpgbg6;
	}
	
	@Size(min=0, max=100, message="可行性评估报告7长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg7() {
		return xmkfjdjlbKxxpgbg7;
	}

	public void setXmkfjdjlbKxxpgbg7(String xmkfjdjlbKxxpgbg7) {
		this.xmkfjdjlbKxxpgbg7 = xmkfjdjlbKxxpgbg7;
	}
	
	@Size(min=0, max=100, message="可行性评估报告8长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg8() {
		return xmkfjdjlbKxxpgbg8;
	}

	public void setXmkfjdjlbKxxpgbg8(String xmkfjdjlbKxxpgbg8) {
		this.xmkfjdjlbKxxpgbg8 = xmkfjdjlbKxxpgbg8;
	}
	
	@Size(min=0, max=100, message="可行性评估报告9长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg9() {
		return xmkfjdjlbKxxpgbg9;
	}

	public void setXmkfjdjlbKxxpgbg9(String xmkfjdjlbKxxpgbg9) {
		this.xmkfjdjlbKxxpgbg9 = xmkfjdjlbKxxpgbg9;
	}
	
	@Size(min=0, max=100, message="可行性评估报告10长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg10() {
		return xmkfjdjlbKxxpgbg10;
	}

	public void setXmkfjdjlbKxxpgbg10(String xmkfjdjlbKxxpgbg10) {
		this.xmkfjdjlbKxxpgbg10 = xmkfjdjlbKxxpgbg10;
	}
	
	@Size(min=0, max=100, message="可行性评估报告11长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg11() {
		return xmkfjdjlbKxxpgbg11;
	}

	public void setXmkfjdjlbKxxpgbg11(String xmkfjdjlbKxxpgbg11) {
		this.xmkfjdjlbKxxpgbg11 = xmkfjdjlbKxxpgbg11;
	}
	
	@Size(min=0, max=100, message="可行性评估报告12长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg12() {
		return xmkfjdjlbKxxpgbg12;
	}

	public void setXmkfjdjlbKxxpgbg12(String xmkfjdjlbKxxpgbg12) {
		this.xmkfjdjlbKxxpgbg12 = xmkfjdjlbKxxpgbg12;
	}
	
	@Size(min=0, max=100, message="可行性评估报告13长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg13() {
		return xmkfjdjlbKxxpgbg13;
	}

	public void setXmkfjdjlbKxxpgbg13(String xmkfjdjlbKxxpgbg13) {
		this.xmkfjdjlbKxxpgbg13 = xmkfjdjlbKxxpgbg13;
	}
	
	@Size(min=0, max=100, message="可行性评估报告14长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg14() {
		return xmkfjdjlbKxxpgbg14;
	}

	public void setXmkfjdjlbKxxpgbg14(String xmkfjdjlbKxxpgbg14) {
		this.xmkfjdjlbKxxpgbg14 = xmkfjdjlbKxxpgbg14;
	}
	
	@Size(min=0, max=100, message="可行性评估报告15长度不能超过 100 个字符")
	public String getXmkfjdjlbKxxpgbg15() {
		return xmkfjdjlbKxxpgbg15;
	}

	public void setXmkfjdjlbKxxpgbg15(String xmkfjdjlbKxxpgbg15) {
		this.xmkfjdjlbKxxpgbg15 = xmkfjdjlbKxxpgbg15;
	}
	
	@Size(min=0, max=100, message="立项决议1长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy1() {
		return xmkfjdjlbLxjy1;
	}

	public void setXmkfjdjlbLxjy1(String xmkfjdjlbLxjy1) {
		this.xmkfjdjlbLxjy1 = xmkfjdjlbLxjy1;
	}
	
	@Size(min=0, max=100, message="立项决议2长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy2() {
		return xmkfjdjlbLxjy2;
	}

	public void setXmkfjdjlbLxjy2(String xmkfjdjlbLxjy2) {
		this.xmkfjdjlbLxjy2 = xmkfjdjlbLxjy2;
	}
	
	@Size(min=0, max=100, message="立项决议3长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy3() {
		return xmkfjdjlbLxjy3;
	}

	public void setXmkfjdjlbLxjy3(String xmkfjdjlbLxjy3) {
		this.xmkfjdjlbLxjy3 = xmkfjdjlbLxjy3;
	}
	
	@Size(min=0, max=100, message="立项决议4长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy4() {
		return xmkfjdjlbLxjy4;
	}

	public void setXmkfjdjlbLxjy4(String xmkfjdjlbLxjy4) {
		this.xmkfjdjlbLxjy4 = xmkfjdjlbLxjy4;
	}
	
	@Size(min=0, max=100, message="立项决议5长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy5() {
		return xmkfjdjlbLxjy5;
	}

	public void setXmkfjdjlbLxjy5(String xmkfjdjlbLxjy5) {
		this.xmkfjdjlbLxjy5 = xmkfjdjlbLxjy5;
	}
	
	@Size(min=0, max=100, message="立项决议6长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy6() {
		return xmkfjdjlbLxjy6;
	}

	public void setXmkfjdjlbLxjy6(String xmkfjdjlbLxjy6) {
		this.xmkfjdjlbLxjy6 = xmkfjdjlbLxjy6;
	}
	
	@Size(min=0, max=100, message="立项决议7长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy7() {
		return xmkfjdjlbLxjy7;
	}

	public void setXmkfjdjlbLxjy7(String xmkfjdjlbLxjy7) {
		this.xmkfjdjlbLxjy7 = xmkfjdjlbLxjy7;
	}
	
	@Size(min=0, max=100, message="立项决议8长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy8() {
		return xmkfjdjlbLxjy8;
	}

	public void setXmkfjdjlbLxjy8(String xmkfjdjlbLxjy8) {
		this.xmkfjdjlbLxjy8 = xmkfjdjlbLxjy8;
	}
	
	@Size(min=0, max=100, message="立项决议9长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy9() {
		return xmkfjdjlbLxjy9;
	}

	public void setXmkfjdjlbLxjy9(String xmkfjdjlbLxjy9) {
		this.xmkfjdjlbLxjy9 = xmkfjdjlbLxjy9;
	}
	
	@Size(min=0, max=100, message="立项决议10长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy10() {
		return xmkfjdjlbLxjy10;
	}

	public void setXmkfjdjlbLxjy10(String xmkfjdjlbLxjy10) {
		this.xmkfjdjlbLxjy10 = xmkfjdjlbLxjy10;
	}
	
	@Size(min=0, max=100, message="立项决议11长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy11() {
		return xmkfjdjlbLxjy11;
	}

	public void setXmkfjdjlbLxjy11(String xmkfjdjlbLxjy11) {
		this.xmkfjdjlbLxjy11 = xmkfjdjlbLxjy11;
	}
	
	@Size(min=0, max=100, message="立项决议12长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy12() {
		return xmkfjdjlbLxjy12;
	}

	public void setXmkfjdjlbLxjy12(String xmkfjdjlbLxjy12) {
		this.xmkfjdjlbLxjy12 = xmkfjdjlbLxjy12;
	}
	
	@Size(min=0, max=100, message="立项决议13长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy13() {
		return xmkfjdjlbLxjy13;
	}

	public void setXmkfjdjlbLxjy13(String xmkfjdjlbLxjy13) {
		this.xmkfjdjlbLxjy13 = xmkfjdjlbLxjy13;
	}
	
	@Size(min=0, max=100, message="立项决议14长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy14() {
		return xmkfjdjlbLxjy14;
	}

	public void setXmkfjdjlbLxjy14(String xmkfjdjlbLxjy14) {
		this.xmkfjdjlbLxjy14 = xmkfjdjlbLxjy14;
	}
	
	@Size(min=0, max=100, message="立项决议15长度不能超过 100 个字符")
	public String getXmkfjdjlbLxjy15() {
		return xmkfjdjlbLxjy15;
	}

	public void setXmkfjdjlbLxjy15(String xmkfjdjlbLxjy15) {
		this.xmkfjdjlbLxjy15 = xmkfjdjlbLxjy15;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录1长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl1() {
		return xmkfjdjlbJdxhbjl1;
	}

	public void setXmkfjdjlbJdxhbjl1(String xmkfjdjlbJdxhbjl1) {
		this.xmkfjdjlbJdxhbjl1 = xmkfjdjlbJdxhbjl1;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录2长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl2() {
		return xmkfjdjlbJdxhbjl2;
	}

	public void setXmkfjdjlbJdxhbjl2(String xmkfjdjlbJdxhbjl2) {
		this.xmkfjdjlbJdxhbjl2 = xmkfjdjlbJdxhbjl2;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录3长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl3() {
		return xmkfjdjlbJdxhbjl3;
	}

	public void setXmkfjdjlbJdxhbjl3(String xmkfjdjlbJdxhbjl3) {
		this.xmkfjdjlbJdxhbjl3 = xmkfjdjlbJdxhbjl3;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录4长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl4() {
		return xmkfjdjlbJdxhbjl4;
	}

	public void setXmkfjdjlbJdxhbjl4(String xmkfjdjlbJdxhbjl4) {
		this.xmkfjdjlbJdxhbjl4 = xmkfjdjlbJdxhbjl4;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录5长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl5() {
		return xmkfjdjlbJdxhbjl5;
	}

	public void setXmkfjdjlbJdxhbjl5(String xmkfjdjlbJdxhbjl5) {
		this.xmkfjdjlbJdxhbjl5 = xmkfjdjlbJdxhbjl5;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录6长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl6() {
		return xmkfjdjlbJdxhbjl6;
	}

	public void setXmkfjdjlbJdxhbjl6(String xmkfjdjlbJdxhbjl6) {
		this.xmkfjdjlbJdxhbjl6 = xmkfjdjlbJdxhbjl6;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录7长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl7() {
		return xmkfjdjlbJdxhbjl7;
	}

	public void setXmkfjdjlbJdxhbjl7(String xmkfjdjlbJdxhbjl7) {
		this.xmkfjdjlbJdxhbjl7 = xmkfjdjlbJdxhbjl7;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录8长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl8() {
		return xmkfjdjlbJdxhbjl8;
	}

	public void setXmkfjdjlbJdxhbjl8(String xmkfjdjlbJdxhbjl8) {
		this.xmkfjdjlbJdxhbjl8 = xmkfjdjlbJdxhbjl8;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录9长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl9() {
		return xmkfjdjlbJdxhbjl9;
	}

	public void setXmkfjdjlbJdxhbjl9(String xmkfjdjlbJdxhbjl9) {
		this.xmkfjdjlbJdxhbjl9 = xmkfjdjlbJdxhbjl9;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录10长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl10() {
		return xmkfjdjlbJdxhbjl10;
	}

	public void setXmkfjdjlbJdxhbjl10(String xmkfjdjlbJdxhbjl10) {
		this.xmkfjdjlbJdxhbjl10 = xmkfjdjlbJdxhbjl10;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录11长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl11() {
		return xmkfjdjlbJdxhbjl11;
	}

	public void setXmkfjdjlbJdxhbjl11(String xmkfjdjlbJdxhbjl11) {
		this.xmkfjdjlbJdxhbjl11 = xmkfjdjlbJdxhbjl11;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录12长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl12() {
		return xmkfjdjlbJdxhbjl12;
	}

	public void setXmkfjdjlbJdxhbjl12(String xmkfjdjlbJdxhbjl12) {
		this.xmkfjdjlbJdxhbjl12 = xmkfjdjlbJdxhbjl12;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录13长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl13() {
		return xmkfjdjlbJdxhbjl13;
	}

	public void setXmkfjdjlbJdxhbjl13(String xmkfjdjlbJdxhbjl13) {
		this.xmkfjdjlbJdxhbjl13 = xmkfjdjlbJdxhbjl13;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录14长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl14() {
		return xmkfjdjlbJdxhbjl14;
	}

	public void setXmkfjdjlbJdxhbjl14(String xmkfjdjlbJdxhbjl14) {
		this.xmkfjdjlbJdxhbjl14 = xmkfjdjlbJdxhbjl14;
	}
	
	@Size(min=0, max=100, message="阶段性汇报记录15长度不能超过 100 个字符")
	public String getXmkfjdjlbJdxhbjl15() {
		return xmkfjdjlbJdxhbjl15;
	}

	public void setXmkfjdjlbJdxhbjl15(String xmkfjdjlbJdxhbjl15) {
		this.xmkfjdjlbJdxhbjl15 = xmkfjdjlbJdxhbjl15;
	}
	
	@Size(min=0, max=100, message="试产报告1长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg1() {
		return xmkfjdjlbScbg1;
	}

	public void setXmkfjdjlbScbg1(String xmkfjdjlbScbg1) {
		this.xmkfjdjlbScbg1 = xmkfjdjlbScbg1;
	}
	
	@Size(min=0, max=100, message="试产报告2长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg2() {
		return xmkfjdjlbScbg2;
	}

	public void setXmkfjdjlbScbg2(String xmkfjdjlbScbg2) {
		this.xmkfjdjlbScbg2 = xmkfjdjlbScbg2;
	}
	
	@Size(min=0, max=100, message="试产报告3长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg3() {
		return xmkfjdjlbScbg3;
	}

	public void setXmkfjdjlbScbg3(String xmkfjdjlbScbg3) {
		this.xmkfjdjlbScbg3 = xmkfjdjlbScbg3;
	}
	
	@Size(min=0, max=100, message="试产报告4长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg4() {
		return xmkfjdjlbScbg4;
	}

	public void setXmkfjdjlbScbg4(String xmkfjdjlbScbg4) {
		this.xmkfjdjlbScbg4 = xmkfjdjlbScbg4;
	}
	
	@Size(min=0, max=100, message="试产报告5长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg5() {
		return xmkfjdjlbScbg5;
	}

	public void setXmkfjdjlbScbg5(String xmkfjdjlbScbg5) {
		this.xmkfjdjlbScbg5 = xmkfjdjlbScbg5;
	}
	
	@Size(min=0, max=100, message="试产报告6长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg6() {
		return xmkfjdjlbScbg6;
	}

	public void setXmkfjdjlbScbg6(String xmkfjdjlbScbg6) {
		this.xmkfjdjlbScbg6 = xmkfjdjlbScbg6;
	}
	
	@Size(min=0, max=100, message="试产报告7长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg7() {
		return xmkfjdjlbScbg7;
	}

	public void setXmkfjdjlbScbg7(String xmkfjdjlbScbg7) {
		this.xmkfjdjlbScbg7 = xmkfjdjlbScbg7;
	}
	
	@Size(min=0, max=100, message="试产报告8长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg8() {
		return xmkfjdjlbScbg8;
	}

	public void setXmkfjdjlbScbg8(String xmkfjdjlbScbg8) {
		this.xmkfjdjlbScbg8 = xmkfjdjlbScbg8;
	}
	
	@Size(min=0, max=100, message="试产报告9长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg9() {
		return xmkfjdjlbScbg9;
	}

	public void setXmkfjdjlbScbg9(String xmkfjdjlbScbg9) {
		this.xmkfjdjlbScbg9 = xmkfjdjlbScbg9;
	}
	
	@Size(min=0, max=100, message="试产报告10长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg10() {
		return xmkfjdjlbScbg10;
	}

	public void setXmkfjdjlbScbg10(String xmkfjdjlbScbg10) {
		this.xmkfjdjlbScbg10 = xmkfjdjlbScbg10;
	}
	
	@Size(min=0, max=100, message="试产报告11长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg11() {
		return xmkfjdjlbScbg11;
	}

	public void setXmkfjdjlbScbg11(String xmkfjdjlbScbg11) {
		this.xmkfjdjlbScbg11 = xmkfjdjlbScbg11;
	}
	
	@Size(min=0, max=100, message="试产报告12长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg12() {
		return xmkfjdjlbScbg12;
	}

	public void setXmkfjdjlbScbg12(String xmkfjdjlbScbg12) {
		this.xmkfjdjlbScbg12 = xmkfjdjlbScbg12;
	}
	
	@Size(min=0, max=100, message="试产报告13长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg13() {
		return xmkfjdjlbScbg13;
	}

	public void setXmkfjdjlbScbg13(String xmkfjdjlbScbg13) {
		this.xmkfjdjlbScbg13 = xmkfjdjlbScbg13;
	}
	
	@Size(min=0, max=100, message="试产报告14长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg14() {
		return xmkfjdjlbScbg14;
	}

	public void setXmkfjdjlbScbg14(String xmkfjdjlbScbg14) {
		this.xmkfjdjlbScbg14 = xmkfjdjlbScbg14;
	}
	
	@Size(min=0, max=100, message="试产报告15长度不能超过 100 个字符")
	public String getXmkfjdjlbScbg15() {
		return xmkfjdjlbScbg15;
	}

	public void setXmkfjdjlbScbg15(String xmkfjdjlbScbg15) {
		this.xmkfjdjlbScbg15 = xmkfjdjlbScbg15;
	}
	
	@Size(min=0, max=100, message="结题报告1长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg1() {
		return xmkfjdjlbJtbg1;
	}

	public void setXmkfjdjlbJtbg1(String xmkfjdjlbJtbg1) {
		this.xmkfjdjlbJtbg1 = xmkfjdjlbJtbg1;
	}
	
	@Size(min=0, max=100, message="结题报告2长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg2() {
		return xmkfjdjlbJtbg2;
	}

	public void setXmkfjdjlbJtbg2(String xmkfjdjlbJtbg2) {
		this.xmkfjdjlbJtbg2 = xmkfjdjlbJtbg2;
	}
	
	@Size(min=0, max=100, message="结题报告3长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg3() {
		return xmkfjdjlbJtbg3;
	}

	public void setXmkfjdjlbJtbg3(String xmkfjdjlbJtbg3) {
		this.xmkfjdjlbJtbg3 = xmkfjdjlbJtbg3;
	}
	
	@Size(min=0, max=100, message="结题报告4长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg4() {
		return xmkfjdjlbJtbg4;
	}

	public void setXmkfjdjlbJtbg4(String xmkfjdjlbJtbg4) {
		this.xmkfjdjlbJtbg4 = xmkfjdjlbJtbg4;
	}
	
	@Size(min=0, max=100, message="结题报告5长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg5() {
		return xmkfjdjlbJtbg5;
	}

	public void setXmkfjdjlbJtbg5(String xmkfjdjlbJtbg5) {
		this.xmkfjdjlbJtbg5 = xmkfjdjlbJtbg5;
	}
	
	@Size(min=0, max=100, message="结题报告6长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg6() {
		return xmkfjdjlbJtbg6;
	}

	public void setXmkfjdjlbJtbg6(String xmkfjdjlbJtbg6) {
		this.xmkfjdjlbJtbg6 = xmkfjdjlbJtbg6;
	}
	
	@Size(min=0, max=100, message="结题报告7长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg7() {
		return xmkfjdjlbJtbg7;
	}

	public void setXmkfjdjlbJtbg7(String xmkfjdjlbJtbg7) {
		this.xmkfjdjlbJtbg7 = xmkfjdjlbJtbg7;
	}
	
	@Size(min=0, max=100, message="结题报告8长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg8() {
		return xmkfjdjlbJtbg8;
	}

	public void setXmkfjdjlbJtbg8(String xmkfjdjlbJtbg8) {
		this.xmkfjdjlbJtbg8 = xmkfjdjlbJtbg8;
	}
	
	@Size(min=0, max=100, message="结题报告9长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg9() {
		return xmkfjdjlbJtbg9;
	}

	public void setXmkfjdjlbJtbg9(String xmkfjdjlbJtbg9) {
		this.xmkfjdjlbJtbg9 = xmkfjdjlbJtbg9;
	}
	
	@Size(min=0, max=100, message="结题报告10长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg10() {
		return xmkfjdjlbJtbg10;
	}

	public void setXmkfjdjlbJtbg10(String xmkfjdjlbJtbg10) {
		this.xmkfjdjlbJtbg10 = xmkfjdjlbJtbg10;
	}
	
	@Size(min=0, max=100, message="结题报告11长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg11() {
		return xmkfjdjlbJtbg11;
	}

	public void setXmkfjdjlbJtbg11(String xmkfjdjlbJtbg11) {
		this.xmkfjdjlbJtbg11 = xmkfjdjlbJtbg11;
	}
	
	@Size(min=0, max=100, message="结题报告12长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg12() {
		return xmkfjdjlbJtbg12;
	}

	public void setXmkfjdjlbJtbg12(String xmkfjdjlbJtbg12) {
		this.xmkfjdjlbJtbg12 = xmkfjdjlbJtbg12;
	}
	
	@Size(min=0, max=100, message="结题报告13长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg13() {
		return xmkfjdjlbJtbg13;
	}

	public void setXmkfjdjlbJtbg13(String xmkfjdjlbJtbg13) {
		this.xmkfjdjlbJtbg13 = xmkfjdjlbJtbg13;
	}
	
	@Size(min=0, max=100, message="结题报告14长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg14() {
		return xmkfjdjlbJtbg14;
	}

	public void setXmkfjdjlbJtbg14(String xmkfjdjlbJtbg14) {
		this.xmkfjdjlbJtbg14 = xmkfjdjlbJtbg14;
	}
	
	@Size(min=0, max=100, message="结题报告15长度不能超过 100 个字符")
	public String getXmkfjdjlbJtbg15() {
		return xmkfjdjlbJtbg15;
	}

	public void setXmkfjdjlbJtbg15(String xmkfjdjlbJtbg15) {
		this.xmkfjdjlbJtbg15 = xmkfjdjlbJtbg15;
	}
	
	@Size(min=0, max=100, message="备注1长度不能超过 100 个字符")
	public String getXmkfjdjlbBz1() {
		return xmkfjdjlbBz1;
	}

	public void setXmkfjdjlbBz1(String xmkfjdjlbBz1) {
		this.xmkfjdjlbBz1 = xmkfjdjlbBz1;
	}
	
	@Size(min=0, max=100, message="备注2长度不能超过 100 个字符")
	public String getXmkfjdjlbBz2() {
		return xmkfjdjlbBz2;
	}

	public void setXmkfjdjlbBz2(String xmkfjdjlbBz2) {
		this.xmkfjdjlbBz2 = xmkfjdjlbBz2;
	}
	
	@Size(min=0, max=100, message="备注3长度不能超过 100 个字符")
	public String getXmkfjdjlbBz3() {
		return xmkfjdjlbBz3;
	}

	public void setXmkfjdjlbBz3(String xmkfjdjlbBz3) {
		this.xmkfjdjlbBz3 = xmkfjdjlbBz3;
	}
	
	@Size(min=0, max=100, message="备注4长度不能超过 100 个字符")
	public String getXmkfjdjlbBz4() {
		return xmkfjdjlbBz4;
	}

	public void setXmkfjdjlbBz4(String xmkfjdjlbBz4) {
		this.xmkfjdjlbBz4 = xmkfjdjlbBz4;
	}
	
	@Size(min=0, max=100, message="备注5长度不能超过 100 个字符")
	public String getXmkfjdjlbBz5() {
		return xmkfjdjlbBz5;
	}

	public void setXmkfjdjlbBz5(String xmkfjdjlbBz5) {
		this.xmkfjdjlbBz5 = xmkfjdjlbBz5;
	}
	
	@Size(min=0, max=100, message="备注6长度不能超过 100 个字符")
	public String getXmkfjdjlbBz6() {
		return xmkfjdjlbBz6;
	}

	public void setXmkfjdjlbBz6(String xmkfjdjlbBz6) {
		this.xmkfjdjlbBz6 = xmkfjdjlbBz6;
	}
	
	@Size(min=0, max=100, message="备注7长度不能超过 100 个字符")
	public String getXmkfjdjlbBz7() {
		return xmkfjdjlbBz7;
	}

	public void setXmkfjdjlbBz7(String xmkfjdjlbBz7) {
		this.xmkfjdjlbBz7 = xmkfjdjlbBz7;
	}
	
	@Size(min=0, max=100, message="备注8长度不能超过 100 个字符")
	public String getXmkfjdjlbBz8() {
		return xmkfjdjlbBz8;
	}

	public void setXmkfjdjlbBz8(String xmkfjdjlbBz8) {
		this.xmkfjdjlbBz8 = xmkfjdjlbBz8;
	}
	
	@Size(min=0, max=100, message="备注9长度不能超过 100 个字符")
	public String getXmkfjdjlbBz9() {
		return xmkfjdjlbBz9;
	}

	public void setXmkfjdjlbBz9(String xmkfjdjlbBz9) {
		this.xmkfjdjlbBz9 = xmkfjdjlbBz9;
	}
	
	@Size(min=0, max=100, message="备注10长度不能超过 100 个字符")
	public String getXmkfjdjlbBz10() {
		return xmkfjdjlbBz10;
	}

	public void setXmkfjdjlbBz10(String xmkfjdjlbBz10) {
		this.xmkfjdjlbBz10 = xmkfjdjlbBz10;
	}
	
	@Size(min=0, max=100, message="备注11长度不能超过 100 个字符")
	public String getXmkfjdjlbBz11() {
		return xmkfjdjlbBz11;
	}

	public void setXmkfjdjlbBz11(String xmkfjdjlbBz11) {
		this.xmkfjdjlbBz11 = xmkfjdjlbBz11;
	}
	
	@Size(min=0, max=100, message="备注12长度不能超过 100 个字符")
	public String getXmkfjdjlbBz12() {
		return xmkfjdjlbBz12;
	}

	public void setXmkfjdjlbBz12(String xmkfjdjlbBz12) {
		this.xmkfjdjlbBz12 = xmkfjdjlbBz12;
	}
	
	@Size(min=0, max=100, message="备注13长度不能超过 100 个字符")
	public String getXmkfjdjlbBz13() {
		return xmkfjdjlbBz13;
	}

	public void setXmkfjdjlbBz13(String xmkfjdjlbBz13) {
		this.xmkfjdjlbBz13 = xmkfjdjlbBz13;
	}
	
	@Size(min=0, max=100, message="备注14长度不能超过 100 个字符")
	public String getXmkfjdjlbBz14() {
		return xmkfjdjlbBz14;
	}

	public void setXmkfjdjlbBz14(String xmkfjdjlbBz14) {
		this.xmkfjdjlbBz14 = xmkfjdjlbBz14;
	}
	
	@Size(min=0, max=100, message="备注15长度不能超过 100 个字符")
	public String getXmkfjdjlbBz15() {
		return xmkfjdjlbBz15;
	}

	public void setXmkfjdjlbBz15(String xmkfjdjlbBz15) {
		this.xmkfjdjlbBz15 = xmkfjdjlbBz15;
	}
	
	@Size(min=0, max=100, message="制表长度不能超过 100 个字符")
	public String getXmkfjdjlbZb() {
		return xmkfjdjlbZb;
	}

	public void setXmkfjdjlbZb(String xmkfjdjlbZb) {
		this.xmkfjdjlbZb = xmkfjdjlbZb;
	}
	
	@Size(min=0, max=100, message="审核长度不能超过 100 个字符")
	public String getXmkfjdjlbSh() {
		return xmkfjdjlbSh;
	}

	public void setXmkfjdjlbSh(String xmkfjdjlbSh) {
		this.xmkfjdjlbSh = xmkfjdjlbSh;
	}
	
}