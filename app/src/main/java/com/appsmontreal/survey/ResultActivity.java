package com.appsmontreal.survey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import model.Survey;

public class ResultActivity extends AppCompatActivity {
    ArrayList<Survey> surveys;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        initialize();
    }

    private void initialize() {
        surveys = (ArrayList<Survey>) getIntent().getExtras().getSerializable(MainActivity.KEY);
    }
}
