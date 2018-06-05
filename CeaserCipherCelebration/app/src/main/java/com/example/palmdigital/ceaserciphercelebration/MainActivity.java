package com.example.palmdigital.ceaserciphercelebration;

import android.renderscript.ScriptGroup;
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
 Button buttonDecrypt = findViewById(R.id.buttonDecrypt);
 Button buttonEncrypt = findViewById(R.id.buttonEncrypt);

buttonDecrypt.setOnClickListener(this);
buttonEncrypt.setOnClickListener(this);




    }

public void onClick(View v)
{
    EditText et_ogText = findViewById(R.id.et_ogText);
    EditText  et_shift = findViewById(R.id.et_shift);

    if (v.getId() == R.id.buttonEncrypt)
    {
        String StrShift = et_shift.getText().toString();
        int shift = Integer.parseInt(StrShift);
        String  enteredText = et_ogText.getText().toString();
        String encrypted = encrypt(enteredText, shift);
        TextView tvEncrypted = findViewById(R.id.tvEncrypted);
        tvEncrypted.setText(encrypted);
    }
    else if (v.getId() == R.id.buttonDecrypt)
    {
        String StrShift = et_shift.getText().toString();
        int shift = Integer.parseInt(StrShift);
        String enteredText = et_ogText.getText().toString();
        String InputDecrypted = decrypt(enteredText, shift);
        TextView tvDecrypted = findViewById(R.id.tvDecrypted);
        tvDecrypted.setText(InputDecrypted);


    }
}

    public static String encrypt(String input, int shift)
    {
        String output = "";
        int alphabetSize = 26;
        char[] alphabet = new char[alphabetSize];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        input = input.toUpperCase();
        for (int i = 0; i < input.length(); i++)
        {
            char thisVal = input.charAt(i);
            if (thisVal == ' ')
            {
                output += ' ';
            }
            else
            {
                for (int j = 0; j < alphabetSize; j++)
                {
                    if (alphabet[j] == thisVal)
                    {
                        int shiftedIndex = (j + shift) % alphabetSize;
                        output += alphabet[shiftedIndex];
                    }
                }
            }
        }
        return output;
    }
    private static String decrypt(String input, int shift)
    {
        String output = "";
        int alphabetSize = 26;
        char[] alphabet = new char[alphabetSize];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        input = input.toUpperCase();
        for (int i = 0; i < input.length(); i++)
        {
            char thisVal = input.charAt(i);
            if (thisVal == ' ')
            {
                output += ' ';
            }
            else
            {
                for (int j = 0; j < alphabetSize; j++)
                {
                    if (alphabet[j] == thisVal)
                    {
                        int shiftedIndex = (j - shift + 26) % alphabetSize;
                        output += alphabet[shiftedIndex];
                    }
                }
            }
        }
        return output;
    }
}
