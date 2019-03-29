package com.example.laman.common;

import android.app.Application;

import com.example.laman.BuildConfig;
import com.facebook.stetho.Stetho;
import com.lzy.okgo.OkGo;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class LaManApplication extends Application {


    private static LaManApplication appContext;

    public static LaManApplication getInstance() {
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
        initOkgo();
        initStetho();
        if (BuildConfig.DEBUG) {
            Logger.addLogAdapter(new AndroidLogAdapter());


        }
    }

    private void initStetho() {
        Stetho.initializeWithDefaults(this);
    }

    private void initOkgo() {
        OkGo.getInstance().init(this);
    }
}
