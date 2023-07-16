package X;

import android.content.Context;

/* renamed from: X.0Tf  reason: invalid class name and case insensitive filesystem */
public final class C05350Tf {
    public static final void A00(Context context, String str) {
        if (str != null && !str.equals(context.getSharedPreferences("acra_criticaldata_store", 0).getString("USER_ID", ""))) {
            context.getSharedPreferences("acra_criticaldata_store", 0).edit().putString("CLIENT_USER_ID", str).commit();
        }
        C37261JnV.A01(str);
    }
}
