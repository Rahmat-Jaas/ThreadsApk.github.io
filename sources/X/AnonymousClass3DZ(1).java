package X;

/* renamed from: X.3DZ  reason: invalid class name */
public final class AnonymousClass3DZ {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        if (r2.equals(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_NONE) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass17Q A00(X.C127397h3 r10) {
        /*
            r9 = this;
            r1 = 0
            r0 = 40
            java.lang.String r2 = r10.A0N(r0)
            r3 = 0
            if (r2 == 0) goto L_0x0011
            int r0 = r2.hashCode()
            switch(r0) {
                case -2119261262: goto L_0x012a;
                case -1866255949: goto L_0x011e;
                case -1782234803: goto L_0x0112;
                case -1335458389: goto L_0x0106;
                case -934641255: goto L_0x00fa;
                case -934521548: goto L_0x00ee;
                case -218232060: goto L_0x00e2;
                case 96417: goto L_0x00d6;
                case 3015911: goto L_0x00ca;
                case 3046176: goto L_0x00be;
                case 3089282: goto L_0x00b2;
                case 3237038: goto L_0x00a6;
                case 3343799: goto L_0x009a;
                case 3357525: goto L_0x008f;
                case 3377907: goto L_0x0084;
                case 3387192: goto L_0x007b;
                case 94627080: goto L_0x0078;
                case 94756344: goto L_0x006d;
                case 109400031: goto L_0x0062;
                case 1382682413: goto L_0x0057;
                case 1434631203: goto L_0x004c;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.String r0 = "Unsupported icon type: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r2)
            X.1zB r2 = new X.1zB
            r2.<init>(r0)
            java.lang.String r0 = "BloksNavbarButton"
            X.C30967GcS.A03(r0, r2)
        L_0x0021:
            r0 = 42
            java.lang.String r4 = r10.A0N(r0)
            r2 = 38
            r0 = 1
            boolean r8 = r10.A0T(r2, r0)
            java.lang.String r0 = X.C18230wP.A0o(r10)
            java.lang.String r5 = X.AnonymousClass2JW.A00(r0)
            java.lang.String r6 = X.C18220wO.A0o(r10)
            r0 = 43
            int r7 = r10.A0H(r0, r1)
            r0 = 41
            X.6jp r2 = r10.A0L(r0)
            X.17Q r1 = new X.17Q
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L_0x004c:
            java.lang.String r0 = "settings"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0I
            goto L_0x0021
        L_0x0057:
            java.lang.String r0 = "payments"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0L
            goto L_0x0021
        L_0x0062:
            java.lang.String r0 = "share"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0N
            goto L_0x0021
        L_0x006d:
            java.lang.String r0 = "close"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A09
            goto L_0x0021
        L_0x0078:
            java.lang.String r0 = "check"
            goto L_0x00b4
        L_0x007b:
            java.lang.String r0 = "none"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0021
            goto L_0x0011
        L_0x0084:
            java.lang.String r0 = "next"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0C
            goto L_0x0021
        L_0x008f:
            java.lang.String r0 = "more"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A00
            goto L_0x0021
        L_0x009a:
            java.lang.String r0 = "mail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0J
            goto L_0x0021
        L_0x00a6:
            java.lang.String r0 = "info"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0Y
            goto L_0x0021
        L_0x00b2:
            java.lang.String r0 = "done"
        L_0x00b4:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A1C
            goto L_0x0021
        L_0x00be:
            java.lang.String r0 = "cart"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0H
            goto L_0x0021
        L_0x00ca:
            java.lang.String r0 = "back"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0B
            goto L_0x0021
        L_0x00d6:
            java.lang.String r0 = "add"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A1L
            goto L_0x0021
        L_0x00e2:
            java.lang.String r0 = "menu_horizontal"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0G
            goto L_0x0021
        L_0x00ee:
            java.lang.String r0 = "report"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0E
            goto L_0x0021
        L_0x00fa:
            java.lang.String r0 = "reload"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0D
            goto L_0x0021
        L_0x0106:
            java.lang.String r0 = "delete"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0u
            goto L_0x0021
        L_0x0112:
            java.lang.String r0 = "questions"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0M
            goto L_0x0021
        L_0x011e:
            java.lang.String r0 = "edit_list"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0O
            goto L_0x0021
        L_0x012a:
            java.lang.String r0 = "sliders"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r3 = X.AnonymousClass006.A0K
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DZ.A00(X.7h3):X.17Q");
    }
}
