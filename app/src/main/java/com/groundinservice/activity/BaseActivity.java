package com.groundinservice.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.groundinservice.R;
import com.groundinservice.util.Utils;

public class BaseActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Utils.darkenStatusBar(this, R.color.colorPrimaryDark);
    }

    protected void setUpToolbar(String name) {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(name);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.mipmap.ic_menu);
    }
}
