package org.yewenxue.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yewenxue.common.utils.PageUtils;
import org.yewenxue.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-01-15 15:21:18
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

