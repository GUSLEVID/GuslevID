package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView textView;
    String name;
    int homeChet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView = findViewById(R.id.textView3);

        Intent intent = getIntent();
        name = intent.getStringExtra("chet");
        homeChet = intent.getIntExtra("homeChet", 0);
        textView.setText(name);
    }
    public void clickHome2(View v){
        Intent intent = new Intent();
        intent.putExtra("homeChet", homeChet);
        setResult(RESULT_OK, intent);
        finish();
    }
}
