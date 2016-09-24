package pl.dawidfiruzek.dagger2mvpexample.main;

import javax.inject.Inject;

import lombok.Setter;
import pl.dawidfiruzek.dagger2mvpexample.main.model.InjectedClass;
import timber.log.Timber;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
public class MainPresenter {

    InjectedClass injectedClass;

    private @Setter MainView view;

    public MainPresenter(InjectedClass injectedClass) {
        this.injectedClass = injectedClass;
    }

    public void test() {
        Timber.d("test called");
        injectedClass.test();
    }
}
