package com.caton.mvvmdemo.app;

import android.app.Application;

/**
 * Created by saisai on 2019/4/22 0022.
 */

public class MyApplication extends Application {
    public static MyApplication app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
