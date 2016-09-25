package pl.dawidfiruzek.dagger2mvpexample.ui.main;

import pl.dawidfiruzek.dagger2mvpexample.data.InjectedClass;
import timber.log.Timber;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
public class MainPresenter implements MainContract.Presenter {

    private final InjectedClass injectedClass;

    private MainContract.View view;

    public MainPresenter(InjectedClass injectedClass) {
        this.injectedClass = injectedClass;
    }

    @Override
    public void setView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void clear() {
        view = null;
    }

    @Override
    public void test() {
        Timber.d("test called in MainPresenter");
        injectedClass.test();

        if(view != null) {
            view.callbackMethod();
        }
    }
}
