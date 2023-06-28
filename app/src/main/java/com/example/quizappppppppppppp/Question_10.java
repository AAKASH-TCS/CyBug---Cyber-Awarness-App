package com.example.quizappppppppppppp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;


public class Question_10 extends AppCompatActivity {

    private MaterialButton mCheckButton18;

    private MaterialButton mCheckButton19;
    MaterialButton mCheckButton38;
   MaterialButton mCheckButton39;
    private int mCorrectValue = 10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
        LinearLayout linearLayout= findViewById(R.id.Gradientlayout);


        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();


        mCheckButton18 = findViewById(R.id.check_button18);
        mCheckButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;

                int value =30;
                if (value == mCorrectValue) {
                    Intent intention = new Intent(Question_10.this,MainActivity.class);
                    startActivity(intention);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);


                } else {
                    Intent intentnine = new Intent(Question_10.this,MainActivity.class);
                    startActivity(intentnine);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });

        mCheckButton19 = findViewById(R.id.check_button19);
        mCheckButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =10;

                if (value == mCorrectValue) {
                    Intent intention = new Intent(Question_10.this,MainActivity.class);
                    startActivity(intention);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                } else {
                    Intent intention = new Intent(Question_10.this,MainActivity.class);
                    startActivity(intention);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });
        mCheckButton38 = findViewById(R.id.check_button38);
        mCheckButton38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =10;

                if (value == mCorrectValue) {
                    Intent intention = new Intent(Question_10.this,MainActivity.class);
                    startActivity(intention);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                } else {
                    Intent intention = new Intent(Question_10.this,MainActivity.class);
                    startActivity(intention);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });
        mCheckButton39 = findViewById(R.id.check_button39);
        mCheckButton39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =10;

                if (value == mCorrectValue) {
                    Intent intention = new Intent(Question_10.this,MainActivity.class);
                    startActivity(intention);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                } else {
                    Intent intention = new Intent(Question_10.this,MainActivity.class);
                    startActivity(intention);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });


    }
}