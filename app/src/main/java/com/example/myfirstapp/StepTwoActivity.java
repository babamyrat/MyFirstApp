package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class StepTwoActivity extends AppCompatActivity {
    EditText edText, edName, edEmail, edPass, edPhone, edNum;
    TextView txtTextView01, txtTextView02, txtTextView03, txtTextView04, txtTextView05, txtTextView06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_two);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //EditText
        edEmail = findViewById(R.id.editTextTextEmailAddress);
        edName = findViewById(R.id.editTextTextPersonName);
        edPass = findViewById(R.id.editTextTextPassword);
        edText = findViewById(R.id.editTextText2);
        edNum = findViewById(R.id.editTextNumber);
        edPhone = findViewById(R.id.editTextPhone2);

        //TextView
        txtTextView01 = findViewById(R.id.txtTextView01);
        txtTextView02 = findViewById(R.id.txtTextView02);
        txtTextView03 = findViewById(R.id.txtTextView03);
        txtTextView04 = findViewById(R.id.txtTextView04);
        txtTextView05 = findViewById(R.id.txtTextView05);
        txtTextView06 = findViewById(R.id.txtTextView06);

    }

    public void ok(View view) {
        //EditText to String
        String text1 = edName.getText().toString();
        String text2 = edText.getText().toString();
        String text3 = edPhone.getText().toString();
        String text4 = edNum.getText().toString();
        String text5 = edPass.getText().toString();
        String text6 = edEmail.getText().toString();


      //When click button
        txtTextView01.setText(text1);
        txtTextView02.setText(text2);
        txtTextView03.setText(text3);
        txtTextView04.setText(text4);
        txtTextView05.setText(text5);
        txtTextView06.setText(text6);

    }
}