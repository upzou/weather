package com.upzou.weather.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zzs on 2017/6/28
 */


public class HttpUtil {

    /**
     * 用OKhttp3框架请求网络
     * @param address 请求地址
     * @param callback 结果回调
     */
    public static void sendOKHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
