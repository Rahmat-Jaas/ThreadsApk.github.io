package X;

/* renamed from: X.1Q6  reason: invalid class name */
public final class AnonymousClass1Q6 extends AnonymousClass0ED {
    public final C15710rl A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r3 == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.content.Context r5, android.content.Intent r6, X.C16240si r7, java.lang.Object r8) {
        /*
            r4 = this;
            X.0rl r2 = r4.A00
            java.lang.String r1 = X.C18210wN.A0e(r8)
            java.util.List r0 = X.C60873Qw.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002d
            r0 = 0
            boolean r3 = r2.A01(r5, r6, r0)
            if (r3 != 0) goto L_0x002c
        L_0x0015:
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r1 = "DirectMessageTrustedAppChecker"
            java.lang.String r0 = "Failed trusted app check: %s"
            X.AnonymousClass0LU.A0O(r1, r0, r2)
            java.lang.String r0 = "Binding intent not handled due to permission check failure"
            X.C10450iM.A03(r1, r0)
            if (r7 == 0) goto L_0x002c
            java.lang.String r0 = "Failed Stella trusted app check"
            r7.Ccv(r0)
        L_0x002c:
            return r3
        L_0x002d:
            r3 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q6.A00(android.content.Context, android.content.Intent, X.0si, java.lang.Object):boolean");
    }

    public AnonymousClass1Q6() {
        C15740ro r1 = new C15740ro();
        r1.A05("com.instagram.android.fbpermission.MANAGE_MESSAGING");
        r1.A04("MANAGE_DIRECT_MESSAGING");
        this.A00 = r1.A00();
    }
}
