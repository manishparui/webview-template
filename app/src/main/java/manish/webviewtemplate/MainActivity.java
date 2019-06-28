package manish.webviewtemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView xWebView;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        url = "http://madmanish.com"; //web site's url
        xWebView = (WebView) findViewById(R.id.xWebView);

        xWebView.getSettings().setJavaScriptEnabled(true);
        xWebView.loadUrl(url);
        xWebView.setWebViewClient(new WebViewClient());
    }
}
