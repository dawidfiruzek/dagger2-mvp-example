package pl.dawidfiruzek.dagger2mvpexample.main;

import android.os.Bundle;

import javax.inject.Inject;

import pl.dawidfiruzek.dagger2mvpexample.common.BaseActivity;
import pl.dawidfiruzek.dagger2mvpexample.R;

public class MainActivity extends BaseActivity implements MainView {

    @Inject MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getMyApplication().getMainComponent().inject(this);

        presenter.setView(this);
        presenter.test();
    }
}
