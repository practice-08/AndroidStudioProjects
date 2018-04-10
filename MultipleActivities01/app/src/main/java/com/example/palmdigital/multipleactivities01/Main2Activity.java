package com.example.palmdigital.multipleactivities01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener
{
Button buttonGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonGoBack = findViewById(R.id.buttonSwitch);
        buttonGoBack.setOnClickListener(this);

    }
    public void onclick(View v)
    {
        if(v.getId() == R.id.buttonGoBack)
        {
            intent i = new intent(this, MainActivity)
        }
    }

}
