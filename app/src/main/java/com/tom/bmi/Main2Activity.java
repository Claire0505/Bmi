package com.tom.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

    public void bmi (View v){
        //取得元件的值並計算BMI
        String w = edWight.getText().toString();
        String h = edHeight.getText().toString();
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight / (height * height);

        Log.d("BMI", String.valueOf(bmi));

        Toast.makeText(this, String.valueOf(bmi), Toast.LENGTH_LONG).show();

        //產生Builder物件
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //呼叫setMessage方法定顯示文字
        builder.setMessage( bmi +" ")
                .setTitle("BMI運算")
                .setPositiveButton("OK", null)
                .setNegativeButton("Cancel", null)
                .show();
    }

}
