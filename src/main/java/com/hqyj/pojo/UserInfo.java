package com.hqyj.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("users") //需要指明连接的数据库“jdbc”中操作的表名
public class UserInfo { //右键类名生成get and set
    @TableId(value = "id", type = IdType.AUTO)   //@TableId注解设置主键
    private Integer id;

    @TableField("NAME") //表内元素NAME
    private String NAME;

    @TableField("PASSWORD")
    private String PASSWORD;

    @TableField("email")
    private String email;

    @TableField("birthday")
    private String birthday;

    public Integer getId() { return id; }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
