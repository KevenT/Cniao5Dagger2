package com.cniao5.cniao5dagger2;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;

/**
 * Created by Ivan on 2016/12/7.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {


    OkHttpClient okhttpclient();

}
