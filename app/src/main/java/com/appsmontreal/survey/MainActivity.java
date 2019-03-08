package com.appsmontreal.survey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

import model.Survey;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener {

    public enum Drink{
        JUICE,
        LEMONADE;
    }

    public static final String KEY = "ok";


    EditText editTextUserId;
    EditText editTextNumberCups;
    RadioGroup radioGroupButtonJuice;
    RadioGroup radioGroupButtonLemonade;
    Button buttonAdd;
    Button buttonNew;
    Button buttonResults;
    Spinner spinnerDrinkType;
    ArrayList<Drink> drinkTypes;
    ArrayAdapter adapter;
    ArrayList<Survey> surveys;
    String drink;
    RadioButton radioButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        editTextUserId = (EditText) findViewById(R.id.editTextUserId);
        editTextNumberCups = (EditText) findViewById(R.id.editTextNumberCups);
        radioGroupButtonJuice = (RadioGroup) findViewById(R.id.radioGroupButtonJuice);
        radioGroupButtonLemonade = (RadioGroup) findViewById(R.id.radioGroupButtonLimonade);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonNew = (Button) findViewById(R.id.buttonNew);
        buttonResults = (Button) findViewById(R.id.buttonResults);
        buttonAdd.setOnClickListener(this);
        buttonNew.setOnClickListener(this);
        buttonResults.setOnClickListener(this);
        spinnerDrinkType = (Spinner) findViewById(R.id.spinnerDrinkType);
        spinnerDrinkType.setOnItemSelectedListener(this);
        drinkTypes = new ArrayList<>();
        populateSpinner();
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,drinkTypes);
        spinnerDrinkType.setAdapter(adapter);
        surveys = new ArrayList<>();
        intent = new Intent(this,ResultActivity.class);
//        groupButtonVisibility();
    }



    public void populateSpinner(){
        for(Drink i : Drink.values()){//populate Array list
            drinkTypes.add(i);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonAdd:
                saveSurvey();
                break;
            case R.id.buttonNew:
                newSurvey();
                break;
            case R.id.buttonResults:
                intent.putExtra(KEY,surveys);
                startActivity(intent);
                break;
            default:
                break;


        }
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getItemAtPosition(position).toString().equals(Drink.LEMONADE.toString())){
            radioGroupButtonJuice.setVisibility(View.INVISIBLE);
            radioGroupButtonLemonade.setVisibility(View.VISIBLE);
            Log.i("I'm hiding","     Juice");
        }else if (parent.getItemAtPosition(position).toString().equals(Drink.JUICE.toString())){
            radioGroupButtonLemonade.setVisibility(View.INVISIBLE);
            radioGroupButtonJuice.setVisibility(View.VISIBLE);
            Log.i("I'm hiding","     Lemonade");
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    public void saveSurvey() {
        if (spinnerDrinkType.getSelectedItem().toString().equals(Drink.LEMONADE.toString())){
            radioButton = (RadioButton) findViewById(radioGroupButtonLemonade.getCheckedRadioButtonId());
        }else if (spinnerDrinkType.getSelectedItem().toString().equals(Drink.JUICE.toString())){
            radioButton = (RadioButton) findViewById(radioGroupButtonJuice.getCheckedRadioButtonId());
        }
        drink = radioButton.getText().toString();

        surveys.add(new Survey(editTextUserId.getText().toString(),spinnerDrinkType.getSelectedItem().toString(), drink,Integer.parseInt(editTextNumberCups.getText().toString())));
        Log.i("info",editTextUserId.getText().toString() + spinnerDrinkType.getSelectedItem().toString()+ drink + Integer.parseInt(editTextNumberCups.getText().toString()));
    }



//    public void groupButtonVisibility(){
//
//        spinnerDrinkType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//                if (parent.getItemAtPosition(position).toString().equals(Drink.LEMONADE.toString())){
//                    radioGroupButtonJuice.setVisibility(View.INVISIBLE);
//                    radioGroupButtonLemonade.setVisibility(View.VISIBLE);
//                    Log.i("I'm hiding","     Juice");
//                }else if (parent.getItemAtPosition(position).toString().equals(Drink.JUICE.toString())){
//                    radioGroupButtonLemonade.setVisibility(View.INVISIBLE);
//                    radioGroupButtonJuice.setVisibility(View.VISIBLE);
//                    Log.i("I'm hiding","     Lemonade");
//                }
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//
//    }


    private void newSurvey() {
        editTextUserId.setText(null);
        editTextNumberCups.setText(null);
        radioGroupButtonLemonade.clearCheck();
        radioGroupButtonJuice.clearCheck();
    }


}
