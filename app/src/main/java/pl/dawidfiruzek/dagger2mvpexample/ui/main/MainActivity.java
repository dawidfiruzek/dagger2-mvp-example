package pl.dawidfiruzek.dagger2mvpexample.ui.main;

import android.os.Bundle;

import javax.inject.Inject;

import pl.dawidfiruzek.dagger2mvpexample.ui.main.injection.DaggerMainComponent;
import pl.dawidfiruzek.dagger2mvpexample.ui.main.injection.MainModule;
import pl.dawidfiruzek.dagger2mvpexample.util.BaseActivity;
import pl.dawidfiruzek.dagger2mvpexample.R;
import timber.log.Timber;

public class MainActivity extends BaseActivity implements MainContract.View, MainContract.Router {

    @Inject
    MainContract.Presenter presenter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initDaggerComponent() {
        DaggerMainComponent.builder()
                .appComponent(getApp().getAppComponent())
                .mainModule(new MainModule(this, this))
                .build()
                .inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter.test();
    }

    @Override
    public void callbackMethod() {
        Timber.d("Callback method called in MainView");
    }
}
