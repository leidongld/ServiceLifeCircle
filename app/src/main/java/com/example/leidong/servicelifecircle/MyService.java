package com.example.leidong.servicelifecircle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by leido on 2016/12/11.
 */

public class MyService extends Service{
    private static final String TAG = "MyService";

    @Override
    public void onCreate(){
        super.onCreate();
        Log.i(TAG, "MyService --->>> onCreate");
    }

    //onStartCommand方法中链接网络获取数据，关闭service服务
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // TODO Auto-generated method stub
        Log.i(TAG, "MyService --->>> onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG, "MyService --->>> onBind");
        return null;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "MyService --->>> onDestroy");
    }
}
