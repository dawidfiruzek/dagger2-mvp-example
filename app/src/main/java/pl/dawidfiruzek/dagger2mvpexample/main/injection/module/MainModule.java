package pl.dawidfiruzek.dagger2mvpexample.main.injection.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import pl.dawidfiruzek.dagger2mvpexample.common.injection.scope.RuntimeScope;
import pl.dawidfiruzek.dagger2mvpexample.main.MainPresenter;
import pl.dawidfiruzek.dagger2mvpexample.main.model.InjectedClass;
import pl.dawidfiruzek.dagger2mvpexample.main.model.InjectedInnerClass;

/**
 * Created by Dawid Firuzek on 12.08.16.
 */
@Module
public class MainModule {

    @RuntimeScope
    @Provides
    InjectedInnerClass provideInjectedInnerClass(Context appContext) {
        return new InjectedInnerClass(appContext);
    }

    @RuntimeScope
    @Provides
    InjectedClass provideInjectedClass(InjectedInnerClass injectedInnerClass) {
        return new InjectedClass(injectedInnerClass);
    }

    @RuntimeScope
    @Provides
    MainPresenter providePresenter(InjectedClass injectedClass) {
        return new MainPresenter(injectedClass);
    }
}
