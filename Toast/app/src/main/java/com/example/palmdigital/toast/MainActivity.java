package com.example.palmdigital.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Hello Adroid Developers",
                Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "Hola desarrolladores de Andriod",
                Toast.LENGTH_LONG).show();

    }
}