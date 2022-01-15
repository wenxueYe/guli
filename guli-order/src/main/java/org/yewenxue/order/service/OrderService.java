package org.yewenxue.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yewenxue.common.utils.PageUtils;
import org.yewenxue.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-01-15 01:45:11
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

