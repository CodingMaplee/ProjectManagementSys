package com.jeesite.modules.core.web;

import com.jeesite.common.collect.ListUtils;
import com.jeesite.common.collect.MapUtils;
import com.jeesite.common.config.Global;
import com.jeesite.common.idgen.IdGen;
import com.jeesite.common.lang.StringUtils;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.core.entity.CoreProjEmployTree;
import com.jeesite.modules.core.service.CoreProjEmployTreeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "${adminPath}/core/coreProjEmployTree")
public class CoreProjEmployTreeController extends BaseController {

    @Autowired
    private CoreProjEmployTreeService projEmployTreeService;

    /**
     * 获取数据
     */
    @ModelAttribute
    public CoreProjEmployTree get(String treeCode, boolean isNewRecord) {
        return projEmployTreeService.get(treeCode, isNewRecord);
    }

    /**
     * 查询列表
     */
    @RequiresPermissions("core:coreProjEmployTree:view")
    @RequestMapping(value = {"list", ""})
    public String list(CoreProjEmployTree projEmployTree, Model model) {
        model.addAttribute("projEmployTree", projEmployTree);
        return "modules/core/coreProjEmployTreeList";
    }
    /**
     * 查询列表数据
     */
    @RequiresPermissions("core:coreProjEmployTree:view")
    @RequestMapping(value = "listData")
    @ResponseBody
    public List<CoreProjEmployTree> listData(CoreProjEmployTree projEmployTree) {
        if (StringUtils.isBlank(projEmployTree.getParentCode())) {
            projEmployTree.setParentCode(CoreProjEmployTree.ROOT_CODE);
        }
        if (StringUtils.isNotBlank(projEmployTree.getTreeName())){
            projEmployTree.setParentCode(null);
        }
        if (StringUtils.isNotBlank(projEmployTree.getRemarks())){
            projEmployTree.setParentCode(null);
        }
        List<CoreProjEmployTree> list = projEmployTreeService.findList(projEmployTree);
        return list;
    }

    /**
     * 查看编辑表单
     */
    @RequiresPermissions("core:coreProjEmployTree:view")
    @RequestMapping(value = "form")
    public String form(CoreProjEmployTree projEmployTree, Model model) {
        // 创建并初始化下一个节点信息
        projEmployTree = createNextNode(projEmployTree);
        model.addAttribute("projEmployTree", projEmployTree);
        return "modules/core/coreProjEmployTreeForm";
    }

    /**
     * 创建并初始化下一个节点信息，如：排序号、默认值
     */
    @RequiresPermissions("core:coreProjEmployTree:edit")
    @RequestMapping(value = "createNextNode")
    @ResponseBody
    public CoreProjEmployTree createNextNode(CoreProjEmployTree projEmployTree) {
        if (StringUtils.isNotBlank(projEmployTree.getParentCode())){
            projEmployTree.setParent(projEmployTreeService.get(projEmployTree.getParentCode()));
        }
        if (projEmployTree.getIsNewRecord()) {
            CoreProjEmployTree where = new CoreProjEmployTree();
            where.setParentCode(projEmployTree.getParentCode());
            CoreProjEmployTree last = projEmployTreeService.getLastByParentCode(where);
            // 获取到下级最后一个节点
            if (last != null){
                projEmployTree.setTreeSort(last.getTreeSort() + 30);
                projEmployTree.setTreeCode(IdGen.nextCode(last.getTreeCode()));
            }else if (projEmployTree.getParent() != null){
                projEmployTree.setTreeCode(projEmployTree.getParent().getTreeCode() + "001");
            }
        }
        // 以下设置表单默认数据
        if (projEmployTree.getTreeSort() == null){
            projEmployTree.setTreeSort(CoreProjEmployTree.DEFAULT_TREE_SORT);
        }
        return projEmployTree;
    }

