package pl.dawidfiruzek.dagger2mvpexample.main;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import pl.dawidfiruzek.dagger2mvpexample.BaseActivity;
import pl.dawidfiruzek.dagger2mvpexample.MyApplication;
import pl.dawidfiruzek.dagger2mvpexample.R;
import timber.log.Timber;

public class MainActivity extends BaseActivity implements MainView {

    @Inject MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getMainApplication().getMainComponent().inject(this);

        presenter.setView(this);
        presenter.test();
    }
}
