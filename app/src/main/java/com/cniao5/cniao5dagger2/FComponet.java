package com.cniao5.cniao5dagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ivan on 2016/12/7.
 */

@Singleton
@Component(modules = AppModule.class)
public interface FComponet {



    CComponet getChildCompnet();
}
