package X;

/* renamed from: X.3MD  reason: invalid class name */
public final class AnonymousClass3MD {
    public static final String A00(AnonymousClass20y r1) {
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            return "BROADCAST_CHAT_CREATION_KEY";
        }
        if (ordinal == 0) {
            return "DISCOVERABLE_PUBLIC_CHANNEL_CREATION_KEY";
        }
        throw AnonymousClass4VZ.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r0.AhE() == null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.AnonymousClass20y r5, com.instagram.service.session.UserSession r6) {
        /*
            boolean r4 = X.C18210wN.A1V(r5)
            X.49q r2 = X.AnonymousClass3Zs.A03(r6)
            int r1 = r5.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x004c
            X.D2R r0 = X.D2R.A0q
        L_0x0011:
            android.content.SharedPreferences r3 = r2.A01(r0)
            java.lang.String r0 = A00(r5)
            r2 = 0
            boolean r1 = r3.getBoolean(r0, r4)
            X.20y r0 = X.AnonymousClass20y.Broadcast
            if (r5 == r0) goto L_0x004f
            if (r1 == 0) goto L_0x004f
            X.Dnj r1 = X.AnonymousClass6VR.A00(r6)
            java.lang.String r0 = r6.getUserId()
            com.instagram.user.model.User r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x003f
            X.4tY r0 = r0.A0I()
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r0.AhE()
            r1 = 0
            if (r0 != 0) goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            java.lang.String r0 = "SUBSCRIBER_SOCIAL_CHANNEL_CREATION_KEY"
            boolean r0 = r3.getBoolean(r0, r4)
            if (r1 != 0) goto L_0x004a
            if (r0 == 0) goto L_0x004b
        L_0x004a:
            r2 = 1
        L_0x004b:
            return r2
        L_0x004c:
            X.D2R r0 = X.D2R.A0N
            goto L_0x0011
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MD.A01(X.20y, com.instagram.service.session.UserSession):boolean");
    }
}
