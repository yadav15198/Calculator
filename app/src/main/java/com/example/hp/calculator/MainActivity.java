package com.example.hp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

TextView text1;
TextView text2;
Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    double a,b,c;
     char ADDITION = '+';
     char SUBTRACTION = '-';
    char MULTIPLICATION = '*';
    char DIVISION = '/';
     char PERCENTAGE = '%';
     int var = 0;
    char currrent;
    boolean add=false;
    boolean sub=false;
    boolean mul=false;
    boolean div=false;
    String s,first,second;
    int  cA = 0,cM =0,cD =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);

        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {


        int id = view.getId();
        if(id == R.id.button4){
            text1.append("7");
        }
        else if(id == R.id. button5){
            text1.append("8");
        }
        else if(id == R.id. button6){
            text1.append("9");
        }
        else if(id == R.id. button7){
            if(!mul) {
                if(text1.length() == 0){
                }
                else{
                text1.append("*");
                currrent = MULTIPLICATION;
                cM =1;
                mul=true;
                add = true;
                div = true;}
            }
        }

        else if(id == R.id. button8){
            text1.append("4");
        }
        else if(id ==R.id. button9){
            text1.append("5");
        }
        else if(id ==R.id. button10){
            text1.append("6");
        }
        else if(id ==R.id. button11){
            if(!sub){
                if(text1.length()== 0){
                    text1.append("-");
                    var = 1;
                }else {
                    text1.append("-");
                    if (cA != 1 && cD != 1 && cM != 1)
                        currrent = SUBTRACTION;
                    sub = true;
                    add = true;
                    mul = true;
                    div = true;
                }
        }}
        else if(id == R.id. button12){
            text1.append("1");
        }
        else if(id ==R.id. button13){
            text1.append("2");
        }
        else if(id ==R.id. button14){
            text1.append("3");
        }
        else if(id ==R.id. button15) {
            if (!add) {
                if (text1.length() == 0) {

                } else {
                    text1.append("+");
                    currrent = ADDITION;
                    cA = 1;
                    add = true;
                    mul = true;
                    div = true;
                }
            }
        }
        else if(id == R.id. button16){
            if(text1.length() != 0) {
                text1.append("%");
                add = true;
                sub = true;
                mul = true;
                div = true;
                currrent = PERCENTAGE;
            }
        }
        else if(id ==R.id. button17){
            if(text1.length() != 0){
            text1.setText("");
            var = 0;}
            if(text2.length() != 0)
                text2.setText("");
        }
        else if(id ==R.id. button18) {
            if (text1.length() != 0) {
                StringBuilder sb = new StringBuilder(text1.getText().toString());
                text1.setText(sb.deleteCharAt(sb.length() - 1).toString());
            }
        }
        else if(id ==R.id. button19) {
            if (!div) {
                if(text1.length() == 0){
                }else {
                    text1.append("/");
                    currrent = DIVISION;
                    cD = 1;
                    div = true;
                    mul = true;
                    add = true;
                }
           }
        }
        else if(id ==R.id. button20){
            text1.append("0");
        }
        else if(id ==R.id. button21){
            text1.append(".");
        }
        else if (id == R.id.button22) {
            s = text1.getText().toString();
            Log.d("mn",s+"saurabh");
            if (currrent == ADDITION) {
                if(var == 1){
                    String [] arr= s.substring(1).split("\\+", 2);

                    first = arr[0];
                    second = arr[1];
                    a = Double.parseDouble(first);
                    b = Double.parseDouble(second);
                    c = (-1*a) + b;
                    text2.setText("" + c);
                    add = false;
                    sub = false;
                    mul = false;
                    div = false;
                }else{
                String [] arr= s.split("\\+", 2);
                first = arr[0];
                second = arr[1];
                a = Double.parseDouble(first);
                Log.d("mo",first+"aurabh");
                b = Double.parseDouble(second);
                Log.d("mp",second +"urabh");
                c = a + b;
                text2.setText("" + c);
                var = 0;
                add = false;
                sub = false;
                mul = false;
                sub = false;}
            } else if (currrent == SUBTRACTION) {
                if(var == 1){
                    String [] arr= s.substring(1).split("-", 2);

                    first = arr[0];
                    second = arr[1];
                    a = Double.parseDouble(first);
                    b = Double.parseDouble(second);
                    c = (-1*a) - b;
                    text2.setText("" + c);
                    add = false;
                    sub = false;
                    mul = false;
                    div = false;
                }
                else{
                String [] arr= s.split("-", 2);
                  first = arr[0];
                second = arr[1];
                a = Double.parseDouble(first);
                b = Double.parseDouble(second);
                c = a - b;
                text2.setText("" + c);
                add = false;
                sub = false;
                mul = false;
                div = false;}
            } else if (currrent == MULTIPLICATION) {
                String [] arr= s.split("\\*", 2);
                first = arr[0];
                second = arr[1];
                a = Double.parseDouble(first);
                b = Double.parseDouble(second);
                c = a * b;
                text2.setText("" + c);
                add = false;
                sub = false;
                mul = false;
                div = false;
            } else if (currrent == DIVISION) {
                String [] arr= s.split("\\/", 2);
                first = arr[0];
                second = arr[1];
                a = Double.parseDouble(first);
                b = Double.parseDouble(second);
                c = a / b;
                text2.setText("" + c);
                add = false;
                sub = false;
                mul = false;
                div = false;
            } else if (currrent == PERCENTAGE) {
                String [] arr= s.split("%", 2);
                first = arr[0];
                second = arr[1];
                a = Double.parseDouble(first);
                b = Double.parseDouble(second);
               c = (a/100)*b;
                text2.setText("" + c);
                add = false;
                sub = false;
                mul = false;
                div = false;
            }
        }
    }
}
