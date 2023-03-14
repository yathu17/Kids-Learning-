package com.example.learnme;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class User extends AppCompatActivity {

    SQLiteDatabase db;
    EditText Edittext_Name,Edittext_Age;
    String NameHolder,AgeHolder,SQLiteDataBaseQueryHolder;
    Button EnterData;
    Boolean EditTextEmptyHold;
    int Age_limit=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        getSupportActionBar().hide();
        EnterData=(Button) findViewById(R.id.Button_Add);
        Edittext_Name=(EditText)findViewById(R.id.Edittext_Name);
        Edittext_Age=(EditText)findViewById(R.id.Edittext_Price);

        EnterData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDataBaseBuild();
                SQLiteTableBuild();
                AddData();
            }
        });
    }

    public void SQLiteDataBaseBuild(){
        db=openOrCreateDatabase("InventoryDb1", Context.MODE_PRIVATE,null);
    }

    public void SQLiteTableBuild(){
        db.execSQL("CREATE TABLE IF NOT EXISTS Product_Table(name VARCHAR,price VARCHAR);");
    }

    public void AddData(){
        NameHolder=Edittext_Name.getText().toString();
        AgeHolder=Edittext_Age.getText().toString();


        if (TextUtils.isEmpty(NameHolder)||TextUtils.isEmpty(AgeHolder)){
            Toast.makeText(User.this,"Please Fill All the required fields",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(User.this,"Data Successfully Entered",Toast.LENGTH_LONG).show();
            SQLiteDataBaseQueryHolder="INSERT INTO Product_Table(name,price) VALUES('"+NameHolder+"','"+AgeHolder+"');";
            db.execSQL(SQLiteDataBaseQueryHolder);
            Intent intent=new Intent(User.this,Sub_list.class);
            startActivity(intent);
        }
        Edittext_Age.setText("");
        Edittext_Age.setText("");
    }
}