package pl.dawidfiruzek.dagger2mvpexample.main;

import timber.log.Timber;

/**
 * Created by Dawid Firuzek on 12.08.16.
 */
public class InjectedClass {

    private final InjectedInnerClass injectedInnerClass;

    public InjectedClass(InjectedInnerClass injectedInnerClass) {
        this.injectedInnerClass = injectedInnerClass;
    }

    public void test() {
        Timber.d("test called");
        if (injectedInnerClass != null) {
            injectedInnerClass.test();
        }
    }
}
