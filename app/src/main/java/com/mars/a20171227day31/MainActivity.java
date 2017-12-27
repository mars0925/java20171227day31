package com.mars.a20171227day31;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

        public void click1(View v){

            tv = (TextView) findViewById(R.id.textView4);
            ed1 = (EditText)findViewById(R.id.editText3);
            ed2 = (EditText)findViewById(R.id.editText4);
            int num1 =Integer.parseInt(ed1.getText().toString());
            int num2 =Integer.parseInt(ed2.getText().toString());

            String sum =String.valueOf((num1+num2));
                tv.setText(sum);


    }
}
