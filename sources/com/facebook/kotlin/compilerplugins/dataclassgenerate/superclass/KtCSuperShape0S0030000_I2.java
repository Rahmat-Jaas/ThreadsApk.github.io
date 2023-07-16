package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;

public class KtCSuperShape0S0030000_I2 extends AnonymousClass0Sf {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r0.A01 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r0.A02 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KtCSuperShape0S0030000_I2(int r1, boolean r2, boolean r3, boolean r4) {
        /*
            r0 = this;
            r0.A03 = r1
            switch(r1) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0017;
                case 2: goto L_0x001f;
                case 3: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0.<init>()
            r0.A02 = r2
            r0.A00 = r3
        L_0x000c:
            r0.A01 = r4
            return
        L_0x000f:
            r0.<init>()
            r0.A00 = r2
            r0.A02 = r3
            goto L_0x000c
        L_0x0017:
            r0.<init>()
            r0.A01 = r2
            r0.A00 = r3
            goto L_0x0026
        L_0x001f:
            r0.<init>()
            r0.A00 = r2
            r0.A01 = r3
        L_0x0026:
            r0.A02 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2.<init>(int, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r1 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r1 == r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        if (r1 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0065, code lost:
        if ((r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0067, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        if (r3.A03 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0071, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0073, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x0060;
                case 1: goto L_0x0042;
                case 2: goto L_0x002a;
                case 3: goto L_0x0026;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x0078
            r1 = 4
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2
            if (r0 == 0) goto L_0x0024
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x0024
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x0024
            boolean r1 = r2.A00
            boolean r0 = r3.A00
        L_0x001c:
            if (r1 != r0) goto L_0x0024
            boolean r1 = r2.A01
            boolean r0 = r3.A01
        L_0x0022:
            if (r1 == r0) goto L_0x0078
        L_0x0024:
            r0 = 0
            return r0
        L_0x0026:
            if (r2 == r3) goto L_0x0078
            r1 = 3
            goto L_0x0063
        L_0x002a:
            if (r2 == r3) goto L_0x0078
            r1 = 2
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2
            if (r0 == 0) goto L_0x0024
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x0024
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            if (r1 != r0) goto L_0x0024
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            goto L_0x0059
        L_0x0042:
            if (r2 == r3) goto L_0x0078
            r1 = 1
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2
            if (r0 == 0) goto L_0x0024
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x0024
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x0024
            boolean r1 = r2.A00
            boolean r0 = r3.A00
        L_0x0059:
            if (r1 != r0) goto L_0x0024
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            goto L_0x0022
        L_0x0060:
            if (r2 == r3) goto L_0x0078
            r1 = 0
        L_0x0063:
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2
            if (r0 == 0) goto L_0x0024
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x0024
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            if (r1 != r0) goto L_0x0024
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            goto L_0x001c
        L_0x0078:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return r1 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        if (r0 == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        r1 = (r1 + (r0 ? 1 : 0)) * 31;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r1 = (r1 + (r0 ? 1 : 0)) * 31;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0 != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 1: goto L_0x0032;
                case 2: goto L_0x0027;
                case 3: goto L_0x0005;
                case 4: goto L_0x001c;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x000b
            r0 = 1
        L_0x000b:
            int r1 = r0 * 31
            boolean r0 = r3.A02
        L_0x000f:
            if (r0 == 0) goto L_0x0012
            r0 = 1
        L_0x0012:
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A01
        L_0x0017:
            if (r0 != 0) goto L_0x001a
            r2 = 0
        L_0x001a:
            int r1 = r1 + r2
            return r1
        L_0x001c:
            boolean r0 = r3.A02
            r2 = 1
            if (r0 == 0) goto L_0x0022
            r0 = 1
        L_0x0022:
            int r1 = r0 * 31
            boolean r0 = r3.A00
            goto L_0x000f
        L_0x0027:
            boolean r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x002d
            r0 = 1
        L_0x002d:
            int r1 = r0 * 31
            boolean r0 = r3.A01
            goto L_0x003c
        L_0x0032:
            boolean r0 = r3.A01
            r2 = 1
            if (r0 == 0) goto L_0x0038
            r0 = 1
        L_0x0038:
            int r1 = r0 * 31
            boolean r0 = r3.A00
        L_0x003c:
            if (r0 == 0) goto L_0x003f
            r0 = 1
        L_0x003f:
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A02
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2.hashCode():int");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KtCSuperShape0S0030000_I2(int r2, int r3, boolean r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.A03 = r3
            r0 = r2 & 1
            switch(r3) {
                case 0: goto L_0x0019;
                case 1: goto L_0x0028;
                default: goto L_0x0007;
            }
        L_0x0007:
            if (r0 == 0) goto L_0x000a
            r4 = 0
        L_0x000a:
            r0 = r2 & 2
            if (r0 == 0) goto L_0x000f
            r5 = 0
        L_0x000f:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x0014
            r6 = 0
        L_0x0014:
            r0 = 2
        L_0x0015:
            r1.<init>(r0, r4, r5, r6)
            return
        L_0x0019:
            if (r0 == 0) goto L_0x001c
            r4 = 0
        L_0x001c:
            r0 = r2 & 2
            if (r0 == 0) goto L_0x0021
            r5 = 0
        L_0x0021:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x0026
            r6 = 0
        L_0x0026:
            r0 = 0
            goto L_0x0015
        L_0x0028:
            if (r0 == 0) goto L_0x002b
            r4 = 0
        L_0x002b:
            r0 = r2 & 2
            if (r0 == 0) goto L_0x0030
            r5 = 0
        L_0x0030:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x0035
            r6 = 0
        L_0x0035:
            r0 = 1
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2.<init>(int, int, boolean, boolean, boolean):void");
    }
}
