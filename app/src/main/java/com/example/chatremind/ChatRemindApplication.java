package com.example.chatremind;

import android.app.Application;

public class ChatRemindApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SPUtils.init(this);
    }
}
