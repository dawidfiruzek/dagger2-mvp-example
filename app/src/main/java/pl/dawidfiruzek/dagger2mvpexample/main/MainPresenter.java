package pl.dawidfiruzek.dagger2mvpexample.main;

import javax.inject.Inject;

import lombok.Setter;
import pl.dawidfiruzek.dagger2mvpexample.main.model.InjectedClass;
import timber.log.Timber;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
public class MainPresenter {

    @Inject
    InjectedClass injectedClass;

    private @Setter MainView view;

    @Inject
    public MainPresenter() {
    }

    public void test() {
        Timber.d("test called");
        injectedClass.test();
    }
}
