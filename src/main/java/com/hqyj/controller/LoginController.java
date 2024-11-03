package com.hqyj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin") //地址映射器
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "111";
    }
}
