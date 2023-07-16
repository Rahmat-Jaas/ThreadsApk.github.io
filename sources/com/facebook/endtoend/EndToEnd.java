package com.facebook.endtoend;

import X.AnonymousClass00U;
import X.C02640Cf;
import X.C02720Cp;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class EndToEnd {
    public static JSONObject A00 = new JSONObject();
    public static Map A01;
    public static boolean A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public static boolean A07;
    public static volatile boolean A08;
    public static volatile boolean A09;

    public static String A00(String str, boolean z, boolean z2) {
        String A012;
        if (!z2 && !isRunningEndToEndTest()) {
            return null;
        }
        String property = System.getProperty(str);
        if (property != null && !property.equals("")) {
            return property;
        }
        String property2 = System.getProperty(AnonymousClass00U.A0L("fb.e2e.", str));
        if (property2 != null && !property2.equals("")) {
            return property2;
        }
        if (z) {
            try {
                String A013 = C02640Cf.A01(str);
                if (A013 != null && !A013.equals("")) {
                    return A013;
                }
                if (AnonymousClass00U.A0L("fb.e2e.", str).length() > 31 || (A012 = C02640Cf.A01(AnonymousClass00U.A0L("fb.e2e.", str))) == null || A012.equals("")) {
                    return null;
                }
                return A012;
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    static {
        try {
            C02720Cp.A00();
        } catch (IllegalStateException unused) {
        }
    }

    public static Map A01() {
        JSONObject jSONObject;
        Map map = A01;
        if (map != null) {
            return map;
        }
        A01 = new HashMap();
        try {
            String A002 = A00("sharedprefs", false, false);
            if (A002 == null || A002.length() <= 0) {
                JSONObject jSONObject2 = A00;
                if (jSONObject2.has("sharedprefs")) {
                    jSONObject = jSONObject2.getJSONObject("sharedprefs");
                } else {
                    jSONObject = new JSONObject();
                }
            } else {
                jSONObject = new JSONObject(A002);
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                A01.put(next, jSONObject.getJSONObject(next));
            }
            if (!A01.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Use E2E shared preferences overrides: ");
                sb.append(A01);
                Log.w("EndToEnd-Test", sb.toString());
            }
            return A01;
        } catch (JSONException e) {
            throw new RuntimeException("Malformed json for shared preferences", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if ("true".equals(java.lang.System.getProperty("fb.running_e2e_locally")) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A02() {
        /*
            java.lang.Class<com.facebook.endtoend.EndToEnd> r4 = com.facebook.endtoend.EndToEnd.class
            monitor-enter(r4)
            boolean r0 = A04     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x002f
            java.lang.String r3 = "true"
            java.lang.String r1 = "fb.running_e2e_locally"
            java.lang.String r0 = X.C02640Cf.A01(r1)     // Catch:{ all -> 0x0033 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0033 }
            r2 = 1
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x0033 }
            boolean r1 = r3.equals(r0)     // Catch:{ all -> 0x0033 }
            r0 = 0
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            A05 = r0     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = "EndToEnd-Test"
            java.lang.String r0 = "Is running E2E test locally"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0033 }
        L_0x002d:
            A04 = r2     // Catch:{ all -> 0x0033 }
        L_0x002f:
            boolean r0 = A05     // Catch:{ all -> 0x0033 }
            monitor-exit(r4)
            return r0
        L_0x0033:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.endtoend.EndToEnd.A02():boolean");
    }

    public static synchronized boolean A03() {
        boolean z;
        synchronized (EndToEnd.class) {
            if (!A02) {
                boolean equals = "true".equals(C02640Cf.A01("fb.running_mobilelab"));
                A06 = equals;
                if (equals) {
                    Log.w("Mobilelab", "Is running Mobilelab test");
                }
                A02 = true;
            }
            z = A06;
        }
        return z;
    }

    public static synchronized boolean A04() {
        boolean z;
        synchronized (EndToEnd.class) {
            if (!A03) {
                boolean equals = "true".equals(C02640Cf.A01("fb.running_sapienz"));
                A07 = equals;
                if (equals) {
                    Log.w("Sapienz", "Is running Sapienz test");
                }
                A03 = true;
            }
            z = A07;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if ("true".equals(java.lang.System.getProperty("fb.running_e2e")) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isRunningEndToEndTest() {
        /*
            boolean r0 = A08
            if (r0 != 0) goto L_0x002e
            java.lang.String r3 = "fb.running_e2e"
            java.lang.String r0 = X.C02640Cf.A01(r3)
            java.lang.String r1 = "true"
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = java.lang.System.getProperty(r3)
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            A09 = r0
            boolean r0 = A09
            if (r0 == 0) goto L_0x002c
            java.lang.String r1 = "EndToEnd-Test"
            java.lang.String r0 = "Is running E2E test"
            android.util.Log.w(r1, r0)
        L_0x002c:
            A08 = r2
        L_0x002e:
            boolean r0 = A09
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.endtoend.EndToEnd.isRunningEndToEndTest():boolean");
    }
}
