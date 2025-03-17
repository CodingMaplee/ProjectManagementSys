package com.jeesite.modules.core.entity;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.entity.TreeEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;
import com.jeesite.modules.test.entity.TestTree;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 测试树表Entity
 * @author zhw
 * @version 2024-11-29
 */
@Table(name="core_projemploytree", alias="a", columns={
        @Column(name="tree_code", attrName="treeCode", label="节点编码", isPK=true),
        @Column(includeEntity=TreeEntity.class),
        @Column(name="tree_name", attrName="treeName", label="节点名称", queryType=QueryType.LIKE, isTreeName=true),
        @Column(includeEntity=DataEntity.class),
    }, orderBy="a.tree_sorts, a.tree_code"
)

public class CoreProjEmployTree extends TreeEntity<CoreProjEmployTree> {

    private static final long serialVersionUID = 1L;
    private String treeCode;		// 节点编码
    private String treeName;		// 节点名称

    public CoreProjEmployTree() {
        this(null);
    }

    public CoreProjEmployTree(String id){
        super(id);
    }

    @Override
    public CoreProjEmployTree getParent() {
        return parent;
    }

    @Override
    public void setParent(CoreProjEmployTree parent) {
        this.parent = parent;
    }

    public String getTreeCode() {
        return treeCode;
    }

    public void setTreeCode(String treeCode) {
        this.treeCode = treeCode;
    }

    @NotBlank(message="节点名称不能为空")
    @Size(min=0, max=200, message="节点名称长度不能超过 200 个字符")
    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }
}
