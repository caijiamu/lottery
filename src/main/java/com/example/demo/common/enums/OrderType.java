package com.example.demo.common.enums;

import com.example.demo.common.exceptions.EnumsTypeNotExistExceptions;

import static com.example.demo.common.ErrorCode.ENUMS_TYPE_NOTEXIT;

/**
 * Created by caijiamu on 2017/9/8.
 */
public enum OrderType {
    payFalse(0, "未付款"),
    paySuccess(1, "付款成功");

    private int value;
    private String desc;

    OrderType(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static String descOf(int value) {
        switch (value) {
            case 0:
                return OrderType.payFalse.desc;
            case 1:
                return OrderType.paySuccess.desc;
            default:
                throw new EnumsTypeNotExistExceptions(ENUMS_TYPE_NOTEXIT, "OrderType", value);
        }
    }


    public int getValue() {
        return value;
    }


    public String getDesc() {
        return desc;
    }

}
