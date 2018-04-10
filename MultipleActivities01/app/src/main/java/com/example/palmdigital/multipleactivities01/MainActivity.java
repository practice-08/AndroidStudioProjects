package com.example.palmdigital.multipleactivities01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bSwitch = findViewById(R.id.buttonSwitch);

        bSwitch.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonSwitch)
        {
            intent i;
            i = new intent(this, MainActivity.class);

        }
    }
}
