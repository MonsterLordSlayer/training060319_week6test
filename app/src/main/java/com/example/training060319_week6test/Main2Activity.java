package com.example.training060319_week6test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tvAddition;
    TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String dbn=intent.getStringExtra("DBN");
        String name=intent.getStringExtra("name");
        String description=intent.getStringExtra("description");
        tvAddition=findViewById(R.id.tvAddition);
        tvName=findViewById(R.id.tvSchoolName);
        tvAddition.setText(description);
        tvName.setText(name);
        OkHttpExample okHttpExample=new OkHttpExample();
        okHttpExample.getSyncRespondforSchoolwithSat(this,dbn);
    }
}
