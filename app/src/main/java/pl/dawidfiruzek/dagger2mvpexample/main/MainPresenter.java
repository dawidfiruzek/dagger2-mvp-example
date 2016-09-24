package pl.dawidfiruzek.dagger2mvpexample.main;

import lombok.Setter;
import pl.dawidfiruzek.dagger2mvpexample.main.model.InjectedClass;
import timber.log.Timber;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
public class MainPresenter {

    private final InjectedClass injectedClass;

    private @Setter MainView view;

    public MainPresenter(InjectedClass injectedClass) {
        this.injectedClass = injectedClass;
    }

    public void test() {
        Timber.d("test called in MainPresenter");
        injectedClass.test();

        if(view != null) {
            view.callbackMethod();
        }
    }
}
