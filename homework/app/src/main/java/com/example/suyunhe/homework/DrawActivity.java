package com.example.suyunhe.homework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class DrawActivity extends Activity {

    private MyView myView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("DrawActivity","画面初始化");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);
        myView = (MyView)findViewById(R.id.myView);
        Intent intent = getIntent();
        if (intent!=null) {
            Log.i("Entrance","开始绘画");
//            myView.setDrawMode();/**/
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
