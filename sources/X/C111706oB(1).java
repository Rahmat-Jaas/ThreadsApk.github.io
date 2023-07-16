package X;

import android.webkit.JavascriptInterface;

/* renamed from: X.6oB  reason: invalid class name and case insensitive filesystem */
public final class C111706oB {
    public final C143218gJ A00;

    @JavascriptInterface
    public void log(String str) {
        try {
            this.A00.onLog(str);
        } catch (Exception e) {
            AnonymousClass0LU.A03(C111706oB.class, "Log message failed", e);
        }
    }

    public C111706oB(C143218gJ r1) {
        this.A00 = r1;
    }
}
