package X;

/* renamed from: X.2If  reason: invalid class name and case insensitive filesystem */
public final class C34092If {
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.app.Activity r11, X.AnonymousClass601 r12, X.C127397h3 r13, X.C109326jp r14, X.C10300i6 r15, java.lang.String r16, java.util.HashMap r17) {
        /*
            X.7qT r6 = X.C63913ic.A08(r12)
            r0 = 40
            X.7h3 r0 = r13.A0K(r0)
            if (r0 != 0) goto L_0x0067
            r8 = 0
        L_0x000d:
            r0 = 46
            r5 = 0
            boolean r4 = r13.A0T(r0, r5)
            r0 = 50
            boolean r3 = r13.A0T(r0, r5)
            r0 = 53
            boolean r2 = r13.A0T(r0, r5)
            r0 = 41
            X.7h3 r9 = r13.A0K(r0)
            r7 = 35
            if (r9 == 0) goto L_0x0065
            java.lang.String r1 = r9.A0N(r7)
        L_0x002e:
            java.lang.String r0 = X.C18230wP.A0o(r13)
            r10 = r17
            X.3iE r10 = X.C63743iE.A02(r0, r10)
            X.3TP r0 = X.C62863b2.A01(r9)
            com.instagram.bloks.hosting.IgBloksScreenConfig r9 = X.C18190wL.A0N(r15)
            if (r0 == 0) goto L_0x0045
            r9.A06(r0)
        L_0x0045:
            r9.A0P = r1
            r9.A08 = r8
            r0 = 44
            boolean r0 = r13.A0T(r0, r5)
            r9.A0h = r0
            r1 = 1
            r9.A0e = r1
            r9.A0d = r2
            r9.A0c = r3
            r9.A0b = r4
            boolean r0 = r6.A00
            r9.A0Y = r0
            java.lang.String r0 = r13.A0N(r7)
            if (r0 == 0) goto L_0x0079
            goto L_0x006c
        L_0x0065:
            r1 = 0
            goto L_0x002e
        L_0x0067:
            X.7Jj r8 = X.C121997Jj.A00(r12, r0)
            goto L_0x000d
        L_0x006c:
            int r0 = X.AnonymousClass7Kk.A06(r0)     // Catch:{ 1zB -> 0x0073 }
            r9.A00 = r0     // Catch:{ 1zB -> 0x0073 }
            goto L_0x0079
        L_0x0073:
            r7 = move-exception
            java.lang.String r0 = "IgBloksNavigationExtensions"
            X.C30967GcS.A03(r0, r7)
        L_0x0079:
            java.lang.Class<com.instagram.modal.ModalActivity> r8 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r7 = X.C62853b1.A00(r9, r10)
            java.lang.String r0 = "bloks"
            X.3iT r7 = X.C63863iT.A02(r11, r7, r15, r8, r0)
            r8 = r16
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = "fade"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00ce
            int[] r0 = com.instagram.modal.ModalActivity.A04
        L_0x0097:
            r7.A0F = r0
        L_0x0099:
            java.util.List r0 = X.C09960hR.A00
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00bc
        L_0x00a3:
            androidx.fragment.app.Fragment r0 = r6.A02
            r2 = 32779(0x800b, float:4.5933E-41)
            if (r0 == 0) goto L_0x00e9
            if (r14 == 0) goto L_0x00b4
            com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape45S0200000_1_I2 r0 = new com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape45S0200000_1_I2
            r0.<init>((X.AnonymousClass601) r12, (X.C109326jp) r14, (int) r1)
            X.C63913ic.A0Q(r12, r0)
        L_0x00b4:
            androidx.fragment.app.Fragment r0 = X.C63913ic.A01(r12)
            r7.A0J(r0, r2)
            return
        L_0x00bc:
            if (r4 != 0) goto L_0x00c2
            if (r3 != 0) goto L_0x00c2
            if (r2 == 0) goto L_0x00a3
        L_0x00c2:
            r7.A0D = r5
            r7.A0A = r1
            if (r4 != 0) goto L_0x00ca
            if (r3 == 0) goto L_0x00cb
        L_0x00ca:
            r5 = 1
        L_0x00cb:
            r7.A09 = r5
            goto L_0x00a3
        L_0x00ce:
            java.lang.String r0 = "push"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00da
            r7.A0G()
            goto L_0x0099
        L_0x00da:
            java.lang.String r0 = "no_animations"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00e5
            int[] r0 = com.instagram.modal.ModalActivity.A06
            goto L_0x0097
        L_0x00e5:
            r7.A0F()
            goto L_0x0099
        L_0x00e9:
            if (r14 == 0) goto L_0x00f2
            java.lang.String r1 = "bloks_present_modal"
            java.lang.String r0 = "Callback ignored because we're presenting modal from a native surface"
            X.C30967GcS.A02(r1, r0)
        L_0x00f2:
            r7.A0H(r11, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34092If.A00(android.app.Activity, X.601, X.7h3, X.6jp, X.0i6, java.lang.String, java.util.HashMap):void");
    }
}
