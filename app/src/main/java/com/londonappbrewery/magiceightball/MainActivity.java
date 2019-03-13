package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askBtn = findViewById(R.id.btn_ask);
        final ImageView ballImage = findViewById(R.id.image_ball);

        final int[] balls = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random picNum = new Random();
                int val = picNum.nextInt(5);
                 Log.v("8ball"," Random number - "+val);
                 ballImage.setImageResource(balls[val]);
            }
        });


    }
}
