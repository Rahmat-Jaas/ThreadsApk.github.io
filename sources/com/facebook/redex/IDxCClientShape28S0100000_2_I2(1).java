package com.facebook.redex;

import X.AnonymousClass562;
import X.AnonymousClass569;
import X.C04220Ms;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class IDxCClientShape28S0100000_2_I2 extends WebChromeClient {
    public Object A00;
    public final int A01;

    public IDxCClientShape28S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onProgressChanged(WebView webView, int i) {
        ProgressBar progressBar;
        switch (this.A01) {
            case 0:
                C04220Ms.A0B(webView, 0);
                super.onProgressChanged(webView, i);
                progressBar = ((AnonymousClass562) this.A00).A01;
                if (progressBar == null) {
                    C04220Ms.A0E("progressBar");
                    throw null;
                }
                break;
            case 1:
                super.onProgressChanged(webView, i);
                progressBar = ((AnonymousClass569) this.A00).A00.A01;
                break;
            default:
                super.onProgressChanged(webView, i);
                return;
        }
        progressBar.setProgress(i);
    }
}
