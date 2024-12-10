package com.example.colleandroid;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.note_c).setOnClickListener(view -> playSound(R.raw.note_c));
        findViewById(R.id.note_d).setOnClickListener(view -> playSound(R.raw.note_d));
        findViewById(R.id.note_e).setOnClickListener(view -> playSound(R.raw.note_e));
        findViewById(R.id.note_f).setOnClickListener(view -> playSound(R.raw.note_f));
        findViewById(R.id.note_g).setOnClickListener(view -> playSound(R.raw.note_g));
        findViewById(R.id.note_a).setOnClickListener(view -> playSound(R.raw.note_a));
        findViewById(R.id.note_b).setOnClickListener(view -> playSound(R.raw.note_b));
    }

    private void playSound(int soundId) {
        if (mediaPlayer != null) {
            mediaPlayer.release(); // Libère l'ancien son
        }
        mediaPlayer = MediaPlayer.create(this, soundId);
        mediaPlayer.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
