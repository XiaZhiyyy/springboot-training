package com.hqyj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hqyj.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;

//BaseMapper是MP框架封装好的接口方法，能对单表进行增删改查
@Mapper //表示这是数据层，
public interface UserInfoDao extends BaseMapper<UserInfo> {
}
