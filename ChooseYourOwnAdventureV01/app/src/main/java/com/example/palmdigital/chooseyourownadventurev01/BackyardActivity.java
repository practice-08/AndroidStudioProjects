package com.example.palmdigital.chooseyourownadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BackyardActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backyard);

        Button buttonLeftScream = findViewById(R.id.buttonLeftScream);
        Button buttonRightFaint = findViewById(R.id.buttonRightFaint);
        buttonLeftScream.setOnClickListener(this);
        buttonRightFaint.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonLeftScream) {
           Intent i = new Intent(this, MainActivity.class);
           startActivity(i);
        } else {
           Intent i = new Intent(this, FaintActivity.class);
           startActivity(i);
        }
    }
}
