package pl.dawidfiruzek.dagger2mvpexample.util.api;

import java.util.List;

import pl.dawidfiruzek.dagger2mvpexample.data.Repository;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Dawid Firuzek on 26.09.2016.
 */

public interface GitHubService {

    @GET("/users/{user}/repos")
    Call<List<Repository>> getRepositories(@Path("user") String user);
}
