package com.sunny.myfirstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // onCreate() 함수가 최초로 실행됨 (콜백)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // 이전 상태값을 들고옴
        setContentView(R.layout.activity_main);
    }
}




