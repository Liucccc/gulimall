package com.liucccc.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liucccc.common.utils.PageUtils;
import com.liucccc.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author liucccc
 * @email 974854469@qq.com
 * @date 2020-08-14 20:59:12
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

