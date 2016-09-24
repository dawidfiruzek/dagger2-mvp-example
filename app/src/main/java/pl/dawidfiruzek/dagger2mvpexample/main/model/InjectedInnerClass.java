package pl.dawidfiruzek.dagger2mvpexample.main.model;

import android.content.Context;

import timber.log.Timber;

/**
 * Created by Dawid Firuzek on 12.08.16.
 */
public class InjectedInnerClass {

    private final Context appContext;

    public InjectedInnerClass(Context appContext) {
        this.appContext = appContext;
    }

    public void test() {
        Timber.d("test called in InjectedInnerClass");
        Timber.d(appContext == null ? "app context is null" : "app context is not null");
    }
}
