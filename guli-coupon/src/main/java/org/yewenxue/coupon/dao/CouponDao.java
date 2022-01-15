package org.yewenxue.coupon.dao;

import org.yewenxue.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-01-15 15:21:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
