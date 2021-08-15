package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    CardView cardView, cardView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = findViewById(R.id.cardClickOne);
        cardView2 = findViewById(R.id.cardClickTwo);

        cardView.setOnClickListener(view ->
            startActivity(new Intent(MainActivity.this, StepOneActivity.class))
        );

        cardView2.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, StepTwoActivity.class))
        );
    }
}