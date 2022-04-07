package com.example.appspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Demarage extends AppCompatActivity {
    ImageView icondem;
    TextView textdem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demarage);
        //hide the bare
        try {
            this.getSupportActionBar().hide();
        }catch (NullPointerException e){}
        //assigne variable

        icondem = findViewById(R.id.icondem);
        textdem = findViewById(R.id.textdem);
        //set full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //inisialiser animation
       // Animation animation = AnimationUtils.loadAnimation(this, R.anim.demarage);
        //start animation
      // textdem.setAnimation(animation);
        //Inisialiser object animator
        ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(
                icondem,
                PropertyValuesHolder.ofFloat("scaleX", 1.2f),
                PropertyValuesHolder.ofFloat("scaleY", 1.2f)


        );

        //set duration
        objectAnimator.setDuration(500);
        //set repeat count
        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        //set repeat mode
        objectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        //start animator
        objectAnimator.start();
        //utilisation d'un thread pour passer au autre activitée
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent intent = new Intent(Demarage.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t.start();

    }




}
