package com.example.palmdigital.edittext01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bGetName = findViewById(R.id.bGetName);
                bGetName.setOnClickListener(this);




    }

    public  void onClick(View v)
    {
        EditText firstNameObject = (EditText) findViewById(R.id.etFirstName);
                String firstStr = firstNameObject.getText().toString();

        EditText LastNameObject = (EditText) findViewById(R.id.etFirstName);
        String LastStr = firstNameObject.getText().toString();


        // log

        TextView tvOutput = findViewById(R.id.tvOutput);
        tvOutput.setText(firstStr);



    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
