package pl.dawidfiruzek.dagger2mvpexample.dagger.component;

import javax.inject.Inject;

import dagger.Component;
import pl.dawidfiruzek.dagger2mvpexample.main.MainActivity;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
@Component
public interface AppComponent {
    void inject(MainActivity activity);
}
