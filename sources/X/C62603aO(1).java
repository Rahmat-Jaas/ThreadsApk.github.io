package X;

import android.content.Intent;
import com.facebook.AccessToken;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3aO  reason: invalid class name and case insensitive filesystem */
public abstract class C62603aO {
    public static final Map A00 = AnonymousClass0wJ.A0y();

    public static synchronized C62603aO A01(String str) {
        C62603aO r2;
        synchronized (C62603aO.class) {
            Map map = A00;
            r2 = (C62603aO) map.get(str);
            if (r2 == null) {
                if ("fbsdk_logged_out_id".equals(str)) {
                    r2 = new AnonymousClass147();
                } else {
                    r2 = new AnonymousClass148(AnonymousClass06O.A00(C60943Re.A00), new AnonymousClass32E(str), str);
                }
                map.put(str, r2);
            }
        }
        return r2;
    }

    public final void A02(AccessToken accessToken) {
        if (!(this instanceof AnonymousClass147)) {
            AnonymousClass148 r3 = (AnonymousClass148) this;
            AccessToken accessToken2 = r3.A00;
            r3.A00 = accessToken;
            r3.A01 = null;
            r3.A02 = new Date(0);
            AnonymousClass32E r0 = r3.A04;
            if (accessToken != null) {
                try {
                    JSONObject A01 = AnonymousClass3J8.A01(accessToken);
                    String str = r0.A00;
                    C18180wK.A0v(AnonymousClass3Zs.A02(str).edit(), "com.facebook.AccessTokenManager.CachedAccessToken", A01.toString());
                } catch (JSONException unused) {
                }
            } else {
                C18180wK.A0u(AnonymousClass3Zs.A02(r0.A00).edit(), "com.facebook.AccessTokenManager.CachedAccessToken");
            }
            if (accessToken2 == null) {
                if (accessToken == null) {
                    return;
                }
            } else if (accessToken2.equals(accessToken)) {
                return;
            }
            Intent A05 = C18250wR.A05("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            A05.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken2);
            A05.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken);
            r3.A03.A02(A05);
        }
    }

    public static AccessToken A00(String str) {
        C62603aO A01 = A01(str);
        if (A01 instanceof AnonymousClass147) {
            return null;
        }
        return ((AnonymousClass148) A01).A00;
    }
}
