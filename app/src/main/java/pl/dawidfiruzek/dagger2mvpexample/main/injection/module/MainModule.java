package pl.dawidfiruzek.dagger2mvpexample.main.injection.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pl.dawidfiruzek.dagger2mvpexample.injection.scope.RuntimeScope;
import pl.dawidfiruzek.dagger2mvpexample.main.MainPresenter;
import pl.dawidfiruzek.dagger2mvpexample.main.MainView;
import pl.dawidfiruzek.dagger2mvpexample.main.Test2;
import pl.dawidfiruzek.dagger2mvpexample.main.TestClass;

/**
 * Created by dawidfiruzek on 12.08.16.
 */
@Module
public class MainModule {

    @RuntimeScope
    @Provides
    TestClass provideTestClass(Context appContext) {
        return new TestClass(appContext);
    }

    @RuntimeScope
    @Provides
    Test2 provideTest2(TestClass testClass) {
        return new Test2(testClass);
    }
}
