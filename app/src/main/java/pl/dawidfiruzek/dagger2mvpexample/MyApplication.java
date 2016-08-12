package pl.dawidfiruzek.dagger2mvpexample;

import android.app.Application;
import android.content.SharedPreferences;

import javax.inject.Inject;

import pl.dawidfiruzek.dagger2mvpexample.injection.component.AppComponent;
import pl.dawidfiruzek.dagger2mvpexample.injection.component.DaggerAppComponent;
import pl.dawidfiruzek.dagger2mvpexample.main.injection.component.DaggerMainComponent;
import pl.dawidfiruzek.dagger2mvpexample.main.injection.component.MainComponent;
import pl.dawidfiruzek.dagger2mvpexample.injection.module.AppModule;
import pl.dawidfiruzek.dagger2mvpexample.main.injection.module.MainModule;
import timber.log.Timber;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
public class MyApplication extends Application {

    private AppComponent appComponent;
    private MainComponent mainComponent;

    @Inject
    SharedPreferences preferences;

    @Override
    public void onCreate() {
        super.onCreate();

        initTimber();

        // TODO create components factory
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        mainComponent = DaggerMainComponent.builder()
                .appComponent(appComponent)
                .mainModule(new MainModule())
                .build();
    }

    private void initTimber() {
        if(BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public MainComponent getMainComponent() {
        return mainComponent;
    }

}
