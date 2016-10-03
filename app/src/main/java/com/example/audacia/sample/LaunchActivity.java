package com.example.audacia.sample;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        new LaunchThread().start();

    }

    class LaunchThread extends Thread{
        @Override
        public void run() {
            SystemClock.sleep(2500);
            Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.move_r_c, R.anim.move_c_l);
            finish();
        }
    }
}
