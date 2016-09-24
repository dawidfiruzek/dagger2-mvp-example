package pl.dawidfiruzek.dagger2mvpexample;

import android.app.Application;

import lombok.Getter;

import pl.dawidfiruzek.dagger2mvpexample.ui.main.injection.DaggerMainComponent;
import pl.dawidfiruzek.dagger2mvpexample.ui.main.injection.MainComponent;
import pl.dawidfiruzek.dagger2mvpexample.ui.main.injection.MainModule;
import pl.dawidfiruzek.dagger2mvpexample.util.injection.AppComponent;
import pl.dawidfiruzek.dagger2mvpexample.util.injection.AppModule;
import pl.dawidfiruzek.dagger2mvpexample.util.injection.DaggerAppComponent;
import timber.log.Timber;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
public class MyApplication extends Application {

    private @Getter AppComponent appComponent;
    private @Getter MainComponent mainComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        init();
    }

    private void init() {
        initTimber();
        initComponents();
    }

    private void initTimber() {
        if(BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    private void initComponents() {
        // TODO create components factory
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        mainComponent = DaggerMainComponent.builder()
                .appComponent(appComponent)
                .mainModule(new MainModule())
                .build();
    }
}
