package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {


    Button btn1;
    EditText ed1;
    EditText ed2;
    String st;
    String st1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);



         btn1 = (Button) findViewById(R.id.button1);
         ed1 = (EditText) findViewById(R.id.input1);
         ed2 = (EditText) findViewById(R.id.input2);

        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FirstActivity.this, SecondActivity.class));

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";

                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                Intent i = new Intent(FirstActivity.this,SecondActivity.class);

                st=ed1.getText().toString();
                st1=ed2.getText().toString();

                i.putExtra("Value",st);
                i.putExtra("Value1",st1);
                startActivity(i);
                finish();





            }
        });



    }
}