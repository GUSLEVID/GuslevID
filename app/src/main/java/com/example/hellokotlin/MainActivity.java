package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()) {
            case R.id.button:
                intent = new Intent(this, ScrollingActivity.class);
                startActivity(intent);
                break;
        }

        switch (v.getId()) {
            case R.id.button2:
                intent = new Intent(this, ScrollingActivity2.class);
                startActivity(intent);
                break;
        }
        switch (v.getId()) {
            case R.id.button3:
                intent = new Intent(this, ScrollingActivity3.class);
                startActivity(intent);
                break;
        }
        switch (v.getId()) {
            case R.id.button4:
                intent = new Intent(this, ScrollingActivity4.class);
                startActivity(intent);
                break;
        }
        switch (v.getId()) {
            case R.id.button5:
                intent = new Intent(this, ScrollingActivity5.class);
                startActivity(intent);
                break;
        }
        switch (v.getId()) {
            case R.id.button6:
                intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;


        }


    }}


