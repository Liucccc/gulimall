package com.liucccc.gulimall.order.dao;

import com.liucccc.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liucccc
 * @date 2020-08-14 21:29:55
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
