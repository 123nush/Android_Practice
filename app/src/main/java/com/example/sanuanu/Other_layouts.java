package com.example.sanuanu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class Other_layouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_layouts);

        String name[]={"Anushka","Sanika","Sakski"};
        ListView list1=findViewById(R.id.list1);
        ArrayAdapter<String> arr=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,name);
        list1.setAdapter(arr);
        String sub[]={"AI","ML","AWP"};
        ArrayAdapter<String> s=new ArrayAdapter<>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,sub);
        GridView g1=findViewById(R.id.grid1);
        g1.setAdapter(s);
    }
}