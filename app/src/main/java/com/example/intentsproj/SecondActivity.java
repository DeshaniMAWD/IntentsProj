package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText tv1;
    EditText tv2;
    String st1;
    String st2;
    EditText tv4;
    String res;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

               tv1=(EditText)findViewById(R.id.textView2);



               st1=getIntent().getExtras().getString("Value");
        st2=getIntent().getExtras().getString("Value1");



        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res  = st1+st2;
                tv4.setText(res);

                st1=tv1.getText().toString();
                st2=tv2.getText().toString();

int lblSum;

                public void add(View view){
                    lblSum.setText(tv1+" + "+tv2+" = "+(n1+n2));
                }

                public void substraction(View view){
                    lblSum.setText(tv1+" - "+tv2+" = "+(n1-n2));
                }

                public void multiplication(View view){
                    lblSum.setText(tv1+" x "+tv2+" = "+(n1*n2));
                }

                public void divition(View view){
                    lblSum.setText(tv1+" / "+tv2+" = "+(n1/n2));
                }
            }
        });


    }
}