package pl.dawidfiruzek.dagger2mvpexample.injection.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by dawidfiruzek on 12.08.16.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface RuntimeScope {
}
