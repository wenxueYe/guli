package org.yewenxue.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yewenxue.common.utils.PageUtils;
import org.yewenxue.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-01-15 15:21:18
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

