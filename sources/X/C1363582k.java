package X;

import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.82k  reason: invalid class name and case insensitive filesystem */
public final class C1363582k implements Runnable {
    public final /* synthetic */ BrowserLiteFragment A00;
    public final /* synthetic */ IF5 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C1363582k(BrowserLiteFragment browserLiteFragment, IF5 if5, String str, String str2) {
        this.A00 = browserLiteFragment;
        this.A03 = str;
        this.A01 = if5;
        this.A02 = str2;
    }

    public final void run() {
        String str = this.A03;
        IF5 if5 = this.A01;
        if (str.equals(if5.A03())) {
            if5.A0B(this.A02);
        }
    }
}
