package com.example.chatremind;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.i("yzl", "收到开机广播");
        if (AccessibilityUtil.isSettingOpen(AccService.class, context)) {
            Log.i("yzl", "收到开机广播时辅助服务已经开启了");
        } else {
            Log.w("yzl", "收到开机广播时辅助服务未开启");
//            AccessibilityUtil.jumpToSetting(context);
            Intent intent2 = new Intent(context, MainActivity.class);
            intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent2);
        }
    }
}
