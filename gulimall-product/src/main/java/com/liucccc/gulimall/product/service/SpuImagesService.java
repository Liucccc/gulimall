package com.liucccc.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liucccc.common.utils.PageUtils;
import com.liucccc.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author liucccc
 * @email 974854469@qq.com
 * @date 2020-08-14 20:59:11
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

