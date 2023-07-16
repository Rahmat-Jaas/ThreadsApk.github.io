package X;

/* renamed from: X.6Or  reason: invalid class name and case insensitive filesystem */
public final class C100796Or {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r0 != null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (r1 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        r0 = X.C18180wK.A0p(r2, X.C86124wJ.A0f(r1, "true"));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass601 r14, X.C63893iY r15) {
        /*
            r9 = 0
            boolean r1 = X.AnonymousClass0wJ.A1Z(r15, r14)
            X.3HX r0 = r14.A00
            r13 = 0
            if (r0 == 0) goto L_0x0027
            android.content.Context r6 = r0.A00
        L_0x000c:
            com.instagram.service.session.UserSession r7 = X.C86104wH.A0Y(r14)
            java.lang.String r10 = X.C63893iY.A0D(r15, r9)
            java.lang.Object r8 = X.C63893iY.A0B(r15, r1)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r11 = "OPT_IN_NUX_UPDATE"
            boolean r0 = X.C04220Ms.A0I(r10, r11)
            if (r0 == 0) goto L_0x007a
            java.lang.String r4 = "bloks.browser_history.UpdateProperty"
            java.lang.String r3 = ""
            goto L_0x0029
        L_0x0027:
            r6 = r13
            goto L_0x000c
        L_0x0029:
            X.Kq4 r12 = X.C36975Ji8.A03     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            if (r8 != 0) goto L_0x002e
            r8 = r3
        L_0x002e:
            X.76V r5 = r12.A02     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            X.0FL r1 = X.C86154wM.A16(r0)     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            X.0FL r0 = X.C86154wM.A16(r0)     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            X.0AD r0 = X.C03970Ls.A01(r2, r1, r0)     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            X.8sP r0 = X.AnonymousClass72C.A00(r0, r5)     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            java.lang.Object r0 = r12.A00(r8, r0)     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            java.util.List r0 = X.AnonymousClass4WH.A06(r0)     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            java.lang.Object r0 = X.AnonymousClass00J.A0D(r0)     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            kotlin.Pair r0 = (kotlin.Pair) r0     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            if (r0 == 0) goto L_0x005a
            java.lang.Object r2 = r0.A00     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            if (r2 != 0) goto L_0x005d
        L_0x005a:
            r2 = r3
            if (r0 == 0) goto L_0x0061
        L_0x005d:
            java.lang.Object r1 = r0.A01     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            if (r1 != 0) goto L_0x0062
        L_0x0061:
            r1 = r3
        L_0x0062:
            java.lang.String r0 = "true"
            java.lang.Boolean r0 = X.C86124wJ.A0f(r1, r0)     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            kotlin.Pair r0 = X.C18180wK.A0p(r2, r0)     // Catch:{ 6Cb | IllegalArgumentException -> 0x006d }
            goto L_0x0086
        L_0x006d:
            r0 = move-exception
            X.C30967GcS.A03(r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            kotlin.Pair r0 = X.C18180wK.A0p(r3, r0)
            goto L_0x0086
        L_0x007a:
            if (r8 != 0) goto L_0x007e
            java.lang.String r8 = ""
        L_0x007e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            kotlin.Pair r0 = X.C18180wK.A0p(r8, r0)
        L_0x0086:
            java.lang.Object r8 = r0.A00
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r0.A01
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r12 = r5.booleanValue()
            if (r6 == 0) goto L_0x009d
            boolean r0 = X.AnonymousClass8bQ.A0m(r8)
            if (r0 == 0) goto L_0x009d
            X.AnonymousClass7Bs.A01(r6, r7, r8)
        L_0x009d:
            X.C04220Ms.A0B(r10, r9)
            r0 = 5
            java.lang.Integer[] r4 = X.AnonymousClass006.A00(r0)
            int r3 = r4.length
            r2 = 0
        L_0x00a7:
            if (r2 >= r3) goto L_0x00d7
            r1 = r4[r2]
            int r0 = r1.intValue()
            switch(r0) {
                case 1: goto L_0x00db;
                case 2: goto L_0x00de;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00e4;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            java.lang.String r0 = "CLEAR_ALL"
        L_0x00b4:
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x00d8
            int r1 = r1.intValue()
            if (r1 == r9) goto L_0x00e6
            r0 = 4
            if (r1 != r0) goto L_0x00d7
            X.Jhz r0 = X.J2X.A00(r7)
            r0.A02(r5)
            if (r6 == 0) goto L_0x00d7
            boolean r0 = X.AnonymousClass8bQ.A0m(r8)
            if (r0 == 0) goto L_0x00d7
            if (r12 == 0) goto L_0x00d7
            X.AnonymousClass7Bs.A02(r6, r7, r8)
        L_0x00d7:
            return r13
        L_0x00d8:
            int r2 = r2 + 1
            goto L_0x00a7
        L_0x00db:
            java.lang.String r0 = "CLEAR_SINGLE"
            goto L_0x00b4
        L_0x00de:
            java.lang.String r0 = "TOOLTIP_VISIBLE"
            goto L_0x00b4
        L_0x00e1:
            java.lang.String r0 = "HAS_ACCESSED_BROWSER_HISTORY"
            goto L_0x00b4
        L_0x00e4:
            r0 = r11
            goto L_0x00b4
        L_0x00e6:
            X.Jhz r0 = X.J2X.A00(r7)
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            r0 = 524(0x20c, float:7.34E-43)
            java.lang.String r0 = X.I17.A00(r0)
            X.AnonymousClass0wJ.A12(r1, r0, r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100796Or.A00(X.601, X.3iY):java.lang.Object");
    }
}
