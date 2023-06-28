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

public class Question_9 extends AppCompatActivity {

    private MaterialButton mCheckButton16;

    private MaterialButton mCheckButton17;

    MaterialButton mCheckButton36;
    MaterialButton mCheckButton37;
    private int mCorrectValue = 10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);
        LinearLayout linearLayout= findViewById(R.id.Gradientlayout);


        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();


        mCheckButton16 = findViewById(R.id.check_button16);
        mCheckButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;

                int value =30;
                if (value == mCorrectValue) {
                    Intent intentnine = new Intent(Question_9.this,qr9.class);
                    startActivity(intentnine);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                } else {

                    Intent intentnine = new Intent(Question_9.this,qw9.class);
                    startActivity(intentnine);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });

        mCheckButton17 = findViewById(R.id.check_button17);
        mCheckButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =10;

                if (value == mCorrectValue) {
                    Intent intentnine = new Intent(Question_9.this,qr9.class);
                    startActivity(intentnine);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);


                } else {
                    Intent intentnine = new Intent(Question_9.this,qw9.class);
                    startActivity(intentnine);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });
        mCheckButton36 = findViewById(R.id.check_button36);
        mCheckButton36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =30;

                if (value == mCorrectValue) {
                    Intent intentfour = new Intent(Question_9.this,qr9.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);



                } else {
                    Intent intentfour = new Intent(Question_9.this,qw9.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });
        mCheckButton37 = findViewById(R.id.check_button37);
        mCheckButton37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =30;

                if (value == mCorrectValue) {

                    Intent intentfour = new Intent(Question_9.this,qr9.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);



                } else {
                    Intent intentfour = new Intent(Question_9.this,qw9.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });


    }
}