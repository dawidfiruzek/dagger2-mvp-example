package pl.dawidfiruzek.dagger2mvpexample.main;

import android.content.Context;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by dawidfiruzek on 12.08.16.
 */
public class TestClass {

    Context appContext;

    public TestClass(Context appContext) {
        this.appContext = appContext;
    }

    public void test() {
        Timber.e(appContext == null ? "null" : "notnull");
    }
}
