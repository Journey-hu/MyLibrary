package com.hu.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.hu.relyontest.LogUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    protected void onResume() {
        super.onResume();
    }

    public void printLog(View view) {
        LogUtils.showLog("this is a log");
    }

    public void showInfo(View view) {
    }

}
