package pl.dawidfiruzek.dagger2mvpexample.main.injection.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pl.dawidfiruzek.dagger2mvpexample.main.MainPresenter;
import pl.dawidfiruzek.dagger2mvpexample.main.model.InjectedClass;
import pl.dawidfiruzek.dagger2mvpexample.main.model.InjectedInnerClass;

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

    @Singleton
    @Provides
    MainPresenter providePresenter(InjectedClass injectedClass) {
        return new MainPresenter(injectedClass);
    }
}
