package com.example.demo.common.exceptions;

import cn.cloudtop.common.api.basic.RestException;

/**
 * Created by caijiamu on 2017/9/8.
 */
public class EnumsTypeNotExistExceptions extends RestException {
    public EnumsTypeNotExistExceptions(int code, String className, int value) {
        super(code, "枚举参数不存在", String.format("枚举%s不存在该值%d", className, value));
    }
}
