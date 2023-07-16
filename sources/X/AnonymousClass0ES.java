package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0ES  reason: invalid class name */
public final class AnonymousClass0ES extends C14460pS {
    public final C12830mZ A00;

    public final String A00() {
        return "com.facebook.rti.mqtt.ACTION_ZR_SWITCH";
    }

    public final String A01() {
        return "ZeroRatingConnectionConfigOverrides";
    }

    public final void A05(String str, String str2) {
        SharedPreferences.Editor edit = this.A04.A00(AnonymousClass006.A08).A00.edit();
        edit.putString("zero_rating_last_host", str);
        edit.putLong("zero_rating_last_host_timestamp", System.currentTimeMillis());
        edit.apply();
    }

    public AnonymousClass0ES(Context context, C12800mV r8, C12830mZ r9, AnonymousClass0L5 r10, Integer num) {
        super(context, r8, r10, num);
        this.A00 = r9;
        SharedPreferences sharedPreferences = this.A04.A00(AnonymousClass006.A08).A00;
        if (System.currentTimeMillis() - sharedPreferences.getLong("zero_rating_last_host_timestamp", 0) < 86400000) {
            this.A06 = sharedPreferences.getString("zero_rating_last_host", (String) null);
        }
    }
}
