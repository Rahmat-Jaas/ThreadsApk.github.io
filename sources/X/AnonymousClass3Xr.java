package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.3Xr  reason: invalid class name */
public final class AnonymousClass3Xr {
    public static void A01(Context context, C10300i6 r2, AnonymousClass3Xr r3, C36941JhV jhV, String str) {
        jhV.A02 = str;
        r3.A02(context, r2, jhV.A00());
    }

    public static final Intent A00(Context context, C10300i6 r3, SimpleWebViewConfig simpleWebViewConfig) {
        AnonymousClass0wJ.A1N(context, r3);
        Intent A04 = C18250wR.A04(context, SimpleWebViewActivity.class);
        A04.putExtra("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", simpleWebViewConfig);
        A04.putExtra("IgSessionManager.SESSION_TOKEN_KEY", r3.getToken());
        return A04;
    }

    public final void A02(Context context, C10300i6 r3, SimpleWebViewConfig simpleWebViewConfig) {
        AnonymousClass0wJ.A1N(context, r3);
        C10650ih.A02(context, A00(context, r3, simpleWebViewConfig));
    }
}
