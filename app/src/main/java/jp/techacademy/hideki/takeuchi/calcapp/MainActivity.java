package jp.techacademy.hideki.takeuchi.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);

    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(this,SecondActivity.class);

        double value1_d = Double.parseDouble((mEditText1.getText().toString()));
        double value2_d = Double.parseDouble((mEditText2.getText().toString()));
        double goukei = 0.0;

        Log.d("test",(mEditText1.getText().toString()));
        if (v.getId() == R.id.button1){
            goukei = value1_d + value2_d;
        } else if(v.getId() == R.id.button2){
            goukei = value1_d - value2_d;
        } else if(v.getId() == R.id.button3){
            goukei = value1_d * value2_d;
        } else if(v.getId() == R.id.button4){
            goukei = value1_d / value2_d;
        }
        intent.putExtra("VALUE1",goukei);
        startActivity(intent);
    }
}
