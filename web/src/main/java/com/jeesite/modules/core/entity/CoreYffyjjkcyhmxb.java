package com.jeesite.modules.core.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 研发费用加计扣除优惠明细表Entity
 * @author tjh
 * @version 2025-01-20
 */
@Table(name="core_yffyjjkcyhmxb", alias="a", label="研发费用加计扣除优惠明细表信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="yffyjjkcyhmxb_xmbh", attrName="yffyjjkcyhmxbXmbh", label="项目编号"),
		@Column(name="yffyjjkcyhmxb_xmmc", attrName="yffyjjkcyhmxbXmmc", label="项目名称"),
		@Column(name="yffyjjkcyhmxb_yfhdfymx", attrName="yffyjjkcyhmxbYfhdfymx", label="研发活动费用明细", isQuery=false),
		@Column(name="yffyjjkcyhmxb_zzyfhzyfjzyf", attrName="yffyjjkcyhmxbZzyfhzyfjzyf", label="自主研发、合作研发、集中研发", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_ryrgfy", attrName="yffyjjkcyhmxbRyrgfy", label="人员人工费用", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_zjcsyfhdrygzxj", attrName="yffyjjkcyhmxbZjcsyfhdrygzxj", label="直接从事研发活动人员工资薪金", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_zjcsyfhdrywxyj", attrName="yffyjjkcyhmxbZjcsyfhdrywxyj", label="直接从事研发活动人员五险一金", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_wpyfrydlwfy", attrName="yffyjjkcyhmxbWpyfrydlwfy", label="外聘研发人员的劳务费用", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_zjtrfy", attrName="yffyjjkcyhmxbZjtrfy", label="直接投入费用", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yfhdzjxhcl", attrName="yffyjjkcyhmxbYfhdzjxhcl", label="研发活动直接消耗材料", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yfhdzjxhrl", attrName="yffyjjkcyhmxbYfhdzjxhrl", label="研发活动直接消耗燃料", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yfhdzjxhdlfy", attrName="yffyjjkcyhmxbYfhdzjxhdlfy", label="研发活动直接消耗动力费用", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yyzjsyhcpszdmjgyzbkfjzzf", attrName="yffyjjkcyhmxbYyzjsyhcpszdmjgyzbkfjzzf", label="用于中间试验和产品试制的模具、工艺装备开发及制造费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yybgcgdzcdypyjjybcssdgzf", attrName="yffyjjkcyhmxbYybgcgdzcdypyjjybcssdgzf", label="用于不构成固定资产的样品、样机及一般测试手段购置费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yyszcpdjyf", attrName="yffyjjkcyhmxbYyszcpdjyf", label="用于试制产品的检验费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yyyfhddyqsbdyxwhdzjywxdfy", attrName="yffyjjkcyhmxbYyyfhddyqsbdyxwhdzjywxdfy", label="用于研发活动的仪器、设备的运行维护、调整、检验、维修等费用", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_tgjyzpfszrdyyyfhddyqsbzpf", attrName="yffyjjkcyhmxbTgjyzpfszrdyyyfhddyqsbzpf", label="通过经营租凭方式租入的用于研发活动的仪器、设备租凭费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_zjfy", attrName="yffyjjkcyhmxbZjfy", label="折旧费用", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yyyfhddyqdzjf", attrName="yffyjjkcyhmxbYyyfhddyqdzjf", label="用于研发活动的仪器的折旧费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yyyfhddsbdzjf", attrName="yffyjjkcyhmxbYyyfhddsbdzjf", label="用于研发活动的设备的折旧费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_wxzctx", attrName="yffyjjkcyhmxbWxzctx", label="无形资产摊销", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yyyfhddrjdtxfy", attrName="yffyjjkcyhmxbYyyfhddrjdtxfy", label="用于研发活动的软件的摊销费用", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yyyfhddzlqdtxfy", attrName="yffyjjkcyhmxbYyyfhddzlqdtxfy", label="用于研发活动的专利权的摊销费用", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yyyfhddfzljs", attrName="yffyjjkcyhmxbYyyfhddfzljs", label="用于研发活动的非专利技术", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_xcpsjfd", attrName="yffyjjkcyhmxbXcpsjfd", label="新产品设计费等", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_xcpsjf", attrName="yffyjjkcyhmxbXcpsjf", label="新产品设计费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_xgygczdf", attrName="yffyjjkcyhmxbXgygczdf", label="新工艺规程制定费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_xyyzdlcsyf", attrName="yffyjjkcyhmxbXyyzdlcsyf", label="新药研制的临床试验费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_ktkfjsdxcsyf", attrName="yffyjjkcyhmxbKtkfjsdxcsyf", label="勘探开发技术的现场试验费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_qtxgfy", attrName="yffyjjkcyhmxbQtxgfy", label="其他相关费用", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_jstsgzlfzlfyfzjzxfgxkjyfbxf", attrName="yffyjjkcyhmxbJstsgzlfzlfyfzjzxfgxkjyfbxf", label="技术图书馆资料费、资料翻译费、专家咨询费、高新科技研发保险费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yfcgdjsfxpylzjdpspgysfy", attrName="yffyjjkcyhmxbYfcgdjsfxpylzjdpspgysfy", label="研发成果的检索、分析、评议、论证、鉴定、评审、评估、验收费用", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_zscqdsqfzcfdlf", attrName="yffyjjkcyhmxbZscqdsqfzcfdlf", label="知识产权的申请费、注册费、代理费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_zgflfbcylbxfbcylbxf", attrName="yffyjjkcyhmxbZgflfbcylbxfbcylbxf", label="职工福利费、补充养老保险费、补充医疗保险费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_clfhyf", attrName="yffyjjkcyhmxbClfhyf", label="差旅费、会议费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_jxedzhdqtxgfy", attrName="yffyjjkcyhmxbJxedzhdqtxgfy", label="经限额调整后的其他相关费用", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_wtyf", attrName="yffyjjkcyhmxbWtyf", label="委托研发", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_wtwbjghgrjxyfhdsfsdfy", attrName="yffyjjkcyhmxbWtwbjghgrjxyfhdsfsdfy", label="委托外部机构或个人进行研发活动所发生的费用", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_qzwtjwjxyfhdsfsdfy", attrName="yffyjjkcyhmxbQzwtjwjxyfhdsfsdfy", label="其中", comment="其中：委托境外进行研发活动所发生的费用", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_ndyffyxj", attrName="yffyjjkcyhmxbNdyffyxj", label="年度研发费用小计", isQuery=false),
		@Column(name="yffyjjkcyhmxb_bnfyhje", attrName="yffyjjkcyhmxbBnfyhje", label="本年费用化金额", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_bnzchje", attrName="yffyjjkcyhmxbBnzchje", label="本年资产化金额", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_bnxcwxzctxf", attrName="yffyjjkcyhmxbBnxcwxzctxf", label="本年形成无形资产摊销费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yqndxcwxzcbntxf", attrName="yffyjjkcyhmxbYqndxcwxzcbntxf", label="以前年度形成无形资产本年摊销费", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yxkcdyffyhj", attrName="yffyjjkcyhmxbYxkcdyffyhj", label="允许扣除的研发费用合计", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_jtssrbf", attrName="yffyjjkcyhmxbJtssrbf", label="减", comment="减：特殊收入部分", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_yxkcdyffydztssrhdje", attrName="yffyjjkcyhmxbYxkcdyffydztssrhdje", label="允许扣除的研发费用抵制特殊收入后的金额", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_jdnxsyfhdzjxccpbkzcbfdydclbf", attrName="yffyjjkcyhmxbJdnxsyfhdzjxccpbkzcbfdydclbf", label="减：当年销售研发活动直接形成产品", comment="减：当年销售研发活动直接形成产品（包括组成部分）对应的材料部分", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_jyqndxsyfhdzjxccpbkzcbfdydclbfjzj", attrName="yffyjjkcyhmxbJyqndxsyfhdzjxccpbkzcbfdydclbfjzj", label="减：以前年度销售研发活动直接形成产品", comment="减：以前年度销售研发活动直接形成产品（包括组成部分）对应的材料部分结转金", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_jjkcbl", attrName="yffyjjkcyhmxbJjkcbl", label="加计扣除比例", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_bnyffyjjkcze", attrName="yffyjjkcyhmxbBnyffyjjkcze", label="本年研发费用加计扣除总额", isQuery=false, isUpdateForce=true),
		@Column(name="yffyjjkcyhmxb_xsyfhdzjxccpbkzcbfdyclbfjzyhndkcje", attrName="yffyjjkcyhmxbXsyfhdzjxccpbkzcbfdyclbfjzyhndkcje", label="销售研发活动直接形成产品", comment="销售研发活动直接形成产品（包括组成部分）对应材料部分结转以后年度扣除金额", isQuery=false, isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class CoreYffyjjkcyhmxb extends DataEntity<CoreYffyjjkcyhmxb> {
	
	private static final long serialVersionUID = 1L;
	private String yffyjjkcyhmxbXmbh;		// 项目编号
	private String yffyjjkcyhmxbXmmc;		// 项目名称
	private String yffyjjkcyhmxbYfhdfymx;		// 研发活动费用明细
	private Double yffyjjkcyhmxbZzyfhzyfjzyf;		// 自主研发、合作研发、集中研发
	private Double yffyjjkcyhmxbRyrgfy;		// 人员人工费用
	private Double yffyjjkcyhmxbZjcsyfhdrygzxj;		// 直接从事研发活动人员工资薪金
	private Double yffyjjkcyhmxbZjcsyfhdrywxyj;		// 直接从事研发活动人员五险一金
	private Double yffyjjkcyhmxbWpyfrydlwfy;		// 外聘研发人员的劳务费用
	private Double yffyjjkcyhmxbZjtrfy;		// 直接投入费用
	private Double yffyjjkcyhmxbYfhdzjxhcl;		// 研发活动直接消耗材料
	private Double yffyjjkcyhmxbYfhdzjxhrl;		// 研发活动直接消耗燃料
	private Double yffyjjkcyhmxbYfhdzjxhdlfy;		// 研发活动直接消耗动力费用
	private Double yffyjjkcyhmxbYyzjsyhcpszdmjgyzbkfjzzf;		// 用于中间试验和产品试制的模具、工艺装备开发及制造费
	private Double yffyjjkcyhmxbYybgcgdzcdypyjjybcssdgzf;		// 用于不构成固定资产的样品、样机及一般测试手段购置费
	private Double yffyjjkcyhmxbYyszcpdjyf;		// 用于试制产品的检验费
	private Double yffyjjkcyhmxbYyyfhddyqsbdyxwhdzjywxdfy;		// 用于研发活动的仪器、设备的运行维护、调整、检验、维修等费用
	private Double yffyjjkcyhmxbTgjyzpfszrdyyyfhddyqsbzpf;		// 通过经营租凭方式租入的用于研发活动的仪器、设备租凭费
	private Double yffyjjkcyhmxbZjfy;		// 折旧费用
	private Double yffyjjkcyhmxbYyyfhddyqdzjf;		// 用于研发活动的仪器的折旧费
	private Double yffyjjkcyhmxbYyyfhddsbdzjf;		// 用于研发活动的设备的折旧费
	private Double yffyjjkcyhmxbWxzctx;		// 无形资产摊销
	private Double yffyjjkcyhmxbYyyfhddrjdtxfy;		// 用于研发活动的软件的摊销费用
	private Double yffyjjkcyhmxbYyyfhddzlqdtxfy;		// 用于研发活动的专利权的摊销费用
	private Double yffyjjkcyhmxbYyyfhddfzljs;		// 用于研发活动的非专利技术
	private Double yffyjjkcyhmxbXcpsjfd;		// 新产品设计费等
	private Double yffyjjkcyhmxbXcpsjf;		// 新产品设计费
	private Double yffyjjkcyhmxbXgygczdf;		// 新工艺规程制定费
	private Double yffyjjkcyhmxbXyyzdlcsyf;		// 新药研制的临床试验费
	private Double yffyjjkcyhmxbKtkfjsdxcsyf;		// 勘探开发技术的现场试验费
	private Double yffyjjkcyhmxbQtxgfy;		// 其他相关费用
	private Double yffyjjkcyhmxbJstsgzlfzlfyfzjzxfgxkjyfbxf;		// 技术图书馆资料费、资料翻译费、专家咨询费、高新科技研发保险费
	private Double yffyjjkcyhmxbYfcgdjsfxpylzjdpspgysfy;		// 研发成果的检索、分析、评议、论证、鉴定、评审、评估、验收费用
	private Double yffyjjkcyhmxbZscqdsqfzcfdlf;		// 知识产权的申请费、注册费、代理费
	private Double yffyjjkcyhmxbZgflfbcylbxfbcylbxf;		// 职工福利费、补充养老保险费、补充医疗保险费
	private Double yffyjjkcyhmxbClfhyf;		// 差旅费、会议费
	private Double yffyjjkcyhmxbJxedzhdqtxgfy;		// 经限额调整后的其他相关费用
	private Double yffyjjkcyhmxbWtyf;		// 委托研发
	private Double yffyjjkcyhmxbWtwbjghgrjxyfhdsfsdfy;		// 委托外部机构或个人进行研发活动所发生的费用
	private Double yffyjjkcyhmxbQzwtjwjxyfhdsfsdfy;		// 其中：委托境外进行研发活动所发生的费用
	private String yffyjjkcyhmxbNdyffyxj;		// 年度研发费用小计
	private Double yffyjjkcyhmxbBnfyhje;		// 本年费用化金额
	private Double yffyjjkcyhmxbBnzchje;		// 本年资产化金额
	private Double yffyjjkcyhmxbBnxcwxzctxf;		// 本年形成无形资产摊销费
	private Double yffyjjkcyhmxbYqndxcwxzcbntxf;		// 以前年度形成无形资产本年摊销费
	private Double yffyjjkcyhmxbYxkcdyffyhj;		// 允许扣除的研发费用合计
	private Double yffyjjkcyhmxbJtssrbf;		// 减：特殊收入部分
	private Double yffyjjkcyhmxbYxkcdyffydztssrhdje;		// 允许扣除的研发费用抵制特殊收入后的金额
	private Double yffyjjkcyhmxbJdnxsyfhdzjxccpbkzcbfdydclbf;		// 减：当年销售研发活动直接形成产品（包括组成部分）对应的材料部分
	private Double yffyjjkcyhmxbJyqndxsyfhdzjxccpbkzcbfdydclbfjzj;		// 减：以前年度销售研发活动直接形成产品（包括组成部分）对应的材料部分结转金
	private Double yffyjjkcyhmxbJjkcbl;		// 加计扣除比例
	private Double yffyjjkcyhmxbBnyffyjjkcze;		// 本年研发费用加计扣除总额
	private Double yffyjjkcyhmxbXsyfhdzjxccpbkzcbfdyclbfjzyhndkcje;		// 销售研发活动直接形成产品（包括组成部分）对应材料部分结转以后年度扣除金额

	public CoreYffyjjkcyhmxb() {
		this(null);
	}
	
	public CoreYffyjjkcyhmxb(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="项目编号长度不能超过 100 个字符")
	public String getYffyjjkcyhmxbXmbh() {
		return yffyjjkcyhmxbXmbh;
	}

	public void setYffyjjkcyhmxbXmbh(String yffyjjkcyhmxbXmbh) {
		this.yffyjjkcyhmxbXmbh = yffyjjkcyhmxbXmbh;
	}
	
	@Size(min=0, max=100, message="项目名称长度不能超过 100 个字符")
	public String getYffyjjkcyhmxbXmmc() {
		return yffyjjkcyhmxbXmmc;
	}

	public void setYffyjjkcyhmxbXmmc(String yffyjjkcyhmxbXmmc) {
		this.yffyjjkcyhmxbXmmc = yffyjjkcyhmxbXmmc;
	}
	
	@Size(min=0, max=100, message="研发活动费用明细长度不能超过 100 个字符")
	public String getYffyjjkcyhmxbYfhdfymx() {
		return yffyjjkcyhmxbYfhdfymx;
	}

	public void setYffyjjkcyhmxbYfhdfymx(String yffyjjkcyhmxbYfhdfymx) {
		this.yffyjjkcyhmxbYfhdfymx = yffyjjkcyhmxbYfhdfymx;
	}
	
	public Double getYffyjjkcyhmxbZzyfhzyfjzyf() {
		return yffyjjkcyhmxbZzyfhzyfjzyf;
	}

	public void setYffyjjkcyhmxbZzyfhzyfjzyf(Double yffyjjkcyhmxbZzyfhzyfjzyf) {
		this.yffyjjkcyhmxbZzyfhzyfjzyf = yffyjjkcyhmxbZzyfhzyfjzyf;
	}
	
	public Double getYffyjjkcyhmxbRyrgfy() {
		return yffyjjkcyhmxbRyrgfy;
	}

	public void setYffyjjkcyhmxbRyrgfy(Double yffyjjkcyhmxbRyrgfy) {
		this.yffyjjkcyhmxbRyrgfy = yffyjjkcyhmxbRyrgfy;
	}
	
	public Double getYffyjjkcyhmxbZjcsyfhdrygzxj() {
		return yffyjjkcyhmxbZjcsyfhdrygzxj;
	}

	public void setYffyjjkcyhmxbZjcsyfhdrygzxj(Double yffyjjkcyhmxbZjcsyfhdrygzxj) {
		this.yffyjjkcyhmxbZjcsyfhdrygzxj = yffyjjkcyhmxbZjcsyfhdrygzxj;
	}
	
	public Double getYffyjjkcyhmxbZjcsyfhdrywxyj() {
		return yffyjjkcyhmxbZjcsyfhdrywxyj;
	}

	public void setYffyjjkcyhmxbZjcsyfhdrywxyj(Double yffyjjkcyhmxbZjcsyfhdrywxyj) {
		this.yffyjjkcyhmxbZjcsyfhdrywxyj = yffyjjkcyhmxbZjcsyfhdrywxyj;
	}
	
	public Double getYffyjjkcyhmxbWpyfrydlwfy() {
		return yffyjjkcyhmxbWpyfrydlwfy;
	}

	public void setYffyjjkcyhmxbWpyfrydlwfy(Double yffyjjkcyhmxbWpyfrydlwfy) {
		this.yffyjjkcyhmxbWpyfrydlwfy = yffyjjkcyhmxbWpyfrydlwfy;
	}
	
	public Double getYffyjjkcyhmxbZjtrfy() {
		return yffyjjkcyhmxbZjtrfy;
	}

	public void setYffyjjkcyhmxbZjtrfy(Double yffyjjkcyhmxbZjtrfy) {
		this.yffyjjkcyhmxbZjtrfy = yffyjjkcyhmxbZjtrfy;
	}
	
	public Double getYffyjjkcyhmxbYfhdzjxhcl() {
		return yffyjjkcyhmxbYfhdzjxhcl;
	}

	public void setYffyjjkcyhmxbYfhdzjxhcl(Double yffyjjkcyhmxbYfhdzjxhcl) {
		this.yffyjjkcyhmxbYfhdzjxhcl = yffyjjkcyhmxbYfhdzjxhcl;
	}
	
	public Double getYffyjjkcyhmxbYfhdzjxhrl() {
		return yffyjjkcyhmxbYfhdzjxhrl;
	}

	public void setYffyjjkcyhmxbYfhdzjxhrl(Double yffyjjkcyhmxbYfhdzjxhrl) {
		this.yffyjjkcyhmxbYfhdzjxhrl = yffyjjkcyhmxbYfhdzjxhrl;
	}
	
	public Double getYffyjjkcyhmxbYfhdzjxhdlfy() {
		return yffyjjkcyhmxbYfhdzjxhdlfy;
	}

	public void setYffyjjkcyhmxbYfhdzjxhdlfy(Double yffyjjkcyhmxbYfhdzjxhdlfy) {
		this.yffyjjkcyhmxbYfhdzjxhdlfy = yffyjjkcyhmxbYfhdzjxhdlfy;
	}
	
	public Double getYffyjjkcyhmxbYyzjsyhcpszdmjgyzbkfjzzf() {
		return yffyjjkcyhmxbYyzjsyhcpszdmjgyzbkfjzzf;
	}

	public void setYffyjjkcyhmxbYyzjsyhcpszdmjgyzbkfjzzf(Double yffyjjkcyhmxbYyzjsyhcpszdmjgyzbkfjzzf) {
		this.yffyjjkcyhmxbYyzjsyhcpszdmjgyzbkfjzzf = yffyjjkcyhmxbYyzjsyhcpszdmjgyzbkfjzzf;
	}
	
	public Double getYffyjjkcyhmxbYybgcgdzcdypyjjybcssdgzf() {
		return yffyjjkcyhmxbYybgcgdzcdypyjjybcssdgzf;
	}

	public void setYffyjjkcyhmxbYybgcgdzcdypyjjybcssdgzf(Double yffyjjkcyhmxbYybgcgdzcdypyjjybcssdgzf) {
		this.yffyjjkcyhmxbYybgcgdzcdypyjjybcssdgzf = yffyjjkcyhmxbYybgcgdzcdypyjjybcssdgzf;
	}
	
	public Double getYffyjjkcyhmxbYyszcpdjyf() {
		return yffyjjkcyhmxbYyszcpdjyf;
	}

	public void setYffyjjkcyhmxbYyszcpdjyf(Double yffyjjkcyhmxbYyszcpdjyf) {
		this.yffyjjkcyhmxbYyszcpdjyf = yffyjjkcyhmxbYyszcpdjyf;
	}
	
	public Double getYffyjjkcyhmxbYyyfhddyqsbdyxwhdzjywxdfy() {
		return yffyjjkcyhmxbYyyfhddyqsbdyxwhdzjywxdfy;
	}

	public void setYffyjjkcyhmxbYyyfhddyqsbdyxwhdzjywxdfy(Double yffyjjkcyhmxbYyyfhddyqsbdyxwhdzjywxdfy) {
		this.yffyjjkcyhmxbYyyfhddyqsbdyxwhdzjywxdfy = yffyjjkcyhmxbYyyfhddyqsbdyxwhdzjywxdfy;
	}
	
	public Double getYffyjjkcyhmxbTgjyzpfszrdyyyfhddyqsbzpf() {
		return yffyjjkcyhmxbTgjyzpfszrdyyyfhddyqsbzpf;
	}

	public void setYffyjjkcyhmxbTgjyzpfszrdyyyfhddyqsbzpf(Double yffyjjkcyhmxbTgjyzpfszrdyyyfhddyqsbzpf) {
		this.yffyjjkcyhmxbTgjyzpfszrdyyyfhddyqsbzpf = yffyjjkcyhmxbTgjyzpfszrdyyyfhddyqsbzpf;
	}
	
	public Double getYffyjjkcyhmxbZjfy() {
		return yffyjjkcyhmxbZjfy;
	}

	public void setYffyjjkcyhmxbZjfy(Double yffyjjkcyhmxbZjfy) {
		this.yffyjjkcyhmxbZjfy = yffyjjkcyhmxbZjfy;
	}
	
	public Double getYffyjjkcyhmxbYyyfhddyqdzjf() {
		return yffyjjkcyhmxbYyyfhddyqdzjf;
	}

	public void setYffyjjkcyhmxbYyyfhddyqdzjf(Double yffyjjkcyhmxbYyyfhddyqdzjf) {
		this.yffyjjkcyhmxbYyyfhddyqdzjf = yffyjjkcyhmxbYyyfhddyqdzjf;
	}
	
	public Double getYffyjjkcyhmxbYyyfhddsbdzjf() {
		return yffyjjkcyhmxbYyyfhddsbdzjf;
	}

	public void setYffyjjkcyhmxbYyyfhddsbdzjf(Double yffyjjkcyhmxbYyyfhddsbdzjf) {
		this.yffyjjkcyhmxbYyyfhddsbdzjf = yffyjjkcyhmxbYyyfhddsbdzjf;
	}
	
	public Double getYffyjjkcyhmxbWxzctx() {
		return yffyjjkcyhmxbWxzctx;
	}

	public void setYffyjjkcyhmxbWxzctx(Double yffyjjkcyhmxbWxzctx) {
		this.yffyjjkcyhmxbWxzctx = yffyjjkcyhmxbWxzctx;
	}
	
	public Double getYffyjjkcyhmxbYyyfhddrjdtxfy() {
		return yffyjjkcyhmxbYyyfhddrjdtxfy;
	}

	public void setYffyjjkcyhmxbYyyfhddrjdtxfy(Double yffyjjkcyhmxbYyyfhddrjdtxfy) {
		this.yffyjjkcyhmxbYyyfhddrjdtxfy = yffyjjkcyhmxbYyyfhddrjdtxfy;
	}
	
	public Double getYffyjjkcyhmxbYyyfhddzlqdtxfy() {
		return yffyjjkcyhmxbYyyfhddzlqdtxfy;
	}

	public void setYffyjjkcyhmxbYyyfhddzlqdtxfy(Double yffyjjkcyhmxbYyyfhddzlqdtxfy) {
		this.yffyjjkcyhmxbYyyfhddzlqdtxfy = yffyjjkcyhmxbYyyfhddzlqdtxfy;
	}
	
	public Double getYffyjjkcyhmxbYyyfhddfzljs() {
		return yffyjjkcyhmxbYyyfhddfzljs;
	}

	public void setYffyjjkcyhmxbYyyfhddfzljs(Double yffyjjkcyhmxbYyyfhddfzljs) {
		this.yffyjjkcyhmxbYyyfhddfzljs = yffyjjkcyhmxbYyyfhddfzljs;
	}
	
	public Double getYffyjjkcyhmxbXcpsjfd() {
		return yffyjjkcyhmxbXcpsjfd;
	}

	public void setYffyjjkcyhmxbXcpsjfd(Double yffyjjkcyhmxbXcpsjfd) {
		this.yffyjjkcyhmxbXcpsjfd = yffyjjkcyhmxbXcpsjfd;
	}
	
	public Double getYffyjjkcyhmxbXcpsjf() {
		return yffyjjkcyhmxbXcpsjf;
	}

	public void setYffyjjkcyhmxbXcpsjf(Double yffyjjkcyhmxbXcpsjf) {
		this.yffyjjkcyhmxbXcpsjf = yffyjjkcyhmxbXcpsjf;
	}
	
	public Double getYffyjjkcyhmxbXgygczdf() {
		return yffyjjkcyhmxbXgygczdf;
	}

	public void setYffyjjkcyhmxbXgygczdf(Double yffyjjkcyhmxbXgygczdf) {
		this.yffyjjkcyhmxbXgygczdf = yffyjjkcyhmxbXgygczdf;
	}
	
	public Double getYffyjjkcyhmxbXyyzdlcsyf() {
		return yffyjjkcyhmxbXyyzdlcsyf;
	}

	public void setYffyjjkcyhmxbXyyzdlcsyf(Double yffyjjkcyhmxbXyyzdlcsyf) {
		this.yffyjjkcyhmxbXyyzdlcsyf = yffyjjkcyhmxbXyyzdlcsyf;
	}
	
	public Double getYffyjjkcyhmxbKtkfjsdxcsyf() {
		return yffyjjkcyhmxbKtkfjsdxcsyf;
	}

	public void setYffyjjkcyhmxbKtkfjsdxcsyf(Double yffyjjkcyhmxbKtkfjsdxcsyf) {
		this.yffyjjkcyhmxbKtkfjsdxcsyf = yffyjjkcyhmxbKtkfjsdxcsyf;
	}
	
	public Double getYffyjjkcyhmxbQtxgfy() {
		return yffyjjkcyhmxbQtxgfy;
	}

	public void setYffyjjkcyhmxbQtxgfy(Double yffyjjkcyhmxbQtxgfy) {
		this.yffyjjkcyhmxbQtxgfy = yffyjjkcyhmxbQtxgfy;
	}
	
	public Double getYffyjjkcyhmxbJstsgzlfzlfyfzjzxfgxkjyfbxf() {
		return yffyjjkcyhmxbJstsgzlfzlfyfzjzxfgxkjyfbxf;
	}

	public void setYffyjjkcyhmxbJstsgzlfzlfyfzjzxfgxkjyfbxf(Double yffyjjkcyhmxbJstsgzlfzlfyfzjzxfgxkjyfbxf) {
		this.yffyjjkcyhmxbJstsgzlfzlfyfzjzxfgxkjyfbxf = yffyjjkcyhmxbJstsgzlfzlfyfzjzxfgxkjyfbxf;
	}
	
	public Double getYffyjjkcyhmxbYfcgdjsfxpylzjdpspgysfy() {
		return yffyjjkcyhmxbYfcgdjsfxpylzjdpspgysfy;
	}

	public void setYffyjjkcyhmxbYfcgdjsfxpylzjdpspgysfy(Double yffyjjkcyhmxbYfcgdjsfxpylzjdpspgysfy) {
		this.yffyjjkcyhmxbYfcgdjsfxpylzjdpspgysfy = yffyjjkcyhmxbYfcgdjsfxpylzjdpspgysfy;
	}
	
	public Double getYffyjjkcyhmxbZscqdsqfzcfdlf() {
		return yffyjjkcyhmxbZscqdsqfzcfdlf;
	}

	public void setYffyjjkcyhmxbZscqdsqfzcfdlf(Double yffyjjkcyhmxbZscqdsqfzcfdlf) {
		this.yffyjjkcyhmxbZscqdsqfzcfdlf = yffyjjkcyhmxbZscqdsqfzcfdlf;
	}
	
	public Double getYffyjjkcyhmxbZgflfbcylbxfbcylbxf() {
		return yffyjjkcyhmxbZgflfbcylbxfbcylbxf;
	}

	public void setYffyjjkcyhmxbZgflfbcylbxfbcylbxf(Double yffyjjkcyhmxbZgflfbcylbxfbcylbxf) {
		this.yffyjjkcyhmxbZgflfbcylbxfbcylbxf = yffyjjkcyhmxbZgflfbcylbxfbcylbxf;
	}
	
	public Double getYffyjjkcyhmxbClfhyf() {
		return yffyjjkcyhmxbClfhyf;
	}

	public void setYffyjjkcyhmxbClfhyf(Double yffyjjkcyhmxbClfhyf) {
		this.yffyjjkcyhmxbClfhyf = yffyjjkcyhmxbClfhyf;
	}
	
	public Double getYffyjjkcyhmxbJxedzhdqtxgfy() {
		return yffyjjkcyhmxbJxedzhdqtxgfy;
	}

	public void setYffyjjkcyhmxbJxedzhdqtxgfy(Double yffyjjkcyhmxbJxedzhdqtxgfy) {
		this.yffyjjkcyhmxbJxedzhdqtxgfy = yffyjjkcyhmxbJxedzhdqtxgfy;
	}
	
	public Double getYffyjjkcyhmxbWtyf() {
		return yffyjjkcyhmxbWtyf;
	}

	public void setYffyjjkcyhmxbWtyf(Double yffyjjkcyhmxbWtyf) {
		this.yffyjjkcyhmxbWtyf = yffyjjkcyhmxbWtyf;
	}
	
	public Double getYffyjjkcyhmxbWtwbjghgrjxyfhdsfsdfy() {
		return yffyjjkcyhmxbWtwbjghgrjxyfhdsfsdfy;
	}

	public void setYffyjjkcyhmxbWtwbjghgrjxyfhdsfsdfy(Double yffyjjkcyhmxbWtwbjghgrjxyfhdsfsdfy) {
		this.yffyjjkcyhmxbWtwbjghgrjxyfhdsfsdfy = yffyjjkcyhmxbWtwbjghgrjxyfhdsfsdfy;
	}
	
	public Double getYffyjjkcyhmxbQzwtjwjxyfhdsfsdfy() {
		return yffyjjkcyhmxbQzwtjwjxyfhdsfsdfy;
	}

	public void setYffyjjkcyhmxbQzwtjwjxyfhdsfsdfy(Double yffyjjkcyhmxbQzwtjwjxyfhdsfsdfy) {
		this.yffyjjkcyhmxbQzwtjwjxyfhdsfsdfy = yffyjjkcyhmxbQzwtjwjxyfhdsfsdfy;
	}
	
	@Size(min=0, max=1, message="年度研发费用小计长度不能超过 1 个字符")
	public String getYffyjjkcyhmxbNdyffyxj() {
		return yffyjjkcyhmxbNdyffyxj;
	}

	public void setYffyjjkcyhmxbNdyffyxj(String yffyjjkcyhmxbNdyffyxj) {
		this.yffyjjkcyhmxbNdyffyxj = yffyjjkcyhmxbNdyffyxj;
	}
	
	public Double getYffyjjkcyhmxbBnfyhje() {
		return yffyjjkcyhmxbBnfyhje;
	}

	public void setYffyjjkcyhmxbBnfyhje(Double yffyjjkcyhmxbBnfyhje) {
		this.yffyjjkcyhmxbBnfyhje = yffyjjkcyhmxbBnfyhje;
	}
	
	public Double getYffyjjkcyhmxbBnzchje() {
		return yffyjjkcyhmxbBnzchje;
	}

	public void setYffyjjkcyhmxbBnzchje(Double yffyjjkcyhmxbBnzchje) {
		this.yffyjjkcyhmxbBnzchje = yffyjjkcyhmxbBnzchje;
	}
	
	public Double getYffyjjkcyhmxbBnxcwxzctxf() {
		return yffyjjkcyhmxbBnxcwxzctxf;
	}

	public void setYffyjjkcyhmxbBnxcwxzctxf(Double yffyjjkcyhmxbBnxcwxzctxf) {
		this.yffyjjkcyhmxbBnxcwxzctxf = yffyjjkcyhmxbBnxcwxzctxf;
	}
	
	public Double getYffyjjkcyhmxbYqndxcwxzcbntxf() {
		return yffyjjkcyhmxbYqndxcwxzcbntxf;
	}

	public void setYffyjjkcyhmxbYqndxcwxzcbntxf(Double yffyjjkcyhmxbYqndxcwxzcbntxf) {
		this.yffyjjkcyhmxbYqndxcwxzcbntxf = yffyjjkcyhmxbYqndxcwxzcbntxf;
	}
	
	public Double getYffyjjkcyhmxbYxkcdyffyhj() {
		return yffyjjkcyhmxbYxkcdyffyhj;
	}

	public void setYffyjjkcyhmxbYxkcdyffyhj(Double yffyjjkcyhmxbYxkcdyffyhj) {
		this.yffyjjkcyhmxbYxkcdyffyhj = yffyjjkcyhmxbYxkcdyffyhj;
	}
	
	public Double getYffyjjkcyhmxbJtssrbf() {
		return yffyjjkcyhmxbJtssrbf;
	}

	public void setYffyjjkcyhmxbJtssrbf(Double yffyjjkcyhmxbJtssrbf) {
		this.yffyjjkcyhmxbJtssrbf = yffyjjkcyhmxbJtssrbf;
	}
	
	public Double getYffyjjkcyhmxbYxkcdyffydztssrhdje() {
		return yffyjjkcyhmxbYxkcdyffydztssrhdje;
	}

	public void setYffyjjkcyhmxbYxkcdyffydztssrhdje(Double yffyjjkcyhmxbYxkcdyffydztssrhdje) {
		this.yffyjjkcyhmxbYxkcdyffydztssrhdje = yffyjjkcyhmxbYxkcdyffydztssrhdje;
	}
	
	public Double getYffyjjkcyhmxbJdnxsyfhdzjxccpbkzcbfdydclbf() {
		return yffyjjkcyhmxbJdnxsyfhdzjxccpbkzcbfdydclbf;
	}

	public void setYffyjjkcyhmxbJdnxsyfhdzjxccpbkzcbfdydclbf(Double yffyjjkcyhmxbJdnxsyfhdzjxccpbkzcbfdydclbf) {
		this.yffyjjkcyhmxbJdnxsyfhdzjxccpbkzcbfdydclbf = yffyjjkcyhmxbJdnxsyfhdzjxccpbkzcbfdydclbf;
	}
	
	public Double getYffyjjkcyhmxbJyqndxsyfhdzjxccpbkzcbfdydclbfjzj() {
		return yffyjjkcyhmxbJyqndxsyfhdzjxccpbkzcbfdydclbfjzj;
	}

	public void setYffyjjkcyhmxbJyqndxsyfhdzjxccpbkzcbfdydclbfjzj(Double yffyjjkcyhmxbJyqndxsyfhdzjxccpbkzcbfdydclbfjzj) {
		this.yffyjjkcyhmxbJyqndxsyfhdzjxccpbkzcbfdydclbfjzj = yffyjjkcyhmxbJyqndxsyfhdzjxccpbkzcbfdydclbfjzj;
	}
	
	public Double getYffyjjkcyhmxbJjkcbl() {
		return yffyjjkcyhmxbJjkcbl;
	}

	public void setYffyjjkcyhmxbJjkcbl(Double yffyjjkcyhmxbJjkcbl) {
		this.yffyjjkcyhmxbJjkcbl = yffyjjkcyhmxbJjkcbl;
	}
	
	public Double getYffyjjkcyhmxbBnyffyjjkcze() {
		return yffyjjkcyhmxbBnyffyjjkcze;
	}

	public void setYffyjjkcyhmxbBnyffyjjkcze(Double yffyjjkcyhmxbBnyffyjjkcze) {
		this.yffyjjkcyhmxbBnyffyjjkcze = yffyjjkcyhmxbBnyffyjjkcze;
	}
	
	public Double getYffyjjkcyhmxbXsyfhdzjxccpbkzcbfdyclbfjzyhndkcje() {
		return yffyjjkcyhmxbXsyfhdzjxccpbkzcbfdyclbfjzyhndkcje;
	}

	public void setYffyjjkcyhmxbXsyfhdzjxccpbkzcbfdyclbfjzyhndkcje(Double yffyjjkcyhmxbXsyfhdzjxccpbkzcbfdyclbfjzyhndkcje) {
		this.yffyjjkcyhmxbXsyfhdzjxccpbkzcbfdyclbfjzyhndkcje = yffyjjkcyhmxbXsyfhdzjxccpbkzcbfdyclbfjzyhndkcje;
	}
	
}