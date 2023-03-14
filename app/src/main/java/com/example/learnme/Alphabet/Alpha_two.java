package com.example.learnme.Alphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.learnme.Numbers.MainActivity;
import com.example.learnme.Numbers.MainActivity2;
import com.example.learnme.R;
import com.example.learnme.Sub_list;

public class Alpha_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_two);
        getSupportActionBar().hide();

        Button click1=(Button)findViewById(R.id.button1);
        Button click2=(Button)findViewById(R.id.button2);
        Button click3=(Button)findViewById(R.id.button3);
        Button click4=(Button)findViewById(R.id.button4);
        Button click5=(Button)findViewById(R.id.button5);
        Button click6=(Button)findViewById(R.id.button6);
        Button click7=(Button)findViewById(R.id.button7);
        Button click8=(Button)findViewById(R.id.button8);
        Button click9=(Button)findViewById(R.id.button9);



        final MediaPlayer mp1=MediaPlayer.create(getApplicationContext(), R.raw.s);
        final MediaPlayer mp2=MediaPlayer.create(getApplicationContext(), R.raw.t);
        final MediaPlayer mp3=MediaPlayer.create(getApplicationContext(), R.raw.u);
        final MediaPlayer mp4=MediaPlayer.create(getApplicationContext(), R.raw.v);
        final MediaPlayer mp5=MediaPlayer.create(getApplicationContext(), R.raw.w);
        final MediaPlayer mp6=MediaPlayer.create(getApplicationContext(), R.raw.x);
        final MediaPlayer mp7=MediaPlayer.create(getApplicationContext(), R.raw.y);
        final MediaPlayer mp8=MediaPlayer.create(getApplicationContext(), R.raw.z);
        final MediaPlayer mp9=MediaPlayer.create(getApplicationContext(), R.raw.z);



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
                    case R.id.button7:
                        mp7.start();
                        break;
                    case R.id.button8:
                        mp8.start();
                        break;
                    case R.id.button9:
                        mp9.start();
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
        click7.setOnClickListener(elem);
        click8.setOnClickListener(elem);
        click9.setOnClickListener(elem);

    }

    public void Alphamenu(View view) {
        Intent intent=new Intent(Alpha_two.this, Sub_list.class);
        startActivity(intent);
    }
}