package com.example.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView tv;
    RadioGroup rg;
    String gender = "";
    Button button;

    ProgressBar prg;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    /*    button = findViewById(R.id.btn);
        rg = findViewById(R.id.radioGroup);


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.btn1)
                    gender = "Male";
                else
                    gender = "Female";

            }
        });



   button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(MainActivity.this, gender, Toast.LENGTH_SHORT).show();
            }
        });*/

    prg=findViewById(R.id.progressBar);
    b1=findViewById(R.id.button);
    b2=findViewById(R.id.button1);

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            prg.setProgress(25);
        }
    });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prg.setProgress(100);
            }
        });
    }


}
