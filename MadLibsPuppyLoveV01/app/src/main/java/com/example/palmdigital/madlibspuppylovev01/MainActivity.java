package com.example.palmdigital.madlibspuppylovev01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        EditText et_color = findViewById(R.id.et_color);
        String colorStr = et_color.getText().toString();

        EditText et_bodyPart = findViewById(R.id.et_bodyPart);
        String bodyPartStr = et_bodyPart.getText().toString();

        String story = "Today I saw him again. When he looks at me with those ";
        String story2 = "eyes, it makes my ";

        story = story + colorStr + story2 + bodyPartStr;






        TextView output = findViewById(R.id.tvStory);
        output.setText(story);



    }
}
