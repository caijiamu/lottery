package com.example.demo.controller;

import cn.cloudtop.common.api.basic.RestResponse;
import com.example.demo.dto.UserAddRequest;
import com.example.demo.dto.UserInfoAlterRequest;
import com.example.demo.dto.UserInfoResponse;
import com.example.demo.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by caijiamu on 2017/9/7.
 */
@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;


    @ApiOperation(value = "新增用户", response = RestResponse.class)
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public RestResponse insertUser(@RequestBody @Valid UserAddRequest userAddRequest) {
        return userService.userAdd(userAddRequest);
    }

    @ApiOperation(value = "修改用户", response = RestResponse.class)
    @RequestMapping(value = "/alter", method = RequestMethod.PUT)
    public RestResponse alterUserInfo(@RequestBody @Valid UserInfoAlterRequest userInfoAlterRequest) {
        return userService.userInfoAlter(userInfoAlterRequest);
    }

    @ApiOperation(value = "删除用户", response = RestResponse.class)
    @RequestMapping(value = "/delete/{userId}", method = RequestMethod.DELETE)
    public RestResponse deleteUser(@PathVariable("userId") long userId) {
        return userService.deleteUser(userId);
    }

    @ApiOperation(value = "获取用户", response = UserInfoResponse.class)
    @RequestMapping(value = "/get/userId/{userId}", method = RequestMethod.GET)
    public UserInfoResponse getUserInfo(@PathVariable long userId) {
        return userService.getUserInfo(userId);
    }


}
