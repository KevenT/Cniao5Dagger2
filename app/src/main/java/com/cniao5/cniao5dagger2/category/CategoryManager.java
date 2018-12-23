package com.cniao5.cniao5dagger2.category;

import android.util.Log;

import javax.inject.Inject;


/**
 * Created by Ivan on 2016/12/5.
 */

public class CategoryManager {


    private   ApiService  mApiService;
    public CategoryManager(ApiService apiService){

        this.mApiService = apiService;

    }


    public void  getCategoies(){


        mApiService.getCategories();

    }
}
