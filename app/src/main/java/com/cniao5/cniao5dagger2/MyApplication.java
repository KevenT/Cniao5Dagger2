package com.cniao5.cniao5dagger2;

import android.app.Application;

/**
 * Created by Ivan on 2016/12/7.
 */

public class MyApplication extends Application {



    private  AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent=DaggerAppComponent.create();
    }

    public  AppComponent getAppComponent(){
        return  mAppComponent;
    }
}
