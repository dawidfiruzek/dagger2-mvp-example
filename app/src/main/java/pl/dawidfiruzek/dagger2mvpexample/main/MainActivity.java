package pl.dawidfiruzek.dagger2mvpexample.main;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import pl.dawidfiruzek.dagger2mvpexample.MyApplication;
import pl.dawidfiruzek.dagger2mvpexample.R;

public class MainActivity extends AppCompatActivity implements MainView{

    MainPresenter presenter;

    @Inject SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ((MyApplication)getApplication()).getAppComponent().inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        presenter = new MainPresenter(this);
    }
}
