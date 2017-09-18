package com.example.demo.service;

import cn.cloudtop.common.api.basic.RestResponse;
import com.example.demo.domain.User;
import com.example.demo.dto.UserAddRequest;
import com.example.demo.dto.UserInfoAlterRequest;
import com.example.demo.dto.UserInfoResponse;
import com.example.demo.dto.vo.UserVo;
import com.example.demo.responsitory.UserResponsitory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by caijiamu on 2017/9/7.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserResponsitory userResponsitory;

    public RestResponse userAdd(UserAddRequest userAddRequest) {

        User user = new User();
        BeanUtils.copyProperties(userAddRequest, user);
        userResponsitory.save(user);

        return new RestResponse();
    }

    public RestResponse userInfoAlter(UserInfoAlterRequest userInfoAlterRequest) {
        User user = userResponsitory.findOne(userInfoAlterRequest.getId());
        BeanUtils.copyProperties(userInfoAlterRequest, user);
        userResponsitory.save(user);
        return new RestResponse();
    }

    public RestResponse deleteUser(long userId) {
        userResponsitory.delete(userId);
        return new RestResponse();
    }

    public UserInfoResponse getUserInfo(long userId) {
        User user = userResponsitory.findOne(userId);
        if (user == null){
            return new UserInfoResponse(1,"用户不存在");
        }
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(user, userVo);
        UserInfoResponse userInfoResponse = new UserInfoResponse();
        userInfoResponse.setUserVo(userVo);
        return userInfoResponse;
    }

}
