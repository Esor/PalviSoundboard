package com.example.sormu.palvisoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mysound1;
    MediaPlayer mysound2;
    MediaPlayer mysound3;
    MediaPlayer mysound4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mysound1 = MediaPlayer.create(this, R.raw.jaffattulloo);
        mysound2 = MediaPlayer.create(this, R.raw.kossupullovaihtunut);
        mysound3 = MediaPlayer.create(this, R.raw.palviasaadaperke);
        mysound4 = MediaPlayer.create(this, R.raw.valillajuotavamiedompia);



    }

    public void sound1(View view) {
        mysound1.start();
    }
    public void sound2(View view) {
        mysound2.start();
    }
    public void sound3(View view) {
        mysound3.start();
    }
    public void sound4(View view) {
        mysound4.start();
    }
}

