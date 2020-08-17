package com.liucccc.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liucccc.common.utils.PageUtils;
import com.liucccc.common.utils.Query;

import com.liucccc.gulimall.product.dao.CategoryDao;
import com.liucccc.gulimall.product.entity.CategoryEntity;
import com.liucccc.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //所有分类
        List<CategoryEntity> all = baseMapper.selectList(null);

        List<CategoryEntity> listTree = all.stream().filter((categoryEntity ->
                categoryEntity.getParentCid() == 0
        )).map((menu) -> {
            menu.setChildren(getChildren(menu, all));
            return menu;
        }).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());

        return listTree;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {

        List<CategoryEntity> children = all.stream().filter((categoryEntity ->
                categoryEntity.getParentCid().equals(root.getCatId())
        )).map((categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity, all));
            return categoryEntity;
        })).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());

        return children;
    }

}