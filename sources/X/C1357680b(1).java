package X;

import com.facebook.browser.lite.extensions.commercecheckout.instagram.IGShopsLiteMessageHandler;
import com.facebook.browser.lite.webview.SystemWebView;

/* renamed from: X.80b  reason: invalid class name and case insensitive filesystem */
public final class C1357680b implements Runnable {
    public final /* synthetic */ IGShopsLiteMessageHandler A00;
    public final /* synthetic */ String A01;

    public C1357680b(IGShopsLiteMessageHandler iGShopsLiteMessageHandler, String str) {
        this.A00 = iGShopsLiteMessageHandler;
        this.A01 = str;
    }

    public final void run() {
        IF5 BHU = this.A00.A02.BHU();
        ((SystemWebView) BHU).A01.loadUrl(this.A01);
    }
}
