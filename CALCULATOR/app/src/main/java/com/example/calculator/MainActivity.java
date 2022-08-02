package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0, buttonadd,buttonmin,buttonmul,buttondiv,buttoneql,buttonc;
    EditText value;
    Float f1,f2;
    boolean b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 =(Button)findViewById(R.id.button4);
        button0 =(Button) findViewById(R.id.button17);
        button2 =(Button) findViewById(R.id.button5);
        button3 =(Button) findViewById(R.id.button6);
        button4 =(Button) findViewById(R.id.button8);
        button5 =(Button) findViewById(R.id.button9);
        button6 =(Button) findViewById(R.id.button10);
        button7 =(Button) findViewById(R.id.button12);
        button8 =(Button) findViewById(R.id.button13);
        button9 =(Button) findViewById(R.id.button14);

        buttonadd =(Button) findViewById(R.id.button7);
        buttonmin =(Button) findViewById(R.id.button11);
        buttonmul =(Button) findViewById(R.id.button15);
        buttondiv =(Button) findViewById(R.id.button19);
        buttoneql =(Button) findViewById(R.id.button18);
        buttonc =(Button) findViewById(R.id.button);
        value=(EditText) findViewById(R.id.editTextTextPersonName2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText(value.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText(value.getText() +"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText(value.getText() +"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText(value.getText() +"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText(value.getText() +"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText(value.getText() +"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText(value.getText() +"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText(value.getText() +"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText(value.getText() +"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText(value.getText() +"0");
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText("");
            }
        });


        buttonadd.setOnClickListener(new View.OnClickListener() { //addition set true
            @Override
            public void onClick(View view) {
                if (value == null) {
                    value.setText("");
                } else {
                    f1 = Float.parseFloat(value.getText() + "");
                    b1 = true;
                    value.setText(null);
                }
            }
        });

        buttonmin.setOnClickListener(new View.OnClickListener() { // subtraction set true
            @Override
            public void onClick(View view) {
                f1 = Float.parseFloat(value.getText() + "");
                b2 = true;
                value.setText(null);
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1 = Float.parseFloat(value.getText() + "");
                b3 = true;
                value.setText(null);
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() { //division set true
            @Override
            public void onClick(View view) {
                f1 = Float.parseFloat(value.getText() + "");
                b4 = true;
                value.setText(null);
            }
        });

        buttoneql.setOnClickListener(new View.OnClickListener() { // when you click = button checks if add minus mul?
            @Override
            public void onClick(View view) {
                f2 = Float.parseFloat(value.getText() + "");

                if (b1 == true) {
                    value.setText(f1 + f2 + "");
                    b1 = false;
                }
                if (b2 == true) {
                    value.setText(f1 - f2 + "");
                    b2 = false;
                }
                if (b3 == true) {
                    value.setText(f1 * f2 + "");
                    b3 = false;
                }
                if (b2 == true) {
                    value.setText(f1 / f2 + "");
                    b2 = false;
                }

            }
        });

    }
}