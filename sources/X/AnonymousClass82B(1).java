package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import java.util.List;

/* renamed from: X.82B  reason: invalid class name */
public final class AnonymousClass82B implements Runnable {
    public final /* synthetic */ WebResourceRequest A00;
    public final /* synthetic */ WebView A01;
    public final /* synthetic */ AnonymousClass513 A02;

    public AnonymousClass82B(WebResourceRequest webResourceRequest, WebView webView, AnonymousClass513 r3) {
        this.A02 = r3;
        this.A01 = webView;
        this.A00 = webResourceRequest;
    }

    public final void run() {
        List<C104356be> list = this.A02.A06;
        synchronized (list) {
            for (C104356be r3 : list) {
                Uri url = this.A00.getUrl();
                if (url != null) {
                    String obj = url.toString();
                    if (!AnonymousClass7CU.A00(obj) && obj.startsWith(I17.A00(674))) {
                        C105736du r5 = r3.A00;
                        String queryParameter = url.getQueryParameter("ev");
                        String queryParameter2 = url.getQueryParameter("id");
                        C109196jc r1 = r5.A00;
                        AnonymousClass7H6.A01(r1.A02).A03(r1.A01, new C1376489k(r5, queryParameter, queryParameter2));
                    }
                }
            }
        }
    }
}
