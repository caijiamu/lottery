package com.example.demo.dto;

import cn.cloudtop.common.api.basic.RestResponse;
import com.example.demo.dto.vo.OrderVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by caijiamu on 2017/9/11.
 */

@ApiModel(description = "订单详情response")
public class OrderDetailResponse extends RestResponse{
    private OrderVo orderVo;

    public OrderVo getOrderVo() {
        return orderVo;
    }

    public void setOrderVo(OrderVo orderVo) {
        this.orderVo = orderVo;
    }

    public OrderDetailResponse() {
    }

    public OrderDetailResponse(int errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }
}
