package com.example.palmdigital.buttontotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonObject2 = (Button) findViewById(R.id.button2);
        buttonObject2.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        Log.i("info", "Hello!");
    }
}
