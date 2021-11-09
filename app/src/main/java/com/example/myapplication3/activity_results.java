package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_results extends AppCompatActivity {

    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intent = getIntent();
        Quiz quiz = (Quiz) intent.getExtras().getSerializable("quiz");

        res = findViewById(R.id.results);

        res.setText("Correct\t  " + quiz.correctCount + "\nWrong\t  " + quiz.wrongCount + "\nTotal\t  10");
    }
}