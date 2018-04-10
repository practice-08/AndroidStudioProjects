package com.example.palmdigital.chooseyourownadventurev01;

import  android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToiletActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);

        Button buttonLeftYes = findViewById(R.id.buttonLeftYes);
        Button buttonRightHeckYes = findViewById(R.id.buttonRightHeckYes);
        buttonLeftYes.setOnClickListener(this);
        buttonRightHeckYes.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonLeftYes) {
            Intent i = new Intent(this, YesandHeckYesActivity.class);
            startActivity(i);
       } else {
          Intent i = new Intent(this, YesandHeckYesActivity.class);
            startActivity(i);
        }
    }
}
