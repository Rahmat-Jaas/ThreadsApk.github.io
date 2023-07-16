package X;

import android.content.SharedPreferences;

/* renamed from: X.3Ep  reason: invalid class name and case insensitive filesystem */
public final class C58233Ep {
    public final SharedPreferences A00;
    public final String A01;

    public final void A00(Long l) {
        SharedPreferences.Editor putLong;
        SharedPreferences sharedPreferences = this.A00;
        if (l == null) {
            putLong = sharedPreferences.edit().remove(this.A01);
        } else {
            putLong = sharedPreferences.edit().putLong(this.A01, l.longValue());
        }
        putLong.apply();
    }

    public C58233Ep(SharedPreferences sharedPreferences, String str) {
        this.A00 = sharedPreferences;
        this.A01 = str;
    }
}
