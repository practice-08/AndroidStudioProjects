package com.example.palmdigital.javaexpressions01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 10;
        String b = "Harry Potter";
        boolean c = true;
       // log.i(tag "info", tag)
        Log.i("info", "Loren Grey");
        Log.i("info", "a = " + a);
        Log.i("info", "b = " + b);
        Log.i("info", "c = " + c);
       // Log.i()
           a++;
           Log.i("info", "a = " + a);
           Log.i("info", "c = " + (1 + 1 == 3));

           float myFloat = 4.0f;
           double myDouble = 42.0;
           int result = myAwsomeFunction();
           Log.i("info", "myAwseomFunction returned = " + result);
           Log.i("info", "myFloat function returned = "+ myFloatReturner());

//make a method that returns void that logs something out to the console

        void myFunctionTwo;
    {
        Log.i("info", "Hello from myFunction2 :) ");
    }

    }//onCreate method
    int myAwsomeFunction()
    {
        return 1000;
    }
    //return a float
    float myFloatReturner()
    {
        return 100.0f;
    }
} //end of class main activity
