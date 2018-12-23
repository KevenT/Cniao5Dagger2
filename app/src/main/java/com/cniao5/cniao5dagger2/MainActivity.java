package com.cniao5.cniao5dagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cniao5.cniao5dagger2.user.User;
import com.cniao5.cniao5dagger2.user.UserManger;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {






    @Inject User mUser;

    @Inject
    UserManger userManger;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerUserComponet.builder().userModule(new UserModule())
//                .appComponent(((MyApplication)getApplication()).getAppComponent())
//                .build()
//                .inject(this);


        userManger.register();

//userManger.login ();
        startActivity(new Intent(this,LoginActivity.class));




    }


}
