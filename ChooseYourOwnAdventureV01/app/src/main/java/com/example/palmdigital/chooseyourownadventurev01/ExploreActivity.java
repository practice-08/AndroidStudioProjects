package com.example.palmdigital.chooseyourownadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        Button buttonLeftBackyard = findViewById(R.id.buttonLeftBackyard);
        Button buttonRightToilet = findViewById(R.id.buttonRightToilet);
        buttonLeftBackyard.setOnClickListener(this);
        buttonRightToilet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonLeftBackyard) {
            Intent i = new Intent(this, BackyardActivity.class);
            startActivity(i);
        } else {
            Intent i = new Intent(this, ToiletActivity.class);
            startActivity(i);
        }
    }
}