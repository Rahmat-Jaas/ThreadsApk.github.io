package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.security.KeyStore;

/* renamed from: X.61o  reason: invalid class name and case insensitive filesystem */
public final class C956361o extends C133087v4 {
    public byte[] A00;
    public final SharedPreferences A01;
    public final String A02;
    public final KeyStore.PrivateKeyEntry A03;

    public final Integer BJ1() {
        return AnonymousClass006.A01;
    }

    public final String getName() {
        return this.A02;
    }

    public C956361o(Context context, String str, KeyStore.PrivateKeyEntry privateKeyEntry) {
        this.A02 = str;
        this.A03 = privateKeyEntry;
        this.A01 = C86164wN.A0C(context, "pair_prefs");
    }
}
