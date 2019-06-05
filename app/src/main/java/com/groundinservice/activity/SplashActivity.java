package com.groundinservice.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.groundinservice.R;

public class SplashActivity extends BaseActivity {

    private static final int TIME_OUT = 5000;

    ImageView imageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView = findViewById(R.id.splash_screen_img_view);
        setGif();

        startMainActivity();
    }

    private void setGif() {
        Glide.with(this).asGif()
                .load(R.raw.splash_image)
                .into(imageView);
    }

    private void startMainActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, TIME_OUT);
    }
}
