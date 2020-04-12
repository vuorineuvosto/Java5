package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    TextView text;
    TextView text2;
    EditText userInput;
    int count = 0;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = findViewById(R.id.userInput);
        text = findViewById(R.id.textView);
        text2 = findViewById(R.id.textView2);

    }

    public void speak(View v){
        System.out.println("Hello World!"); // 7.1 Tehtävä, konsoliin.
        if(count > 0){
            text.setText(userInput.getText().toString()); // 7.3Tehtävä, >1. painalluksella teksti tulee käyttäjän syötteestä.
        }else{
            text.setText("Hello World!"); // 7.2 Tehtävä, 1. painalluksella teksti muuttuu "Hello World!":si
        }
        count++;
    }
    public void jee(View a){
            text2.setText(userInput.getText().toString()); // 7.4 Tehtävä, syöte päivitetään enterillä.

    }
}
