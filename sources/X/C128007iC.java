package X;

import com.facebook.xanalytics.XAnalyticsAdapter;
import com.instagram.service.session.UserSession;

/* renamed from: X.7iC  reason: invalid class name and case insensitive filesystem */
public final class C128007iC implements XAnalyticsAdapter {
    public static final C1186971x A01 = new C1186971x();
    public final UserSession A00;

    public final void cleanup() {
    }

    public final void flush() {
    }

    public final String getStructureSamplingConfig(String str) {
        return "";
    }

    public final void logCounter(String str, double d, String str2) {
        C04220Ms.A0B(str, 0);
    }

    public final void logEventBypassSampling(String str, String str2) {
        logEvent(str, str2, "", AnonymousClass0wJ.A1Y(str, str2), -1.0d);
    }

    public final boolean shouldLog(String str) {
        return true;
    }

    public C128007iC(UserSession userSession) {
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.C102596Vu.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.C102596Vu.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void logEvent(java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, double r12) {
        /*
            r7 = this;
            boolean r5 = X.AnonymousClass0wJ.A1Z(r8, r9)
            java.lang.Class<X.7iC> r0 = X.C128007iC.class
            java.lang.String r0 = r0.getSimpleName()
            X.0rn r2 = X.C15730rn.A01(r8, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.A00 = r0
            java.lang.String r0 = "UTF8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ IOException -> 0x00a8 }
            X.C04220Ms.A06(r0)     // Catch:{ IOException -> 0x00a8 }
            byte[] r0 = r9.getBytes(r0)     // Catch:{ IOException -> 0x00a8 }
            X.C04220Ms.A06(r0)     // Catch:{ IOException -> 0x00a8 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x00a8 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00a8 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x00a1 }
            r0.<init>(r3)     // Catch:{ all -> 0x00a1 }
            android.util.JsonReader r4 = new android.util.JsonReader     // Catch:{ all -> 0x00a1 }
            r4.<init>(r0)     // Catch:{ all -> 0x00a1 }
            android.util.JsonToken r1 = r4.peek()     // Catch:{ all -> 0x009a }
            android.util.JsonToken r0 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ all -> 0x009a }
            if (r1 != r0) goto L_0x0093
            r4.beginObject()     // Catch:{ all -> 0x009a }
        L_0x003e:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0093
            java.lang.String r6 = r4.nextName()     // Catch:{ all -> 0x009a }
            android.util.JsonToken r0 = r4.peek()     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x008f
            int[] r1 = X.AnonymousClass6Z1.A00     // Catch:{ all -> 0x009a }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x009a }
            r1 = r1[r0]     // Catch:{ all -> 0x009a }
            if (r1 == r5) goto L_0x0083
            r0 = 2
            if (r1 == r0) goto L_0x007b
            r0 = 3
            if (r1 == r0) goto L_0x006f
            r0 = 4
            if (r1 != r0) goto L_0x008f
            X.0ri r1 = new X.0ri     // Catch:{ all -> 0x009a }
            r1.<init>()     // Catch:{ all -> 0x009a }
            X.71x r0 = A01     // Catch:{ all -> 0x009a }
            X.C1186971x.A00(r4, r1, r0)     // Catch:{ all -> 0x009a }
            r2.A05(r1, r6)     // Catch:{ all -> 0x009a }
            goto L_0x003e
        L_0x006f:
            boolean r0 = r4.nextBoolean()     // Catch:{ all -> 0x009a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x009a }
            r2.A09(r6, r0)     // Catch:{ all -> 0x009a }
            goto L_0x003e
        L_0x007b:
            java.lang.String r0 = r4.nextString()     // Catch:{ all -> 0x009a }
            r2.A0D(r6, r0)     // Catch:{ all -> 0x009a }
            goto L_0x003e
        L_0x0083:
            double r0 = r4.nextDouble()     // Catch:{ all -> 0x009a }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x009a }
            r2.A0A(r6, r0)     // Catch:{ all -> 0x009a }
            goto L_0x003e
        L_0x008f:
            r4.skipValue()     // Catch:{ all -> 0x009a }
            goto L_0x003e
        L_0x0093:
            r4.close()     // Catch:{ all -> 0x00a1 }
            r3.close()     // Catch:{ IOException -> 0x00a8 }
            goto L_0x00a8
        L_0x009a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            X.C102596Vu.A00(r4, r1)     // Catch:{ all -> 0x00a1 }
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            X.C102596Vu.A00(r3, r1)     // Catch:{ IOException -> 0x00a8 }
            throw r0     // Catch:{ IOException -> 0x00a8 }
        L_0x00a8:
            com.instagram.service.session.UserSession r0 = r7.A00
            X.C18180wK.A1K(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128007iC.logEvent(java.lang.String, java.lang.String, java.lang.String, boolean, double):void");
    }

    public final void logCounter(String str, double d) {
        C04220Ms.A0B(str, 0);
    }
}
