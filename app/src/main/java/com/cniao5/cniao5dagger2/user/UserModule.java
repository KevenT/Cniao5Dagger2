package com.cniao5.cniao5dagger2.user;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by Ivan on 2016/12/1.
 */

@Module
public class UserModule {



//    private  Context mContext;
//    public UserModule(Context context){
//
//        this.mContext = context;
//
//    }





    @Provides
    public ApiService provideApiService(OkHttpClient client){



        ApiService apiService =   new ApiService(client);

        return  apiService;

    }

    @Provides
    public UserManger provideUserManger(ApiService apiService){

        return  new UserManger(apiService);
    }

}
