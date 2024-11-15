package com.hqyj.service;

import com.hqyj.pojo.UserInfo;
import com.hqyj.util.ResultVo;

public interface UserInfoService {  //接口一般是定义方法实现

    //添加数据目录，方法返回值使用统一响应类
    ResultVo add(UserInfo userInfo);
    //更改数据目录
    ResultVo update(UserInfo userInfo);
    //删除
    ResultVo del(Integer id);
    //查询
    ResultVo query();

}
