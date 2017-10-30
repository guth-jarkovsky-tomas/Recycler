package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class ActivityDetail extends AppCompatActivity  {

    static final private String ARG_URL = "url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String url = (String) intent.getExtras().get(ARG_URL);
        WebView webView = (WebView) findViewById(R.id.web);
        webView.loadUrl(url);
    }

    static public void starter(String url,Context context) {
        Intent intent = new Intent(context, ActivityDetail.class);
        intent.putExtra(ARG_URL,url);
        context.startActivity(intent);
    }



}