package com.rzice.lynley.messageauthentication;

import android.app.Application;

import cn.smssdk.SMSSDK;

/**
 * 作者： XMZ on 2017/3/22 21:02.
 * 邮箱：Lynley1207@163.com
 */

public class Appcontext  extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        SMSSDK.initSDK(this, "1c56771fd1e2b", "816656c06e4db55eb9854e92b0811918");
    }
}
