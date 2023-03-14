
package com.example.learnme.Animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.learnme.R;
import com.example.learnme.Sub_list;

public class Animals_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_two);
        getSupportActionBar().hide();

        ImageButton click1=(ImageButton)findViewById(R.id.button1);
        ImageButton click2=(ImageButton)findViewById(R.id.button2);
        ImageButton click3=(ImageButton)findViewById(R.id.button3);
        ImageButton click4=(ImageButton)findViewById(R.id.button4);
        ImageButton click5=(ImageButton)findViewById(R.id.button5);

        final MediaPlayer mp1=MediaPlayer.create(getApplicationContext(), R.raw.snake);
        final MediaPlayer mp2=MediaPlayer.create(getApplicationContext(), R.raw.monkey);
        final MediaPlayer mp3=MediaPlayer.create(getApplicationContext(), R.raw.kangaroo);
        final MediaPlayer mp4=MediaPlayer.create(getApplicationContext(), R.raw.camel);
        final MediaPlayer mp5=MediaPlayer.create(getApplicationContext(), R.raw.wolf);


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
                }
            }
        };
        click1.setOnClickListener(elem);
        click2.setOnClickListener(elem);
        click3.setOnClickListener(elem);
        click4.setOnClickListener(elem);
        click5.setOnClickListener(elem);
    }

    public void ammenu(View view) {
        Intent intent=new Intent(Animals_two.this, Sub_list.class);
        startActivity(intent);
    }

    public void alert(View view) {
            Toast.makeText(getApplicationContext(),"No Objects",Toast.LENGTH_SHORT).show();
    }
}