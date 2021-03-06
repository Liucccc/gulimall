package com.liucccc.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liucccc.common.utils.PageUtils;
import com.liucccc.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author liucccc
 * @date 2020-08-14 21:18:08
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

