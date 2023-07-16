package X;

import android.content.SharedPreferences;

/* renamed from: X.3YD  reason: invalid class name */
public final class AnonymousClass3YD {
    public final SharedPreferences A00;
    public final C03700Kj A01;
    public final String A02;
    public final String A03;

    public AnonymousClass3YD(SharedPreferences sharedPreferences, String str, String str2) {
        C04220Ms.A0B(str, 1);
        AnonymousClass0IY r0 = AnonymousClass0IY.A00;
        this.A00 = sharedPreferences;
        this.A01 = r0;
        if (str2.length() == 0) {
            throw C18180wK.A0a("surfaceId cannot be empty");
        }
        this.A03 = str;
        this.A02 = str2;
    }

    public final int A02(Integer num, String str) {
        String str2;
        int intValue = num.intValue();
        if (intValue == 0) {
            str2 = "impressionCount";
        } else if (intValue == 1) {
            str2 = "primaryActionCount";
        } else if (intValue != 2) {
            str2 = "dismissActionCount";
        } else {
            str2 = "secondaryActionCount";
        }
        return this.A00.getInt(A00(this, str, str2), 0);
    }

    public static final String A00(AnonymousClass3YD r3, String str, String str2) {
        if (str.length() == 0) {
            throw C18180wK.A0a("promotionId cannot be empty");
        }
        return AnonymousClass00U.A0N(r3.A03, AnonymousClass00U.A0N(str, str2, '/'), '/');
    }

    public static final void A01(AnonymousClass3YD r6, String str, String str2, String str3, String str4) {
        String A002 = A00(r6, str, str2);
        String A003 = A00(r6, str, str3);
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = r6.A00;
        SharedPreferences.Editor putLong = sharedPreferences.edit().putInt(A002, C18190wL.A04(sharedPreferences, A002) + 1).putLong(A003, currentTimeMillis);
        if (str4 != null) {
            putLong.putLong(AnonymousClass00U.A0N(r6.A03, AnonymousClass00U.A0N(r6.A02, str4, '/'), '/'), currentTimeMillis);
        }
        putLong.apply();
    }
}
