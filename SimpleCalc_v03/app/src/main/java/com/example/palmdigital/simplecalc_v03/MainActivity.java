import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.palmdigital.simplecalc_v03.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textViewNum1Display;
    TextView textViewNum2Display;
    TextView tvOutput;
    int sum;
    int result;
    int num1;
    int num2;
    char operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewNum1Display = findViewById(R.id.textViewNum1Display);
        textViewNum2Display = findViewById(R.id.textViewNum2Display);
        tvOutput = findViewById(R.id.tvOutput);


        ImageView ivTop0 = findViewById(R.id.ivTop0);
        ImageView ivTop1 = findViewById(R.id.ivTop1);
        ImageView ivTop2 = findViewById(R.id.ivTop2);
        ImageView ivTop3 = findViewById(R.id.ivTop3);
        ImageView ivTop4 = findViewById(R.id.ivTop4);
        ImageView ivTop5 = findViewById(R.id.ivTop5);
        ImageView ivTop6 = findViewById(R.id.ivTop6);
        ImageView ivTop7 = findViewById(R.id.ivTop7);
        ImageView ivTop8 = findViewById(R.id.ivTop8);
        ImageView ivTop9 = findViewById(R.id.ivTop9);



        ImageView iv20 = findViewById(R.id.iv20);
        ImageView iv21 = findViewById(R.id.iv21);
        ImageView iv22 = findViewById(R.id.iv22);
        ImageView iv23 = findViewById(R.id.iv23);
        ImageView iv24 = findViewById(R.id.iv24);
        ImageView iv25 = findViewById(R.id.iv25);
        ImageView iv26 = findViewById(R.id.iv26);
        ImageView iv27 = findViewById(R.id.iv27);
        ImageView iv28 = findViewById(R.id.iv28);
        ImageView iv29 = findViewById(R.id.iv29);

        ImageView ivS = findViewById(R.id.ivS);
        ImageView ivM = findViewById(R.id.ivM);
        ImageView ivD = findViewById(R.id.ivD);
        ImageView ivP = findViewById(R.id.ivP);

        //  ImageView  = findViewById(R.id.imageViewEquals);


        ivTop0.setOnClickListener(this);
        ivTop1.setOnClickListener(this);
        ivTop2.setOnClickListener(this);
        ivTop3.setOnClickListener(this);
        ivTop4.setOnClickListener(this);
        ivTop5.setOnClickListener(this);
        ivTop6.setOnClickListener(this);
        ivTop7.setOnClickListener(this);
        ivTop8.setOnClickListener(this);
        ivTop9.setOnClickListener(this);

        iv20.setOnClickListener(this);
        iv21.setOnClickListener(this);
        iv22.setOnClickListener(this);
        iv23.setOnClickListener(this);
        iv24.setOnClickListener(this);
        iv25.setOnClickListener(this);
        iv26.setOnClickListener(this);
        iv27.setOnClickListener(this);
        iv28.setOnClickListener(this);
        iv29.setOnClickListener(this);
        ivS.setOnClickListener(this);
        ivM.setOnClickListener(this);
        ivP.setOnClickListener(this);
        ivD.setOnClickListener(this);

        // imageViewEquals.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ivTop0) {

            textViewNum1Display.setText("0");
            num1 = 0;
        } else if (v.getId() == R.id.ivTop1) {
            textViewNum1Display.setText("1");
            num1 = 1;
        } else if (v.getId() == R.id.ivTop2) {
            textViewNum1Display.setText("2");
            num1 = 2;
        } else if (v.getId() == R.id.ivTop3) {
            textViewNum2Display.setText("3");
            num1 = 3;
        } else if (v.getId() == R.id.ivTop4) {
            textViewNum2Display.setText("4");
            num1 = 4;
        } else if (v.getId() == R.id.ivTop5) {
            textViewNum2Display.setText("5");
            num1 = 5;
        } else if (v.getId() == R.id.ivTop6) {
            textViewNum2Display.setText("6");
            num1 = 6;
        } else if (v.getId() == R.id.ivTop7) {
            textViewNum2Display.setText("7");
            num1 = 7;
        } else if (v.getId() == R.id.ivTop8) {
            textViewNum2Display.setText("8");
            num1 = 8;
        } else if (v.getId() == R.id.ivTop9) {
            textViewNum2Display.setText("9");
            num1 = 9;

        } else if (v.getId() == R.id.iv20) {

                textViewNum1Display.setText("0");
                num2 = 0;
            } else if (v.getId() == R.id.iv21) {
                textViewNum1Display.setText("1");
                num2 = 1;
            } else if (v.getId() == R.id.iv22) {
                textViewNum1Display.setText("2");
                num2 = 2;
            } else if (v.getId() == R.id.iv23) {
                textViewNum2Display.setText("3");
                num2 = 3;
            } else if (v.getId() == R.id.iv24) {
                textViewNum2Display.setText("4");
                num2 = 4;
            } else if (v.getId() == R.id.iv25) {
                textViewNum2Display.setText("5");
                num2 = 5;
            } else if (v.getId() == R.id.ivTop6) {
                textViewNum2Display.setText("6");
                num2 = 6;
            } else if (v.getId() == R.id.ivTop7) {
                textViewNum2Display.setText("7");
                num2 = 7;
            } else if (v.getId() == R.id.ivTop8) {
                textViewNum2Display.setText("8");
                num2 = 8;
            } else if (v.getId() == R.id.ivTop9) {
                textViewNum2Display.setText("9");
                num2 = 9;
        } else if (v.getId() == R.id.ivP) {
            operation = '+' ;
        } else if (v.getId() == R.id.ivS) {
            operation = '-';
        } else if (v.getId() == R.id.ivM) {
            operation = '*';
        } else if (v.getId() == R.id.ivD) {
            operation = '/';
        } else if (v.getId() == R.id.ivE) {
            if (operation == '+') {
                result = num1 + num2;
            } else if(operation == '-'){
                result = num1 - num2;
            }
             else if(operation == '*'){
            result = num1 * num2;
            }





//            {
//                result = num1 - num2;
//            } {
//
//            }



            tvOutput.setText("" + result);
        }
    }
}