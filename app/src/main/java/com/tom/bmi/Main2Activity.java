package com.tom.bmi;

import android.content.Intent;
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
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
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
//        builder.setMessage( bmi +" ")
//                .setTitle("BMI運算")
//                .setPositiveButton("OK", null)
//                .setNegativeButton("Cancel", null)
//                .show();

        Intent intent = new Intent(this, IntentResultActivity.class);
        //傳遞資料
       // intent.putExtra(getString(R.string.bmi_extra), bmi);

        // 有多種資料需要傳遞，可使用Bundle類別 (類似一個袋子，先將所有要傳的資料放在一個袋子中，最後再將袋子放到Intent
        Bundle bag = new Bundle();
        bag.putFloat(getString(R.string.bmi_extra), bmi);
        bag.putString("TEST_EXTRA", "Testing");
        //最後，再呼叫Intent類別的 putExtras 方法(後面有加s的)，將bag放入
        intent.putExtras(bag);

        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestory", Toast.LENGTH_SHORT).show();
    }
}
