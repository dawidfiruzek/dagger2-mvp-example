package pl.dawidfiruzek.dagger2mvpexample.main.injection;

import javax.inject.Singleton;

import dagger.Component;
import pl.dawidfiruzek.dagger2mvpexample.common.injection.AppComponent;
import pl.dawidfiruzek.dagger2mvpexample.main.MainActivity;

/**
 * Created by Dawid Firuzek on 12.08.16.
 */
@Singleton
@Component(
        dependencies = AppComponent.class,
        modules = MainModule.class
)
public interface MainComponent {

    void inject(MainActivity activity);
}
