package X;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.1vr  reason: invalid class name and case insensitive filesystem */
public final class C28971vr extends C34608Ibe implements C82424pb {
    public static final String __redex_internal_original_name = "PayPalAuthWebViewFragment";
    public WebView A00;
    public String A01;
    public String A02;

    public final void A01(WebView webView) {
        C04220Ms.A0B(webView, 0);
        this.A00 = webView;
    }

    public final boolean onBackPressed() {
        WebView webView = this.A00;
        C04220Ms.A0A(webView);
        Uri A012 = C15430rJ.A01(webView.getUrl());
        String host = A012.getHost();
        String path = A012.getPath();
        if (host == null || path == null || this.A01 == null) {
            FragmentActivity activity = getActivity();
            Intent A0B = C18230wP.A0B();
            A0B.putExtra("AUTH_RESULT_KEY", "AUTH_INCOMPLETE");
            C04220Ms.A0A(activity);
            C18200wM.A10(activity, A0B);
            return true;
        }
        A00();
        return true;
    }

    private final void A00() {
        FragmentActivity activity = getActivity();
        Intent A0B = C18230wP.A0B();
        A0B.putExtra("AUTH_RESULT_KEY", "AUTH_COMPLETE");
        A0B.putExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, this.A01);
        A0B.putExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, this.A02);
        C04220Ms.A0A(activity);
        C18200wM.A10(activity, A0B);
    }

    public final boolean A02(Uri uri, WebView webView) {
        boolean A1Z = AnonymousClass0wJ.A1Z(webView, uri);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String queryParameter = uri.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        this.A01 = queryParameter;
        if (scheme == null || host == null || queryParameter == null) {
            return super.A02(uri, webView);
        }
        this.A02 = uri.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        A00();
        return A1Z;
    }
}
