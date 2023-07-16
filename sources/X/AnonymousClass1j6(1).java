package X;

/* renamed from: X.1j6  reason: invalid class name */
public final class AnonymousClass1j6 extends JY2 {
    public final /* synthetic */ C685544g A00;

    public AnonymousClass1j6(C685544g r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r2 == null) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResponseStarted(X.GXK r8, X.JWQ r9, X.GJN r10) {
        /*
            r7 = this;
            X.44g r0 = r7.A00
            X.47k r4 = r0.A01
            X.0i6 r3 = r0.A00
            boolean r0 = r10.A01()
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "X-AED"
            X.3Ud r2 = r10.A00(r0)
            r5 = -1
            if (r2 == 0) goto L_0x0028
            java.lang.String r0 = r2.A01     // Catch:{ NumberFormatException -> 0x0022 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0022 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0022 }
            if (r0 < 0) goto L_0x0095
            r5 = r0
        L_0x0022:
            r0 = -1
            r6 = 0
            if (r5 != r0) goto L_0x0031
            if (r2 != 0) goto L_0x0095
        L_0x0028:
            java.lang.String r1 = "EmergencyPushVersionChangeHandler"
            java.lang.String r0 = "Emergency push version header missing"
            X.C10450iM.A03(r1, r0)
            java.lang.String r6 = "missing_header"
        L_0x0031:
            X.0dD r0 = r4.A04
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r1 = "preference_emergency_push_version"
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L_0x0066
            android.content.SharedPreferences$Editor r0 = r2.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r5)
            r0.commit()
            java.lang.String r0 = "ig_emergency_push_did_set_initial_version"
            X.0rn r2 = X.C18230wP.A0T(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "current_version"
            r2.A08(r1, r0)
            java.lang.String r0 = "error_description"
            if (r6 == 0) goto L_0x005e
            r2.A0D(r0, r6)
        L_0x005e:
            X.0kZ r0 = X.C12090lI.A00(r3)
            r0.Ce1(r2)
        L_0x0065:
            return
        L_0x0066:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = r2.getInt(r1, r0)
            if (r5 <= r6) goto L_0x0065
            X.C63643hy.A01()
            java.util.concurrent.Semaphore r0 = r4.A05
            boolean r0 = r0.tryAcquire()
            if (r0 == 0) goto L_0x0065
            X.H1T r2 = X.C18180wK.A0O(r3)
            java.lang.String r0 = "aed/current/"
            r2.A0J(r0)
            java.lang.Class<X.1Tc> r1 = X.C22031Tc.class
            java.lang.Class<X.3MS> r0 = X.AnonymousClass3MS.class
            X.H8c r1 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            X.1hQ r0 = new X.1hQ
            r0.<init>(r3, r4, r6, r5)
            r1.A00 = r0
            X.C31155GhB.A02(r1)
            return
        L_0x0095:
            java.lang.String r1 = "EmergencyPushVersionChangeHandler"
            java.lang.String r0 = "Invalid emergency push version received"
            X.C10450iM.A03(r1, r0)
            java.lang.String r1 = "invalid_version: "
            java.lang.String r0 = r2.toString()
            java.lang.String r6 = X.AnonymousClass00U.A0L(r1, r0)
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1j6.onResponseStarted(X.GXK, X.JWQ, X.GJN):void");
    }
}
