package com.cniao5.cniao5dagger2.user;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Ivan on 2016/12/1.
 */

public class User {

    private int id;
    private String name;


    public User(){

        Log.d("User","user----");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
