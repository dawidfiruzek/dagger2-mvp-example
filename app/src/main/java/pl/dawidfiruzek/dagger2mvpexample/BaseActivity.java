package pl.dawidfiruzek.dagger2mvpexample;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by dawidfiruzek on 12.08.16.
 */
public class BaseActivity extends AppCompatActivity {

    protected MyApplication getMainApplication() {
        return ((MyApplication) getApplication());
    }
}
