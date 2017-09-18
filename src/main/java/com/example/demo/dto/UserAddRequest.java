package com.example.demo.dto;

import cn.cloudtop.common.api.basic.HttpMethod;
import cn.cloudtop.common.api.basic.RestRequest;
import cn.cloudtop.common.api.basic.RestResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by caijiamu on 2017/9/7.
 */

@ApiModel(description = "新增用户")
public class UserAddRequest implements RestRequest<RestResponse> {

    @ApiModelProperty(value = "手机号码", required = true)
    @NotBlank(message = "手机号码不能为空")
    @Pattern(regexp = "13[0-9]{9}|15[012356789][0-9]{8}|17[678][0-9]{8}|18[0-9]{9}|14[57][0-9]{8}", message = "手机格式错误")
    private String phone;

    @ApiModelProperty(value = "真实姓名")
    private String name;


    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    @Override
    public String getUrl() {
        return "/api/user/add";
    }

    @Override
    public Map<String, Object> getParameters() {
        Map<String, Object> map = new HashMap<>();
        map.put("phone",this.phone);
        map.put("name",this.name);
        return map;
    }

    @Override
    public Class<RestResponse> responseClass() {
        return RestResponse.class;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
