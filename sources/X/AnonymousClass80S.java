package X;

import android.webkit.ValueCallback;

/* renamed from: X.80S  reason: invalid class name */
public final class AnonymousClass80S implements Runnable {
    public final /* synthetic */ C91225fq A00;
    public final /* synthetic */ String A01;

    public AnonymousClass80S(C91225fq r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        C91225fq r3 = this.A00;
        String str = this.A01;
        String A0L = AnonymousClass00U.A0L("javascript: ", str);
        try {
            r3.evaluateJavascript(str, (ValueCallback) null);
        } catch (IllegalStateException unused) {
            r3.loadUrl(A0L);
        }
    }
}
