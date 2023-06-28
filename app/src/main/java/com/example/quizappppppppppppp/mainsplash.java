package com.example.quizappppppppppppp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Objects;

public class mainsplash extends AppCompatActivity {
   @Override
    protected void onCreate(Bundle savedInstanceState)
   {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.mainsplash);
       getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

    Thread td =new Thread(){
        @Override
        public void run() {
            try {
                sleep(5000);
            }
            catch (Exception ex){
                ex.printStackTrace();

            }
            finally {
                Intent pika=new Intent(mainsplash.this,calculator.class);
                startActivity(pika);
                finish();

            }
        }
    };td.start();





    }
}