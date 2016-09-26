package pl.dawidfiruzek.dagger2mvpexample.util;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import pl.dawidfiruzek.dagger2mvpexample.MyApplication;
import pl.dawidfiruzek.dagger2mvpexample.R;

/**
 * Created by Dawid Firuzek on 12.08.16.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        init();
    }

    private void init() {
        ButterKnife.bind(this);
        initDaggerComponent();
    }

    protected abstract @LayoutRes int getLayoutId();

    protected abstract void initDaggerComponent();

    protected MyApplication getApp() {
        return ((MyApplication) getApplication());
    }
}
