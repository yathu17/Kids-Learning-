package com.example.learnme;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learnme.Alphabet.Alpha;
import com.example.learnme.Animals.Animals;
import com.example.learnme.Birds.Birds;
import com.example.learnme.Colors.colors;
import com.example.learnme.Numbers.MainActivity;
import com.example.learnme.Vechile.vechile;

public class Sub_list extends AppCompatActivity {
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_list);
        button=(Button)findViewById(R.id.button);


        ListView listView = findViewById(R.id.listView);

        final String[] text = {"ALPHABET", "NUMBERS", "COLORS","ANIMALS","BIRDS","VEHICLE",};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, text);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You Clicked "+ text[position], Toast.LENGTH_SHORT).show();
                if(position==0) {
                    startActivity(new Intent(Sub_list.this, Alpha.class));
                }else if(position==1) {
                    startActivity(new Intent(Sub_list.this, MainActivity.class));
                }else if(position==2) {
                    startActivity(new Intent(Sub_list.this, colors.class));
                }else if(position==3) {
                    startActivity(new Intent(Sub_list.this, Animals.class));
                }else if(position==4) {
                    startActivity(new Intent(Sub_list.this, Birds.class));
                }else if(position==5) {
                    startActivity(new Intent(Sub_list.this, vechile.class));
                }
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}


