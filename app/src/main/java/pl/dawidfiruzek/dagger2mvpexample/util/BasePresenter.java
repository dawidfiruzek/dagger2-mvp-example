package pl.dawidfiruzek.dagger2mvpexample.util;

/**
 * Created by Dawid Firuzek on 25.09.2016.
 */

public interface BasePresenter<T> {
    void setView(T view);
}
