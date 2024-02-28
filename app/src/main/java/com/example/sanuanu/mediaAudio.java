package com.example.sanuanu;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class mediaAudio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_audio);

        Button str_brn = findViewById(R.id.str_btn);
        Button pause_btn = findViewById(R.id.pause_btn);
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(mediaAudio.this,R.raw.songg);
        str_brn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Toast.makeText(mediaAudio.this, "Audio Played", Toast.LENGTH_SHORT).show();
            }
        });
        pause_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.release();
                Toast.makeText(mediaAudio.this, "Audio paused", Toast.LENGTH_SHORT).show();
            }
        });
    }
}