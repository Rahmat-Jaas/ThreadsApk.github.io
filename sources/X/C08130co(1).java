package X;

import android.content.Context;
import java.io.File;
import java.util.Map;

/* renamed from: X.0co  reason: invalid class name and case insensitive filesystem */
public final class C08130co extends C05460Tv {
    public final C05210Rw A00;
    public final AnonymousClass0RV A01;

    public final C05480Tx A02(Context context, Map map, int i, int i2) {
        return new C05480Tx(false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d9, code lost:
        if (r6 == null) goto L_0x01de;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x01cd */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e8 A[Catch:{ JSONException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ec A[Catch:{ JSONException -> 0x021d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C05480Tx A03(android.content.Context r16, java.util.Map r17, int r18, int r19) {
        /*
            r15 = this;
            r4 = 1
            r1 = r18
            if (r1 < r4) goto L_0x0235
            r0 = r19
            if (r1 <= r0) goto L_0x0235
            X.0RV r6 = r15.A01
            r5 = 0
            r3 = 0
            boolean r0 = r6.A01
            r10 = r16
            if (r0 != 0) goto L_0x0018
            X.AnonymousClass0RV.A00(r10, r6)
            r6.A01 = r4
        L_0x0018:
            X.0RW r12 = r6.A00
            if (r12 == 0) goto L_0x0022
            boolean r0 = r12.A00()
            if (r0 == r5) goto L_0x0044
        L_0x0022:
            r6.A00 = r3
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()
            java.lang.String r2 = r0.dataDir
            java.lang.String r1 = "ig_crash_log_session"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            r0.delete()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            X.C04220Ms.A06(r0)
            X.AnonymousClass0RV.A01(r10, r6, r0)
            X.0RW r12 = r6.A00
        L_0x0044:
            r13 = -1
            r2 = r17
            if (r17 == 0) goto L_0x0060
            java.lang.String r1 = "number_of_crashes"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0060
            java.lang.Object r1 = r2.get(r1)
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0060
            java.lang.Number r1 = (java.lang.Number) r1
            long r13 = r1.longValue()
        L_0x0060:
            X.0Rw r11 = r15.A00
            X.0S4 r9 = new X.0S4
            r9.<init>(r10, r11, r12, r13)
            r9.start()
            r0 = 36310559758483594(0x8100430000008a, double:3.0262824299289143E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            boolean r0 = X.C07960cV.A05(r0)
            if (r0 == 0) goto L_0x0118
            java.lang.Integer r8 = X.AnonymousClass006.A01
        L_0x007b:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r8 == r0) goto L_0x0235
            X.0S1 r0 = new X.0S1
            r0.<init>(r10, r11, r12)
            r0.start()
            android.content.SharedPreferences r9 = android.preference.PreferenceManager.getDefaultSharedPreferences(r10)
            r9.getClass()
            X.02U r0 = X.AnonymousClass02U.A00
            X.0Oa r1 = X.AnonymousClass0OY.A02(r0)
            X.C04220Ms.A0B(r8, r5)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r8 != r0) goto L_0x010c
            java.lang.String r8 = "current"
            java.lang.String r7 = r9.getString(r8, r3)
            if (r7 == 0) goto L_0x0115
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0115
            java.lang.String[] r6 = X.AnonymousClass0S7.A00
        L_0x00ab:
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00fe
            if (r7 == 0) goto L_0x0112
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0112
            java.io.File r0 = r10.getFilesDir()
            java.lang.String r1 = r0.getPath()
            java.lang.String r0 = "/[0-9]+/clips/*.+"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r0)
            X.C04220Ms.A06(r3)
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()
            java.lang.String r1 = r0.dataDir
            java.lang.String r0 = "/databases/clips_[0-9]+.+"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r0)
            X.C04220Ms.A06(r2)
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()
            java.lang.String r1 = r0.dataDir
            java.lang.String r0 = "/shared_prefs/[0-9]+_ig_clips_drafts\\.xml"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            X.C04220Ms.A06(r0)
            java.util.regex.Pattern[] r3 = new java.util.regex.Pattern[]{r3, r2, r0}
        L_0x00fe:
            r15.A06(r10, r6, r3)
            android.content.SharedPreferences$Editor r0 = r9.edit()
            android.content.SharedPreferences$Editor r0 = r0.putString(r8, r7)
            r0.commit()
        L_0x010c:
            X.0Tx r1 = new X.0Tx
            r1.<init>(r4, r4)
            return r1
        L_0x0112:
            java.util.regex.Pattern[] r3 = new java.util.regex.Pattern[r5]
            goto L_0x00fe
        L_0x0115:
            java.lang.String[] r6 = new java.lang.String[r5]
            goto L_0x00ab
        L_0x0118:
            android.os.StrictMode$ThreadPolicy r7 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r0 = new android.os.StrictMode$ThreadPolicy$Builder
            r0.<init>()
            android.os.StrictMode$ThreadPolicy$Builder r0 = r0.permitAll()
            android.os.StrictMode$ThreadPolicy r0 = r0.build()
            android.os.StrictMode.setThreadPolicy(r0)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r0 = "https"
            android.net.Uri$Builder r1 = r2.scheme(r0)
            java.lang.String r0 = "i.instagram.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "api/v1/instacrash/resolver"
            android.net.Uri$Builder r6 = r1.path(r0)
            java.lang.String r1 = "3419628305025917"
            java.lang.String r0 = "app_id"
            r6.appendQueryParameter(r0, r1)
            X.0et r0 = X.C09120et.A03(r10)     // Catch:{ IOException -> 0x01d0, all -> 0x0229 }
            X.0dK r0 = r0.A1H     // Catch:{ IOException -> 0x01d0, all -> 0x0229 }
            X.0ZU r0 = r0.A00     // Catch:{ IOException -> 0x01d0, all -> 0x0229 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ IOException -> 0x01d0, all -> 0x0229 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ IOException -> 0x01d0, all -> 0x0229 }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x01d0, all -> 0x0229 }
            if (r0 == 0) goto L_0x0165
            java.lang.String r1 = "is_test"
            java.lang.String r0 = "1"
            r2.appendQueryParameter(r1, r0)     // Catch:{ IOException -> 0x01d0, all -> 0x0229 }
        L_0x0165:
            android.net.Uri r0 = r2.build()     // Catch:{ IOException -> 0x01d0, all -> 0x0229 }
            java.lang.String r1 = r0.toString()     // Catch:{ IOException -> 0x01d0, all -> 0x0229 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x01d0, all -> 0x0229 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01d0, all -> 0x0229 }
            java.net.URLConnection r6 = r0.openConnection()     // Catch:{ IOException -> 0x01d0, all -> 0x0229 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x01d0, all -> 0x0229 }
            java.lang.String r1 = X.C10640ig.A00(r10)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r0 = "User-Agent"
            r6.addRequestProperty(r0, r1)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r0 = "GET"
            r6.setRequestMethod(r0)     // Catch:{ IOException -> 0x01ce }
            r0 = 1393512984(0x530f5218, float:6.1555763E11)
            X.C13770oH.A02(r6, r0)     // Catch:{ IOException -> 0x01ce }
            r6.getResponseMessage()     // Catch:{ IOException -> 0x01ce }
            int r1 = r6.getResponseCode()     // Catch:{ IOException -> 0x01ce }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 < r0) goto L_0x01db
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 >= r0) goto L_0x01db
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01ce }
            r2.<init>()     // Catch:{ IOException -> 0x01ce }
            r0 = 1055431673(0x3ee89bf9, float:0.45431498)
            java.io.InputStream r1 = X.C13770oH.A00(r6, r0)     // Catch:{ IOException -> 0x01ce }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x01ce }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01ce }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x01ce }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01ce }
        L_0x01b1:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x01bb
            r2.append(r0)     // Catch:{ all -> 0x01c9 }
            goto L_0x01b1
        L_0x01bb:
            r1.close()     // Catch:{ IOException -> 0x01ce }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01ce }
            r6.disconnect()
            android.os.StrictMode.setThreadPolicy(r7)
            goto L_0x01e2
        L_0x01c9:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x01cd }
        L_0x01cd:
            throw r0     // Catch:{ IOException -> 0x01ce }
        L_0x01ce:
            r2 = move-exception
            goto L_0x01d2
        L_0x01d0:
            r2 = move-exception
            r6 = r3
        L_0x01d2:
            java.lang.String r1 = "InstacrashMitigationRetriever"
            java.lang.String r0 = "Error retrieving mitigation"
            X.AnonymousClass0LU.A0E(r1, r0, r2)     // Catch:{ all -> 0x022b }
            if (r6 == 0) goto L_0x01de
        L_0x01db:
            r6.disconnect()
        L_0x01de:
            android.os.StrictMode.setThreadPolicy(r7)
            r2 = r3
        L_0x01e2:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x021d }
            if (r0 == 0) goto L_0x01ec
            java.lang.Integer r8 = X.AnonymousClass006.A00     // Catch:{ JSONException -> 0x021d }
            goto L_0x007b
        L_0x01ec:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x021d }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x021d }
            java.lang.String r0 = "mitigation"
            java.lang.String r7 = r1.getString(r0)     // Catch:{ JSONException -> 0x021d }
            r0 = 2
            java.lang.Integer[] r6 = X.AnonymousClass006.A00(r0)     // Catch:{ JSONException -> 0x021d }
            int r2 = r6.length     // Catch:{ JSONException -> 0x021d }
            r1 = 0
        L_0x01fe:
            if (r1 >= r2) goto L_0x0219
            r8 = r6[r1]     // Catch:{ JSONException -> 0x021d }
            int r0 = r8.intValue()     // Catch:{ JSONException -> 0x021d }
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0213
            java.lang.String r0 = "no-op"
        L_0x020c:
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ JSONException -> 0x021d }
            if (r0 != 0) goto L_0x007b
            goto L_0x0216
        L_0x0213:
            java.lang.String r0 = "clear_minus_credentials"
            goto L_0x020c
        L_0x0216:
            int r1 = r1 + 1
            goto L_0x01fe
        L_0x0219:
            java.lang.Integer r8 = X.AnonymousClass006.A00     // Catch:{ JSONException -> 0x021d }
            goto L_0x007b
        L_0x021d:
            r2 = move-exception
            java.lang.String r1 = "InstacrashMitigationRetriever"
            java.lang.String r0 = "Error parsing json"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            java.lang.Integer r8 = X.AnonymousClass006.A00
            goto L_0x007b
        L_0x0229:
            r0 = move-exception
            goto L_0x0231
        L_0x022b:
            r0 = move-exception
            if (r6 == 0) goto L_0x0231
            r6.disconnect()
        L_0x0231:
            android.os.StrictMode.setThreadPolicy(r7)
            throw r0
        L_0x0235:
            r0 = 0
            X.0Tx r1 = new X.0Tx
            r1.<init>(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08130co.A03(android.content.Context, java.util.Map, int, int):X.0Tx");
    }

    public final String A04() {
        return "Instagram Instacrash Remedy";
    }

    public C08130co() {
        C05210Rw r1 = new C05210Rw();
        AnonymousClass0RV r0 = new AnonymousClass0RV();
        this.A00 = r1;
        this.A01 = r0;
    }

    public final void A05(Context context, C05470Tw r8) {
        AnonymousClass0RV r5 = this.A01;
        boolean z = r5.A01;
        if (!z) {
            AnonymousClass0RV.A00(context, r5);
            r5.A01 = true;
            z = true;
        }
        if (r5.A00 != null) {
            C05210Rw r4 = this.A00;
            if (!z) {
                AnonymousClass0RV.A00(context, r5);
                r5.A01 = true;
            }
            AnonymousClass0RW r3 = r5.A00;
            boolean z2 = false;
            if (C08360dF.A00().A00.getString("current", (String) null) != null) {
                z2 = true;
            }
            new AnonymousClass0S0(context, r4, r3, z2).start();
            r5.A00 = null;
            new File(context.getApplicationInfo().dataDir, "ig_crash_log_session").delete();
        }
    }
}
