package X;

/* renamed from: X.2Hs  reason: invalid class name and case insensitive filesystem */
public final class C33962Hs {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (X.C63433hT.A05(r3) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass601 r12) {
        /*
            r4 = 1
            X.C04220Ms.A0B(r12, r4)
            X.0i6 r3 = X.C63913ic.A0F(r12)
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.util.Calendar.getInstance()
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36317277087862312(0x81065f00080e28, double:3.03053049607653E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0021
            boolean r0 = X.C63433hT.A05(r3)
            r1 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            java.lang.String r6 = "is_aggregated"
            java.lang.String r9 = "daily_time_spent_in_secs"
            r0 = 2
            r12 = 0
            kotlin.Pair[] r5 = new kotlin.Pair[r0]
            if (r1 == 0) goto L_0x006c
            java.util.List r11 = X.C60613Pu.A00()
            java.util.List r10 = X.C63043bN.A01(r3)
            X.3am r0 = X.C63043bN.A01
            android.content.SharedPreferences r1 = X.C62803am.A01(r0, r3)
            java.lang.String r0 = "LAST_SCREEN_TIME_UPLOAD"
            long r7 = X.C18180wK.A05(r1, r0)
            long r2 = X.AnonymousClass0wJ.A0A()
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0062
            r0 = 0
        L_0x0049:
            java.util.List r0 = X.C60613Pu.A01(r11, r10, r0)
            kotlin.Pair r0 = X.C18180wK.A0p(r9, r0)
            r5[r12] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
        L_0x0057:
            kotlin.Pair r0 = X.C18180wK.A0p(r6, r0)
            r5[r4] = r0
            java.util.Map r0 = X.AnonymousClass4WJ.A0H(r5)
            return r0
        L_0x0062:
            long r2 = r2 - r7
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 / r0
            r0 = 1
            long r2 = r2 + r0
            int r0 = (int) r2
            goto L_0x0049
        L_0x006c:
            java.util.List r0 = X.C60613Pu.A00()
            kotlin.Pair r0 = X.C18180wK.A0p(r9, r0)
            r5[r12] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33962Hs.A00(X.601):java.lang.Object");
    }
}
