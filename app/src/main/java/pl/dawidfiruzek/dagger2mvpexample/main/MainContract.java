package pl.dawidfiruzek.dagger2mvpexample.main;

/**
 * Created by Dawid Firuzek on 25.09.2016.
 */

public interface MainContract {
    interface View {
        void callbackMethod();
    }

    interface Presenter {
        void setView(View view);
        void test();
    }
}
