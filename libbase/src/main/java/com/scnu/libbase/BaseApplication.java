package com.scnu.libbase;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by ChenZehao
 * on 2019/12/19
 */
public class BaseApplication extends Application {
    public static BaseApplication instance;

    private boolean isDebug = true;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        init();
    }

    private void init() {
        if (isDebug) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ARouter.getInstance().destroy();
    }
}
