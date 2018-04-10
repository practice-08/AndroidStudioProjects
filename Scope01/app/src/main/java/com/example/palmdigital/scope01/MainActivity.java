package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int myInt = 100;

        myInt = 200;
       // Log.i()
        double myDouble;
        char myChar;
        float myFloat;
        boolean myBool;
        long myLong;
        byte myByte;
        //not primitive
        String myString;
        Integer myInt2;
        Float myFloat2;
        Double myDouble2;

        myString = "this is an awesome string";
       // myInt = awesomeMethod;
        myDouble = 5.6;
        myFloat  = 5.7f;

        myBool = true;
        myBool = false;

        TextView tv_Num1Display = findViewById(R.id.tvTop);
        TextView tv_Num2Display;


    }// end of onCreate
public int awesomeMethod(int input) {

}


 }// end of MainActivity class
// try and put a method here
