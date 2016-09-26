package pl.dawidfiruzek.dagger2mvpexample.util.api;

/**
 * Created by Dawid Firuzek on 26.09.2016.
 */

public class ApiClient {

    private final ApiServiceGenerator apiServiceGenerator;

    public ApiClient(ApiServiceGenerator apiServiceGenerator) {
        this.apiServiceGenerator = apiServiceGenerator;
    }
}
