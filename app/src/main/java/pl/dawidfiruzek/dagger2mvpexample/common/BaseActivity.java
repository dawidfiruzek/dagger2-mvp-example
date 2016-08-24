package pl.dawidfiruzek.dagger2mvpexample.common;

import android.support.v7.app.AppCompatActivity;

import pl.dawidfiruzek.dagger2mvpexample.MyApplication;

/**
 * Created by Dawid Firuzek on 12.08.16.
 */
public class BaseActivity extends AppCompatActivity {

    protected MyApplication getMyApplication() {
        return ((MyApplication) getApplication());
    }
}
