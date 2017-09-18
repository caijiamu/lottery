package com.example.demo.common.enums;

/**
 * Created by caijiamu on 2017/9/11.
 */
public enum CashState {
    CashStateNo(0, "未知状态"),
    CashStateFalse(1, "提现失败"),
    CashStateSuccess(2, "提现成功");

    private int value;
    private String desc;

    CashState(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String descOf(int value) {
        switch (value) {
            case 0:
                return CashState.CashStateNo.desc;
            case 1:
                return CashState.CashStateFalse.desc;
            case 2:
                return CashState.CashStateSuccess.desc;
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
