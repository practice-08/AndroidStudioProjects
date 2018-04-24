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

        EditText et_nouns1 = findViewById(R.id.et_nouns1);
        String nouns1Str = et_nouns1.getText().toString();

        EditText et_verb1 = findViewById(R.id.et_verb1);
        String verb1Str = et_verb1.getText().toString();

        EditText et_adj1 = findViewById(R.id.et_adj1);
        String adj1Str = et_adj1.getText().toString();

        EditText et_adj2 = findViewById(R.id.et_adj2);
        String adj2Str = et_adj2.getText().toString();

        EditText et_verbs2 = findViewById(R.id.et_verbs2);
        String verb2Str = et_adj2.getText().toString();

        EditText et_noun2 = findViewById(R.id.et_noun2);
        String noun2Str = et_adj2.getText().toString();

        EditText et_noun3 = findViewById(R.id.et_noun3);
        String noun3Str = et_adj2.getText().toString();



        String story = "Today I saw him again. When he looks at me with those ";
        story += colorStr;
        story += " eyes, it makes my ";
        story += bodyPartStr;
        story += " go pitterpat, and I feel as if I have ";
        story += nouns1Str;
        story += " in my stomach. When he scrunches his nose, I want to ";
        story += verb1Str;
        story += " him softly. He is so ";
        story += adj1Str;
        story += " and ";
        story += adj2Str;
        story += " Tomorrow he will be mine. For now he ";
        story += verb2Str;
        story += " in the store ";
        story += noun2Str;
        story += " looking at me. ";
        story += noun3Str;
        story += " love in hard to resist ";








                TextView output = findViewById(R.id.tvStory);
        output.setText(story);



    }
}
