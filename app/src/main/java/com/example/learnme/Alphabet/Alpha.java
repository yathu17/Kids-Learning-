package com.example.learnme.Alphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.learnme.Numbers.MainActivity;
import com.example.learnme.Numbers.MainActivity2;
import com.example.learnme.R;

public class Alpha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
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
        Button click10=(Button)findViewById(R.id.button10);
        Button click11=(Button)findViewById(R.id.button11);
        Button click12=(Button)findViewById(R.id.button12);
        Button click13=(Button)findViewById(R.id.button13);
        Button click14=(Button)findViewById(R.id.button14);
        Button click15=(Button)findViewById(R.id.button15);
        Button click16=(Button)findViewById(R.id.button16);
        Button click17=(Button)findViewById(R.id.button17);
        Button click18=(Button)findViewById(R.id.button18);


        final MediaPlayer mp1=MediaPlayer.create(getApplicationContext(), R.raw.a);
        final MediaPlayer mp2=MediaPlayer.create(getApplicationContext(), R.raw.b);
        final MediaPlayer mp3=MediaPlayer.create(getApplicationContext(), R.raw.c);
        final MediaPlayer mp4=MediaPlayer.create(getApplicationContext(), R.raw.d);
        final MediaPlayer mp5=MediaPlayer.create(getApplicationContext(), R.raw.e);
        final MediaPlayer mp6=MediaPlayer.create(getApplicationContext(), R.raw.f);
        final MediaPlayer mp7=MediaPlayer.create(getApplicationContext(), R.raw.g);
        final MediaPlayer mp8=MediaPlayer.create(getApplicationContext(), R.raw.h);
        final MediaPlayer mp9=MediaPlayer.create(getApplicationContext(), R.raw.i);
        final MediaPlayer mp10=MediaPlayer.create(getApplicationContext(), R.raw.j);
        final MediaPlayer mp11=MediaPlayer.create(getApplicationContext(), R.raw.k);
        final MediaPlayer mp12=MediaPlayer.create(getApplicationContext(), R.raw.l);
        final MediaPlayer mp13=MediaPlayer.create(getApplicationContext(), R.raw.m);
        final MediaPlayer mp14=MediaPlayer.create(getApplicationContext(), R.raw.n);
        final MediaPlayer mp15=MediaPlayer.create(getApplicationContext(), R.raw.o);
        final MediaPlayer mp16=MediaPlayer.create(getApplicationContext(), R.raw.p);
        final MediaPlayer mp17=MediaPlayer.create(getApplicationContext(), R.raw.q);
        final MediaPlayer mp18=MediaPlayer.create(getApplicationContext(), R.raw.r);


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
                    case R.id.button10:
                        mp10.start();
                        break;
                    case R.id.button11:
                        mp11.start();
                        break;
                    case R.id.button12:
                        mp12.start();
                        break;
                    case R.id.button13:
                        mp13.start();
                        break;
                    case R.id.button14:
                        mp14.start();
                        break;
                    case R.id.button15:
                        mp15.start();
                        break;
                    case R.id.button16:
                        mp16.start();
                        break;
                    case R.id.button17:
                        mp17.start();
                        break;
                    case R.id.button18:
                        mp18.start();
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
        click10.setOnClickListener(elem);
        click11.setOnClickListener(elem);
        click12.setOnClickListener(elem);
        click13.setOnClickListener(elem);
        click14.setOnClickListener(elem);
        click15.setOnClickListener(elem);
        click16.setOnClickListener(elem);
        click17.setOnClickListener(elem);
        click18.setOnClickListener(elem);

    }

    public void Alphatwo(View view) {
        Intent intent=new Intent(Alpha.this, Alpha_two.class);
        startActivity(intent);
    }
}