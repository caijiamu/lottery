package com.example.demo.dto;

import cn.cloudtop.common.api.basic.HttpMethod;
import cn.cloudtop.common.api.basic.RestRequest;
import cn.cloudtop.common.api.basic.RestResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by caijiamu on 2017/9/8.
 */
@ApiModel(description = "修改用户信息")
public class UserInfoAlterRequest implements RestRequest<RestResponse>{
    @ApiModelProperty(value = "用户id")
    private long id;

    @ApiModelProperty(value = "名字")
    private String name;

    @ApiModelProperty(value = "电话")
    private String phone;


    @Override
    public HttpMethod getMethod() {
        return HttpMethod.PUT;
    }

    @Override
    public String getUrl() {
        return "/api/user/alter";
    }

    @Override
    public Map<String, Object> getParameters() {
        Map<String, Object> map = new HashMap<>();
        map.put("phone",this.phone);
        map.put("name",this.name);
        map.put("id",this.id);
        return map;
    }

    @Override
    public Class<RestResponse> responseClass() {
        return RestResponse.class;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
