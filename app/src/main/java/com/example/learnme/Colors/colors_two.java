package com.example.learnme.Colors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.learnme.R;
import com.example.learnme.Sub_list;

public class colors_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors_two);
        getSupportActionBar().hide();

        ImageButton click1=(ImageButton)findViewById(R.id.button1);
        ImageButton click2=(ImageButton)findViewById(R.id.button2);
        ImageButton click3=(ImageButton)findViewById(R.id.button3);
        ImageButton click4=(ImageButton)findViewById(R.id.button4);


        final MediaPlayer mp1=MediaPlayer.create(getApplicationContext(), R.raw.brown);
        final MediaPlayer mp2=MediaPlayer.create(getApplicationContext(), R.raw.blue);
        final MediaPlayer mp3=MediaPlayer.create(getApplicationContext(), R.raw.black);
        final MediaPlayer mp4=MediaPlayer.create(getApplicationContext(), R.raw.white);


        View.OnClickListener elem = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.button1:
                        mp1.start();
                        break;
                    case R.id.button2:
                        mp2.start();
                        break;
                    case R.id.button3:
                        mp3.start();
                        break;
                    case R.id.button4:
                        mp4.start();
                        break;

                }
            }
        };
        click1.setOnClickListener(elem);
        click2.setOnClickListener(elem);
        click3.setOnClickListener(elem);
        click4.setOnClickListener(elem);
    }


    public void colorsmenu(View view) {
        Intent intent=new Intent(colors_two.this, Sub_list.class);
        startActivity(intent);
    }
}