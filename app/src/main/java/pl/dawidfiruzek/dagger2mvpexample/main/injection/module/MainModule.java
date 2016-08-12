package pl.dawidfiruzek.dagger2mvpexample.main.injection.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import pl.dawidfiruzek.dagger2mvpexample.common.injection.scope.RuntimeScope;
import pl.dawidfiruzek.dagger2mvpexample.main.InjectedClass;
import pl.dawidfiruzek.dagger2mvpexample.main.InjectedInnerClass;

/**
 * Created by Dawid Firuzek on 12.08.16.
 */
@Module
public class MainModule {

    @RuntimeScope
    @Provides
    InjectedInnerClass provideTestClass(Context appContext) {
        return new InjectedInnerClass(appContext);
    }

    @RuntimeScope
    @Provides
    InjectedClass provideTest2(InjectedInnerClass injectedInnerClass) {
        return new InjectedClass(injectedInnerClass);
    }
}
