package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;

public class KtCSuperShape0S1001000_I2 extends AnonymousClass0Sf {
    public int A00;
    public String A01;
    public final int A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S1001000_I2() {
        this((String) null, -1, 8);
        this.A02 = 8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (X.C04220Ms.A0I(r2.A01, r3.A01) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        if ((r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0052, code lost:
        if (r3.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005c, code lost:
        if (X.C04220Ms.A0I(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        if (r2.A00 == r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if ((r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r3.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x0047;
                case 1: goto L_0x0065;
                case 2: goto L_0x0043;
                case 3: goto L_0x003f;
                case 4: goto L_0x003b;
                case 5: goto L_0x0037;
                case 6: goto L_0x0033;
                case 7: goto L_0x002f;
                case 8: goto L_0x002a;
                case 9: goto L_0x0025;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x0068
            r1 = 10
        L_0x0009:
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2
            if (r0 == 0) goto L_0x0023
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2) r3
            int r0 = r3.A02
            if (r0 != r1) goto L_0x0023
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0023
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0068
        L_0x0023:
            r0 = 0
            return r0
        L_0x0025:
            if (r2 == r3) goto L_0x0068
            r1 = 9
            goto L_0x004a
        L_0x002a:
            if (r2 == r3) goto L_0x0068
            r1 = 8
            goto L_0x004a
        L_0x002f:
            if (r2 == r3) goto L_0x0068
            r1 = 7
            goto L_0x004a
        L_0x0033:
            if (r2 == r3) goto L_0x0068
            r1 = 6
            goto L_0x0009
        L_0x0037:
            if (r2 == r3) goto L_0x0068
            r1 = 5
            goto L_0x0009
        L_0x003b:
            if (r2 == r3) goto L_0x0068
            r1 = 4
            goto L_0x0009
        L_0x003f:
            if (r2 == r3) goto L_0x0068
            r1 = 3
            goto L_0x0009
        L_0x0043:
            if (r2 == r3) goto L_0x0068
            r1 = 2
            goto L_0x004a
        L_0x0047:
            if (r2 == r3) goto L_0x0068
            r1 = 0
        L_0x004a:
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2
            if (r0 == 0) goto L_0x0023
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2) r3
            int r0 = r3.A02
            if (r0 != r1) goto L_0x0023
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0023
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0068
            goto L_0x0023
        L_0x0065:
            r1 = 1
            if (r2 != r3) goto L_0x0009
        L_0x0068:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r1 = r0 * 31;
        r0 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0005;
                case 2: goto L_0x001b;
                case 3: goto L_0x0022;
                case 4: goto L_0x0022;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0011;
                case 8: goto L_0x0011;
                case 9: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = r2.A00
            int r1 = r0 * 31
            java.lang.String r0 = r2.A01
        L_0x000b:
            int r0 = r0.hashCode()
        L_0x000f:
            int r1 = r1 + r0
            return r1
        L_0x0011:
            java.lang.String r0 = r2.A01
            if (r0 != 0) goto L_0x001d
            r0 = 0
        L_0x0016:
            int r1 = r0 * 31
            int r0 = r2.A00
            goto L_0x000f
        L_0x001b:
            java.lang.String r0 = r2.A01
        L_0x001d:
            int r0 = r0.hashCode()
            goto L_0x0016
        L_0x0022:
            int r0 = r2.A00
            int r1 = r0 * 31
            java.lang.String r0 = r2.A01
            if (r0 != 0) goto L_0x000b
            r0 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2.hashCode():int");
    }

    public final String toString() {
        if (9 - this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("SegmentFrame(segmentId=");
        A0s.append(this.A01);
        A0s.append(", frameMs=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public KtCSuperShape0S1001000_I2(int i, String str, int i2) {
        this.A02 = i2;
        switch (i2) {
            case 1:
            case 6:
            case 10:
                C04220Ms.A0B(str, 2);
                break;
        }
        this.A00 = i;
        this.A01 = str;
    }

    public KtCSuperShape0S1001000_I2(String str, int i, int i2) {
        this.A02 = i2;
        switch (i2) {
            case 2:
            case 9:
                C04220Ms.A0B(str, 1);
                break;
        }
        this.A01 = str;
        this.A00 = i;
    }
}
