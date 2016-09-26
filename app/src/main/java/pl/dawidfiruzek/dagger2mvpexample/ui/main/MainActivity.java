package pl.dawidfiruzek.dagger2mvpexample.ui.main;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import pl.dawidfiruzek.dagger2mvpexample.util.BaseActivity;
import pl.dawidfiruzek.dagger2mvpexample.R;
import pl.dawidfiruzek.dagger2mvpexample.util.injection.main.DaggerMainComponent;
import pl.dawidfiruzek.dagger2mvpexample.util.injection.main.MainModule;

public class MainActivity extends BaseActivity implements MainContract.View, MainContract.Router {

    @BindView(R.id.main_textview_repos)
    TextView repos;

    @Inject
    MainContract.Presenter presenter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initDaggerComponent() {
        DaggerMainComponent.builder()
                .appComponent(getApp().getAppComponent())
                .mainModule(new MainModule())
                .build()
                .inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
    }

    private void init() {
        presenter.setView(this);
        presenter.setRouter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        presenter.onResumed();
    }

    @Override
    protected void onDestroy() {
        presenter.clear();
        super.onDestroy();
    }

    @Override
    public void showRepos(String repos) {
        this.repos.setText(repos);
    }
}
