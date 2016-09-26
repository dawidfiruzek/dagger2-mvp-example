package pl.dawidfiruzek.dagger2mvpexample.ui.main;

import pl.dawidfiruzek.dagger2mvpexample.data.InjectedClass;
import timber.log.Timber;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View view;
    private final MainContract.Router router;
    private final InjectedClass injectedClass;

    public MainPresenter(MainContract.View view,
                         MainContract.Router router,
                         InjectedClass injectedClass) {
        this.view = view;
        this.router = router;
        this.injectedClass = injectedClass;
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
