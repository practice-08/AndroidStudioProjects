package com.example.palmdigital.buttontologcatone;

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

        Button myButtonObject2 = (Button)findViewById(R.id.button2);
        myButtonObject2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        Log.i("info", "Bonjour!");

    }
}
