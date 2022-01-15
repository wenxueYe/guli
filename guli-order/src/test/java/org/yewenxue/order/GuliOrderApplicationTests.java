package org.yewenxue.order;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.yewenxue.order.entity.OrderReturnReasonEntity;
import org.yewenxue.order.service.OrderReturnReasonService;

import java.util.List;

@SpringBootTest
class GuliOrderApplicationTests {

    @Autowired
    OrderReturnReasonService orderReturnReasonService;

    @Test
    void contextLoads() {
//        OrderReturnReasonEntity orderReturnReasonEntity = new OrderReturnReasonEntity();
//        orderReturnReasonEntity.setId(1L);
//        orderReturnReasonEntity.setName("iphone-12");
//
//        orderReturnReasonService.updateById(orderReturnReasonEntity);
//        System.out.println("成功");

        //查询
        List<OrderReturnReasonEntity> list = orderReturnReasonService.list(new QueryWrapper<OrderReturnReasonEntity>().eq("id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
