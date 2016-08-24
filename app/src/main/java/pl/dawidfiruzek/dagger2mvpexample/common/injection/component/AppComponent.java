package pl.dawidfiruzek.dagger2mvpexample.common.injection.component;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import pl.dawidfiruzek.dagger2mvpexample.MyApplication;
import pl.dawidfiruzek.dagger2mvpexample.common.injection.module.AppModule;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    // AppModule
    MyApplication myApp();
    Context appContext();
    SharedPreferences sharedPrefs();
}
