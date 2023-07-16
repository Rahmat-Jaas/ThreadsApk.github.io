package X;

/* renamed from: X.1nD  reason: invalid class name */
public final class AnonymousClass1nD extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nD(C697249u r7) {
        super("prefetchSelfProfile", 1791138859, 5, false, false);
        this.A00 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (r4 != false) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loggedRun() {
        /*
            r21 = this;
            r0 = r21
            X.49u r1 = r0.A00
            com.instagram.service.session.UserSession r0 = r1.A06
            X.EAI r8 = X.EAI.A01(r0)
            android.content.Context r14 = r1.A05
            java.lang.String r7 = r0.getUserId()
            com.instagram.service.session.UserSession r6 = r8.A01
            X.DpN r1 = X.C25643DpN.A00(r6)
            java.lang.String r0 = "profile"
            boolean r0 = r1.A01(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x010f
            boolean r0 = r8.A06
            r5 = 0
            if (r0 == 0) goto L_0x0070
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x0059
            r13 = 3
            java.lang.Integer[] r12 = X.AnonymousClass006.A00(r13)
            int r11 = r12.length
            r10 = 0
        L_0x0030:
            if (r10 >= r11) goto L_0x0073
            r9 = r12[r10]
            r4 = 1
            if (r9 == 0) goto L_0x0045
            boolean r0 = r8.A09(r9, r7)
            r4 = r0 ^ 1
        L_0x003d:
            if (r4 == 0) goto L_0x0042
            X.EAI.A06(r14, r8, r9, r7)
        L_0x0042:
            int r10 = r10 + 1
            goto L_0x0030
        L_0x0045:
            java.lang.Integer[] r3 = X.AnonymousClass006.A00(r13)
            int r2 = r3.length
            r1 = 0
        L_0x004b:
            if (r1 >= r2) goto L_0x003d
            r0 = r3[r1]
            boolean r0 = r8.A09(r0, r7)
            if (r0 == 0) goto L_0x0056
            r4 = 0
        L_0x0056:
            int r1 = r1 + 1
            goto L_0x004b
        L_0x0059:
            r4 = 1
            java.lang.Integer[] r3 = X.C18240wQ.A1Z()
            int r2 = r3.length
            r1 = 0
        L_0x0060:
            if (r1 >= r2) goto L_0x006e
            r0 = r3[r1]
            boolean r0 = r8.A09(r0, r7)
            if (r0 == 0) goto L_0x006b
            r4 = 0
        L_0x006b:
            int r1 = r1 + 1
            goto L_0x0060
        L_0x006e:
            if (r4 == 0) goto L_0x0073
        L_0x0070:
            X.EAI.A06(r14, r8, r5, r7)
        L_0x0073:
            java.lang.String r0 = r6.getUserId()
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00cb
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r6)
            boolean r0 = r0.A3a()
            if (r0 == 0) goto L_0x00cb
            r7 = 0
            X.C04220Ms.A0B(r14, r7)
            java.lang.String r0 = "{\"is_badged\":"
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r1 = X.AnonymousClass00U.A0H(r0, r2, r7)
            java.lang.String r0 = "{\"server_params\":"
            java.lang.String r1 = X.AnonymousClass00U.A0M(r0, r1, r2)
            r2 = 1
            java.lang.String r0 = "params"
            java.util.HashMap r18 = X.C63203gz.A03(r0, r1)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            long r3 = r1.getTimeInMillis()
            r0 = 5
            r1.add(r0, r2)
            r0 = 11
            r1.set(r0, r7)
            X.C18190wL.A1W(r1)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r1.getTimeInMillis()
            long r0 = r0 - r3
            long r19 = r2.toSeconds(r0)
            X.18u r15 = new X.18u
            r15.<init>(r6)
            java.lang.String r16 = "com.bloks.www.ig.pro_dash.entry_point.hypercard"
            r17 = r5
            X.M4x.A03(r14, r15, r16, r17, r18, r19)
        L_0x00cb:
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r6)
            r0 = 179(0xb3, float:2.51E-43)
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r4 = new com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2
            r4.<init>((com.instagram.service.session.UserSession) r6, (int) r0)
            r3 = 1
            X.HtU r0 = r1.A0G()
            if (r0 == 0) goto L_0x00e0
            r0.Aah()
        L_0x00e0:
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r6)
            java.lang.String r0 = "creator/creator_info/"
            r2.A0J(r0)
            java.lang.String r0 = r1.getId()
            X.C18250wR.A17(r2, r0)
            java.lang.String r1 = "surface_type"
            java.lang.String r0 = "android"
            r2.A0O(r1, r0)
            java.lang.String r1 = "self_profile"
            java.lang.String r0 = "entry_point"
            r2.A0O(r0, r1)
            java.lang.Class<X.1UG> r1 = X.AnonymousClass1UG.class
            java.lang.Class<X.3Pk> r0 = X.C60513Pk.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r2.A00 = r4
            r1 = 1653838317(0x629391ed, float:1.3610932E21)
            r0 = 3
            X.C31155GhB.A05(r2, r1, r0, r3, r3)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1nD.loggedRun():void");
    }
}
