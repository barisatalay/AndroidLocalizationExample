package com.atalay.androidlocalizationexample.View.Main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.atalay.androidlocalizationexample.Base.BaseActivity;
import com.atalay.androidlocalizationexample.R;
import com.atalay.androidlocalizationexample.View.Settings.SettingsActivity;

/**
 * Created by baris on 6.03.2017.
 */

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUi();
    }

    private void initUi() {
        ((Button) findViewById(R.id.main_settingsbut)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this.getApplicationContext(), SettingsActivity.class));
    }
}
