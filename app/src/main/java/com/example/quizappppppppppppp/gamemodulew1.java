package com.example.quizappppppppppppp;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class gamemodulew1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamemodulew1);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);



        Thread td = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(7000);
                } catch (Exception ex) {
                    ex.printStackTrace();

                } finally {
                    Intent g1 = new Intent(gamemodulew1.this, gamemodule1.class);
                    startActivity(g1);
                    finish();

                }
            }
        };
        td.start();


    }

}
