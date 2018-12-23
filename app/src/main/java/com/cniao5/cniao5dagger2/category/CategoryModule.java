package com.cniao5.cniao5dagger2.category;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by Ivan on 2016/12/5.
 */

@Module
public class CategoryModule {




    @Provides
    public   ApiService provideApiService(OkHttpClient client){

        return  new ApiService(client);
    }

    @Provides
    public  CategoryManager provideCategoryManager(ApiService apiService){

        return  new CategoryManager(apiService);
    }



}
