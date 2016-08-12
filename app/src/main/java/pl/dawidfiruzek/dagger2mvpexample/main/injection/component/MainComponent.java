package pl.dawidfiruzek.dagger2mvpexample.main.injection.component;

import dagger.Component;
import pl.dawidfiruzek.dagger2mvpexample.injection.component.AppComponent;
import pl.dawidfiruzek.dagger2mvpexample.injection.scope.RuntimeScope;
import pl.dawidfiruzek.dagger2mvpexample.main.MainActivity;
import pl.dawidfiruzek.dagger2mvpexample.main.injection.module.MainModule;

/**
 * Created by dawidfiruzek on 12.08.16.
 */
@RuntimeScope
@Component(
        dependencies = AppComponent.class,
        modules = MainModule.class
)
public interface MainComponent {
    void inject(MainActivity activity);
}