    /**
     * 保存数据
     */
    @RequiresPermissions("core:coreProjEmployTree:edit")
    @PostMapping(value = "save")
    @ResponseBody
    public String save(@Validated CoreProjEmployTree projEmployTree) {
        projEmployTreeService.save(projEmployTree);
        return renderResult(Global.TRUE, text("保存数据成功！"));
    }

    /**
     * 停用数据
     */
    @RequiresPermissions("core:coreProjEmployTree:edit")
    @RequestMapping(value = "disable")
    @ResponseBody
    public String disable(CoreProjEmployTree projEmployTree) {
        CoreProjEmployTree where = new CoreProjEmployTree();
        where.setStatus(CoreProjEmployTree.STATUS_NORMAL);
        where.setParentCodes("," + projEmployTree.getId() + ",");
        long count = projEmployTreeService.findCount(where);
        if (count > 0) {
            return renderResult(Global.FALSE, text("该数据包含未停用的子数据！"));
        }
        projEmployTree.setStatus(CoreProjEmployTree.STATUS_DISABLE);
        projEmployTreeService.updateStatus(projEmployTree);
        return renderResult(Global.TRUE, text("停用数据成功"));
    }

    /**
     * 启用数据
     */
    @RequiresPermissions("core:coreProjEmployTree:edit")
    @RequestMapping(value = "enable")
    @ResponseBody
    public String enable(CoreProjEmployTree projEmployTree) {
        projEmployTree.setStatus(CoreProjEmployTree.STATUS_NORMAL);
        projEmployTreeService.updateStatus(projEmployTree);
        return renderResult(Global.TRUE, text("启用数据成功"));
    }

    /**
     * 删除数据
     */
    @RequiresPermissions("core:coreProjEmployTree:edit")
    @RequestMapping(value = "delete")
    @ResponseBody
    public String delete(CoreProjEmployTree projEmployTree) {
        projEmployTreeService.delete(projEmployTree);
        return renderResult(Global.TRUE, text("删除数据成功！"));
    }

    /**
     * 获取树结构数据
     * @param excludeCode 排除的Code
     * @param isShowCode 是否显示编码（true or 1：显示在左侧；2：显示在右侧；false or null：不显示）
     * @return
     */
    @RequiresPermissions("core:coreProjEmployTree:view")
    @RequestMapping(value = "treeData")
    @ResponseBody
    public List<Map<String, Object>> treeData(String excludeCode, String isShowCode) {
        List<Map<String, Object>> mapList = ListUtils.newArrayList();
        List<CoreProjEmployTree> list = projEmployTreeService.findList(new CoreProjEmployTree());
        for (int i=0; i<list.size(); i++){
            CoreProjEmployTree e = list.get(i);
            // 过滤非正常的数据
            if (!CoreProjEmployTree.STATUS_NORMAL.equals(e.getStatus())){
                continue;
            }
            // 过滤被排除的编码（包括所有子级）
            if (StringUtils.isNotBlank(excludeCode)){
                if (e.getId().equals(excludeCode)){
                    continue;
                }
                if (e.getParentCodes().contains("," + excludeCode + ",")){
                    continue;
                }
            }
            Map<String, Object> map = MapUtils.newHashMap();
            map.put("id", e.getId());
            map.put("pId", e.getParentCode());
            map.put("name", StringUtils.getTreeNodeName(isShowCode, e.getTreeCode(), e.getTreeName()));
            mapList.add(map);
        }
        return mapList;
    }

    /**
     * 修复表结构相关数据
     */
    @RequiresPermissions("core:coreProjEmployTree:edit")
    @RequestMapping(value = "fixTreeData")
    @ResponseBody
    public String fixTreeData(CoreProjEmployTree projEmployTree){
        if (!projEmployTree.currentUser().isAdmin()){
            return renderResult(Global.FALSE, "操作失败，只有管理员才能进行修复！");
        }
        projEmployTreeService.fixTreeData();
        return renderResult(Global.TRUE, "数据修复成功");
    }
}
