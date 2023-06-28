package com.example.quizappppppppppppp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class Question_2 extends AppCompatActivity {

    private MaterialButton mCheckButton2;
    private MaterialButton mCheckButton22;
    private MaterialButton mCheckButton23;
    private MaterialButton mCheckButton3;
    private int mCorrectValue = 10;
    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        LinearLayout linearLayout= findViewById(R.id.Gradientlayout);


        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();


        mCheckButton2 = findViewById(R.id.check_button2);
        mCheckButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;

                int value =30;
                if (value == mCorrectValue) {
                    Intent intentone=new Intent(Question_2.this,qr2.class);
                    startActivity(intentone);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                } else {
                    mCheckButton2.setBackgroundResource(R.drawable.wrong);
                    Intent intentone=new Intent(Question_2.this,qw2.class);
                    startActivity(intentone);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });
        mCheckButton3 = findViewById(R.id.check_button3);
        mCheckButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =10;

                if (value == mCorrectValue) {
                    Intent intenttwo=new Intent(Question_2.this,qr2.class);
                    startActivity(intenttwo);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);


                } else {
                    Intent intentone=new Intent(Question_2.this,qw2.class);
                    startActivity(intentone);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });
        mCheckButton22 = findViewById(R.id.check_button22);
        mCheckButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;

                int value =30;
                if (value == mCorrectValue) {
                    Intent intentone=new Intent(Question_2.this,qr2.class);
                    startActivity(intentone);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                } else {
                    Intent intentone=new Intent(Question_2.this,qw2.class);
                    startActivity(intentone);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });
        mCheckButton23 = findViewById(R.id.check_button23);
        mCheckButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;

                int value =30;
                if (value == mCorrectValue) {
                    Intent intentone=new Intent(Question_2.this,qr2.class);
                    startActivity(intentone);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                } else {
                    Intent intentone=new Intent(Question_2.this,qw2.class);
                    startActivity(intentone);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });


    }
}