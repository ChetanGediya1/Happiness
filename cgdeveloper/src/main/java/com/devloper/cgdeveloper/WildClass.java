package com.devloper.cgdeveloper;

import android.content.Context;
import android.widget.Toast;

public class WildClass {
    public static void createToast(Context context,String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

    }
}
