package com.badongs.handout3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d(TAG, "onCreate");
        Button button = findViewById(R.id.bt_click);
        //button.setOnClickListener(onClickListener);
    }

    @Override
    public void onClick(View v) {

    }
}
