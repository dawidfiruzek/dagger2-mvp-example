package pl.dawidfiruzek.dagger2mvpexample.dagger.component;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import pl.dawidfiruzek.dagger2mvpexample.dagger.module.AppModule;
import pl.dawidfiruzek.dagger2mvpexample.main.MainActivity;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MainActivity activity);
}