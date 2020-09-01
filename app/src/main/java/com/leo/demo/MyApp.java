package com.leo.demo;

import android.app.Application;
import android.util.Log;

/**
 * @author Leo.ZhangTJ
 * @time 2020/8/24
 * @function
 * @describe
 */
public class MyApp extends Application {

    public static final String TAG = "aaaaaaaaaaaa";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "Application onCreate");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.i(TAG, "Application onTerminate");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.i(TAG, "Application onLowMemory");
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Log.i(TAG, "Application onTrimMemory");
    }
}
