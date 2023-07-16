package X;

import android.view.View;

/* renamed from: X.03L  reason: invalid class name */
public final class AnonymousClass03L implements View.OnApplyWindowInsetsListener {
    public AnonymousClass03Y A00;
    public final AnonymousClass03I A01;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View r22, android.view.WindowInsets r23) {
        /*
            r21 = this;
            r3 = r22
            r2 = r23
            boolean r0 = r3.isLaidOut()
            X.03Y r18 = X.AnonymousClass03Y.A01(r3, r2)
            r4 = r21
            if (r0 == 0) goto L_0x001c
            X.03Y r0 = r4.A00
            if (r0 != 0) goto L_0x002e
            X.03Y r0 = X.C006102s.A00(r3)
            r4.A00 = r0
            if (r0 != 0) goto L_0x002e
        L_0x001c:
            r0 = r18
            r4.A00 = r0
        L_0x0020:
            r0 = 2131307888(0x7f092d70, float:1.8234016E38)
            java.lang.Object r0 = r3.getTag(r0)
            if (r0 != 0) goto L_0x002d
            android.view.WindowInsets r2 = r3.onApplyWindowInsets(r2)
        L_0x002d:
            return r2
        L_0x002e:
            X.03I r0 = X.C005702o.A00(r3)
            if (r0 == 0) goto L_0x003d
            android.view.WindowInsets r0 = r0.A00
            boolean r0 = X.C002401c.A00(r0, r2)
            if (r0 == 0) goto L_0x003d
            goto L_0x0020
        L_0x003d:
            X.03Y r7 = r4.A00
            r6 = 1
            r5 = 0
        L_0x0041:
            r0 = r18
            X.03V r8 = r0.A00
            X.01T r1 = r8.A05(r6)
            X.03V r0 = r7.A00
            X.01T r0 = r0.A05(r6)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0056
            r5 = r5 | r6
        L_0x0056:
            int r6 = r6 << 1
            r0 = 256(0x100, float:3.59E-43)
            if (r6 <= r0) goto L_0x0041
            if (r5 == 0) goto L_0x0020
            X.03Y r0 = r4.A00
            r20 = r0
            r0 = r5 & 8
            if (r0 == 0) goto L_0x0122
            r6 = 8
            X.01T r0 = r8.A05(r6)
            int r1 = r0.A00
            r0 = r20
            X.03V r0 = r0.A00
            X.01T r0 = r0.A05(r6)
            int r0 = r0.A00
            if (r1 <= r0) goto L_0x011e
            android.view.animation.Interpolator r7 = X.C005702o.A02
        L_0x007c:
            r0 = 160(0xa0, double:7.9E-322)
            X.03O r6 = new X.03O
            r6.<init>(r5, r7, r0)
            r1 = 0
            X.03N r0 = r6.A00
            r0.A08(r1)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r0)
            X.03N r0 = r6.A00
            long r0 = r0.A07()
            android.animation.ValueAnimator r17 = r7.setDuration(r0)
            X.01T r8 = r8.A05(r5)
            r0 = r20
            X.03V r0 = r0.A00
            X.01T r7 = r0.A05(r5)
            int r0 = r8.A01
            r19 = r0
            int r13 = r7.A01
            int r15 = java.lang.Math.min(r0, r13)
            int r14 = r8.A03
            int r12 = r7.A03
            int r16 = java.lang.Math.min(r14, r12)
            int r11 = r8.A02
            int r10 = r7.A02
            int r1 = java.lang.Math.min(r11, r10)
            int r9 = r8.A00
            int r8 = r7.A00
            int r0 = java.lang.Math.min(r9, r8)
            r7 = r16
            X.01T r15 = X.AnonymousClass01T.A00(r15, r7, r1, r0)
            r0 = r19
            int r13 = java.lang.Math.max(r0, r13)
            int r7 = java.lang.Math.max(r14, r12)
            int r1 = java.lang.Math.max(r11, r10)
            int r0 = java.lang.Math.max(r9, r8)
            X.01T r1 = X.AnonymousClass01T.A00(r13, r7, r1, r0)
            X.03H r7 = new X.03H
            r7.<init>(r15, r1)
            r0 = 0
            X.C005702o.A01(r3, r2, r6, r0)
            X.03J r8 = new X.03J
            r13 = r20
            r14 = r5
            r9 = r3
            r10 = r4
            r11 = r6
            r12 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = r17
            r0.addUpdateListener(r8)
            r0 = 1
            com.facebook.redex.IDxLAdapterShape0S0300000_I2 r1 = new com.facebook.redex.IDxLAdapterShape0S0300000_I2
            r1.<init>(r0, r3, r4, r6)
            r0 = r17
            r0.addListener(r1)
            X.03K r0 = new X.03K
            r8 = r0
            r9 = r17
            r10 = r3
            r11 = r7
            r12 = r4
            r13 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            X.C004702d.A00(r3, r0)
            goto L_0x001c
        L_0x011e:
            android.view.animation.Interpolator r7 = X.C005702o.A01
            goto L_0x007c
        L_0x0122:
            android.view.animation.Interpolator r7 = X.C005702o.A00
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03L.onApplyWindowInsets(android.view.View, android.view.WindowInsets):android.view.WindowInsets");
    }

    public AnonymousClass03L(View view, AnonymousClass03I r4) {
        AnonymousClass03Y r0;
        this.A01 = r4;
        AnonymousClass03Y A002 = C006102s.A00(view);
        if (A002 != null) {
            r0 = new AnonymousClass03T(A002).A00.A00();
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }
}
