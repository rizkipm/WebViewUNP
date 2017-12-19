package imastudio.id.co.webviewunp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView loadWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadWeb = (WebView)findViewById(R.id.loadWeb);

        //untuk mengatur webview
        WebSettings settings = loadWeb.getSettings();

        //mengguanakan wideview port dan zoom out apabila tidak ada port yang digunakan
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);

        //mengaktifkan zoom
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        loadWeb.setWebViewClient(new WebViewClient());

        //memanggil url
        loadWeb.loadUrl("http://www.unp.ac.id");
    }
}
