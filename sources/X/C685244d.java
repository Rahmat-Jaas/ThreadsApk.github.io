package X;

/* renamed from: X.44d  reason: invalid class name and case insensitive filesystem */
public final class C685244d implements C82324pR {
    public static final C685244d A00 = new C685244d();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r4.endsWith(r0) != false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CWV(X.GXK r7, java.lang.String r8) {
        /*
            r6 = this;
            r5 = 0
            r3 = 1
            if (r8 == 0) goto L_0x0040
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0040
            java.net.URI r0 = r7.A08
            java.lang.String r4 = r0.getHost()
            if (r4 == 0) goto L_0x0032
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "ak.instagram.com"
            boolean r0 = r4.endsWith(r0)
            if (r0 == 0) goto L_0x004b
            X.20l r2 = X.C302920l.AKAMAI
        L_0x0022:
            X.20l r0 = X.C302920l.AKAMAI
            if (r2 != r0) goto L_0x0041
            java.lang.String r0 = "Pragma"
            java.lang.String r1 = "akamai-x-cache-on, akamai-x-cache-remote-on, akamai-x-get-client-ip"
        L_0x002a:
            r7.A03(r0, r1)
            java.lang.String r0 = "Cdn"
            r7.A02(r0, r2)
        L_0x0032:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "InstagramTraceEnabled"
            r7.A02(r0, r1)
            java.lang.String r0 = "InstagramTraceToken"
            r7.A02(r0, r8)
        L_0x0040:
            return
        L_0x0041:
            java.lang.String r0 = "X-FB-Debug"
            java.lang.String r1 = "True"
            r7.A03(r0, r1)
            java.lang.String r0 = "X-FB-Origin-Debug"
            goto L_0x002a
        L_0x004b:
            java.lang.String[] r2 = X.C547730a.A00
            r0 = r2[r5]
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x007f
            java.lang.String r1 = "."
            r0 = r2[r5]
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            X.C04220Ms.A0B(r0, r3)
            boolean r0 = r4.endsWith(r0)
            if (r0 != 0) goto L_0x007f
            r0 = r2[r3]
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x007f
            r1 = 46
            r0 = r2[r3]
            java.lang.String r0 = X.AnonymousClass00U.A0B(r0, r1)
            X.C04220Ms.A0B(r0, r3)
            boolean r0 = r4.endsWith(r0)
            if (r0 == 0) goto L_0x0032
        L_0x007f:
            X.20l r2 = X.C302920l.IGCDN
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C685244d.CWV(X.GXK, java.lang.String):void");
    }
}
