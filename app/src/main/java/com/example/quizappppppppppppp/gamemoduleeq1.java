package com.example.quizappppppppppppp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class gamemoduleeq1 extends AppCompatActivity {

   ImageButton m1;
   ImageButton m2;


    @SuppressLint({"MissingInflatedId", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamemoduleq1);

        m1=findViewById(R.id.hello);
        m1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(gamemoduleeq1.this,gamemodulew1.class);
                startActivity(l);
                finish();
            }
        });
        m2=findViewById(R.id.hello2);
        m2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p=new Intent(gamemoduleeq1.this,gamemoduler1.class);
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


