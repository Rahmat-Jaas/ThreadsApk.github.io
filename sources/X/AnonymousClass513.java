package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.513  reason: invalid class name */
public final class AnonymousClass513 extends WebViewClient {
    public C113046qd A00;
    public Executor A01;
    public final List A02 = Collections.synchronizedList(AnonymousClass0wJ.A0v());
    public final List A03 = Collections.synchronizedList(AnonymousClass0wJ.A0v());
    public final List A04 = Collections.synchronizedList(AnonymousClass0wJ.A0v());
    public final List A05 = Collections.synchronizedList(AnonymousClass0wJ.A0v());
    public final List A06 = Collections.synchronizedList(AnonymousClass0wJ.A0v());

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        this.A01.execute(new AnonymousClass82B(webResourceRequest, webView, this));
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public AnonymousClass513(C91225fq r5, Executor executor) {
        this.A01 = executor;
        r5.addJavascriptInterface(new C111706oB(new C125287ct(r5, this)), "_FBIXLoggingBridge");
        AnonymousClass6GJ r3 = new AnonymousClass6GJ();
        C104366bf r2 = new C104366bf(this);
        this.A04.add(new C125327cx(r3));
        this.A02.add(new C125297cu(r2, r3));
    }

    public final void A00(String str) {
        if (!AnonymousClass7CU.A00(str) && AnonymousClass7K0.A02(Uri.parse(str))) {
            this.A01.execute(new AnonymousClass80T(this, str));
            C113046qd r0 = this.A00;
            if (r0 != null) {
                r0.A00(str);
            }
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.A01.execute(new AnonymousClass82A(webView, this, str));
        A00(str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        A00(str);
        C113046qd r2 = this.A00;
        if (r2 != null) {
            r2.A00.execute(new AnonymousClass82C((C91225fq) webView, r2, str));
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (AnonymousClass7CU.A00(str) || ReactWebViewManager.BLANK_URL.equals(str)) {
            return true;
        }
        C113046qd r0 = this.A00;
        if (r0 != null) {
            List list = r0.A05;
            synchronized (list) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw C18210wN.A0W("shouldOverrideUrlLoading");
                }
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return null;
    }
}
