package com.cniao5.cniao5dagger2.category;

import android.util.Log;

import java.util.List;

import okhttp3.OkHttpClient;

/**
 * Created by Ivan on 2016/12/5.
 */

public class ApiService {


    private OkHttpClient mOkHttpClient;

    public ApiService(OkHttpClient client){

        this.mOkHttpClient = client;

    }


    public List<?> getCategories(){

        Log.d("ApiService-Category" ,mOkHttpClient+"");

        return  null;
    }
}
