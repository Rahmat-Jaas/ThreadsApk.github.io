package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.endtoend.EndToEnd;

/* renamed from: X.0dD  reason: invalid class name and case insensitive filesystem */
public final class C08350dD {
    public static C08350dD A01;
    public final SharedPreferences A00;

    public final void A00(String str) {
        this.A00.edit().putString("google_ad_id", str).apply();
    }

    public C08350dD(Context context) {
        SharedPreferences r0;
        if (EndToEnd.isRunningEndToEndTest()) {
            r0 = C08370dG.A00(context);
        } else {
            r0 = new C08400dJ(PreferenceManager.getDefaultSharedPreferences(context));
        }
        this.A00 = r0;
    }
}
