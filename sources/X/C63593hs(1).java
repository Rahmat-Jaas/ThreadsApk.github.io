package X;

import android.content.SharedPreferences;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3hs  reason: invalid class name and case insensitive filesystem */
public final class C63593hs {
    public static final C556133x A00;
    public static final C556133x A01;
    public static final C556233y A02;
    public static final C58243Eq A03;
    public static final C58233Ep A04;
    public static final C58243Eq A05;

    static {
        SharedPreferences sharedPreferences = C10600ic.A00.getSharedPreferences("unauthenticated", 0);
        A00 = new C556133x(sharedPreferences);
        A03 = new C58243Eq(sharedPreferences, "last_log_in_token");
        A01 = new C556133x(sharedPreferences);
        A02 = new C556233y(sharedPreferences);
        A04 = new C58233Ep(sharedPreferences, "last_attempt_time_stamp");
        A05 = new C58243Eq(sharedPreferences, "last_user_profile_photo_url");
    }

    public static synchronized int A00() {
        int i;
        synchronized (C63593hs.class) {
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences sharedPreferences = A04.A00;
            if (sharedPreferences.getLong("last_attempt_time_stamp", 0) + 604800000 < currentTimeMillis || sharedPreferences.getLong("last_attempt_time_stamp", 0) > currentTimeMillis) {
                AnonymousClass0wJ.A11(A02.A00.edit(), "number_of_login_attempts", 0);
            }
            i = A02.A00.getInt("number_of_login_attempts", 0);
        }
        return i;
    }

    public static synchronized String A01() {
        String string;
        synchronized (C63593hs.class) {
            string = A03.A00.getString("last_log_in_token", (String) null);
        }
        return string;
    }

    public static synchronized void A02() {
        SharedPreferences.Editor putInt;
        synchronized (C63593hs.class) {
            A04.A00(C18200wM.A0c());
            SharedPreferences sharedPreferences = A02.A00;
            int A042 = C18190wL.A04(sharedPreferences, "number_of_login_attempts") + 1;
            if (Integer.valueOf(A042) == null) {
                putInt = sharedPreferences.edit().remove("number_of_login_attempts");
            } else {
                putInt = sharedPreferences.edit().putInt("number_of_login_attempts", A042);
            }
            putInt.apply();
        }
    }

    public static synchronized void A03(ImageUrl imageUrl, String str) {
        synchronized (C63593hs.class) {
            A03.A00(str);
            AnonymousClass0wJ.A13(A00.A00.edit(), "did_facebook_sso", false);
            A05.A00(imageUrl.getUrl());
        }
    }

    public static synchronized void A04(ImageUrl imageUrl, String str) {
        synchronized (C63593hs.class) {
            A03.A00(str);
            AnonymousClass0wJ.A13(A00.A00.edit(), "did_facebook_sso", true);
            A05.A00(imageUrl.getUrl());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (A01() != null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A05() {
        /*
            java.lang.Class<X.3hs> r2 = X.C63593hs.class
            monitor-enter(r2)
            X.33x r0 = A00     // Catch:{ all -> 0x0019 }
            android.content.SharedPreferences r1 = r0.A00     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = "did_facebook_sso"
            boolean r0 = X.C18190wL.A1X(r1, r0)     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0016
            java.lang.String r1 = A01()     // Catch:{ all -> 0x001b }
            r0 = 0
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            monitor-exit(r2)
            return r0
        L_0x0019:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001b }
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63593hs.A05():boolean");
    }

    public static synchronized boolean A06() {
        boolean z;
        synchronized (C63593hs.class) {
            z = A01.A00.getBoolean("registration_push_sent_v2", false);
        }
        return z;
    }
}
