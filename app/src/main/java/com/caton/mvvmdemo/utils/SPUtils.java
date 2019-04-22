package com.caton.mvvmdemo.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.caton.mvvmdemo.app.MyApplication;

/**
 * Created by saisai on 2019/4/22 0022.
 */

public class SPUtils {
    MyApplication application;
    private SPUtils(MyApplication application){
        this.application=application;
    }

    private static SPUtils instance=null;

    public static SPUtils getInstance(){
        if(instance==null){
            synchronized (SPUtils.class){
                if(instance==null){
                    instance=new SPUtils(MyApplication.app);
                }
            }
        }
        return instance;
    }

    public String getString(String key) {
        return MyApplication.app.getSharedPreferences("config", Context.MODE_PRIVATE).getString(key, "");
    }

    public int getInt(String key) {
        return MyApplication.app.getSharedPreferences("config", Context.MODE_PRIVATE).getInt(key, 0);
    }

    public long getLong(String key) {
        return MyApplication.app.getSharedPreferences("config", Context.MODE_PRIVATE).getLong(key, 0);
    }

    public boolean getBoolean(String key) {
        return MyApplication.app.getSharedPreferences("config", Context.MODE_PRIVATE).getBoolean(key, false);
    }

    public float getFloat(String key) {
        return MyApplication.app.getSharedPreferences("config", Context.MODE_PRIVATE).getFloat(key, 0);
    }

    public void put(String key, Object value) {
        SharedPreferences.Editor config = MyApplication.app.getSharedPreferences("config", Context.MODE_PRIVATE).edit();

        if (value instanceof String) {
            config.putString(key, (String) value).commit();
        } else if (value instanceof Integer) {
            config.putInt(key, (Integer) value).commit();
        } else if (value instanceof Long) {
            config.putLong(key, (Long) value).commit();
        } else if (value instanceof Boolean) {
            config.putBoolean(key, (Boolean) value).commit();
        } else if (value instanceof Float) {
            config.putFloat(key, (Float) value).commit();
        }
    }
}
