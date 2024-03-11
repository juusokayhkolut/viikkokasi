package com.example.viikkokahdeksan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editFirstNumber, editSecondNumber;
    Button plusButton, minusButton, multiplyButton, divideButton;
    TextView textSeeResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFirstNumber = findViewById(R.id.editFirstNumber);
        editSecondNumber = findViewById(R.id.editSecondNumber);
        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        textSeeResult = findViewById(R.id.textSeeResult);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(editFirstNumber.getText().toString());
                int secondNumber = Integer.parseInt(editSecondNumber.getText().toString());
                int result = firstNumber + secondNumber;
                textSeeResult.setText(String.valueOf(result));
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(editFirstNumber.getText().toString());
                int secondNumber = Integer.parseInt(editSecondNumber.getText().toString());
                int result = firstNumber - secondNumber;
                textSeeResult.setText(String.valueOf(result));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(editFirstNumber.getText().toString());
                int secondNumber = Integer.parseInt(editSecondNumber.getText().toString());
                int result = firstNumber * secondNumber;
                textSeeResult.setText(String.valueOf(result));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(editFirstNumber.getText().toString());
                int secondNumber = Integer.parseInt(editSecondNumber.getText().toString());
                int result = secondNumber != 0 ? firstNumber / secondNumber : 0;
                textSeeResult.setText(String.valueOf(result));
            }
        });
    }
}