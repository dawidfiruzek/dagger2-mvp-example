package pl.dawidfiruzek.dagger2mvpexample.util.injection.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

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

    @Provides
    MyApplication provideApplication() {
        return app;
    }

    @Provides
    Context provideApplicationContext() {
        return app.getApplicationContext();
    }

    @Provides
    SharedPreferences provideSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(app);
    }
}
