package com.gagan.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity_B extends AppCompatActivity {
    String TAG = "Activity_B";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__b);

        findViewById(R.id.btn_activity_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_B.this, Activity_C.class));
            }
        });
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