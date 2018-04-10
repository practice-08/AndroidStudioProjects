package com.example.palmdigital.chooseyourownadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonWakeObject = findViewById(R.id.buttonLeftWakeUp);
        Button buttonExploreObject = findViewById(R.id.buttonRightExplore);
        buttonWakeObject.setOnClickListener(this);
        buttonExploreObject.setOnClickListener(this);
    }// end of onCreate Method

    public  void onClick(View v)
    {
        if (v.getId() == R.id.buttonLeftWakeUp)
        {
            Intent i = new Intent(this, WakeUpActivitey.class);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent (this, ExploreActivity.class);
            startActivity(i);
        }
    }
}
