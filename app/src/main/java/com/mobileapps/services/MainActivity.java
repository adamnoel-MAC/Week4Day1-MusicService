package com.mobileapps.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.mobileapps.services.Services.MyNormalService;

public class MainActivity extends AppCompatActivity {

    EditText etBoundData;
    TextView tvBoundData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etBoundData = findViewById(R.id.etBoundData);
        tvBoundData = findViewById(R.id.tvBoundData);
    }

    public void onNormalService(View view) {
        Intent intent =  new Intent();
        MyNormalService myNormalService = new MyNormalService();
        myNormalService.onStartCommand(intent,0,0);
    }

    public void onIntentService(View view) {
    }

    public void onBoundService(View view) {
    }

    public void onScheduleService(View view) {
    }

    public void onStartCounter(View view) {
    }

    public void onStopCounter(View view) {
    }
}
// implement Bound