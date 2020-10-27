package com.hu.relyontest;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class ToastUtil {

    @SuppressLint("WrongConstant")
    public static void showToast(Context context, String string){
        Toast toast=new Toast(context);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setDuration(2000);
        toast.setText(string);
        toast.show();
    }
}
