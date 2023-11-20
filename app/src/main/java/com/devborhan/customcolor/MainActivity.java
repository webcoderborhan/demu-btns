package com.devborhan.customcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_anim, btn_anim1, btn_anim2, btn_anim3;
    Animation myAnim, Anim1, Anim2, Anim3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_anim = findViewById(R.id.btn_anim);
        btn_anim1 = findViewById(R.id.btn_anim1);
        btn_anim2 = findViewById(R.id.btn_anim2);
        btn_anim3 = findViewById(R.id.btn_anim3);


        myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.my_anim);
        Anim1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.left_to_right);
        Anim2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
        Anim3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);
        btn_anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_anim.startAnimation(myAnim);
            }
        });

        btn_anim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_anim1.startAnimation(Anim1);
            }
        });

        btn_anim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_anim2.startAnimation(Anim2);
            }
        });

        btn_anim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_anim3.startAnimation(Anim3);
            }
        });


//        btn_anim.startAnimation(myAnim);

    }
}