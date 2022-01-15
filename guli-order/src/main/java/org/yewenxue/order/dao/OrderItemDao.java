package org.yewenxue.order.dao;

import org.yewenxue.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-01-15 01:45:11
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
