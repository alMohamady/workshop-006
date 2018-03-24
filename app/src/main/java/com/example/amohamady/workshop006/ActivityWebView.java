package com.example.amohamady.workshop006;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class ActivityWebView extends AppCompatActivity {

    WebView web;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        web = (WebView) findViewById(R.id.theWeb);
        btn = (Button) findViewById(R.id.btnStart);
        txt = (TextView) findViewById(R.id.txtWeb);

        web.setWebViewClient(new WebViewClient());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.loadUrl(txt.getText().toString());
            }
        });


    }

}
