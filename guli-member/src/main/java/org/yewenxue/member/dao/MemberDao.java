package org.yewenxue.member.dao;

import org.yewenxue.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-01-15 15:26:40
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
