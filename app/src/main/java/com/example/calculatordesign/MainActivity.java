package com.example.calculatordesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text;

    Button num0, num1, num2, num3, num4, num5
            , num6, num7, num8, num9, deci;
    Button clear, bracket, divide, multiply
            , add, sub, equal,
            backspace;

    float valueOne, valueTwo;

    boolean calAddition, calSubtract, calMultiplication, calDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeEverything();
        doAllTheCalculations();
    }

    private void initializeEverything()
    {
        text = (EditText)findViewById(R.id.text);

        num0 = (Button)findViewById(R.id.num0);
        num1 = (Button)findViewById(R.id.num1);
        num2 = (Button)findViewById(R.id.num2);
        num3 = (Button)findViewById(R.id.num3);
        num4 = (Button)findViewById(R.id.num4);
        num5 = (Button)findViewById(R.id.num5);
        num6 = (Button)findViewById(R.id.num6);
        num7 = (Button)findViewById(R.id.num7);
        num8 = (Button)findViewById(R.id.num8);
        num9 = (Button)findViewById(R.id.num9);
        deci = (Button)findViewById(R.id.deci);

        clear = (Button)findViewById(R.id.clear);
        bracket = (Button)findViewById(R.id.brackets);
        divide = (Button)findViewById(R.id.divide);
        multiply = (Button)findViewById(R.id.multi);
        sub = (Button)findViewById(R.id.subs);
        add = (Button)findViewById(R.id.add);
        equal = (Button)findViewById(R.id.equal);
        backspace = (Button)findViewById(R.id.backspace);

    }

    private void doAllTheCalculations()
    {
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text.setText(text.getText() + "0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text.setText(text.getText() + "1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text.setText(text.getText() + "2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text.setText(text.getText() + "3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text.setText(text.getText() + "4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text.setText(text.getText() + "5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text.setText(text.getText() + "6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text.setText(text.getText() + "7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text.setText(text.getText() + "8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text.setText(text.getText() + "9");
            }
        });

        deci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text.setText(text.getText() + ".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text == null) {
                    text.setText("");
                } else {
                    valueOne = Float.parseFloat(text.getText() + "");
                    calAddition = true;
                    text.setText(null);
                }
            }
            });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text == null) {
                    text.setText("");
                } else {
                    valueOne = Float.parseFloat(text.getText() + "");
                    calSubtract = true;
                    text.setText(null);
                }
            }
            });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text == null) {
                    text.setText("");
                } else {
                    valueOne = Float.parseFloat(text.getText() + "");
                    calDivision = true;
                    text.setText(null);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text == null) {
                    text.setText("");
                } else {
                    valueOne = Float.parseFloat(text.getText() + "");
                    calMultiplication = true;
                    text.setText(null);
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text.setText("");
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String back = String.valueOf(valueOne);

//             if(back.length() > 1)
//             {
//                 back = back.substring(0,back.length()-1);
//             }

                text.setText(back);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                valueTwo = Float.parseFloat(text.getText() + "");

                if (calAddition == true)
                {
                    text.setText(valueOne + valueTwo + "");
                    calAddition = false;
                }

                if (calSubtract == true)
                {
                    text.setText(valueOne - valueOne + "");
                    calSubtract = false;
                }

                if (calMultiplication == true)
                {
                    text.setText(valueOne * valueTwo + "");
                    calMultiplication = false;
                }

                if (calDivision == true)
                {
                    text.setText(valueOne / valueTwo + "");
                    calDivision = false;
                }
            }
        });

        bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

            }
        });



    }
}
