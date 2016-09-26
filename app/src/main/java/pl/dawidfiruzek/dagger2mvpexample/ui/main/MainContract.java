package pl.dawidfiruzek.dagger2mvpexample.ui.main;

import android.support.annotation.NonNull;

import pl.dawidfiruzek.dagger2mvpexample.util.BasePresenter;

/**
 * Created by Dawid Firuzek on 25.09.2016.
 */

public interface MainContract {
    interface View {
        void callbackMethod();
    }

    interface Presenter extends BasePresenter<View>{
        void setRouter(@NonNull Router router);
        void test();
    }

    interface Router {

    }
}
