package com.facebook.flexlayout.styles;

import X.AnonymousClass76L;
import X.C18250wR;

public class FlexItemCallback {
    public final AnonymousClass76L mMeasureFunction;

    public final float baseline(float f, float f2) {
        throw C18250wR.A0V("Baseline function isn't defined!");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
        if (java.lang.Float.isNaN(r8) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        if (java.lang.Float.isNaN(r8) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r8.A03 == 13320) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.flexlayout.layoutoutput.MeasureOutput measure(float r17, float r18, float r19, float r20, float r21, float r22) {
        /*
            r16 = this;
            r6 = r17
            r5 = r18
            r4 = r19
            r3 = r20
            r0 = r16
            X.76L r2 = r0.mMeasureFunction
            if (r2 == 0) goto L_0x012f
            X.8gn r1 = r2.A01
            boolean r0 = r1 instanceof X.C127397h3
            if (r0 == 0) goto L_0x012c
            r8 = r1
            X.7h3 r8 = (X.C127397h3) r8
            int r7 = r8.A03
            r0 = 13320(0x3408, float:1.8665E-41)
            if (r7 != r0) goto L_0x012c
        L_0x001d:
            r15 = 1
            r14 = 0
            boolean r0 = X.AnonymousClass0wJ.A1W(r8)
            X.7h3 r8 = X.AnonymousClass7KN.A02(r1)
            r7 = 0
            if (r0 != 0) goto L_0x0074
            if (r8 == 0) goto L_0x0074
            r0 = 61
            float r13 = X.AnonymousClass7KN.A01(r8, r0)
            r0 = 57
            float r12 = X.AnonymousClass7KN.A01(r8, r0)
            r0 = 58
            float r11 = X.AnonymousClass7KN.A01(r8, r0)
            r0 = 55
            float r10 = X.AnonymousClass7KN.A01(r8, r0)
            r0 = 59
            float r9 = X.AnonymousClass7KN.A01(r8, r0)
            r0 = 56
            float r8 = X.AnonymousClass7KN.A01(r8, r0)
            boolean r0 = java.lang.Float.isNaN(r13)
            if (r0 == 0) goto L_0x0117
            boolean r0 = java.lang.Float.isNaN(r12)
            if (r0 == 0) goto L_0x0117
            boolean r0 = java.lang.Float.isNaN(r11)
            if (r0 == 0) goto L_0x0117
            boolean r0 = java.lang.Float.isNaN(r10)
            if (r0 == 0) goto L_0x0117
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 == 0) goto L_0x0117
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 == 0) goto L_0x0117
        L_0x0074:
            r9 = 2143289344(0x7fc00000, float:NaN)
            if (r7 != 0) goto L_0x009e
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto L_0x0080
            r5 = r21
        L_0x0080:
            X.6qV r7 = r2.A00
            int r2 = X.AnonymousClass76L.A00(r6, r5)
            int r0 = X.AnonymousClass76L.A00(r4, r3)
            X.MeD r3 = r1.ABY(r7, r2, r0)
            int r0 = r3.getWidth()
            float r2 = (float) r0
            int r0 = r3.getHeight()
        L_0x0097:
            float r1 = (float) r0
            com.facebook.flexlayout.layoutoutput.MeasureOutput r0 = new com.facebook.flexlayout.layoutoutput.MeasureOutput
            r0.<init>(r2, r1, r9, r3)
            return r0
        L_0x009e:
            boolean r10 = r2.A02
            if (r10 != 0) goto L_0x010d
            r0 = 5
            r8 = r7[r0]
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 != 0) goto L_0x010d
        L_0x00ab:
            int r11 = java.lang.Math.round(r8)
            if (r10 == 0) goto L_0x0102
            r0 = 5
            r8 = r7[r0]
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 != 0) goto L_0x0102
        L_0x00ba:
            int r0 = java.lang.Math.round(r8)
            int r11 = r11 + r0
            r8 = r7[r14]
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 == 0) goto L_0x00c8
            r8 = 0
        L_0x00c8:
            int r12 = java.lang.Math.round(r8)
            r0 = 3
            r8 = r7[r0]
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 == 0) goto L_0x00d6
            r8 = 0
        L_0x00d6:
            int r0 = java.lang.Math.round(r8)
            int r12 = r12 + r0
            X.6qV r8 = r2.A00
            float r0 = (float) r11
            float r6 = r17 - r0
            float r5 = r18 - r0
            int r2 = X.AnonymousClass76L.A00(r6, r5)
            float r0 = (float) r12
            float r4 = r19 - r0
            float r3 = r20 - r0
            int r0 = X.AnonymousClass76L.A00(r4, r3)
            X.MeD r0 = r1.ABY(r8, r2, r0)
            X.MGt r3 = new X.MGt
            r3.<init>(r0, r7, r10)
            int r0 = r3.getWidth()
            float r2 = (float) r0
            int r0 = r3.getHeight()
            goto L_0x0097
        L_0x0102:
            r0 = 2
            r8 = r7[r0]
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 == 0) goto L_0x00ba
            r8 = 0
            goto L_0x00ba
        L_0x010d:
            r8 = r7[r15]
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 == 0) goto L_0x00ab
            r8 = 0
            goto L_0x00ab
        L_0x0117:
            r0 = 6
            float[] r7 = new float[r0]
            r7[r14] = r13
            r7[r15] = r12
            r0 = 2
            r7[r0] = r11
            r0 = 3
            r7[r0] = r10
            r0 = 4
            r7[r0] = r9
            r0 = 5
            r7[r0] = r8
            goto L_0x0074
        L_0x012c:
            r8 = 0
            goto L_0x001d
        L_0x012f:
            r0 = 426(0x1aa, float:5.97E-43)
            java.lang.String r0 = X.I17.A00(r0)
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.flexlayout.styles.FlexItemCallback.measure(float, float, float, float, float, float):com.facebook.flexlayout.layoutoutput.MeasureOutput");
    }

    public FlexItemCallback(AnonymousClass76L r1) {
        this.mMeasureFunction = r1;
    }
}
