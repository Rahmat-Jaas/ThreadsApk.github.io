package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.39M  reason: invalid class name */
public final class AnonymousClass39M {
    public static AnonymousClass39M A02;
    public String A00;
    public final SharedPreferences A01;

    public AnonymousClass39M(Context context) {
        AnonymousClass7M8 A002 = AnonymousClass3SL.A00(context, "AuthHeaderPrefs");
        this.A01 = A002;
        this.A00 = A002.getString("DEVICE_HEADER_ID", "");
    }
}
