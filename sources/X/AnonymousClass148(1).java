package X;

import com.facebook.AccessToken;
import java.util.Date;
import org.json.JSONException;

/* renamed from: X.148  reason: invalid class name */
public final class AnonymousClass148 extends C62603aO {
    public AccessToken A00;
    public C64383kN A01;
    public Date A02 = new Date(0);
    public final AnonymousClass06O A03;
    public final AnonymousClass32E A04;
    public final String A05;

    public AnonymousClass148(AnonymousClass06O r4, AnonymousClass32E r5, String str) {
        this.A05 = str;
        this.A03 = r4;
        this.A04 = r5;
        AccessToken accessToken = null;
        String string = AnonymousClass3Zs.A02(r5.A00).getString("com.facebook.AccessTokenManager.CachedAccessToken", (String) null);
        if (string != null) {
            try {
                accessToken = AnonymousClass3J8.A00(C18250wR.A0j(string));
            } catch (JSONException unused) {
            }
        }
        this.A00 = accessToken;
    }
}
