package com.example.demo.service;

import cn.cloudtop.common.api.basic.RestResponse;
import com.example.demo.common.utils.CommonUtils;
import com.example.demo.domain.Orders;
import com.example.demo.dto.CreateOrderRequest;
import com.example.demo.dto.OrderDetailResponse;
import com.example.demo.dto.vo.OrderVo;
import com.example.demo.responsitory.OrdersResponsitory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.example.demo.common.ErrorCode.NOT_EXIST;

/**
 * Created by caijiamu on 2017/9/8.
 */
@Service
public class OrderService {

    @Autowired
    private OrdersResponsitory ordersResponsitory;

    public RestResponse createOrder(CreateOrderRequest createOrderRequest) {
        Orders orders = new Orders();
        BeanUtils.copyProperties(createOrderRequest, orders);
        String orderNo = "O" + new SimpleDateFormat("MMddHHmmssSSS").format(new Date()) + CommonUtils.generateRandom(3, 1);
        orders.setOrderNo(orderNo);
        orders.setOrderState(0);
        orders.setShow(true);
        ordersResponsitory.save(orders);
        return new RestResponse();
    }


    public OrderDetailResponse orderDetail(long orderId) {
        Orders orders = ordersResponsitory.findOne(orderId);
        if (orders == null) {
            return new OrderDetailResponse(NOT_EXIST, "查无此订单");
        }
        OrderDetailResponse orderDetailResponse = new OrderDetailResponse();
        OrderVo orderVo = new  OrderVo();
        BeanUtils.copyProperties(orders,orderVo);
        orderDetailResponse.setOrderVo(orderVo);
        return orderDetailResponse;
    }
}
