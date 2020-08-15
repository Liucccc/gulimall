package com.liucccc.gulimall.product.dao;

import com.liucccc.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liucccc
 * @email 974854469@qq.com
 * @date 2020-08-14 20:59:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
