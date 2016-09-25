package pl.dawidfiruzek.dagger2mvpexample.ui.main.injection;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pl.dawidfiruzek.dagger2mvpexample.ui.main.MainContract;
import pl.dawidfiruzek.dagger2mvpexample.ui.main.MainPresenter;
import pl.dawidfiruzek.dagger2mvpexample.data.InjectedClass;
import pl.dawidfiruzek.dagger2mvpexample.data.InjectedInnerClass;

/**
 * Created by Dawid Firuzek on 12.08.16.
 */
@Module
public class MainModule {

    @Provides
    InjectedInnerClass provideInjectedInnerClass(Context appContext) {
        return new InjectedInnerClass(appContext);
    }

    @Provides
    InjectedClass provideInjectedClass(InjectedInnerClass injectedInnerClass) {
        return new InjectedClass(injectedInnerClass);
    }

    @Provides
    MainContract.Presenter providePresenter(InjectedClass injectedClass) {
        return new MainPresenter(injectedClass);
    }
}
