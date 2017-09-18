package com.example.demo.common;

import cn.jiguang.common.ClientConfig;
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.common.FinalStateConfig.JPAppKey;
import static com.example.demo.common.FinalStateConfig.jPMasterSecret;

/**
 * Created by caijiamu on 2017/9/13.
 */
public class JPush {

    /**
     *   给所以人发送消息
     */
    public static void jPushAllUser(String message) {
        JPushClient jpushClient = new JPushClient(jPMasterSecret, JPAppKey, null, ClientConfig.getInstance());

        Map<String, String> extras  = new HashMap<String, String>();
        extras.put("extMessage","额外通知");
        PushPayload payload = buildPushObject_all_alias_alert(message,extras);

        try {
            PushResult result = jpushClient.sendPush(payload);
            System.out.print("Got result - " + result);

        } catch (APIConnectionException e) {
            // Connection error, should retry later
            System.out.print("Connection error, should retry later");

        } catch (APIRequestException e) {
            // Should review the error, and fix the request
            System.out.print("Should review the error, and fix the request");
            System.out.print("HTTP Status: " + e.getStatus());
            System.out.print("Error Code: " + e.getErrorCode());
            System.out.print("Error Message: " + e.getErrorMessage());
        }
    }

    private static PushPayload buildPushObject_all_alias_alert(String message,
                                                               Map<String, String> extras)
    {
        return PushPayload.newBuilder()
                .setPlatform(Platform.all())
                // 设置平台
                .setAudience(Audience.all())
                // 按什么发送 tag alia
                .setNotification(
                        Notification
                                .newBuilder()
                                .setAlert(message)
                                .addPlatformNotification(
                                        AndroidNotification.newBuilder().addExtras(extras).build())
                                .addPlatformNotification(
                                        IosNotification.newBuilder().addExtras(extras).build())
                                .build())
                // 发送消息
                .setOptions(Options.newBuilder().setApnsProduction(true).build()).build();
        //设置ios平台环境  True 表示推送生产环境，False 表示要推送开发环境   默认是开发
    }
}
