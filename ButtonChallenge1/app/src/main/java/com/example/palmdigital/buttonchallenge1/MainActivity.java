package com.example.palmdigital.buttonchallenge1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button button1;
    public Button button2;
    public Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setText("Contacts");
        button2.setText("Email");
        button3.setText("Messages");

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

button1.setBackgroundColor(0xff00ff00);
button2.setBackgroundColor(0xffff00ff);
button3.setBackgroundColor(0xff00ffff);


    }

    @Override
    public void onClick(View view)
    {
        if(view.getId() == R.id.button1)
        {
            Toast.makeText(MainActivity.this, "You clicked Contacts.", Toast.LENGTH_SHORT).show();
            Log.i("info", "You clicked Contacts");
        }


        else if (view.getId() == R.id.button2)
        {
        Toast.makeText(MainActivity.this, "You clicked Emails.", Toast.LENGTH_SHORT).show();
        Log.i("info", "You clicked Emails");
        }


        else if (view.getId() == R.id.button3)
        {
        Toast.makeText(MainActivity.this, "You clicked Messages.", Toast.LENGTH_SHORT).show();
        Log.i("info", "You clicked Messages");
        }


//        else  (view.getId() == R.id.button3)
//        Toast.makeText(MainActivity.this,"You clicked Messages", Toast.LENGTH_SHORT).show());


    }


public void setColors(Button b, int hexcode)
{

}
}