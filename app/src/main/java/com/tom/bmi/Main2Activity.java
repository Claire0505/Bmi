package com.tom.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText edWight;
    private EditText edHeight;
    private Button btnHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViews();
    }

    private void findViews() {
        edWight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
        btnHelp = findViewById(R.id.btn_help);
    }

}
