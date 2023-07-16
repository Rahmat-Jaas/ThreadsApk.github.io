package X;

import android.content.SharedPreferences;

/* renamed from: X.78l  reason: invalid class name and case insensitive filesystem */
public final class C1200878l {
    public final SharedPreferences A00;
    public final String A01;

    public C1200878l(SharedPreferences sharedPreferences, String str) {
        C04220Ms.A0B(sharedPreferences, 1);
        this.A00 = sharedPreferences;
        this.A01 = str;
    }

    public static String A00(C1200878l r1, String str) {
        String str2 = r1.A01;
        C04220Ms.A0B(str2, 0);
        return AnonymousClass00U.A0N(str2, str, '_');
    }

    public final void A01(String str, float f) {
        C04220Ms.A0B(str, 0);
        this.A00.edit().putFloat(A00(this, str), f).apply();
    }

    public final void A02(String str, long j) {
        C04220Ms.A0B(str, 0);
        AnonymousClass0wJ.A12(this.A00.edit(), A00(this, str), j);
    }
}
