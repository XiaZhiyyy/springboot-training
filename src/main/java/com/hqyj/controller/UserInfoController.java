package com.hqyj.controller;


import com.hqyj.pojo.UserInfo;
import com.hqyj.service.UserInfoService;
import com.hqyj.util.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //表示此类为控制器
@RequestMapping("/user")
public class UserInfoController {

    //获取服务层userInfoService接口实现类对象
    @Autowired
    UserInfoService userInfoService;

    //PostMapping相比明文传输的RequestMapping方式更安全,传输的数据存放于表单的body中
    //RequestBody
    @PostMapping("/add")
    public ResultVo add(@RequestBody UserInfo userInfo){
        return userInfoService.add(userInfo);
    }

    // 修改
    @PutMapping("/update")
    public ResultVo update(@RequestBody UserInfo userInfo){
        return userInfoService.update(userInfo);
    }

    //查询
    //get 请求更快，明文传输
    @GetMapping("/query")
    public ResultVo query(){
        return userInfoService.query();
    }
}
