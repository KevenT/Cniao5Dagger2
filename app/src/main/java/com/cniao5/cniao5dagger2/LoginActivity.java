package com.cniao5.cniao5dagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.cniao5.cniao5dagger2.user.UserManger;
import com.cniao5.cniao5dagger2.user.UserModule;

import javax.inject.Inject;

/**
 * Created by Ivan on 2016/12/7.
 */

public class LoginActivity extends AppCompatActivity {




    @Inject
    UserManger userManger;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        DaggerLoginComponet.builder().userModule(new UserModule(LoginActivity.this))
                .appComponent(((MyApplication)getApplication()).getAppComponent())
                .build()
                .inject(this);



        userManger.login();


    }


}
