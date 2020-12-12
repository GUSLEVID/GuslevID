package com.example.hellokotlin;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    TextView textView;
    ArrayList<String> answers = new ArrayList<>();
    ArrayList<String> otvets = new ArrayList<>();
    EditText editText;
    int a = 0;
    int chet = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView = findViewById(R.id.textView4);
        editText = findViewById(R.id.editText2);
        createAnswers();
        createOtvet();
        textView.setText(answers.get(a));
    }
    public void createAnswers(){
        answers.add("Как назывался остров не подалеку от Петербурга?");
        answers.add("С каким языком чаще сравнивают Kotlin?");
        answers.add("В каком году Kotlin начал набирать популярность?");
        answers.add("fun ___ (args: Array234<String>");
        answers.add("member function это?");

    }

    public  void createOtvet(){
        otvets.add("Kotlin");
        otvets.add("Java");
        otvets.add("2015");
        otvets.add("main");
        otvets.add("Функция");

    }
    public void proverka(View v){
        String temp = editText.getText().toString();
        String tempOtvet = otvets.get(a);
        if(tempOtvet.equals(temp)){
            chet++;
        }
        a++;
        editText.setText("");
        if(a > 4){
            Intent intent = new Intent(this, Main4Activity.class);
            intent.putExtra("chet", "Ваш счет:" + chet);
            intent.putExtra("homeChet", chet);
            startActivityForResult(intent, 1);
            //finish();
        }else {
            textView.setText(answers.get(a));
        }

    }
    public void clickHome(View v){
        Intent intent = new Intent();
        intent.putExtra("home", "Вы вернулись домой. повторите тест");
        setResult(RESULT_OK, intent);
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Intent intent = new Intent();
        intent.putExtra("homeChet", data.getStringExtra("homeChet"));
        setResult(RESULT_OK, intent);
        finish();
    }
}
