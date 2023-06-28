package com.example.quizappppppppppppp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class gamemoduleeq2 extends AppCompatActivity {

   ImageButton m1;
   ImageButton m2;


    @SuppressLint({"MissingInflatedId", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamemoduleq2);

        m1=findViewById(R.id.hello);
        m1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(gamemoduleeq2.this,gamemodulew2.class);
                startActivity(l);
                finish();
            }
        });
        m2=findViewById(R.id.hello2);
        m2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p=new Intent(gamemoduleeq2.this,gamemoduler2.class);
                startActivity(p);
                finish();
            }
        });


    }


}

     /*   videoView = findViewById(R.id.video);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.backgroundvid);
        videoView.setVideoURI(uri);
        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }

        });




}
    @Override
    protected void onResume () {
        videoView.resume();
        super.onResume();
    }

    @Override
    protected void onRestart () {
        videoView.start();
        super.onRestart();
    }

    @Override
    protected void onPause () {
        videoView.pause();
        super.onPause();
    }
}*/


