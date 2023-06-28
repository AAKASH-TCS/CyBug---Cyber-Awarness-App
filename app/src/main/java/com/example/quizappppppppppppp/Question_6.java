package com.example.quizappppppppppppp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Question_6 extends AppCompatActivity {

    private MaterialButton mCheckButton10;

    private MaterialButton mCheckButton11;

    MaterialButton mcheckButton30;
    MaterialButton mcheckButton31;
    private int mCorrectValue = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
        LinearLayout linearLayout= findViewById(R.id.Gradientlayout);


        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();


        mCheckButton10 = findViewById(R.id.check_button10);
        mCheckButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;


                int value =30;
                if (value == mCorrectValue) {
                    Intent intentsix=new Intent(Question_6.this,qr6.class);
                    startActivity(intentsix);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                } else {
                    Intent intentsix=new Intent(Question_6.this,qw6.class);
                    startActivity(intentsix);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });

      mCheckButton11 = findViewById(R.id.check_button11);
        mCheckButton11.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               String valueString =null;
                int value =10;

                if (value == mCorrectValue) {
                    Intent intentsix=new Intent(Question_6.this,qr6.class);
                    startActivity(intentsix);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);


                } else {
                    Intent intentsix=new Intent(Question_6.this,qw6.class);
                  startActivity(intentsix);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

        });
        mcheckButton30 = findViewById(R.id.check_button30);
        mcheckButton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString =null;
                int value =30;

                if (value == mCorrectValue) {
                    Intent intentfour = new Intent(Question_6.this,qr6.class);
                 startActivity(intentfour);
                  overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);



                } else {
                    Intent intentfour = new Intent(Question_6.this,qw6.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }

     });
       mcheckButton31= findViewById(R.id.check_button31);
        mcheckButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String valueString =null;
             int value =30;
               if (value == mCorrectValue) {
                    Intent intentfour = new Intent(Question_6.this,qr6.class);
                    startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);



                } else {
                    Intent intentfour = new Intent(Question_6.this,qw6.class);
                   startActivity(intentfour);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }
       });


    }
}