package com.hqyj.service.impl;


import com.hqyj.dao.UserInfoDao;
import com.hqyj.pojo.UserInfo;
import com.hqyj.service.UserInfoService;
import com.hqyj.util.ResultVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service    //表示服务层，不需要自己new就可以实现类
public class UserInfoServiceImpl implements UserInfoService {

    //获取数据层实现类的对象
    @Resource
    UserInfoDao userInfoDao;

    @Override
    public ResultVo add(UserInfo userInfo) {
        try {
            int bool = userInfoDao.insert(userInfo);
            if (bool > 0) {
                return ResultVo.success("新增成功");
            } else {
                return ResultVo.error("新增失败");
            }
        }catch(Exception e){
            e.printStackTrace();
            return ResultVo.error("新增异常");
        }
    }

    @Override
    public ResultVo update(UserInfo userInfo) {
        try {
            int bool = userInfoDao.updateById(userInfo);
            if (bool > 0) {
                return ResultVo.success("修改成功");
            } else {
                return ResultVo.error("修改失败");
            }
        }catch(Exception e){
            e.printStackTrace();
            return ResultVo.error("修改异常");
        }
    }

    @Override
    public ResultVo del(Integer id) {
        return null;
    }

    @Override
    public ResultVo query() {
        try{
            // 查询所有
            List<UserInfo> list = userInfoDao.selectList(null);
            if(list.size() > 0){
                return ResultVo.success("查询数据结果：",list);
            }else{
                return ResultVo.error("查询数据为空");
            }
        }catch (Exception e){
            e.printStackTrace();
            return ResultVo.error("查询异常");
        }
    }
}
