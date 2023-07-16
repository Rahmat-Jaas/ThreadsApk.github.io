package com.facebook.redex;

import X.AnonymousClass5xK;
import X.C33659Hs6;
import java.util.Date;

public class IDxSListenerShape786S0100000_1_I2 implements C33659Hs6 {
    public Object A00;
    public final int A01;

    public IDxSListenerShape786S0100000_1_I2(AnonymousClass5xK r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
        if (r7.after(r1) != false) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BuV(java.util.Date r7) {
        /*
            r6 = this;
            int r1 = r6.A01
            java.lang.Object r4 = r6.A00
            X.5xK r4 = (X.AnonymousClass5xK) r4
            X.0Oa r0 = r4.A03
            java.lang.Object r2 = r0.getValue()
            X.10I r2 = (X.AnonymousClass10I) r2
            if (r1 == 0) goto L_0x005e
            X.4wG r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1) r0
            r5 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.Object r3 = r0.A01
            java.util.Date r3 = (java.util.Date) r3
            if (r3 == 0) goto L_0x0051
            if (r7 != 0) goto L_0x0038
            X.4wE r2 = r2.A03
        L_0x0025:
            java.lang.Object r1 = r2.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1
            r0.<init>((java.util.Date) r3, (java.util.Date) r5)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x0025
        L_0x0034:
            r4.onBackPressed()
            return
        L_0x0038:
            boolean r0 = r3.before(r7)
            if (r0 != 0) goto L_0x003f
            r7 = r5
        L_0x003f:
            X.4wE r2 = r2.A03
        L_0x0041:
            java.lang.Object r1 = r2.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1
            r0.<init>((java.util.Date) r3, (java.util.Date) r7)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x0041
            goto L_0x0034
        L_0x0051:
            X.4wE r1 = r2.A03
        L_0x0053:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.ADi(r0, r5)
            if (r0 == 0) goto L_0x0053
            goto L_0x0034
        L_0x005e:
            r3 = 0
            if (r7 != 0) goto L_0x006e
            X.4wE r1 = r2.A03
        L_0x0063:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.ADi(r0, r3)
            if (r0 == 0) goto L_0x0063
            goto L_0x0034
        L_0x006e:
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r5.setTime(r0)
            r1 = 12
            r0 = 60
            r5.add(r1, r0)
            int r0 = r5.get(r1)
            int r0 = r0 % 5
            if (r0 == 0) goto L_0x008e
            int r0 = 5 - r0
            r5.add(r1, r0)
        L_0x008e:
            java.util.Date r1 = r5.getTime()
            X.C04220Ms.A06(r1)
            boolean r0 = r7.after(r1)
            if (r0 != 0) goto L_0x009c
            r7 = r1
        L_0x009c:
            X.4wG r0 = r2.A06
            java.lang.Object r0 = r0.getValue()
            X.17S r0 = (X.AnonymousClass17S) r0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r0 = r0.A01
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r1 = r0.A00
            java.util.Date r1 = (java.util.Date) r1
            if (r1 == 0) goto L_0x00c8
            boolean r0 = r7.after(r1)
            if (r0 == 0) goto L_0x00c8
        L_0x00b4:
            X.4wE r2 = r2.A03
        L_0x00b6:
            java.lang.Object r1 = r2.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1
            r0.<init>((java.util.Date) r7, (java.util.Date) r3)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x00b6
            goto L_0x0034
        L_0x00c7:
            r1 = r3
        L_0x00c8:
            r3 = r1
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxSListenerShape786S0100000_1_I2.BuV(java.util.Date):void");
    }

    public final void BtA(Date date) {
    }
}
