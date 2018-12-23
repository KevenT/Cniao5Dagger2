package com.cniao5.cniao5dagger2.ano;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Ivan on 2016/12/7.
 */


@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {
}
