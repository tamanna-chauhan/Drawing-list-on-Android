package com.acadview.spinner_test;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static com.acadview.spinner_test.R.id.state;

public class MainActivity extends AppCompatActivity {

    Spinner country,state;

    String[] countries = new String[]{"INDIA", "USA", "AUSTRALIA"};
    String[] stateIndia = new String[]{"DELHI","CHANDIGARH","HARAYANA","PUNE"};
    String[] stateUSA = new String[]{"MEXICO","WASHINGTON","LOWA","CALIFORNIA"};
    String[] stateAustralia = new String[]{"MELBOURNE","VICTORIA","QUEENLAND","TASMANIA"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country = findViewById(R.id.country);
        state = findViewById(R.id.state);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, countries);
        country.setAdapter(adapter);


        country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    setAdapter(stateIndia);
                } else if (i == 1) {
                    setAdapter(stateUSA);
                } else if (i == 2) {
                    setAdapter(stateAustralia);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });


    }

    public void setAdapter(String[] states) {

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout. simple_dropdown_item_1line,states);
        state.setAdapter(arrayAdapter);

    }

}
