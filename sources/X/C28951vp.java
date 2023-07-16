package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.client.utils.URLEncodedUtils;
import java.util.Iterator;

/* renamed from: X.1vp  reason: invalid class name and case insensitive filesystem */
public final class C28951vp extends C34608Ibe implements C82424pb {
    public static final String __redex_internal_original_name = "PlatformAuthorizeAppWebViewFragment";

    public final String getModuleName() {
        return "platform_authorize_webview";
    }

    public final boolean A02(Uri uri, WebView webView) {
        FragmentActivity fragmentActivity;
        String str;
        String str2;
        String str3;
        String obj = uri.toString();
        if (obj.startsWith("fbconnect://success")) {
            Bundle A06 = C18180wK.A06();
            Iterator<String> it = uri.getQueryParameterNames().iterator();
            while (it.hasNext()) {
                C18190wL.A12(uri, A06, C18180wK.A0k(it));
            }
            if (uri.getFragment() != null) {
                for (String split : uri.getFragment().split(URLEncodedUtils.PARAMETER_SEPARATOR)) {
                    String[] split2 = split.split("=");
                    String str4 = split2[0];
                    if (split2.length > 1) {
                        str3 = split2[1];
                    } else {
                        str3 = "";
                    }
                    A06.putString(str4, str3);
                }
            }
            fragmentActivity = requireActivity();
            Intent A0B = C18230wP.A0B();
            A0B.putExtras(A06);
            fragmentActivity.setResult(-1, A0B);
        } else {
            try {
                String originalUrl = webView.getOriginalUrl();
                if (originalUrl != null) {
                    String queryParameter = C15430rJ.A01(Uri.encode(originalUrl)).getQueryParameter("redirect_uri");
                    String encode = Uri.encode(obj);
                    if (queryParameter != null && encode.startsWith(queryParameter)) {
                        C37412JrW.A01(requireActivity(), obj);
                        fragmentActivity = requireActivity();
                        fragmentActivity.setResult(0);
                    }
                }
            } catch (SecurityException e) {
                e = e;
                str = __redex_internal_original_name;
                str2 = "URI security exception";
                AnonymousClass0LU.A0E(str, str2, e);
                return false;
            } catch (Exception e2) {
                e = e2;
                str = __redex_internal_original_name;
                str2 = "URI uncaught exception";
                AnonymousClass0LU.A0E(str, str2, e);
                return false;
            }
            return false;
        }
        fragmentActivity.finish();
        return true;
    }

    public final boolean onBackPressed() {
        FragmentActivity requireActivity = requireActivity();
        requireActivity.setResult(0);
        requireActivity.finish();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-127096692);
        super.onCreate(bundle);
        if (C18190wL.A0F(this) != null) {
            C18190wL.A0F(this).setSoftInputMode(3);
        }
        C14030oh.A09(-419500262, A02);
    }
}
