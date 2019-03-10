package com.appsmontreal.survey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import model.Calculation;
import model.Survey;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {
    ArrayList<Survey> surveys;
    Button buttonReturn;
    Calculation calculator;
    TextView textViews[] = new TextView[12];
    int textViewWidgets[] ={R.id.textViewAppleTotal,R.id.textViewOrangeTotal,R.id.textViewMixedTotal,R.id.textViewCocaTotal,R.id.textViewSpriteTotal,R.id.textViewSevenUpTotal,
                            R.id.textViewApplePercentage,R.id.textViewOrangePercentage,R.id.textViewMixedPercentage,R.id.textViewCocaPercentage,R.id.textViewSpritePercentage,R.id.textViewSevenUpPercentage};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        initialize();
    }

    private void initialize() {
        for(int x = 0; x < textViews.length; x++){
            textViews[x] = (TextView) findViewById(textViewWidgets[x]);
        }
        buttonReturn = (Button) findViewById(R.id.buttonReturn);
        buttonReturn.setOnClickListener(this);
//        surveys = (ArrayList<Survey>) getIntent().getExtras().getSerializable(MainActivity.KEY);
        calculator = new Calculation();
        showUpResults();
    }

    private void showUpResults() {
        calculator.calculate();
        textViews[0].setText(String.valueOf(calculator.getTotalApple()));
        textViews[1].setText(String.valueOf(calculator.getTotalOrange()));
        textViews[2].setText(String.valueOf(calculator.getTotalMixed()));
        textViews[3].setText(String.valueOf(calculator.getTotalCoca()));
        textViews[4].setText(String.valueOf(calculator.getTotalSprite()));
        textViews[5].setText(String.valueOf(calculator.getTotalSevenUP()));
        textViews[6].setText(String.valueOf(calculator.getPercentageApple()));
        textViews[7].setText(String.valueOf(calculator.getPercentageOrange()));
        textViews[8].setText(String.valueOf(calculator.getPercentageMixed()));
        textViews[9].setText(String.valueOf(calculator.getPercentageCoca()));
        textViews[10].setText(String.valueOf(calculator.getPercentageSprite()));
        textViews[11].setText(String.valueOf(calculator.getPercentageSevenUP()));

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonReturn:
                finish();
                break;
            default:
                break;
        }
    }



}
