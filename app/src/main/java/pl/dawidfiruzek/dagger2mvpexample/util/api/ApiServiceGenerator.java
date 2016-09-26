package pl.dawidfiruzek.dagger2mvpexample.util.api;

import retrofit2.Retrofit;

/**
 * Created by Dawid Firuzek on 26.09.2016.
 */

public class ApiServiceGenerator {

    private final Retrofit retrofit;

    public ApiServiceGenerator(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public <T> T createService(Class<T> serviceClass) {
         return retrofit.create(serviceClass)  ;
    }
}
