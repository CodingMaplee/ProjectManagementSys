package com.jeesite.modules.core.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 研发费用预算明细表Entity
 * @author zhw
 * @version 2024-12-17
 */
@Table(name="core_yffyysmxb", alias="a", label="研发费用预算明细表信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="yffyysmxb_kfxmmc", attrName="yffyysmxbKfxmmc", label="开发项目名称"),
		@Column(name="yffyysmxb_xmyqyfsj", attrName="yffyysmxbXmyqyfsj", label="项目预期研发时间"),
		@Column(name="yffyysmxb_yffyyszje", attrName="yffyysmxbYffyyszje", label="研发费用预算总金额"),
		@Column(name="yffyysmxb_qyzctr", attrName="yffyysmxbQyzctr", label="企业自筹投入", isUpdateForce=true),
		@Column(name="yffyysmxb_qtqdtr", attrName="yffyysmxbQtqdtr", label="其他渠道投入", isUpdateForce=true),
		@Column(name="yffyysmxb_bnd", attrName="yffyysmxbBnd", label="本年度"),
		@Column(name="yffyysmxb_bndjskfxmyszje", attrName="yffyysmxbBndjskfxmyszje", label="本年度技术开发项目预算总金额", isUpdateForce=true),
		@Column(name="yffyysmxb_bndqyzctr", attrName="yffyysmxbBndqyzctr", label="本年度企业自筹投入", isUpdateForce=true),
		@Column(name="yffyysmxb_bndqtqdtr", attrName="yffyysmxbBndqtqdtr", label="本年度其它渠道投入", isUpdateForce=true),
		@Column(name="yffyysmxb_yfhxzjxh", attrName="yffyysmxbYfhxzjxh", label="研发活性直接消耗的材料、燃料和动力费用", isUpdateForce=true),
		@Column(name="yffyysmxb_zjcsyfhddbqyzzryfy", attrName="yffyysmxbZjcsyfhddbqyzzryfy", label="直接从事研发活动的本企业在职人员费用", isUpdateForce=true),
		@Column(name="yffyysmxb_zyyyyfhdxgzjf", attrName="yffyysmxbZyyyyfhdxgzjf", label="专业用于研发活动相关折旧费", isUpdateForce=true),
		@Column(name="yffyysmxb_zmyyyfhddygzlf", attrName="yffyysmxbZmyyyfhddygzlf", label="专门用于研发活动的有关租赁费", isUpdateForce=true),
		@Column(name="yffyysmxb_zmyyyfhddygwxzctxf", attrName="yffyysmxbZmyyyfhddygwxzctxf", label="专门用于研发活动的有关无形资产摊销费", isUpdateForce=true),
		@Column(name="yffyysmxb_zmyyzjsyhcpszdmjgyzbkfjzzf", attrName="yffyysmxbZmyyzjsyhcpszdmjgyzbkfjzzf", label="专门用于中间实验和产品试制的模具、工艺装备开发及制造费", isUpdateForce=true),
		@Column(name="yffyysmxb_yjcglzjdpsysfy", attrName="yffyysmxbYjcglzjdpsysfy", label="研究成果论证、鉴定、评审、验收费用", isUpdateForce=true),
		@Column(name="yffyysmxb_yyfhdzjxgdqtfy", attrName="yffyysmxbYyfhdzjxgdqtfy", label="与研发活动直接相关的其它费用", isUpdateForce=true),
		@Column(name="yffyysmxb_yjkftrehj", attrName="yffyysmxbYjkftrehj", label="研究开发投入额合计", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class CoreYffyysmxb extends DataEntity<CoreYffyysmxb> {
	
	private static final long serialVersionUID = 1L;
	private String yffyysmxbKfxmmc;		// 开发项目名称
	private String yffyysmxbXmyqyfsj;		// 项目预期研发时间
	private Double yffyysmxbYffyyszje;		// 研发费用预算总金额
	private Double yffyysmxbQyzctr;		// 企业自筹投入
	private Double yffyysmxbQtqdtr;		// 其他渠道投入
	private String yffyysmxbBnd;		// 本年度
	private Double yffyysmxbBndjskfxmyszje;		// 本年度技术开发项目预算总金额
	private Double yffyysmxbBndqyzctr;		// 本年度企业自筹投入
	private Double yffyysmxbBndqtqdtr;		// 本年度其它渠道投入
	private Double yffyysmxbYfhxzjxh;		// 研发活性直接消耗的材料、燃料和动力费用
	private Double yffyysmxbZjcsyfhddbqyzzryfy;		// 直接从事研发活动的本企业在职人员费用
	private Double yffyysmxbZyyyyfhdxgzjf;		// 专业用于研发活动相关折旧费
	private Double yffyysmxbZmyyyfhddygzlf;		// 专门用于研发活动的有关租赁费
	private Double yffyysmxbZmyyyfhddygwxzctxf;		// 专门用于研发活动的有关无形资产摊销费
	private Double yffyysmxbZmyyzjsyhcpszdmjgyzbkfjzzf;		// 专门用于中间实验和产品试制的模具、工艺装备开发及制造费
	private Double yffyysmxbYjcglzjdpsysfy;		// 研究成果论证、鉴定、评审、验收费用
	private Double yffyysmxbYyfhdzjxgdqtfy;		// 与研发活动直接相关的其它费用
	private Double yffyysmxbYjkftrehj;		// 研究开发投入额合计

	public CoreYffyysmxb() {
		this(null);
	}
	
	public CoreYffyysmxb(String id){
		super(id);
	}
	
	@NotBlank(message="开发项目名称不能为空")
	@Size(min=0, max=100, message="开发项目名称长度不能超过 100 个字符")
	public String getYffyysmxbKfxmmc() {
		return yffyysmxbKfxmmc;
	}

	public void setYffyysmxbKfxmmc(String yffyysmxbKfxmmc) {
		this.yffyysmxbKfxmmc = yffyysmxbKfxmmc;
	}
	
	@NotBlank(message="项目预期研发时间不能为空")
	@Size(min=0, max=100, message="项目预期研发时间长度不能超过 100 个字符")
	public String getYffyysmxbXmyqyfsj() {
		return yffyysmxbXmyqyfsj;
	}

	public void setYffyysmxbXmyqyfsj(String yffyysmxbXmyqyfsj) {
		this.yffyysmxbXmyqyfsj = yffyysmxbXmyqyfsj;
	}
	
	@NotNull(message="研发费用预算总金额不能为空")
	public Double getYffyysmxbYffyyszje() {
		return yffyysmxbYffyyszje;
	}

	public void setYffyysmxbYffyyszje(Double yffyysmxbYffyyszje) {
		this.yffyysmxbYffyyszje = yffyysmxbYffyyszje;
	}
	
	public Double getYffyysmxbQyzctr() {
		return yffyysmxbQyzctr;
	}

	public void setYffyysmxbQyzctr(Double yffyysmxbQyzctr) {
		this.yffyysmxbQyzctr = yffyysmxbQyzctr;
	}
	
	public Double getYffyysmxbQtqdtr() {
		return yffyysmxbQtqdtr;
	}

	public void setYffyysmxbQtqdtr(Double yffyysmxbQtqdtr) {
		this.yffyysmxbQtqdtr = yffyysmxbQtqdtr;
	}
	
	@Size(min=0, max=64, message="本年度长度不能超过 64 个字符")
	public String getYffyysmxbBnd() {
		return yffyysmxbBnd;
	}

	public void setYffyysmxbBnd(String yffyysmxbBnd) {
		this.yffyysmxbBnd = yffyysmxbBnd;
	}
	
	public Double getYffyysmxbBndjskfxmyszje() {
		return yffyysmxbBndjskfxmyszje;
	}

	public void setYffyysmxbBndjskfxmyszje(Double yffyysmxbBndjskfxmyszje) {
		this.yffyysmxbBndjskfxmyszje = yffyysmxbBndjskfxmyszje;
	}
	
	public Double getYffyysmxbBndqyzctr() {
		return yffyysmxbBndqyzctr;
	}

	public void setYffyysmxbBndqyzctr(Double yffyysmxbBndqyzctr) {
		this.yffyysmxbBndqyzctr = yffyysmxbBndqyzctr;
	}
	
	public Double getYffyysmxbBndqtqdtr() {
		return yffyysmxbBndqtqdtr;
	}

	public void setYffyysmxbBndqtqdtr(Double yffyysmxbBndqtqdtr) {
		this.yffyysmxbBndqtqdtr = yffyysmxbBndqtqdtr;
	}
	
	public Double getYffyysmxbYfhxzjxh() {
		return yffyysmxbYfhxzjxh;
	}

	public void setYffyysmxbYfhxzjxh(Double yffyysmxbYfhxzjxh) {
		this.yffyysmxbYfhxzjxh = yffyysmxbYfhxzjxh;
	}
	
	public Double getYffyysmxbZjcsyfhddbqyzzryfy() {
		return yffyysmxbZjcsyfhddbqyzzryfy;
	}

	public void setYffyysmxbZjcsyfhddbqyzzryfy(Double yffyysmxbZjcsyfhddbqyzzryfy) {
		this.yffyysmxbZjcsyfhddbqyzzryfy = yffyysmxbZjcsyfhddbqyzzryfy;
	}
	
	public Double getYffyysmxbZyyyyfhdxgzjf() {
		return yffyysmxbZyyyyfhdxgzjf;
	}

	public void setYffyysmxbZyyyyfhdxgzjf(Double yffyysmxbZyyyyfhdxgzjf) {
		this.yffyysmxbZyyyyfhdxgzjf = yffyysmxbZyyyyfhdxgzjf;
	}
	
	public Double getYffyysmxbZmyyyfhddygzlf() {
		return yffyysmxbZmyyyfhddygzlf;
	}

	public void setYffyysmxbZmyyyfhddygzlf(Double yffyysmxbZmyyyfhddygzlf) {
		this.yffyysmxbZmyyyfhddygzlf = yffyysmxbZmyyyfhddygzlf;
	}
	
	public Double getYffyysmxbZmyyyfhddygwxzctxf() {
		return yffyysmxbZmyyyfhddygwxzctxf;
	}

	public void setYffyysmxbZmyyyfhddygwxzctxf(Double yffyysmxbZmyyyfhddygwxzctxf) {
		this.yffyysmxbZmyyyfhddygwxzctxf = yffyysmxbZmyyyfhddygwxzctxf;
	}
	
	public Double getYffyysmxbZmyyzjsyhcpszdmjgyzbkfjzzf() {
		return yffyysmxbZmyyzjsyhcpszdmjgyzbkfjzzf;
	}

	public void setYffyysmxbZmyyzjsyhcpszdmjgyzbkfjzzf(Double yffyysmxbZmyyzjsyhcpszdmjgyzbkfjzzf) {
		this.yffyysmxbZmyyzjsyhcpszdmjgyzbkfjzzf = yffyysmxbZmyyzjsyhcpszdmjgyzbkfjzzf;
	}
	
	public Double getYffyysmxbYjcglzjdpsysfy() {
		return yffyysmxbYjcglzjdpsysfy;
	}

	public void setYffyysmxbYjcglzjdpsysfy(Double yffyysmxbYjcglzjdpsysfy) {
		this.yffyysmxbYjcglzjdpsysfy = yffyysmxbYjcglzjdpsysfy;
	}
	
	public Double getYffyysmxbYyfhdzjxgdqtfy() {
		return yffyysmxbYyfhdzjxgdqtfy;
	}

	public void setYffyysmxbYyfhdzjxgdqtfy(Double yffyysmxbYyfhdzjxgdqtfy) {
		this.yffyysmxbYyfhdzjxgdqtfy = yffyysmxbYyfhdzjxgdqtfy;
	}
	
	public Double getYffyysmxbYjkftrehj() {
		return yffyysmxbYjkftrehj;
	}

	public void setYffyysmxbYjkftrehj(Double yffyysmxbYjkftrehj) {
		this.yffyysmxbYjkftrehj = yffyysmxbYjkftrehj;
	}
	
}