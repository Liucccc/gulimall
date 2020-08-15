package com.liucccc.gulimall.coupon.dao;

import com.liucccc.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author liucccc
 * @date 2020-08-14 21:18:08
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
