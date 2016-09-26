package pl.dawidfiruzek.dagger2mvpexample.util.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Dawid Firuzek on 26.09.2016.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface RuntimeScope {
}
