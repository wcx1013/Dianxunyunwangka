package com.yd.dengteng.welcome;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.blankj.utilcode.util.AppUtils;
import com.yd.dengteng.main.MainActivity;


public class WelcomeActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().postDelayed(this, 1500);
    }

    @Override
    public void run() {
        if (isFinishing() || !AppUtils.isAppForeground()) {
            finish();
            return;
        }
        MainActivity.start(this);
        finish();
    }
}
