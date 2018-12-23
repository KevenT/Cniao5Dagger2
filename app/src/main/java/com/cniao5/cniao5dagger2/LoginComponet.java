package com.cniao5.cniao5dagger2;

import com.cniao5.cniao5dagger2.ano.ActivityScope;
import com.cniao5.cniao5dagger2.user.UserModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ivan on 2016/12/7.
 */


@ActivityScope
@Component(modules = UserModule.class,dependencies = AppComponent.class)
public interface LoginComponet {



    void inject(LoginActivity activity);

}
