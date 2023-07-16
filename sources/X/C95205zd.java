package X;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.secure.securewebview.SecureWebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5zd  reason: invalid class name and case insensitive filesystem */
public final class C95205zd extends C90995fQ {
    public final C021209x A00;

    public final SecureWebView A0T(Context context) {
        C04220Ms.A0B(context, 0);
        SecureWebView secureWebView = new SecureWebView(context);
        secureWebView.getSettings().setUseWideViewPort(true);
        secureWebView.getSettings().setLoadWithOverviewMode(true);
        secureWebView.getSettings().setSupportZoom(true);
        secureWebView.getSettings().setBuiltInZoomControls(true);
        secureWebView.getSettings().setDisplayZoomControls(false);
        secureWebView.getSettings().setDomStorageEnabled(true);
        secureWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        secureWebView.getSettings().setJavaScriptEnabled(true);
        secureWebView.addJavascriptInterface(this, "_MetaCommerceThirdPartyMarketingTag");
        return secureWebView;
    }

    @JavascriptInterface
    public final void log(String str) {
        C04220Ms.A0B(str, 0);
        try {
            JSONObject A0j = C18250wR.A0j(str);
            String string = A0j.getString("event");
            String string2 = A0j.getString("id");
            String string3 = A0j.getString("surface");
            C04220Ms.A06(string3);
            C171619zh valueOf = C171619zh.valueOf(string3);
            String string4 = A0j.getString("extra_data_json");
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(C86104wH.A0K(this.A00, "commerce_third_party_marketing_tag_fire"), 451);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0T("event_type", string);
                A0I.A0T("global_site_tag_id", string2);
                A0I.A0O(valueOf, "surface");
                A0I.A0T("extra_data_json", string4);
                A0I.Bb4();
            }
        } catch (JSONException e) {
            AnonymousClass0LU.A0E("BkBloksComponentsCommerceMarketingTagRenderUnit", "JSONException when parsing message from WebView", e);
        }
    }

    public C95205zd(AnonymousClass3HX r2, C127397h3 r3) {
        super(r2, r3);
        this.A00 = C13330nS.A02(C63913ic.A0E(r2));
    }
}
