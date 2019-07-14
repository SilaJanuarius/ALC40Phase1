package com.kilonzosila.alc40;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {
    private WebView webview;
    private String URL="https://andela.com/alc/";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About ALC");

        webview = findViewById(R.id.wvAlc);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new myWebClient());
        webview.loadUrl(URL);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (webview != null)
            webview.destroy();
    }

    public class myWebClient extends WebViewClient {

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {

            handler.proceed();
            Log.d("ERR",error.getUrl());
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
