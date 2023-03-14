package com.example.learnme.Vechile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.learnme.Birds.Birds;
import com.example.learnme.Birds.Birds_two;
import com.example.learnme.R;

public class vechile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vechile);
        getSupportActionBar().hide();

        ImageButton click1 = (ImageButton) findViewById(R.id.button1);
        ImageButton click2 = (ImageButton) findViewById(R.id.button2);
        ImageButton click3 = (ImageButton) findViewById(R.id.button3);
        ImageButton click4 = (ImageButton) findViewById(R.id.button4);
        ImageButton click5 = (ImageButton) findViewById(R.id.button5);
        ImageButton click6 = (ImageButton) findViewById(R.id.button6);

        final MediaPlayer mp1 = MediaPlayer.create(getApplicationContext(), R.raw.motorbike);
        final MediaPlayer mp2 = MediaPlayer.create(getApplicationContext(), R.raw.car);
        final MediaPlayer mp3 = MediaPlayer.create(getApplicationContext(), R.raw.bus);
        final MediaPlayer mp4 = MediaPlayer.create(getApplicationContext(), R.raw.train);
        final MediaPlayer mp5 = MediaPlayer.create(getApplicationContext(), R.raw.lorry);
        final MediaPlayer mp6 = MediaPlayer.create(getApplicationContext(), R.raw.bicycle);


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
                    case R.id.button5:
                        mp5.start();
                        break;
                    case R.id.button6:
                        mp6.start();
                        break;
                }
            }
        };
        click1.setOnClickListener(elem);
        click2.setOnClickListener(elem);
        click3.setOnClickListener(elem);
        click4.setOnClickListener(elem);
        click5.setOnClickListener(elem);
        click6.setOnClickListener(elem);
    }


    public void vectwo(View view) {
        Intent intent = new Intent(vechile.this, vechile_two.class);
        startActivity(intent);
    }

}