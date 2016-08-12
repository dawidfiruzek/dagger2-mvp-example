package pl.dawidfiruzek.dagger2mvpexample.injection.component;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import pl.dawidfiruzek.dagger2mvpexample.MyApplication;
import pl.dawidfiruzek.dagger2mvpexample.injection.module.AppModule;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    // AppModule
    MyApplication myApp();
    SharedPreferences sharedPrefs();
}
