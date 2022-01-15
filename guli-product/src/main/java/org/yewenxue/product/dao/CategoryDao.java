package org.yewenxue.product.dao;

import org.yewenxue.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-01-15 15:35:39
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
