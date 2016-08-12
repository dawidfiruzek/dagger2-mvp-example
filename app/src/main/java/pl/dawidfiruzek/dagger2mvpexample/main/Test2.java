package pl.dawidfiruzek.dagger2mvpexample.main;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by dawidfiruzek on 12.08.16.
 */
public class Test2 {

    TestClass testClass;

    public Test2(TestClass testClass) {
        this.testClass = testClass;
    }

    public void test() {
        Timber.e(testClass == null ? "null" : "notnull");
        testClass.test();
    }
}
