package com.example.amohamady.workshop006;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getWebView(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityWebView.class);
        startActivity(intent);
    }

    public void getClc(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityCalculator.class);
        startActivity(intent);
    }

    public void getRadioButton(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityRadioButton.class);
        startActivity(intent);
    }
}
