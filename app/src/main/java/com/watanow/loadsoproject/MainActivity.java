package com.watanow.loadsoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.watanow.lbslogicpkg.LbsLogicMain;

public class MainActivity extends AppCompatActivity {
/*
    statics
    {
        try
        {
            System.loadLibrary("liblbslogic");
        }
        catch (UnsatisfiedLinkError ule)
        {
            Log.e("MainActivity", "WARNING: Could not load native library: "
                    + ule.getMessage());
        }s


    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LbsLogicMain nativeApi = new LbsLogicMain();
        int result = nativeApi.ndkLbsLogic(5, 10);

        Log.d("","result : " + result);
    }
}
