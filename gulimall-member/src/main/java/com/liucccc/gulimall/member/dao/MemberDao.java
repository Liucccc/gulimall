package com.liucccc.gulimall.member.dao;

import com.liucccc.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author liucccc
 * @date 2020-08-14 21:28:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
