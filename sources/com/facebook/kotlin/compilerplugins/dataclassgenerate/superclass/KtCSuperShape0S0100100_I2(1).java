package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C18190wL;

public class KtCSuperShape0S0100100_I2 extends AnonymousClass0Sf {
    public long A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S0100100_I2() {
        this(0, (Object) null, 5);
        this.A02 = 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r5.A00 == r6.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        if ((r6 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        if (r6.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        if (r5.A00 != r6.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        if (X.C04220Ms.A0I(r5.A01, r6.A01) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if ((r6 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r6.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (X.C04220Ms.A0I(r5.A01, r6.A01) == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0032;
                case 2: goto L_0x002e;
                case 3: goto L_0x002a;
                case 4: goto L_0x0026;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r5 == r6) goto L_0x0056
            r1 = 5
        L_0x0008:
            boolean r0 = r6 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2
            if (r0 == 0) goto L_0x0024
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2) r6
            int r0 = r6.A02
            if (r0 != r1) goto L_0x0024
            java.lang.Object r1 = r5.A01
            java.lang.Object r0 = r6.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0024
            long r3 = r5.A00
            long r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
        L_0x0024:
            r0 = 0
            return r0
        L_0x0026:
            if (r5 == r6) goto L_0x0056
            r1 = 4
            goto L_0x0008
        L_0x002a:
            if (r5 == r6) goto L_0x0056
            r1 = 3
            goto L_0x0035
        L_0x002e:
            if (r5 == r6) goto L_0x0056
            r1 = 2
            goto L_0x0035
        L_0x0032:
            if (r5 == r6) goto L_0x0056
            r1 = 1
        L_0x0035:
            boolean r0 = r6 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2
            if (r0 == 0) goto L_0x0024
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2) r6
            int r0 = r6.A02
            if (r0 != r1) goto L_0x0024
            long r3 = r5.A00
            long r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
            java.lang.Object r1 = r5.A01
            java.lang.Object r0 = r6.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x0024
        L_0x0052:
            if (r5 == r6) goto L_0x0056
            r1 = 0
            goto L_0x0008
        L_0x0056:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 1: goto L_0x0019;
                case 2: goto L_0x0019;
                case 3: goto L_0x0027;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L_0x0014
            r0 = 0
        L_0x000a:
            int r2 = r0 * 31
            long r0 = r3.A00
            int r0 = X.C18190wL.A02(r0)
        L_0x0012:
            int r2 = r2 + r0
            return r2
        L_0x0014:
            int r0 = r0.hashCode()
            goto L_0x000a
        L_0x0019:
            long r0 = r3.A00
            int r0 = X.C18190wL.A02(r0)
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L_0x0031
            r0 = 0
            goto L_0x0012
        L_0x0027:
            long r0 = r3.A00
            int r0 = X.C18190wL.A02(r0)
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A01
        L_0x0031:
            int r0 = r0.hashCode()
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A02) {
            case 2:
                sb = C18190wL.A0s("GridItemAnimationOption(duration=");
                sb.append(this.A00);
                str = ", interpolator=";
                break;
            case 3:
                sb = C18190wL.A0s("ScreenshotEffectBurnerParam(timestampUs=");
                sb.append(this.A00);
                str = ", image=";
                break;
            default:
                return super.toString();
        }
        sb.append(str);
        sb.append(this.A01);
        return AnonymousClass0wJ.A0u(sb);
    }

    public KtCSuperShape0S0100100_I2(long j, Object obj, int i) {
        this.A02 = i;
        this.A00 = j;
        this.A01 = obj;
    }
}
