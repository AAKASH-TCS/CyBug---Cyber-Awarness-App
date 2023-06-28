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

public class Question_8 extends AppCompatActivity {

    private MaterialButton mCheckButton14;

    private MaterialButton mCheckButton15;
    MaterialButton mCheckButton34;
    MaterialButton mCheckButton35;
    private int mCorrectValue = 10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
        LinearLayout linearLayout= findViewById(R.id.Gradientlayout);


        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();


        mCheckButton14 = findViewById(R.id.check_button14);
        mCheckButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;

                int value =30;
                if (value == mCorrectValue) {

                    Intent intenteight = new Intent(Question_8.this,qr8.class);
                    startActivity(intenteight);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                } else {
                    Intent intenteight = new Intent(Question_8.this,qw8.class);
                    startActivity(intenteight);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });

        mCheckButton15 = findViewById(R.id.check_button15);
        mCheckButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String valueString =null;
                int value =10;

                if (value == mCorrectValue) {
                    Intent intenteight = new Intent(Question_8.this,qr8.class);
                    startActivity(intenteight);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);


                } else {
                    Intent intenteight = new Intent(Question_8.this,qw8.class);
                    startActivity(intenteight);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });
        mCheckButton34 = findViewById(R.id.check_button34);
        mCheckButton34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =30;

                if (value == mCorrectValue) {
                    Intent intentfour = new Intent(Question_8.this,qr8.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);



                } else {
                    Intent intentfour = new Intent(Question_8.this,qw8.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });
        mCheckButton35 = findViewById(R.id.check_button35);
        mCheckButton35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =30;

                if (value == mCorrectValue) {
                    Intent intentfour = new Intent(Question_8.this,qr8.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);



                } else {
                    Intent intentfour = new Intent(Question_8.this,qw8.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });


    }
}