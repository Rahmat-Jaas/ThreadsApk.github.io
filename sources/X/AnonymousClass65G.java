package X;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

/* renamed from: X.65G  reason: invalid class name */
public final class AnonymousClass65G extends C34608Ibe implements C82424pb {
    public static final String __redex_internal_original_name = "OpenWebViewWithUrlChangeFragment";
    public WebView A00;
    public C107896hU A01;
    public C112466pe A02;
    public C132027tC A03;
    public final C04530Oa A04 = C62373Zc.A03(C86154wM.A14(this, 47));

    public final void A01(WebView webView) {
        C04220Ms.A0B(webView, 0);
        this.A00 = webView;
    }

    public final boolean A02(Uri uri, WebView webView) {
        boolean A1Z = AnonymousClass0wJ.A1Z(webView, uri);
        C107896hU r3 = this.A01;
        if (r3 != null) {
            Boolean bool = (Boolean) C61043Rr.A00(r3.A00, C86104wH.A0W(C18190wL.A0n(uri)), r3.A01);
            if (bool != null && bool.booleanValue()) {
                C112466pe r1 = this.A02;
                if (r1 != null) {
                    r1.A00(C18190wL.A0n(uri), false);
                }
                requireActivity().finish();
                return A1Z;
            }
        }
        return super.A02(uri, webView);
    }

    public final boolean onBackPressed() {
        String str;
        WebView webView = this.A00;
        if (webView == null || (str = webView.getUrl()) == null) {
            str = "";
        }
        C112466pe r1 = this.A02;
        if (r1 == null) {
            return false;
        }
        r1.A00(str, true);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1890748346);
        super.onCreate(bundle);
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A04);
        C04220Ms.A0B(A0U, 0);
        C132027tC r1 = (C132027tC) A0U.A01(C132027tC.class, C86154wM.A14(A0U, 46));
        this.A03 = r1;
        if (r1 == null) {
            C04220Ms.A0E("callbackHelper");
            throw null;
        }
        this.A01 = r1.A00;
        this.A02 = r1.A01;
        C14030oh.A09(-515673935, A022);
    }
}
