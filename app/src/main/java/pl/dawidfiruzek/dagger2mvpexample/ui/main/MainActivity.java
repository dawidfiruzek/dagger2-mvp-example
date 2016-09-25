package pl.dawidfiruzek.dagger2mvpexample.ui.main;

import android.os.Bundle;

import javax.inject.Inject;

import pl.dawidfiruzek.dagger2mvpexample.util.BaseActivity;
import pl.dawidfiruzek.dagger2mvpexample.R;
import timber.log.Timber;

public class MainActivity extends BaseActivity implements MainContract.View {

    @Inject
    MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getMyApplication().getMainComponent().inject(this);

        presenter.setView(this);
        presenter.test();
    }

    @Override
    protected void onDestroy() {
        presenter.clearView();
        super.onDestroy();
    }

    @Override
    public void callbackMethod() {
        Timber.d("Callback method called in MainView");
    }
}
