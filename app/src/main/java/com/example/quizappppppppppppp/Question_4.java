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

public class Question_4 extends AppCompatActivity {

    private MaterialButton mCheckButton6;

    private MaterialButton mCheckButton7;

    private MaterialButton mCheckButton26;
    private MaterialButton mCheckButton27;
    private int mCorrectValue = 10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        LinearLayout linearLayout= findViewById(R.id.Gradientlayout);


        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();


        mCheckButton6 = findViewById(R.id.check_button6);
        mCheckButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;

                int value =30;
                if (value == mCorrectValue) {
                    Intent intentfour = new Intent(Question_4.this,qr4.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                } else {
                    Intent intentfour = new Intent(Question_4.this,qw4.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });

        mCheckButton7 = findViewById(R.id.check_button7);
        mCheckButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =20;

                if (value == mCorrectValue) {
                    Intent intentfour = new Intent(Question_4.this,qr4.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);



                } else {
                    Intent intentfour = new Intent(Question_4.this,qw4.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });

        mCheckButton26 = findViewById(R.id.check_button26);
        mCheckButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =30;

                if (value == mCorrectValue) {
                    Intent intentfour = new Intent(Question_4.this,qr4.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);



                } else {
                    Intent intentfour = new Intent(Question_4.this,qw4.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });


        mCheckButton27 = findViewById(R.id.check_button27);
        mCheckButton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =10;

                if (value == mCorrectValue) {
                    Intent intentfour = new Intent(Question_4.this,qr4.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);



                } else {
                    Intent intentfour = new Intent(Question_4.this,qw4.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });


    }
}