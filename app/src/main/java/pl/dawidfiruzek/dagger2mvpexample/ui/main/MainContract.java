package pl.dawidfiruzek.dagger2mvpexample.ui.main;

/**
 * Created by Dawid Firuzek on 25.09.2016.
 */

public interface MainContract {
    interface View {
        void callbackMethod();
    }

    interface Presenter {
        void test();
    }

    interface Router {

    }
}
