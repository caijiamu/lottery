package com.example.demo.domain;

import javax.persistence.Entity;

/**
 * 用户的提现
 * Created by caijiamu on 2017/9/11.
 */
@Entity

public class UserCash extends BaseDomain{
    private long userId;
    private double price;
    private int payType;
    private String cashNO;
    private int cashState;
    private String cashTime;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public String getCashNO() {
        return cashNO;
    }

    public void setCashNO(String cashNO) {
        this.cashNO = cashNO;
    }

    public int getCashState() {
        return cashState;
    }

    public void setCashState(int cashState) {
        this.cashState = cashState;
    }

    public String getCashTime() {
        return cashTime;
    }

    public void setCashTime(String cashTime) {
        this.cashTime = cashTime;
    }
}
