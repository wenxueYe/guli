package org.yewenxue.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yewenxue.common.utils.PageUtils;
import org.yewenxue.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-01-15 15:30:29
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

