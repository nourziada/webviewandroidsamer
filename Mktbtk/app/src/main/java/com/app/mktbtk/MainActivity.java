package com.app.mktbtk;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
    CountDownTimer timer ;
    TextView tv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_1.setText("");




        Typeface face = Typeface.createFromAsset(getAssets(),"granada.ttf");
        tv_1.setTypeface(face);

        if (getIntent().getBooleanExtra("EXIT", false))
        {
            finish();
        }else {
            timer = new CountDownTimer(3000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {

                }

                @Override
                public void onFinish() {
                    Intent i = new Intent(MainActivity.this, SecActivity.class);
                    startActivity(i);

                }
            };

            timer.start();


        }


    }


}
