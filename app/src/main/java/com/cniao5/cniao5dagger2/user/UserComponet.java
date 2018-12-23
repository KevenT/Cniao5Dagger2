package com.cniao5.cniao5dagger2.user;

import com.cniao5.cniao5dagger2.AppComponent;
import com.cniao5.cniao5dagger2.MainActivity;
import com.cniao5.cniao5dagger2.ano.ActivityScope;

import dagger.Component;

/**
 * Created by Ivan on 2016/12/1.
 */

@ActivityScope
@Component(modules = {UserModule.class},dependencies = AppComponent.class)
public interface UserComponet {

    void inject(MainActivity activity);


}
