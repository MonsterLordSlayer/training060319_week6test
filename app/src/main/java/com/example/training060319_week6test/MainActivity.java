package com.example.training060319_week6test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OkHttpExample okHttpExample=new OkHttpExample();
        okHttpExample.getSyncRespondforSchool(this);
    }
}
