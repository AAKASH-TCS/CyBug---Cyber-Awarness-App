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

public class Question_7 extends AppCompatActivity {

    private MaterialButton mCheckButton12;

    private MaterialButton mCheckButton13;

    MaterialButton mCheckButton32;
    MaterialButton mCheckButton33;

    private int mCorrectValue = 10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);
        LinearLayout linearLayout= findViewById(R.id.Gradientlayout);


        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();


        mCheckButton12 = findViewById(R.id.check_button12);
        mCheckButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;

                int value =30;
                if (value == mCorrectValue) {
                    Intent intentseven = new Intent(Question_7.this,qr7.class);
                    startActivity(intentseven);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                } else {
                    Intent intentseven = new Intent(Question_7.this,qw7.class);
                    startActivity(intentseven);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });

        mCheckButton13 = findViewById(R.id.check_button13);
        mCheckButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =10;

                if (value == mCorrectValue) {
                    Intent intentseven = new Intent(Question_7.this,qr7.class);
                    startActivity(intentseven);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);


                } else {
                    Intent intentseven = new Intent(Question_7.this,qw7.class);
                    startActivity(intentseven);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });
        mCheckButton32 = findViewById(R.id.check_button32);
        mCheckButton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =30;

                if (value == mCorrectValue) {
                    Intent intentfour = new Intent(Question_7.this,qr7.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);



                } else {
                    Intent intentfour = new Intent(Question_7.this,qw7.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });
        mCheckButton33 = findViewById(R.id.check_button33);
        mCheckButton33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =30;

                if (value == mCorrectValue) {
                    Intent intentfour = new Intent(Question_7.this,qr7.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);



                } else {
                    Intent intentfour = new Intent(Question_7.this,qw7.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });


    }
}