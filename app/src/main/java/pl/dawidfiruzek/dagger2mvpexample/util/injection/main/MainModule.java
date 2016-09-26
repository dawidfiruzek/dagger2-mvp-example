package pl.dawidfiruzek.dagger2mvpexample.util.injection.main;

import dagger.Module;
import dagger.Provides;
import pl.dawidfiruzek.dagger2mvpexample.ui.main.MainContract;
import pl.dawidfiruzek.dagger2mvpexample.ui.main.MainPresenter;
import pl.dawidfiruzek.dagger2mvpexample.util.api.ApiServiceGenerator;
import pl.dawidfiruzek.dagger2mvpexample.util.api.GitHubService;

/**
 * Created by Dawid Firuzek on 12.08.16.
 */
@Module
public class MainModule {

    @Provides
    GitHubService provideGitHubService(ApiServiceGenerator apiServiceGenerator) {
        return apiServiceGenerator.createService(GitHubService.class);
    }

    @Provides
    MainContract.Presenter providePresenter(GitHubService gitHubService) {
        return new MainPresenter(gitHubService);
    }
}
