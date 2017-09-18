package com.example.demo.controller;

import cn.cloudtop.common.api.basic.RestResponse;
import com.example.demo.dto.CreateOrderRequest;
import com.example.demo.dto.OrderDetailResponse;
import com.example.demo.service.OrderService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by caijiamu on 2017/9/8.
 */
@RestController
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "创建订单", response = RestResponse.class)
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public RestResponse createOrder(@RequestBody CreateOrderRequest createOrderRequest) {
        return orderService.createOrder(createOrderRequest);
    }

    @ApiOperation(value = "订单详情",response = OrderDetailResponse.class)
    @RequestMapping(value = "/detail/{orderId}",method = RequestMethod.GET)
    public OrderDetailResponse detail(@PathVariable long orderId) {
           return orderService.orderDetail(orderId);
    }
    
}
