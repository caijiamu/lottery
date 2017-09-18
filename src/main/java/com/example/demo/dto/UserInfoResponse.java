package com.example.demo.dto;

import cn.cloudtop.common.api.basic.RestResponse;
import com.example.demo.dto.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by caijiamu on 2017/9/8.
 */
@ApiModel(description = "用户信息response")
public class UserInfoResponse extends RestResponse {

    @ApiModelProperty("用户信息")
    private UserVo userVo;

    public UserVo getUserVo() {
        return userVo;
    }

    public void setUserVo(UserVo userVo) {
        this.userVo = userVo;
    }

    public UserInfoResponse () {};

    public UserInfoResponse(int errorCode,String errorMessage) {
        super(errorCode,errorMessage);
    }

}
