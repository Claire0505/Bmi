package com.tom.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class IntentResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_result);

        Intent intent = getIntent();

        // 第一個參數為字串，代表資料的標籤，第二個參數是該標籤讀取不到資料時的預設值
       // float bmi = intent.getFloatExtra(getString(R.string.bmi_extra), 0);

        Bundle bag = intent.getExtras();
        float bmi = bag.getFloat(getString(R.string.bmi_extra), 0);
        String test = bag.getString("TEST_EXTRA", null);

        TextView result = findViewById(R.id.result);
        result.setText(String.format("%s%s", getString(R.string.bmiValue), bmi));

        Toast.makeText(this, "TestBundle:" + test, Toast.LENGTH_SHORT).show();
    }
}
