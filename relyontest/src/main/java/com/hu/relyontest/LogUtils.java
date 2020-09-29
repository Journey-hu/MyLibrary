package com.hu.relyontest;

import android.util.Log;

public class LogUtils {

    private static final String TAG = "自定义TAG";

    public static void showLog(String msg){
        Log.e(TAG,msg);
    }
}
