package org.yewenxue.ware.dao;

import org.yewenxue.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-01-15 15:30:29
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
