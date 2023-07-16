package com.facebook.redex;

import X.C82034oy;

public class IDxBDelegateShape506S0100000_1_I2 implements C82034oy {
    public Object A00;
    public final int A01;

    public IDxBDelegateShape506S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x011a, code lost:
        X.AnonymousClass4u2.A01(r1, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x011d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
        X.AnonymousClass4u2.A06(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.AnonymousClass4u2 r23) {
        /*
            r22 = this;
            r2 = r22
            int r1 = r2.A01
            r0 = r23
            switch(r1) {
                case 0: goto L_0x012d;
                case 1: goto L_0x014d;
                case 2: goto L_0x0052;
                case 3: goto L_0x017a;
                case 4: goto L_0x0027;
                case 5: goto L_0x0061;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 1
            r0.CtT(r1)
            r1 = 2131826643(0x7f1117d3, float:1.9286176E38)
            r0.Cqb(r1)
            java.lang.Object r1 = r2.A00
            X.CUB r1 = (X.CUB) r1
            X.0Oa r1 = r1.A07
            java.lang.Object r1 = r1.getValue()
            boolean r1 = X.AnonymousClass0wJ.A1X(r1)
            if (r1 == 0) goto L_0x0026
        L_0x0023:
            X.AnonymousClass4u2.A06(r0)
        L_0x0026:
            return
        L_0x0027:
            java.lang.Object r3 = r2.A00
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r3)
            r1 = 2131822310(0x7f1106e6, float:1.9277388E38)
            java.lang.String r1 = r2.getString(r1)
            X.AnonymousClass4u2.A08(r0, r1)
            X.Drc r4 = X.C18240wQ.A0K()
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r3)
            r1 = 2131822303(0x7f1106df, float:1.9277374E38)
            java.lang.String r1 = r2.getString(r1)
            r4.A0F = r1
            r1 = 231(0xe7, float:3.24E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r1 = X.C18210wN.A0H(r3, r1)
            goto L_0x011a
        L_0x0052:
            java.lang.Object r1 = r2.A00
            X.9OE r1 = (X.AnonymousClass9OE) r1
            androidx.fragment.app.Fragment r1 = r1.A02
            r1.getClass()
            X.4oy r1 = (X.C82034oy) r1
            r1.configureActionBar(r0)
            goto L_0x0023
        L_0x0061:
            java.lang.Object r5 = r2.A00
            X.1dM r5 = (X.AnonymousClass1dM) r5
            java.util.Set r6 = r5.A0H
            int r4 = r6.size()
            r3 = 0
            if (r4 != 0) goto L_0x0072
            r0.CtO(r3)
            return
        L_0x0072:
            android.content.res.Resources r7 = X.AnonymousClass0wJ.A0B(r5)
            r1 = 2131689801(0x7f0f0149, float:1.9008628E38)
            r2 = 1
            java.lang.String r1 = X.AnonymousClass0wJ.A0m(r7, r4, r1)
            r0.setTitle(r1)
            r0.CtO(r2)
            java.lang.Integer r13 = X.AnonymousClass006.A0C
            r8 = 0
            android.content.Context r7 = r5.requireContext()
            r1 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r1 = r7.getColor(r1)
            android.graphics.drawable.ColorDrawable r10 = new android.graphics.drawable.ColorDrawable
            r10.<init>(r1)
            android.content.Context r7 = r5.requireContext()
            r1 = 2131099740(0x7f06005c, float:1.7811842E38)
            int r14 = r7.getColor(r1)
            android.content.Context r7 = r5.requireContext()
            r1 = 2131100070(0x7f0601a6, float:1.7812511E38)
            int r16 = r7.getColor(r1)
            r1 = 335(0x14f, float:4.7E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r12 = X.C18210wN.A0H(r5, r1)
            android.content.Context r7 = r5.requireContext()
            r1 = 2131099740(0x7f06005c, float:1.7811842E38)
            android.graphics.ColorFilter r9 = X.C63393hP.A01(r7, r1)
            r15 = -2
            r18 = 2131233204(0x7f0809b4, float:1.8082539E38)
            X.DYo r7 = new X.DYo
            r11 = r8
            r17 = r15
            r19 = r15
            r20 = r15
            r21 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.Cro(r7)
            r0.CtT(r2)
            java.util.Set r3 = r5.A0G
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00f2
            X.Drc r8 = X.C18240wQ.A0K()
            java.lang.Integer r3 = X.AnonymousClass006.A0u
            r8.A05(r3)
            r8.A02 = r1
            r7 = 7
            com.facebook.redex.IDxCListenerShape6S0101000_1_I2 r3 = new com.facebook.redex.IDxCListenerShape6S0101000_1_I2
            r3.<init>(r5, r4, r7)
            X.AnonymousClass4u2.A01(r3, r8, r0)
        L_0x00f2:
            if (r4 != r2) goto L_0x0026
            boolean r2 = r5.A0A
            if (r2 != 0) goto L_0x0026
            java.lang.Object r3 = X.AnonymousClass00J.A07(r6)
            X.3Vc r3 = (X.C61723Vc) r3
            boolean r2 = r3.A02()
            X.Drc r4 = X.C18240wQ.A0K()
            if (r2 == 0) goto L_0x011e
            r2 = 2131232587(0x7f08074b, float:1.8081287E38)
            r4.A05 = r2
            r2 = 2131837246(0x7f11413e, float:1.9307682E38)
            r4.A04 = r2
            r4.A02 = r1
            r1 = 223(0xdf, float:3.12E-43)
        L_0x0116:
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r1 = X.C18200wM.A0R(r5, r3, r1)
        L_0x011a:
            X.AnonymousClass4u2.A01(r1, r4, r0)
            return
        L_0x011e:
            r2 = 2131232582(0x7f080746, float:1.8081277E38)
            r4.A05 = r2
            r2 = 2131828315(0x7f111e5b, float:1.9289567E38)
            r4.A04 = r2
            r4.A02 = r1
            r1 = 224(0xe0, float:3.14E-43)
            goto L_0x0116
        L_0x012d:
            java.lang.Object r4 = r2.A00
            r1 = 311(0x137, float:4.36E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r2 = X.C18190wL.A0H(r4, r1)
            r1 = 1
            r0.CtU(r2, r1)
            r1 = 2131821074(0x7f110212, float:1.927488E38)
            r0.Cqb(r1)
            r3 = 2131232399(0x7f08068f, float:1.8080906E38)
            r2 = 308(0x134, float:4.32E-43)
            com.facebook.redex.IDxCListenerShape205S0100000_4_I2 r1 = new com.facebook.redex.IDxCListenerShape205S0100000_4_I2
            r1.<init>((java.lang.Object) r4, (int) r2)
            r0.Crj(r1, r3)
            return
        L_0x014d:
            r1 = 2131832770(0x7f112fc2, float:1.9298603E38)
            r0.Cqb(r1)
            r15 = 1
            r0.CtT(r15)
            java.lang.Integer r7 = X.AnonymousClass006.A00
            r3 = 0
            java.lang.Object r1 = r2.A00
            android.content.Context r2 = X.C18220wO.A0A(r1)
            r1 = 2131099961(0x7f060139, float:1.781229E38)
            android.graphics.ColorFilter r2 = X.C63393hP.A01(r2, r1)
            r8 = -2
            X.DYo r1 = new X.DYo
            r4 = r3
            r5 = r3
            r6 = r3
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.Cro(r1)
            return
        L_0x017a:
            java.lang.Object r1 = r2.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r1)
            r1 = 2131822296(0x7f1106d8, float:1.927736E38)
            java.lang.String r1 = r2.getString(r1)
            X.AnonymousClass4u2.A08(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxBDelegateShape506S0100000_1_I2.configureActionBar(X.4u2):void");
    }
}
