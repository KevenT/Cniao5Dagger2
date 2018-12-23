package com.cniao5.cniao5dagger2.user;

import android.util.Log;

/**
 * Created by Ivan on 2016/12/1.
 */

public class UserManger {


    private ApiService mApiService;



    public UserManger( ApiService apiService){

        mApiService = apiService;


    }





    public void login(){
        Log.d("UserManger","Login");

        mApiService.login();
    }


    public void  register(){


        Log.d("UserManger","register----");



        /// other working

        mApiService.register();
//        mUserStore.register();
    }
}
