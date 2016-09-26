package pl.dawidfiruzek.dagger2mvpexample.ui.main;

import android.support.annotation.NonNull;

import pl.dawidfiruzek.dagger2mvpexample.data.InjectedClass;
import timber.log.Timber;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
public class MainPresenter implements MainContract.Presenter {

    private final InjectedClass injectedClass;

    private MainContract.View view;
    private MainContract.Router router;

    public MainPresenter(InjectedClass injectedClass) {
        this.injectedClass = injectedClass;
    }

    @Override
    public void setView(@NonNull MainContract.View view) {
        this.view = view;
    }

    @Override
    public void setRouter(@NonNull MainContract.Router router) {
        this.router = router;
    }

    @Override
    public void clear() {
        view = null;
        router = null;
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
