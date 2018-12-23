package com.cniao5.cniao5dagger2;

import com.cniao5.cniao5dagger2.ano.ActivityScope;

import dagger.Subcomponent;

/**
 * Created by Ivan on 2016/12/7.
 */

@ActivityScope
@Subcomponent(modules = UtilModule.class)
public interface CComponet {


    void inject(SubComponetAcivity activity);

}
