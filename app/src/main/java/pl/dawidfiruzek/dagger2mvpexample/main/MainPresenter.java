package pl.dawidfiruzek.dagger2mvpexample.main;

import android.content.SharedPreferences;

import javax.inject.Inject;

import lombok.Setter;
import timber.log.Timber;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
public class MainPresenter {

    @Inject
    SharedPreferences preferences;

    @Inject
    Test2 testClass;

    private @Setter MainView view;

    @Inject
    public MainPresenter() {
    }

    public void test() {
        Timber.e("test");
        Timber.e(preferences == null ? "null" : "notnull");

        testClass.test();
    }
}
