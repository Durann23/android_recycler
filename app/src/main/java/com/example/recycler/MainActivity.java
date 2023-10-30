package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i=new Intent(this, Recycler.class);

        new CountDownTimer(5000, 1000)
        {
            public void onTick(long msUntilFinished)
            {

            }
            public void onFinish() {

                startActivity(i);
            }
        }.start();

    }
}