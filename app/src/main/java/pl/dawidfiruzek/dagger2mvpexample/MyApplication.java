package pl.dawidfiruzek.dagger2mvpexample;

import android.app.Application;

import lombok.Getter;

import pl.dawidfiruzek.dagger2mvpexample.util.injection.app.AppComponent;
import pl.dawidfiruzek.dagger2mvpexample.util.injection.app.AppModule;
import pl.dawidfiruzek.dagger2mvpexample.util.injection.app.DaggerAppComponent;
import timber.log.Timber;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
public class MyApplication extends Application {

    private @Getter AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        init();
    }

    private void init() {
        initTimber();
        initDagger();
    }

    private void initTimber() {
        if(BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    private void initDagger() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}
