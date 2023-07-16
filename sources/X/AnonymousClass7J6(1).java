package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7J6  reason: invalid class name */
public final class AnonymousClass7J6 {
    public static final AtomicInteger A03 = new AtomicInteger((int) SystemClock.elapsedRealtime());
    public Bundle A00;
    public final Context A01;
    public final String A02;

    public static final synchronized Bundle A00(AnonymousClass7J6 r4) {
        Bundle bundle;
        synchronized (r4) {
            bundle = r4.A00;
            if (bundle == null) {
                try {
                    ApplicationInfo applicationInfo = r4.A01.getPackageManager().getApplicationInfo(r4.A02, 128);
                    if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                        r4.A00 = bundle;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 35);
                    A0s.append("Couldn't get own application info: ");
                    Log.w("FirebaseMessaging", C18180wK.A0i(valueOf, A0s));
                }
                bundle = Bundle.EMPTY;
            }
        }
        return bundle;
    }

    public AnonymousClass7J6(Context context, String str) {
        this.A01 = context;
        this.A02 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00be A[SYNTHETIC, Splitter:B:20:0x00be] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(android.os.Bundle r12, X.AnonymousClass7J6 r13, java.lang.String r14) {
        /*
            java.lang.String r11 = A02(r12, r14)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = java.lang.String.valueOf(r14)
            java.lang.String r7 = "_loc_key"
            java.lang.String r0 = r0.concat(r7)
            java.lang.String r2 = A02(r12, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r11 = 0
            if (r0 != 0) goto L_0x0061
            android.content.Context r0 = r13.A01
            android.content.res.Resources r3 = r0.getResources()
            java.lang.String r1 = r13.A02
            java.lang.String r0 = "string"
            int r6 = r3.getIdentifier(r2, r0, r1)
            java.lang.String r5 = " Default value will be used."
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r0 = java.lang.String.valueOf(r14)
            if (r6 != 0) goto L_0x0062
            java.lang.String r1 = r0.concat(r7)
            r0 = 6
            java.lang.String r2 = r1.substring(r0)
            int r0 = X.C86104wH.A0A(r2)
            int r1 = r0 + 49
            int r0 = X.C86104wH.A0A(r14)
            int r1 = r1 + r0
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r1)
            r1.append(r2)
            java.lang.String r0 = " resource not found: "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = X.C18180wK.A0i(r5, r1)
            android.util.Log.w(r4, r0)
        L_0x0061:
            return r11
        L_0x0062:
            java.lang.String r10 = "_loc_args"
            java.lang.String r0 = r0.concat(r10)
            java.lang.String r7 = A02(r12, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00b6
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0089 }
            r9.<init>(r7)     // Catch:{ JSONException -> 0x0089 }
            int r8 = r9.length()     // Catch:{ JSONException -> 0x0089 }
            java.lang.String[] r2 = new java.lang.String[r8]     // Catch:{ JSONException -> 0x0089 }
            r1 = 0
        L_0x007e:
            if (r1 >= r8) goto L_0x00b7
            java.lang.Object r0 = r9.opt(r1)     // Catch:{ JSONException -> 0x0089 }
            r2[r1] = r0     // Catch:{ JSONException -> 0x0089 }
            int r1 = r1 + 1
            goto L_0x007e
        L_0x0089:
            java.lang.String r0 = java.lang.String.valueOf(r14)
            java.lang.String r1 = r0.concat(r10)
            r0 = 6
            java.lang.String r2 = r1.substring(r0)
            int r0 = X.C86104wH.A0A(r2)
            int r1 = r0 + 41
            int r0 = X.C86104wH.A0A(r7)
            int r1 = r1 + r0
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r1)
            java.lang.String r0 = "Malformed "
            X.C86154wM.A1V(r0, r2, r1)
            r1.append(r7)
            java.lang.String r0 = "  Default value will be used."
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)
            android.util.Log.w(r4, r0)
        L_0x00b6:
            r2 = r11
        L_0x00b7:
            if (r2 != 0) goto L_0x00be
            java.lang.String r11 = r3.getString(r6)
            return r11
        L_0x00be:
            java.lang.String r11 = r3.getString(r6, r2)     // Catch:{ MissingFormatArgumentException -> 0x00c3 }
            return r11
        L_0x00c3:
            r3 = move-exception
            java.lang.String r2 = java.util.Arrays.toString(r2)
            int r0 = X.C86104wH.A0A(r14)
            int r1 = r0 + 58
            int r0 = X.C86104wH.A0A(r2)
            int r1 = r1 + r0
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r1)
            java.lang.String r0 = "Missing format argument for "
            X.C86154wM.A1V(r0, r14, r1)
            r1.append(r2)
            java.lang.String r0 = X.C18180wK.A0i(r5, r1)
            android.util.Log.w(r4, r0, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7J6.A01(android.os.Bundle, X.7J6, java.lang.String):java.lang.String");
    }

    public static String A02(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return bundle.getString(str.replace("gcm.n.", "gcm.notification."));
        }
        return string;
    }

    public static void A03(Intent intent, Bundle bundle) {
        Iterator A0x = C86144wL.A0x(bundle);
        while (A0x.hasNext()) {
            String A0k = C18180wK.A0k(A0x);
            if (A0k.startsWith("google.c.a.") || A0k.equals("from")) {
                intent.putExtra(A0k, bundle.getString(A0k));
            }
        }
    }
}
