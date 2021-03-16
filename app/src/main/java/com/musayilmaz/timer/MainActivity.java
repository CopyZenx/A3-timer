package com.musayilmaz.timer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000,1000) {


            @Override
            public void onTick(long millisUntilFinished) {

                TextView textView = (TextView) findViewById(R. id.textView);
                textView.setText("Left: " +millisUntilFinished/1000 );
            }

            @Override
            public void onFinish() {

                Toast.makeText(getApplicationContext(), "Time Has Come", Toast.LENGTH_LONG).show();

                TextView textView = (TextView) findViewById(R. id.textView);

                textView.setText("Left: " +0);

            }
        }.start();


    }
}

