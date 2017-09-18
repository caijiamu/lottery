package com.example.demo.domain;

import javax.persistence.Entity;

/**
 * 用户充值
 * Created by caijiamu on 2017/9/11.
 */
@Entity
public class UserRecharge extends BaseDomain {
     private long userId;
     private String orderNo;
     private double price;
     private int payType;
     private int rechargeState;
     private int payTime;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public int getRechargeState() {
        return rechargeState;
    }

    public void setRechargeState(int rechargeState) {
        this.rechargeState = rechargeState;
    }

    public int getPayTime() {
        return payTime;
    }

    public void setPayTime(int payTime) {
        this.payTime = payTime;
    }
}
