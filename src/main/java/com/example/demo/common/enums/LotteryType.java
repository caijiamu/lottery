package com.example.demo.common.enums;

import cn.cloudtop.common.api.basic.RestException;
import com.example.demo.Lottery3d;
import com.example.demo.common.exceptions.EnumsTypeNotExistExceptions;

import static com.example.demo.common.ErrorCode.ENUMS_TYPE_NOTEXIT;

/**
 * Created by caijiamu on 2017/9/8.
 */
public enum LotteryType {
    SixLottery(0, "六合"),
    DoubleBall(1,"双色");

    private int value;
    private String desc;

    LotteryType(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static String descOf(int value) {
        switch (value){
            case 0:
                return LotteryType.SixLottery.desc;
            case 1:
                return LotteryType.DoubleBall.desc;
                default:
                    throw new EnumsTypeNotExistExceptions(ENUMS_TYPE_NOTEXIT,"LotteryType",value);
        }
    }

    public int getValue() {
        return value;
    }


    public String getDesc() {
        return desc;
    }


}
