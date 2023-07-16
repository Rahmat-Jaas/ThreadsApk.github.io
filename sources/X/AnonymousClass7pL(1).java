package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7pL  reason: invalid class name */
public final class AnonymousClass7pL implements C33788HuV {
    public final Context A00;
    public final UserSession A01;

    public final String getFilenameSuffix() {
        return "_feed_cache.json";
    }

    public final String getTag() {
        return "FeedCacheLogCollector";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008f, code lost:
        if (r15.getBoolean("has_liked") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009d, code lost:
        if (r15.getBoolean("has_viewer_saved") == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ab, code lost:
        if (r15.getBoolean("is_seen") == false) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getContentInBackground(android.content.Context r19) {
        /*
            r18 = this;
            r2 = 10
            r1 = 8
            r0 = 111(0x6f, float:1.56E-43)
            java.lang.String r13 = X.AnonymousClass7C6.A01(r2, r1, r0)
            java.lang.String r12 = "id"
            r0 = 57
            java.lang.String r11 = X.I17.A00(r0)
            r0 = 232(0xe8, float:3.25E-43)
            java.lang.String r10 = X.I17.A00(r0)
            java.lang.String r9 = "is_seen"
            java.lang.String r8 = "has_viewer_saved"
            java.lang.String r7 = "has_liked"
            r0 = 0
            r1 = r19
            X.C04220Ms.A0B(r1, r0)
            r0 = r18
            android.content.Context r2 = r0.A00
            com.instagram.service.session.UserSession r0 = r0.A01
            java.lang.String r1 = r0.getUserId()
            java.lang.String r0 = X.C10380iF.A02(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "MainFeed-%s-%s.json"
            java.lang.String r1 = X.C18180wK.A0j(r0, r1)
            java.io.File r0 = r2.getCacheDir()
            java.io.File r1 = X.C86154wM.A0U(r0, r1)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00df
            org.json.JSONObject r17 = X.C18230wP.A0y()
            java.lang.StringBuilder r0 = X.C18200wM.A0r()     // Catch:{ IOException | JSONException -> 0x00da }
            java.lang.String r0 = X.AnonymousClass0hL.A06(r1, r0)     // Catch:{ IOException | JSONException -> 0x00da }
            org.json.JSONObject r0 = X.C18250wR.A0j(r0)     // Catch:{ IOException | JSONException -> 0x00da }
            org.json.JSONArray r16 = r0.getJSONArray(r10)     // Catch:{ IOException | JSONException -> 0x00da }
            org.json.JSONArray r6 = X.C18250wR.A0i()     // Catch:{ IOException | JSONException -> 0x00da }
            int r5 = r16.length()     // Catch:{ IOException | JSONException -> 0x00da }
            r4 = 0
        L_0x0067:
            if (r4 >= r5) goto L_0x00d5
            r0 = r16
            java.lang.Object r1 = r0.get(r4)     // Catch:{ IOException | JSONException -> 0x00da }
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)     // Catch:{ IOException | JSONException -> 0x00da }
            X.C04220Ms.A0C(r1, r0)     // Catch:{ IOException | JSONException -> 0x00da }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ IOException | JSONException -> 0x00da }
            boolean r0 = r1.has(r11)     // Catch:{ IOException | JSONException -> 0x00da }
            if (r0 == 0) goto L_0x00d2
            org.json.JSONObject r15 = r1.getJSONObject(r11)     // Catch:{ IOException | JSONException -> 0x00da }
            boolean r0 = r15.has(r7)     // Catch:{ IOException | JSONException -> 0x00da }
            if (r0 == 0) goto L_0x0091
            boolean r0 = r15.getBoolean(r7)     // Catch:{ IOException | JSONException -> 0x00da }
            r14 = 1
            if (r0 != 0) goto L_0x0092
        L_0x0091:
            r14 = 0
        L_0x0092:
            boolean r0 = r15.has(r8)     // Catch:{ IOException | JSONException -> 0x00da }
            if (r0 == 0) goto L_0x009f
            boolean r0 = r15.getBoolean(r8)     // Catch:{ IOException | JSONException -> 0x00da }
            r3 = 1
            if (r0 != 0) goto L_0x00a0
        L_0x009f:
            r3 = 0
        L_0x00a0:
            boolean r0 = r15.has(r9)     // Catch:{ IOException | JSONException -> 0x00da }
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r15.getBoolean(r9)     // Catch:{ IOException | JSONException -> 0x00da }
            r2 = 1
            if (r0 != 0) goto L_0x00ae
        L_0x00ad:
            r2 = 0
        L_0x00ae:
            org.json.JSONObject r1 = X.C18230wP.A0y()     // Catch:{ IOException | JSONException -> 0x00da }
            java.lang.String r0 = r15.getString(r12)     // Catch:{ IOException | JSONException -> 0x00da }
            r1.put(r12, r0)     // Catch:{ IOException | JSONException -> 0x00da }
            java.lang.String r0 = "user"
            org.json.JSONObject r0 = r15.getJSONObject(r0)     // Catch:{ IOException | JSONException -> 0x00da }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ IOException | JSONException -> 0x00da }
            r1.put(r13, r0)     // Catch:{ IOException | JSONException -> 0x00da }
            r1.put(r7, r14)     // Catch:{ IOException | JSONException -> 0x00da }
            r1.put(r8, r3)     // Catch:{ IOException | JSONException -> 0x00da }
            r1.put(r9, r2)     // Catch:{ IOException | JSONException -> 0x00da }
            r6.put(r1)     // Catch:{ IOException | JSONException -> 0x00da }
        L_0x00d2:
            int r4 = r4 + 1
            goto L_0x0067
        L_0x00d5:
            r0 = r17
            r0.put(r10, r6)     // Catch:{ IOException | JSONException -> 0x00da }
        L_0x00da:
            java.lang.String r0 = X.C18190wL.A0n(r17)
            return r0
        L_0x00df:
            java.lang.String r0 = "home feed cache file doesn't exist"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7pL.getContentInBackground(android.content.Context):java.lang.String");
    }

    public final String getFilenamePrefix() {
        return this.A01.getUserId();
    }

    public AnonymousClass7pL(Context context, UserSession userSession) {
        AnonymousClass0wJ.A1O(context, userSession);
        this.A00 = context;
        this.A01 = userSession;
    }
}
