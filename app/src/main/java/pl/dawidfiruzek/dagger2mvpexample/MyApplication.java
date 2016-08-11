package pl.dawidfiruzek.dagger2mvpexample;

import android.app.Application;

import pl.dawidfiruzek.dagger2mvpexample.dagger.component.AppComponent;
import pl.dawidfiruzek.dagger2mvpexample.dagger.component.DaggerAppComponent;
import pl.dawidfiruzek.dagger2mvpexample.dagger.module.AppModule;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
public class MyApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
