package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class StepOneActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    TextView txtToggleButton, txtSwitch, txtCheckBox, txtEditText;
    Button btnReset;
    Switch aSwitch;
    CheckBox checkBox;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_one);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtToggleButton = findViewById(R.id.txtToggleButton);
        txtSwitch = findViewById(R.id.txtSwitch);
        txtCheckBox = findViewById(R.id.txtCheckBox);
        txtEditText = findViewById(R.id.txtEditText);

        toggleButton = findViewById(R.id.toggleButton);
        btnReset = findViewById(R.id.btnReset);
        aSwitch= findViewById(R.id.switch1);
        checkBox = findViewById(R.id.checkBox);
        editText = findViewById(R.id.editText);


        clickReset();
        toggleButton();
        switchAll();
        clickCheckBox();
        clickEditText();


    }

    private void clickEditText() {

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                String text = editText.getText().toString();

                if(s.length() != 0)
                    txtEditText.setText(text);
            }
        });

    }

    private void clickCheckBox() {
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    txtCheckBox.setText("On");
                } else {
                    txtCheckBox.setText("Off");
                }
            }
        });
    }

    private void switchAll() {
        aSwitch.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b){
                txtSwitch.setText("On");
            }else{
                txtSwitch.setText("Off");
            }
        });
    }

    private void clickReset() {
        btnReset.setOnClickListener(view -> {
            txtToggleButton.setText("Text");
            txtSwitch.setText("Text");
            txtCheckBox.setText("Text");
            txtEditText.setText("Text");
        });
    }

    private void toggleButton() {
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                txtToggleButton.setText("On");
            } else {
                txtToggleButton.setText("Off");
            }
        });
    }
}