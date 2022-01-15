package org.yewenxue.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yewenxue.common.utils.PageUtils;
import org.yewenxue.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-01-15 15:30:29
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

