package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by caijiamu on 2017/9/8.
 */
@Entity
public class Orders extends BaseDomain {
    private String orderNo;
    private double amount;
    private String payTime;
    private long userId;
    private int orderState;

    private int lotteryType;
    private String redBall;//红球
    private String blueBall;//篮球
    private int unit; //个位
    private int tens; //十位
    private int hundred;  //百位
    private int thousand;  //千位
    private int tenThousand;  //万位
    private int multiple;//倍数

    private boolean winLottery; //是否中奖
    private double winAmount; //中奖金额
    private int grade; //等级
    @Column(columnDefinition = "bit default true")//设置默认值
    private boolean isShow; //是否显示

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


    public String getRedBall() {
        return redBall;
    }

    public void setRedBall(String redBall) {
        this.redBall = redBall;
    }

    public String getBlueBall() {
        return blueBall;
    }

    public void setBlueBall(String blueBall) {
        this.blueBall = blueBall;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getTens() {
        return tens;
    }

    public void setTens(int tens) {
        this.tens = tens;
    }

    public int getHundred() {
        return hundred;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
    }

    public int getThousand() {
        return thousand;
    }

    public void setThousand(int thousand) {
        this.thousand = thousand;
    }

    public int getTenThousand() {
        return tenThousand;
    }

    public void setTenThousand(int tenThousand) {
        this.tenThousand = tenThousand;
    }

    public boolean isWinLottery() {
        return winLottery;
    }

    public void setWinLottery(boolean winLottery) {
        this.winLottery = winLottery;
    }

    public double getWinAmount() {
        return winAmount;
    }

    public void setWinAmount(double winAmount) {
        this.winAmount = winAmount;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public int getLotteryType() {
        return lotteryType;
    }

    public void setLotteryType(int lotteryType) {
        this.lotteryType = lotteryType;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    public int getMultiple() {
        return multiple;
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }
}
