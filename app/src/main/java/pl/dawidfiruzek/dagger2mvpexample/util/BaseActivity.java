package pl.dawidfiruzek.dagger2mvpexample.util;

import android.support.v7.app.AppCompatActivity;

import pl.dawidfiruzek.dagger2mvpexample.MyApplication;

/**
 * Created by Dawid Firuzek on 12.08.16.
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected MyApplication getMyApplication() {
        return ((MyApplication) getApplication());
    }
}
