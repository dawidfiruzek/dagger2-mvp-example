package pl.dawidfiruzek.dagger2mvpexample.util;

import android.support.annotation.NonNull;

/**
 * Created by Dawid Firuzek on 26.09.2016.
 */

public interface BasePresenter <T> {
    void setView(@NonNull T view);
    void clear();
}
