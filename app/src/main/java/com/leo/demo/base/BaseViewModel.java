package com.leo.demo.base;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

/**
 * @author Leo.ZhangTJ
 * @time 2020/8/24
 * @function
 * @describe
 */
public class BaseViewModel extends ViewModel implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy() {

    }
}
