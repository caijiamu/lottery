package com.example.demo.dto;

import cn.cloudtop.common.api.basic.HttpMethod;
import cn.cloudtop.common.api.basic.RestRequest;
import cn.cloudtop.common.api.basic.RestResponse;
import com.example.demo.dto.vo.OrderVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.json.HTTP;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by caijiamu on 2017/9/8.
 */
@ApiModel(value = "下单request")
public class CreateOrderRequest implements RestRequest<RestResponse> {

    @ApiModelProperty(value = "类型，0：六合，1：双色")
    private int lotteryType;
    @ApiModelProperty(value = "红球")
    private String redBall;
    @ApiModelProperty(value = "篮球")
    private String blueBall;
    @ApiModelProperty(value = "个位")
    private int unit;
    @ApiModelProperty(value = "十位")
    private int tens;
    @ApiModelProperty(value = "百位")
    private int hundred;
    @ApiModelProperty(value = "千位")
    private int thousand;
    @ApiModelProperty(value = "万位")
    private int tenThousand;

    private double amount;
    private double userId;

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    @Override
    public String getUrl() {
        return "api/order/create";
    }

    @Override
    public Map<String, Object> getParameters() {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        map.put("amount", amount);
        map.put("tenThousand", tenThousand);
        map.put("thousand", thousand);
        map.put("hundred", hundred);
        map.put("tens", tens);
        map.put("unit", unit);
        map.put("blueBall", blueBall);
        map.put("redBall", redBall);
        map.put("lotteryType", lotteryType);
        return map;
    }

    @Override
    public Class<RestResponse> responseClass() {
        return RestResponse.class;
    }

    public int getLotteryType() {
        return lotteryType;
    }

    public void setLotteryType(int lotteryType) {
        this.lotteryType = lotteryType;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getUserId() {
        return userId;
    }

    public void setUserId(double userId) {
        this.userId = userId;
    }
}
