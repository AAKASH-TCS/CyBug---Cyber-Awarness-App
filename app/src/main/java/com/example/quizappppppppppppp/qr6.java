package com.example.quizappppppppppppp;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class qr6 extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr6);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);



        Thread td = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(7000);
                } catch (Exception ex) {
                    ex.printStackTrace();

                } finally {
                    Intent g1 = new Intent(qr6.this, Question_7.class);
                    startActivity(g1);
                    finish();

                }
            }
        };
        td.start();


    }

}
