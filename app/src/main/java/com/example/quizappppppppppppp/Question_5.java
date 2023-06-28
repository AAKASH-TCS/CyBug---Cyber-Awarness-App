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

public class Question_5 extends AppCompatActivity {

    private MaterialButton mCheckButton8;

    private MaterialButton mCheckButton9;

    MaterialButton mCheckButton28;
    MaterialButton mCheckButton29;
    private int mCorrectValue = 10;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        LinearLayout linearLayout= findViewById(R.id.Gradientlayout);


        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();


        mCheckButton8 = findViewById(R.id.check_button8);
        mCheckButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;

                int value =30;
                if (value == mCorrectValue) {
                    Intent intentfive =new Intent(Question_5.this,qr5.class);
                    startActivity(intentfive);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                } else {
                    Intent intentfive =new Intent(Question_5.this,qw5.class);
                    startActivity(intentfive);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });

        mCheckButton9 = findViewById(R.id.check_button9);
        mCheckButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =10;

                if (value == mCorrectValue) {
                    Intent intentfive =new Intent(Question_5.this,qr5.class);
                    startActivity(intentfive);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);


                } else {
                    Intent intentfive =new Intent(Question_5.this,qw5.class);
                    startActivity(intentfive);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }

        });
        mCheckButton28 = findViewById(R.id.check_button28);
        mCheckButton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =30;

                if (value == mCorrectValue) {
                    Intent intentfive = new Intent(Question_5.this,qr5.class);
                    startActivity(intentfive);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);



                } else {
                    Intent intentfive = new Intent(Question_5.this,qw5.class);
                    startActivity(intentfive);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });
        mCheckButton29 = findViewById(R.id.check_button29);
        mCheckButton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =30;

                if (value == mCorrectValue) {
                    Intent intentfive = new Intent(Question_5.this,qr5.class);
                    startActivity(intentfive);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);



                } else {
                    Intent intentfive = new Intent(Question_5.this,qw5.class);
                    startActivity(intentfive);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });

    }
}