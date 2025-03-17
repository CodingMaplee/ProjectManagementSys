package com.jeesite.modules.core.service;

import com.jeesite.common.service.TreeService;
import com.jeesite.modules.file.utils.FileUploadUtils;
import com.jeesite.modules.core.dao.CoreProjEmployTreeDao;
import com.jeesite.modules.core.entity.CoreProjEmployTree;
import com.jeesite.modules.test.dao.TestTreeDao;
import com.jeesite.modules.test.entity.TestTree;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CoreProjEmployTreeService extends TreeService<CoreProjEmployTreeDao, CoreProjEmployTree> {
    /**
     * 获取单条数据
     * @param projEmployTree
     * @return
     */
    @Override
    public CoreProjEmployTree get(CoreProjEmployTree projEmployTree) {
        return super.get(projEmployTree);
    }

    /**
     * 查询列表数据
     * @param projEmployTree
     * @return
     */
    @Override
    public List<CoreProjEmployTree> findList(CoreProjEmployTree projEmployTree) {
        return super.findList(projEmployTree);
    }

    /**
     * 保存数据（插入或更新）
     * @param projEmployTree
     */
    @Override
    @Transactional
    public void save(CoreProjEmployTree projEmployTree) {
        super.save(projEmployTree);
    }

    /**
     * 更新状态
     * @param projEmployTree
     */
    @Override
    @Transactional
    public void updateStatus(CoreProjEmployTree projEmployTree) {
        super.updateStatus(projEmployTree);
    }

    /**
     * 删除数据
     * @param projEmployTree
     */
    @Override
    @Transactional
    public void delete(CoreProjEmployTree projEmployTree) {
        projEmployTree.sqlMap().markIdDelete(); // 逻辑删除时标记ID值
        super.delete(projEmployTree);
    }


}
