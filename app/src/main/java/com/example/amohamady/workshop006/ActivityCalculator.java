package com.example.amohamady.workshop006;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityCalculator extends AppCompatActivity {

    EditText num1, num2;
    TextView txtResult;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        num1 = (EditText) findViewById(R.id.txtNum1);
        num2 = (EditText) findViewById(R.id.txtNum2);
        txtResult =  (TextView) findViewById(R.id.txtResult);
        btn = (Button) findViewById(R.id.btnCalc);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double theNum1 = Double.parseDouble(num1.getText().toString());
                double theNum2 = Double.parseDouble(num2.getText().toString());

                double theResult =  theNum1 +  theNum2;

                txtResult.setText(String.valueOf(theResult));
            }
        });

    }
}
