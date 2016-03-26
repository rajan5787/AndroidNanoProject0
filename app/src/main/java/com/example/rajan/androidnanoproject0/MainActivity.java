package com.example.rajan.androidnanoproject0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mapping();

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }



    public void mapping(){
        button1=(Button)findViewById(R.id.btn_project_1);
        button2=(Button)findViewById(R.id.btn_project_2);
        button3=(Button)findViewById(R.id.btn_project_3);
        button4=(Button)findViewById(R.id.btn_project_4);
        button5=(Button)findViewById(R.id.btn_project_5);
        button6=(Button)findViewById(R.id.btn_project_6);

    }

    @Override
    public void onClick(View v) {
        Button button=(Button)v;
        int id = v.getId();
        switch (id){
            case R.id.btn_project_1:
                Toast.makeText(MainActivity.this,"This button will launch "+button.getText(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_project_2:
                Toast.makeText(MainActivity.this,"This button will launch "+button.getText(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_project_3:
                Toast.makeText(MainActivity.this,"This button will launch "+button.getText(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_project_4:
                Toast.makeText(MainActivity.this,"This button will launch "+button.getText(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_project_5:
                Toast.makeText(MainActivity.this,"This button will launch "+button.getText(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_project_6:
                Toast.makeText(MainActivity.this,"This button will launch CAPSTONE APP",Toast.LENGTH_SHORT).show();
                break;
        }

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

        return super.onOptionsItemSelected(item);
    }
}
