package com.example.saumyaawasthi.phrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
public void play(View view){
  Button button=(Button) view;
    Log.i("button pressed",button.getTag().toString());
	Log.i("Button Works just Fine ","button works");
    mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(button.getTag().toString(),


            "raw",getPackageName()));
    mediaPlayer.start();
Log.i("Media Player","START");
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
