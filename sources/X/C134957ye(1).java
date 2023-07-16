package X;

/* renamed from: X.7ye  reason: invalid class name and case insensitive filesystem */
public final class C134957ye implements Runnable {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        if (r6.A02.contains(r1) == false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            X.7IZ r4 = X.AnonymousClass7IZ.A08
            android.view.ViewGroup r3 = X.AnonymousClass7IZ.A00
            if (r3 == 0) goto L_0x00d8
            X.770 r0 = X.AnonymousClass7IZ.A00()
            X.6lR r0 = r0.A06
            X.56r r2 = r0.A03
            X.770 r0 = X.AnonymousClass7IZ.A00()
            X.6lR r0 = r0.A06
            X.56r r0 = r0.A03
            java.lang.Object r0 = r0.A08()
            java.lang.Number r0 = (java.lang.Number) r0
            r5 = 0
            r1 = 1
            if (r0 == 0) goto L_0x013c
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x002a:
            r2.A0H(r0)
            X.770 r0 = X.AnonymousClass7IZ.A00()
            X.6lR r0 = r0.A06
            X.56r r0 = r0.A02
            java.lang.Object r0 = r0.A08()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.C04220Ms.A0I(r0, r2)
            if (r0 != 0) goto L_0x005e
            X.7IQ r7 = X.AnonymousClass7IZ.A01()
            X.7Ea r6 = r7.A0A
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x00eb
            X.4WE r0 = X.AnonymousClass4WE.A00()
            java.lang.String r1 = r0.A00
            X.C04220Ms.A06(r1)
            java.util.Set r0 = r6.A02
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x00eb
        L_0x005e:
            X.770 r0 = X.AnonymousClass7IZ.A00()
            X.6lR r0 = r0.A06
            X.56r r0 = r0.A02
            java.lang.Object r0 = r0.A08()
            boolean r0 = X.C04220Ms.A0I(r0, r2)
            if (r0 != 0) goto L_0x0078
            X.7Ea r0 = X.AnonymousClass7IZ.A02()
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x00d8
        L_0x0078:
            X.770 r4 = X.AnonymousClass7IZ.A00()
            X.6lR r7 = r4.A06
            X.56r r0 = r7.A02
            java.lang.Object r0 = r0.A08()
            boolean r0 = X.C04220Ms.A0I(r0, r2)
            if (r0 == 0) goto L_0x00b0
            X.AnonymousClass770.A00()
            X.6kP r3 = r4.A05
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x00b0
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x00b0
            X.7IQ r2 = X.AnonymousClass7IZ.A01()
            android.view.View r1 = r3.A01
            X.C04220Ms.A0A(r1)
            android.view.View r0 = r3.A02
            X.C04220Ms.A0A(r0)
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            java.util.List r0 = X.C06750aI.A17(r0)
            r2.A04(r0)
        L_0x00b0:
            X.7Ea r0 = r4.A07
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x00d8
            android.view.ViewGroup r0 = X.AnonymousClass7IZ.A00
            if (r0 == 0) goto L_0x00d8
            android.view.Display r0 = r0.getDisplay()
            if (r0 == 0) goto L_0x00d8
            float r0 = r0.getRefreshRate()
            double r4 = (double) r0
            int r8 = r7.A01
            r6 = 100
            double r2 = r7.A00
            if (r8 >= r6) goto L_0x00e4
            double r0 = (double) r8
            double r2 = r2 * r0
            double r2 = r2 + r4
            int r0 = r8 + 1
            r7.A01 = r0
            double r0 = (double) r0
        L_0x00d5:
            double r2 = r2 / r0
            r7.A00 = r2
        L_0x00d8:
            android.os.Handler r2 = X.AnonymousClass7IZ.A07
            X.7Ea r0 = X.AnonymousClass7IZ.A02()
            long r0 = r0.A00
            r2.postDelayed(r9, r0)
            return
        L_0x00e4:
            r0 = 99
            double r0 = (double) r0
            double r2 = r2 * r0
            double r2 = r2 + r4
            double r0 = (double) r6
            goto L_0x00d5
        L_0x00eb:
            java.util.Map r0 = r7.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00fd
            java.util.List r0 = X.AnonymousClass7IZ.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00fd
            goto L_0x005e
        L_0x00fd:
            X.770 r0 = X.AnonymousClass7IZ.A00()
            X.6lR r0 = r0.A06
            X.56r r1 = r0.A04
            X.770 r0 = X.AnonymousClass7IZ.A00()
            X.6lR r0 = r0.A06
            X.56r r0 = r0.A04
            java.lang.Object r0 = r0.A08()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x011f
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x011f:
            r1.A0H(r5)
            X.7IQ r1 = X.AnonymousClass7IZ.A01()
            int r0 = r3.getMeasuredWidth()
            r1.A01 = r0
            X.7IQ r1 = X.AnonymousClass7IZ.A01()
            int r0 = r3.getMeasuredHeight()
            r1.A00 = r0
            r0 = 0
            r4.A03(r3, r0)
            goto L_0x005e
        L_0x013c:
            r0 = r5
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134957ye.run():void");
    }
}
