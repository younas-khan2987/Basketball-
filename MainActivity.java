package com.example.basketball;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebSettings; import android.webkit.WebView;
public class MainActivity extends Activity {
 protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
 WebView w=new WebView(this); WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true);
 w.loadUrl("file:///android_asset/Basketball.html"); setContentView(w); }
}