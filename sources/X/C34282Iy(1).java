package X;

/* renamed from: X.2Iy  reason: invalid class name and case insensitive filesystem */
public final class C34282Iy {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass601 r13, X.C63893iY r14) {
        /*
            r6 = 0
            boolean r5 = X.AnonymousClass0wJ.A1Z(r14, r13)
            java.util.List r1 = r14.A00
            java.lang.String r9 = X.C18190wL.A0q(r1, r6)
            if (r9 != 0) goto L_0x000f
            java.lang.String r9 = ""
        L_0x000f:
            java.lang.String r8 = X.C18190wL.A0q(r1, r5)
            r0 = 2
            java.lang.String r11 = X.C18190wL.A0q(r1, r0)
            r0 = 3
            java.lang.String r7 = X.C18190wL.A0q(r1, r0)
            r0 = 4
            X.6jp r4 = X.C18190wL.A0R(r1, r0)
            r0 = 5
            java.lang.String r12 = X.C18190wL.A0q(r1, r0)
            r0 = 6
            java.lang.Object r3 = r1.get(r0)
            r0 = 7
            java.lang.Object r1 = r1.get(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            X.3iD r2 = X.C63733iD.A01()
            if (r11 == 0) goto L_0x00e3
            int r10 = r11.hashCode()
            r0 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r10 == r0) goto L_0x00d7
            r0 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r10 != r0) goto L_0x00e3
            java.lang.String r0 = "error"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00e3
            X.22c r0 = X.C306022c.ERROR
        L_0x0051:
            r2.A0A = r9
            r2.A0F = r8
            r2.A0F(r0)
            if (r1 == 0) goto L_0x006b
            long r10 = r1.longValue()
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x006b
            long r0 = r1.longValue()
            int r8 = (int) r0
            r2.A01 = r8
        L_0x006b:
            if (r7 == 0) goto L_0x007e
            int r0 = r7.length()
            if (r0 == 0) goto L_0x007e
            r2.A0I = r5
            r2.A0D = r7
            com.facebook.redex.IDxCBackShape137S0200000_1_I2 r0 = new com.facebook.redex.IDxCBackShape137S0200000_1_I2
            r0.<init>((X.AnonymousClass601) r13, (X.C109326jp) r4, (int) r6)
            r2.A07 = r0
        L_0x007e:
            X.22b r1 = X.AnonymousClass22b.SQUARE
            if (r3 == 0) goto L_0x008c
            java.lang.String r0 = "circle"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d1
            X.22b r1 = X.AnonymousClass22b.CIRCULAR
        L_0x008c:
            if (r12 == 0) goto L_0x00a1
            int r0 = r12.length()
            if (r0 == 0) goto L_0x00a1
            r2.A0E(r1)
            android.net.Uri r0 = X.C15430rJ.A01(r12)
            com.instagram.common.typedurl.ImageUrl r0 = X.AnonymousClass3WG.A00(r0)
            r2.A06 = r0
        L_0x00a1:
            X.7qT r4 = X.C63913ic.A08(r13)
            X.3TR r3 = r2.A0B()
            androidx.fragment.app.FragmentActivity r2 = X.C63913ic.A05(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity"
            X.C04220Ms.A0C(r2, r0)
            com.instagram.base.activity.BaseFragmentActivity r2 = (com.instagram.base.activity.BaseFragmentActivity) r2
            X.K6u r0 = r2.BCa()
            r0.A07(r3)
            int r1 = r3.A00
            if (r1 != 0) goto L_0x00c3
            int r1 = X.AnonymousClass3WL.A01()
        L_0x00c3:
            r0 = -1
            if (r1 != r0) goto L_0x00cf
            r1 = 3
            com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape20S0300000_1_I2 r0 = new com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape20S0300000_1_I2
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r2)
            X.C63913ic.A0Q(r13, r0)
        L_0x00cf:
            r0 = 0
            return r0
        L_0x00d1:
            java.lang.String r0 = "square"
            r3.equals(r0)
            goto L_0x008c
        L_0x00d7:
            java.lang.String r0 = "success"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00e3
            X.22c r0 = X.C306022c.SUCCESS
            goto L_0x0051
        L_0x00e3:
            X.22c r0 = X.C306022c.DEFAULT
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34282Iy.A00(X.601, X.3iY):java.lang.Object");
    }
}
