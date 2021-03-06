package pl.dawidfiruzek.dagger2mvpexample.util.injection.app;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import pl.dawidfiruzek.dagger2mvpexample.MyApplication;
import pl.dawidfiruzek.dagger2mvpexample.util.api.ApiServiceGenerator;
import pl.dawidfiruzek.dagger2mvpexample.util.injection.NetworkModule;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */

@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class
})
public interface AppComponent {

    // AppModule
    MyApplication myApp();
    Context appContext();
    SharedPreferences sharedPrefs();

    // NetworkModule
    ApiServiceGenerator apiServiceGenerator();
}
