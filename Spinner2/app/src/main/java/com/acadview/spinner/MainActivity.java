package com.acadview.spinner;


import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.acadview.spinner.R;

import static android.R.layout.simple_dropdown_item_1line;

public class MainActivity extends AppCompatActivity {

    Spinner country;
    Spinner state;
    String[] countries = new String[]{"INDIA", "USA", "AUSTRALIA"};
    String[] stateIndia = new String[]{"DELHI","CHANDIGARH","HARAYANA"};
    String[] stateUSA = new String[]{"MEXICO","WASHINGTON","LOWA"};
    String[] stateAustralia = new String[]{"MELBOURNE","VICTORIA","QUEENLAND"};



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
