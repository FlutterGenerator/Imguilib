package com.android.support;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {
    static {
        System.loadLibrary("MEOW");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}