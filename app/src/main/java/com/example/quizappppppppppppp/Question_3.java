package com.example.quizappppppppppppp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Question_3 extends AppCompatActivity {
    private MaterialButton mCheckButton4;

    private MaterialButton mCheckButton5;
    private MaterialButton mCheckButton24;
    private MaterialButton mCheckButton25;

    TextView txtview;
    private int mCorrectValue = 30;

    @SuppressLint({"MissingInflatedId", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        LinearLayout linearLayout= findViewById(R.id.Gradientlayout);


        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();
        mCheckButton4 = findViewById(R.id.check_button4);
        mCheckButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;

                int value =30;
                if (value == mCorrectValue) {
                    Intent intentthree =new Intent(Question_3.this,qr3.class);
                    startActivity(intentthree);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                } else {
                    Intent intentthree =new Intent(Question_3.this,qw3.class);
                    startActivity(intentthree);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });

        mCheckButton5 = findViewById(R.id.check_button5);
        mCheckButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =10;

                if (value == mCorrectValue) {
                    Intent intentthree =new Intent(Question_3.this,qr3.class);
                    startActivity(intentthree);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);


                } else {
                    Intent intentthree =new Intent(Question_3.this,qw3.class);
                    startActivity(intentthree);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });

        mCheckButton24 = findViewById(R.id.check_button24);
        mCheckButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;

                int value =10;
                if (value == mCorrectValue) {
                    Intent intentthree =new Intent(Question_3.this,qr3.class);
                    startActivity(intentthree);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                } else {
                    Intent intentthree =new Intent(Question_3.this,qw3.class);
                    startActivity(intentthree);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });

        mCheckButton25 = findViewById(R.id.check_button25);
        mCheckButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;

                int value =10;
                if (value == mCorrectValue) {
                    Intent intentthree =new Intent(Question_3.this,qr3.class);
                    startActivity(intentthree);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                } else {
                    Intent intentthree =new Intent(Question_3.this,qw3.class);
                    startActivity(intentthree);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });


    }
}