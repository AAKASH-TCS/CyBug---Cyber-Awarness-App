package com.example.quizappppppppppppp;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class qw5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qw5);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);



        Thread td = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(7000);
                } catch (Exception ex) {
                    ex.printStackTrace();

                } finally {
                    Intent g1 = new Intent(qw5.this, Question_6.class);
                    startActivity(g1);
                    finish();

                }
            }
        };
        td.start();


    }

}
