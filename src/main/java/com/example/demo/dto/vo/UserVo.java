package com.example.demo.dto.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;

/**
 * Created by caijiamu on 2017/9/8.
 */
@ApiModel(description = "用户信息")
public class UserVo {

    private long id;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("昵称")
    private String nickName;

    private String phone;

    @Column(columnDefinition = "int(1) default 1 comment '性别 0：未知 1：男 2：女'")
    private int sexType;//0:未知，1：男，2：女

    private String  portraitUrl; //头像

    private String weiAccount; //微信账号

    private String weiOpenId; //微信openid

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSexType() {
        return sexType;
    }

    public void setSexType(int sexType) {
        this.sexType = sexType;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public String getWeiAccount() {
        return weiAccount;
    }

    public void setWeiAccount(String weiAccount) {
        this.weiAccount = weiAccount;
    }

    public String getWeiOpenId() {
        return weiOpenId;
    }

    public void setWeiOpenId(String weiOpenId) {
        this.weiOpenId = weiOpenId;
    }
}
