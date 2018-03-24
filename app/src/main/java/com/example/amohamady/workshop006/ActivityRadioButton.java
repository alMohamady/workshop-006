package com.example.amohamady.workshop006;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityRadioButton extends AppCompatActivity {

    RadioGroup group;
    RadioButton rBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
    }


    public void getRadioValue(View view) {

        group = (RadioGroup) findViewById(R.id.myRadio);
        int id = group.getCheckedRadioButtonId();
        rBtn = (RadioButton) findViewById(id);

        Toast.makeText(ActivityRadioButton.this, rBtn.getText(), Toast.LENGTH_LONG ).show();
    }
}
