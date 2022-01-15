package org.yewenxue.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yewenxue.common.utils.PageUtils;
import org.yewenxue.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-01-15 15:35:39
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

