package X;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.1vo  reason: invalid class name and case insensitive filesystem */
public final class C28941vo extends C34608Ibe implements C82424pb {
    public static final String __redex_internal_original_name = "DirectDebitACHWebViewFragment";
    public String A00;
    public WebView A01;

    public final void A01(WebView webView) {
        C04220Ms.A0B(webView, 0);
        this.A01 = webView;
    }

    public final boolean A02(Uri uri, WebView webView) {
        C04220Ms.A0B(uri, 1);
        if (!C04220Ms.A0I(uri.getLastPathSegment(), "payouts_direct_debit_external_result")) {
            return false;
        }
        this.A00 = uri.toString();
        FragmentActivity requireActivity = requireActivity();
        Intent A0B = C18230wP.A0B();
        A0B.putExtra("AUTH_RESULT_KEY", "AUTH_COMPLETE");
        A0B.putExtra("REDIRECT_URL", this.A00);
        C18200wM.A10(requireActivity, A0B);
        return false;
    }

    public final boolean onBackPressed() {
        String str;
        WebView webView = this.A01;
        if (webView != null) {
            str = webView.getUrl();
        } else {
            str = null;
        }
        Uri A012 = C15430rJ.A01(str);
        if (A012.getHost() == null || A012.getPath() == null || !C04220Ms.A0I(A012.getLastPathSegment(), "payouts_direct_debit_external_result")) {
            FragmentActivity requireActivity = requireActivity();
            Intent A0B = C18230wP.A0B();
            A0B.putExtra("AUTH_RESULT_KEY", "AUTH_INCOMPLETE");
            C18200wM.A10(requireActivity, A0B);
            return true;
        }
        FragmentActivity requireActivity2 = requireActivity();
        Intent A0B2 = C18230wP.A0B();
        A0B2.putExtra("AUTH_RESULT_KEY", "AUTH_COMPLETE");
        A0B2.putExtra("REDIRECT_URL", this.A00);
        C18200wM.A10(requireActivity2, A0B2);
        return true;
    }
}
