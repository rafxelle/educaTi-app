package rafaelle.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = findViewById(R.id.webv);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);



        web.setWebViewClient(new WebViewClient());

        web.loadUrl("https://rafaelle.000webhostapp.com/educati/");
    }

    private class WebViewClient extends android.webkit.WebViewClient {
    }
}