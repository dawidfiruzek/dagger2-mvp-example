package pl.dawidfiruzek.dagger2mvpexample.injection.module;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pl.dawidfiruzek.dagger2mvpexample.MyApplication;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
@Module
public class AppModule {
    private MyApplication app;

    public AppModule(MyApplication app) {
        this.app = app;
    }

    @Singleton
    @Provides
    MyApplication provideApplication() {
        return app;
    }

    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences(MyApplication app) {
        return PreferenceManager.getDefaultSharedPreferences(app);
    }
}
