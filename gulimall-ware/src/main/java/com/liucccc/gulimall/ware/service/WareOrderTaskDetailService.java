package com.liucccc.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liucccc.common.utils.PageUtils;
import com.liucccc.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author liucccc
 * @date 2020-08-14 21:31:27
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

