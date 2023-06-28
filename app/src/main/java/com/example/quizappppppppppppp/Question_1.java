package com.example.quizappppppppppppp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.content.Intent;

import com.google.android.material.button.MaterialButton;

public class Question_1 extends AppCompatActivity {


     MaterialButton mCheckButton;
    MaterialButton mCheckButton1;

     MaterialButton mCheckButton20;
     MaterialButton mCheckButton21;

    int mCorrectValue = 10;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        LinearLayout linearLayout= findViewById(R.id.Gradientlayout);


        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();

        mCheckButton = findViewById(R.id.check_button);
        mCheckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;



                    int value =30;
                    if (value == mCorrectValue) {
                        mCheckButton.setBackgroundResource(R.drawable.crt_back);
                        Intent intentone=new Intent(Question_1.this,qr1.class);
                        startActivity(intentone);
                        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                    } else {
                        mCheckButton.setBackgroundResource(R.drawable.wrg_back);
                        Intent intentone=new Intent(Question_1.this,qw1.class);
                        startActivity(intentone);
                        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                    }
                }

        });

        mCheckButton1 = findViewById(R.id.check_button1);
        mCheckButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                                int value =10;

                    if (value == mCorrectValue) {

                        mCheckButton1.setBackgroundResource(R.drawable.crt_back);
                        Intent intentone=new Intent(Question_1.this,qr1.class);
                        startActivity(intentone);
                        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);


                    } else {
                        mCheckButton1.setBackgroundResource(R.drawable.wrg_back);
                        Intent intentone=new Intent(Question_1.this,qw1.class);
                        startActivity(intentone);
                        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                    }
                }

        });
        mCheckButton20 = findViewById(R.id.check_button20);
        mCheckButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =30;
                if (value == mCorrectValue) {

                    mCheckButton20.setBackgroundResource(R.drawable.crt_back);
                    Intent intentone=new Intent(Question_1.this,qr1.class);
                    startActivity(intentone);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                } else {

                    mCheckButton20.setBackgroundResource(R.drawable.wrg_back);
                    Intent intentone=new Intent(Question_1.this,qw1.class);
                    startActivity(intentone);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });
        mCheckButton21 = findViewById(R.id.check_button21);
        mCheckButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;



                int value =30;
                if (value == mCorrectValue) {

                    mCheckButton21.setBackgroundResource(R.drawable.crt_back);
                    Intent intentone=new Intent(Question_1.this,qr1.class);
                    startActivity(intentone);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                } else {

                    mCheckButton21.setBackgroundResource(R.drawable.wrg_back);
                    Intent intentone=new Intent(Question_1.this,qw1.class);
                    startActivity(intentone);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });


    }
}