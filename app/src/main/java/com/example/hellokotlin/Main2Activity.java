package com.example.hellokotlin;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button button7;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button7 = findViewById(R.id.button7);
        textView2 = findViewById(R.id.textView2);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data == null){
            return;
        }
        String name = data.getStringExtra("home");
        int homeChet = data.getIntExtra("homeChet", 0);
        if(name != ""){
            textView2.setText(name);
        }

        if(homeChet >= 0 && homeChet <=1){
            textView2.setText("Ваша оценка 2");
        }else
            if (homeChet >=2 && homeChet <= 3){
            textView2.setText("Ваша оценка 3");
        }else
            if (homeChet >= 4 && homeChet <= 5){
            textView2.setText("Ваша оценка 4");
        }else
            textView2.setText("Ваша оценка 5");

    }

    public void click(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivityForResult(intent, 1);
    }
}
