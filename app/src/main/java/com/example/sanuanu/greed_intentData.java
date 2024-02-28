package com.example.sanuanu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class greed_intentData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greed_intent_data);
        Intent intent=getIntent();
        String n=intent.getStringExtra("Name");
//        String a=intent.getStringExtra("Age");
//        String m=intent.getStringExtra("Mobile");
//        String r=intent.getStringExtra("Roll");

        TextView content=findViewById(R.id.content);
//        TextView content1=findViewById(R.id.content1);

        content.setText("Helooo");
//        content.setText("Name:"+n+" "+"Age:"+a+" "+"Mobile:"+m+" "+"Roll No:"+r);
//        content.setText(String.valueOf(n));

    }
}