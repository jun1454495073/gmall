package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-01-03 19:38:21
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}