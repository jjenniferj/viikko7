package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String word;
    TextView text;
    EditText textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.testFunction();
        text = (TextView)  findViewById(R.id.textView);
        textInput = (EditText) findViewById(R.id.editText);
    }


    public void testFunction(View v) {
        //System.out.println("Hello World!");
        //text.setText("Hello World!");
        word = textInput.getText().toString();
        text.setText(word);
    }
}
