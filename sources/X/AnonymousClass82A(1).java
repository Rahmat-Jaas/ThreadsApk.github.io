package X;

import android.webkit.WebView;
import java.util.List;

/* renamed from: X.82A  reason: invalid class name */
public final class AnonymousClass82A implements Runnable {
    public final /* synthetic */ WebView A00;
    public final /* synthetic */ AnonymousClass513 A01;
    public final /* synthetic */ String A02;

    public AnonymousClass82A(WebView webView, AnonymousClass513 r2, String str) {
        this.A01 = r2;
        this.A00 = webView;
        this.A02 = str;
    }

    public final void run() {
        List<C143228gK> list = this.A01.A03;
        synchronized (list) {
            for (C143228gK C9y : list) {
                C9y.C9y((C91225fq) this.A00, this.A02);
            }
        }
    }
}
