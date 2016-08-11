package pl.dawidfiruzek.dagger2mvpexample.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pl.dawidfiruzek.dagger2mvpexample.R;

public class MainActivity extends AppCompatActivity implements MainView{

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        presenter = new MainPresenter(this);
    }
}
