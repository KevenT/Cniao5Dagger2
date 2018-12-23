package com.cniao5.cniao5dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by Ivan on 2016/12/7.
 */


@Module
public class AppModule {


    @Singleton
    @Provides
    OkHttpClient provideOkHttp(){

        return  new OkHttpClient().newBuilder().build();
    }



}
