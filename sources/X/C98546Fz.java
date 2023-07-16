package X;

/* renamed from: X.6Fz  reason: invalid class name and case insensitive filesystem */
public final class C98546Fz {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r14 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r1 != false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C41822MeD A00(X.C112976qV r15, X.M5L r16, X.C127397h3 r17, int r18, int r19) {
        /*
            r8 = 0
            r7 = 1
            r5 = 2
            r4 = r16
            X.C04220Ms.A0B(r4, r5)
            r6 = r15
            android.content.Context r2 = r15.A04
            r1 = 41
            r0 = 0
            r9 = r17
            float r17 = r9.A0G(r1, r0)
            X.C04220Ms.A06(r2)
            android.app.Activity r3 = X.AnonymousClass7I3.A00(r2)
            java.lang.String r16 = "Required value was null."
            if (r3 == 0) goto L_0x00eb
            r15 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0081
            java.lang.String r12 = X.C127397h3.A0C(r9)
            if (r12 == 0) goto L_0x0076
            java.lang.Integer r14 = X.AnonymousClass006.A00
            java.lang.Integer[] r11 = X.C18240wQ.A1Z()
            int r10 = r11.length
            r2 = 0
        L_0x0033:
            if (r2 >= r10) goto L_0x004d
            r13 = r11[r2]
            int r0 = r13.intValue()
            switch(r0) {
                case 1: goto L_0x0070;
                case 2: goto L_0x0073;
                default: goto L_0x003e;
            }
        L_0x003e:
            java.lang.String r1 = "AUTO"
        L_0x0040:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = X.C18220wO.A0u(r0, r12)
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x006d
            r14 = r13
        L_0x004d:
            if (r14 == 0) goto L_0x0076
        L_0x004f:
            android.content.ContentResolver r1 = r3.getContentResolver()
            java.lang.String r0 = "accelerometer_rotation"
            r2 = 0
            int r0 = android.provider.Settings.System.getInt(r1, r0, r8)
            boolean r1 = X.C86114wI.A1T(r0, r7)
            int r0 = r14.intValue()
            if (r0 == r8) goto L_0x0079
            if (r0 == r5) goto L_0x007d
            if (r0 == r7) goto L_0x007e
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x006d:
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0070:
            java.lang.String r1 = "LANDSCAPE"
            goto L_0x0040
        L_0x0073:
            java.lang.String r1 = "PORTRAIT"
            goto L_0x0040
        L_0x0076:
            java.lang.Integer r14 = X.AnonymousClass006.A00
            goto L_0x004f
        L_0x0079:
            r2 = 10
            if (r1 == 0) goto L_0x007e
        L_0x007d:
            r2 = 1
        L_0x007e:
            r3.setRequestedOrientation(r2)
        L_0x0081:
            X.7h3 r5 = X.C127397h3.A05(r9)
            if (r5 == 0) goto L_0x00e6
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            r8 = r18
            r9 = r19
            if (r0 != 0) goto L_0x00e3
            android.view.Window r0 = r3.getWindow()
            android.view.View r3 = r0.getDecorView()
            X.C04220Ms.A06(r3)
            int r0 = r3.getWidth()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r0 = r3.getHeight()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
        L_0x00ac:
            X.MeD r13 = r5.ABY(r6, r2, r1)
            X.C04220Ms.A06(r13)
            int r0 = android.view.View.MeasureSpec.getMode(r2)
            if (r0 != 0) goto L_0x00de
            int r10 = r13.getWidth()
        L_0x00bd:
            int r0 = android.view.View.MeasureSpec.getMode(r1)
            if (r0 != 0) goto L_0x00d9
            int r11 = r13.getHeight()
        L_0x00c7:
            r15 = 0
            r12 = r6
            r14 = r5
            r16 = r2
            r17 = r1
            X.7J7 r7 = X.AnonymousClass7J7.A02(r12, r13, r14, r15, r16, r17)
            X.7h1 r5 = new X.7h1
            r6 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L_0x00d9:
            int r11 = android.view.View.MeasureSpec.getSize(r1)
            goto L_0x00c7
        L_0x00de:
            int r10 = android.view.View.MeasureSpec.getSize(r2)
            goto L_0x00bd
        L_0x00e3:
            r2 = r8
            r1 = r9
            goto L_0x00ac
        L_0x00e6:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r16)
            throw r0
        L_0x00eb:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98546Fz.A00(X.6qV, X.M5L, X.7h3, int, int):X.MeD");
    }
}
