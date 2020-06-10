package com.gagan.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Activity_C extends AppCompatActivity {
    String TAG = "Activity_C";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__c);

        Log.e(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }
}
