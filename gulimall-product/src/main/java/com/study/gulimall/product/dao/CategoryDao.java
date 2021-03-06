package com.study.gulimall.product.dao;

import com.study.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author me
 * @email me@gmail.com
 * @date 2021-06-02 15:33:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
