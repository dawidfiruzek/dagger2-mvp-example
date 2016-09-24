package pl.dawidfiruzek.dagger2mvpexample.util.injection;

import android.content.Context;
import android.content.SharedPreferences;

import dagger.Component;
import pl.dawidfiruzek.dagger2mvpexample.MyApplication;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
@Component(modules = AppModule.class)
public interface AppComponent {

    // AppModule
    MyApplication myApp();
    Context appContext();
    SharedPreferences sharedPrefs();
}
