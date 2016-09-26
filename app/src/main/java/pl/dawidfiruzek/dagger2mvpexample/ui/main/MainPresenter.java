package pl.dawidfiruzek.dagger2mvpexample.ui.main;

import android.support.annotation.NonNull;

import java.util.List;

import pl.dawidfiruzek.dagger2mvpexample.data.Repository;
import pl.dawidfiruzek.dagger2mvpexample.util.api.GitHubService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Dawid Firuzek on 11.08.2016.
 */
public class MainPresenter implements MainContract.Presenter {

    private final GitHubService gitHubService;

    private MainContract.View view;
    private MainContract.Router router;

    public MainPresenter(GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }

    @Override
    public void setView(@NonNull MainContract.View view) {
        this.view = view;
    }

    @Override
    public void setRouter(@NonNull MainContract.Router router) {
        this.router = router;
    }

    @Override
    public void clear() {
        view = null;
        router = null;
    }

    @Override
    public void onResumed() {
        gitHubService
                .getRepositories("dawidfiruzek")
                .enqueue(new Callback<List<Repository>>() {
                    @Override
                    public void onResponse(Call<List<Repository>> call, Response<List<Repository>> response) {
                        if (response.isSuccessful()) {
                            StringBuilder stringBuilder = new StringBuilder();
                            for (Repository repo : response.body()) {
                                stringBuilder.append(repo.getName());
                                stringBuilder.append("\n");
                            }

                            if(view != null) {
                                view.showRepos(stringBuilder.toString());
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<List<Repository>> call, Throwable t) {
                        if(view != null) {
                            view.showRepos("błąd");
                        }
                    }
                });
    }
}
