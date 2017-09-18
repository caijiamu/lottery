package com.example.demo.common.enums;

/**
 * Created by caijiamu on 2017/9/11.
 */
public enum RechargeState {
    RechargeFalse(0, "未付款"),
    RechargeSuccess(1, "付款成功");

    private int value;
    private String desc;

    RechargeState(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String descOf(int value) {
        switch (value) {
            case 0:
                return RechargeState.RechargeFalse.desc;
            case 1:
                return RechargeState.RechargeSuccess.desc;
            default:
                return "未知状态";
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
