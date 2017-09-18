package com.example.demo.common.enums;

/**
 * Created by caijiamu on 2017/9/11.
 */
public enum PayType {
    NotPay(0, ""),
    WXPay(1, "微信支付"),
    AliPay(2, "支付宝");

    private int value;
    private String desc;

    PayType(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String descOf(int value) {
        switch (value) {
            case 1:
                return PayType.WXPay.desc;
            case 2:
                return PayType.AliPay.desc;
            default:
                return "未知支付方式";
        }
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
