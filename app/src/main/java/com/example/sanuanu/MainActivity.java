package com.example.sanuanu;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.sanuanu.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        TextView text = findViewById(R.id.hello);
        TextView no1_text1=findViewById(R.id.no1_text);
        TextView no2_text1=findViewById(R.id.no2_text);
        EditText no1=findViewById(R.id.no1);
        EditText no2=findViewById(R.id.no2);
        Button b1=findViewById(R.id.button_first);
        TextView r=findViewById(R.id.result);
        Button b2=findViewById(R.id.button_second);
        Button button_relative=findViewById(R.id.button_relative);
        Button button_other=findViewById(R.id.other_layout);
        //code for addition
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x=Integer.parseInt(no1.getText().toString());
                int y=Integer.parseInt(no2.getText().toString());

                int z=x+y;
                r.setText(String.valueOf(z));
                Log.d("RESULT",r.toString());


            }
        });
        //code for multiplication
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(no1.getText().toString());
                TableLayout t1=findViewById(R.id.mul_table);
                for(int i=1;i<11;i++){
                    TableRow t=new TableRow(getApplicationContext());
                    TextView text=new TextView(getApplicationContext());
                    int z=a*i;
                    text.setAutoLinkMask(20);
                    text.setText(String.valueOf(z));
                    t.addView(text);
                    t1.addView(t);
                }
            }
        });

        button_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent rel=new Intent(MainActivity.this,Relative.class);
                Intent rel=new Intent(MainActivity.this,greed.class);
                startActivity(rel);
            }
        });
        button_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent other=new Intent(MainActivity.this,Other_layouts.class);
                startActivity(other);

            }
        });

        Button app=findViewById(R.id.app);
        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ab =new Intent(MainActivity.this,AppBarFragments.class);
                startActivity(ab);
            }
        });
        Button lc = findViewById(R.id.act_life_cycle);
        lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Do you want to Navigate?");
                builder.setTitle("Alert!!");
                builder.setCancelable(false);
                builder.setPositiveButton("No",(DialogInterface.OnClickListener)(dialog, which) -> {
                    dialog.cancel();
                });
                builder.setNegativeButton("Yes",(DialogInterface.OnClickListener)(dialog, which) -> {
                    Intent intent = new Intent(MainActivity.this, ActivityLifecycle.class);
                    startActivity(intent);
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();




            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Do you want to exit?");
        builder.setTitle("Alert!!");
        builder.setCancelable(false);
        builder.setPositiveButton("No",(DialogInterface.OnClickListener)(dialog, which) -> {
            dialog.cancel();
        });
        builder.setNegativeButton("Yes",(DialogInterface.OnClickListener)(dialog, which) -> {
            finish();
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}
