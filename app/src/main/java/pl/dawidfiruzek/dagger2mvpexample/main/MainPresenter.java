package pl.dawidfiruzek.dagger2mvpexample.main;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
public class MainPresenter {

    private final MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }
}
