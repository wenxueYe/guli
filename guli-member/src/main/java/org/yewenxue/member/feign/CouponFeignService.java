package org.yewenxue.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yewenxue.common.utils.R;

/**
 * @Time : 2022/1/16 2:51
 * @Author : wenxue ye
 * @File : CouponFeignService
 * @Project : guli
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    /**
     *  会员的优惠券信息--cus
     */
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();




}
