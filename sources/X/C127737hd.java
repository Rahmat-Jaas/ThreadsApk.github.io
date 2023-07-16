package X;

import android.content.Context;
import android.webkit.WebView;

/* renamed from: X.7hd  reason: invalid class name and case insensitive filesystem */
public final class C127737hd implements Mcm {
    public final /* synthetic */ C127397h3 A00;

    public C127737hd(C127397h3 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        WebView webView = (WebView) obj;
        if (!AnonymousClass2LL.A00(C127397h3.A0A(this.A00, 43), false)) {
            return null;
        }
        webView.getSettings().setUserAgentString(AnonymousClass7CV.A01(webView.getSettings().getUserAgentString()));
        return null;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        WebView webView = (WebView) obj;
        if (AnonymousClass2LL.A00(C127397h3.A0A(this.A00, 43), false)) {
            webView.getSettings().setUserAgentString((String) null);
        }
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
