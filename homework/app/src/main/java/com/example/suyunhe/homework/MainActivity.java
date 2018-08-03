package com.example.suyunhe.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int mTotalProgress = 100;
    private int mCurrentProgress = 0;

    private MyView myview;
    Random random = new Random();
//    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myview = (MyView) findViewById(R.id.myView);
        new Thread(new ProgressRunable()).start();
/*        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("begin","启动画面");
                Intent intent = new Intent(MainActivity.this,DrawActivity.class);
                startActivity(intent);
            }
        });*/
    }
    class  ProgressRunable implements Runnable {
        @Override
        public void run(){
            while (mCurrentProgress < mTotalProgress) {
//                mCurrentProgress = random.nextInt(99)%(100);
                mCurrentProgress += 1;
                myview.setmTotalProgress(mCurrentProgress);
                try {
                    Thread.sleep(90);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
