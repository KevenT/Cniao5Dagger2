package com.cniao5.cniao5dagger2.ano;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Ivan on 2016/12/1.
 */



@Qualifier
@Documented
@Retention(RUNTIME)
public @interface Release {
}
