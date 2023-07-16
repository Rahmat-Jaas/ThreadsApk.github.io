package com.facebook.redex;

import X.C82404pZ;

public class IDxConsumerShape142S0200000_2_I2 implements C82404pZ {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxConsumerShape142S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [X.8n9, X.Ew2, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018f, code lost:
        X.C25237DiI.A00(r7, r7, new kotlin.coroutines.jvm.internal.KtSLambdaShape13S0101000_I2_10(r0, r7, r1), r3, 3);
        r2 = r0.A0F;
        r4 = r0.A02;
        r3 = r0.A01;
        r5 = X.AnonymousClass006.A0u;
        r6 = X.I6I.A00(r0);
        r9 = r0.A04;
        r1 = (X.IM8) r14.A00;
        X.KK5.A03(r2, r3, r4, r5, r6, r7, r7, r9, r7, r1.A0N, r7, 480);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01bb, code lost:
        r0 = (X.I6I) r14.A01;
        X.I6I.A02(r0);
        r2 = r0.A0F;
        r4 = r0.A02;
        r3 = r0.A01;
        r5 = X.AnonymousClass006.A0j;
        r6 = X.I6I.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0237, code lost:
        r1.A0l = false;
        r0.A0D.A0G(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x023f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0251, code lost:
        r9 = r0.A04;
        r7 = X.AnonymousClass006.A06;
        r1 = (X.IM8) r14.A00;
        X.KK5.A03(r2, r3, r4, r5, r6, r7, (java.lang.Integer) null, r9, (java.lang.String) null, r1.A0N, (java.util.Map) null, ch.boye.httpclientandroidlib.HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A02
            X.EUq r15 = (X.C26743EUq) r15
            switch(r0) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x0102;
                case 2: goto L_0x014b;
                case 3: goto L_0x01d0;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r0 = r15.A06()
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = X.AnonymousClass5z0.A00(r15)
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = X.AnonymousClass5z0.A00(r15)
            if (r0 == 0) goto L_0x0063
            X.8qf r0 = (X.C148218qf) r0
            com.google.common.collect.ImmutableList r0 = r0.B0I()
            X.C04220Ms.A06(r0)
            java.lang.Object r8 = r14.A01
            java.util.Iterator r7 = r0.iterator()
            r4 = 0
            r3 = r4
        L_0x002a:
            boolean r0 = r7.hasNext()
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0068
            java.lang.Object r2 = r7.next()
            X.8r3 r2 = (X.C148438r3) r2
            com.google.common.collect.ImmutableList r0 = r2.B0K()
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002a
            com.google.common.collect.ImmutableList r0 = r2.B0K()
            X.C04220Ms.A06(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x004f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r1.next()
            X.8qd r0 = (X.C148198qd) r0
            X.Ito r0 = r0.BEq()
            if (r0 != r8) goto L_0x004f
            r3 = r2
            goto L_0x004f
        L_0x0063:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0068:
            if (r3 != 0) goto L_0x0076
            java.lang.Object r1 = r14.A00
            X.0YM r1 = (X.AnonymousClass0YM) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.invoke(r0, r0, r4)
        L_0x0075:
            return
        L_0x0076:
            com.google.common.collect.ImmutableList r0 = r3.B0f()
            if (r0 == 0) goto L_0x00a2
            java.util.Iterator r3 = r0.iterator()
        L_0x0080:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r2 = r3.next()
            X.8qe r2 = (X.C148208qe) r2
            X.69L r1 = r2.Agi()
            X.69L r0 = X.AnonymousClass69L.A02
            if (r1 == r0) goto L_0x009c
            X.69L r1 = r2.Agi()
            X.69L r0 = X.AnonymousClass69L.A01
            if (r1 != r0) goto L_0x0080
        L_0x009c:
            X.69L r4 = r2.Agi()
            r5 = 1
            goto L_0x0080
        L_0x00a2:
            java.lang.Object r2 = r14.A00
            X.0YM r2 = (X.AnonymousClass0YM) r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.invoke(r1, r0, r4)
            return
        L_0x00b2:
            r0 = 0
            X.C04220Ms.A0B(r15, r0)
            boolean r0 = r15.A06()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r0 = r15.A03()
            X.44e r0 = (X.C685344e) r0
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r4 = r14.A01
            X.3ak r4 = (X.C62793ak) r4
            X.4qz r3 = X.AnonymousClass3J5.A00(r4)
            r2 = 0
            r0 = 36
            kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7
            r1.<init>((java.lang.Object) r4, (java.lang.Object) r15, (X.C146958n9) r2, (int) r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            return
        L_0x00dd:
            java.lang.Object r0 = r14.A01
            X.I6I r0 = (X.I6I) r0
            X.I6I.A02(r0)
            X.KK5 r1 = r0.A0F
            X.Itt r3 = r0.A02
            X.ItJ r2 = r0.A01
            java.lang.Integer r4 = X.AnonymousClass006.A0j
            java.lang.Integer r5 = X.AnonymousClass006.A0Y
            java.lang.String r8 = r0.A04
            r9 = 0
            java.lang.Integer r6 = X.AnonymousClass006.A1L
            java.lang.Integer r7 = X.AnonymousClass006.A01
            java.lang.Object r0 = r14.A00
            X.IM8 r0 = (X.IM8) r0
            java.lang.String r10 = r0.A0N
            r12 = 288(0x120, float:4.04E-43)
            r11 = r9
            X.KK5.A03(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0102:
            boolean r0 = r15.A06()
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r0 = r15.A03()
            X.44e r0 = (X.C685344e) r0
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r0 = X.AnonymousClass5z0.A00(r15)
            X.8qa r0 = (X.C148168qa) r0
            r7 = 0
            if (r0 == 0) goto L_0x01bb
            X.8qZ r0 = r0.BJe()
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r0 = r14.A01
            X.I6I r0 = (X.I6I) r0
            java.lang.Object r1 = X.AnonymousClass5z0.A00(r15)
            X.8qa r1 = (X.C148168qa) r1
            if (r1 == 0) goto L_0x0146
            X.8qZ r1 = r1.BJe()
            if (r1 == 0) goto L_0x0146
            X.8rI r2 = r1.A9Q()
            X.C04220Ms.A06(r2)
            r1 = 0
            r0.A09(r2, r1)
            X.4qz r3 = X.AnonymousClass3J5.A00(r0)
            r1 = 7
            goto L_0x018f
        L_0x0146:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x014b:
            boolean r0 = r15.A06()
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r0 = r15.A03()
            X.44e r0 = (X.C685344e) r0
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r0 = X.AnonymousClass5z0.A00(r15)
            X.8qa r0 = (X.C148168qa) r0
            r7 = 0
            if (r0 == 0) goto L_0x01bb
            X.8qZ r0 = r0.BJe()
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r0 = r14.A01
            X.I6I r0 = (X.I6I) r0
            java.lang.Object r1 = X.AnonymousClass5z0.A00(r15)
            X.8qa r1 = (X.C148168qa) r1
            if (r1 == 0) goto L_0x01b6
            X.8qZ r1 = r1.BJe()
            if (r1 == 0) goto L_0x01b6
            X.8rI r2 = r1.A9Q()
            X.C04220Ms.A06(r2)
            r1 = 0
            r0.A09(r2, r1)
            X.4qz r3 = X.AnonymousClass3J5.A00(r0)
            r1 = 8
        L_0x018f:
            kotlin.coroutines.jvm.internal.KtSLambdaShape13S0101000_I2_10 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape13S0101000_I2_10
            r2.<init>(r0, r7, r1)
            r1 = 3
            X.C25237DiI.A00(r7, r7, r2, r3, r1)
            X.KK5 r2 = r0.A0F
            X.Itt r4 = r0.A02
            X.ItJ r3 = r0.A01
            java.lang.Integer r5 = X.AnonymousClass006.A0u
            java.lang.Integer r6 = X.I6I.A00(r0)
            java.lang.String r9 = r0.A04
            java.lang.Object r1 = r14.A00
            X.IM8 r1 = (X.IM8) r1
            java.lang.String r11 = r1.A0N
            r13 = 480(0x1e0, float:6.73E-43)
            r8 = r7
            r10 = r7
            r12 = r7
            X.KK5.A03(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0237
        L_0x01b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x01bb:
            java.lang.Object r0 = r14.A01
            X.I6I r0 = (X.I6I) r0
            X.I6I.A02(r0)
            X.KK5 r2 = r0.A0F
            X.Itt r4 = r0.A02
            X.ItJ r3 = r0.A01
            java.lang.Integer r5 = X.AnonymousClass006.A0j
            java.lang.Integer r6 = X.I6I.A00(r0)
            goto L_0x0251
        L_0x01d0:
            boolean r0 = r15.A06()
            if (r0 == 0) goto L_0x0240
            java.lang.Object r0 = r15.A03()
            X.44e r0 = (X.C685344e) r0
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L_0x0240
            java.lang.Object r0 = X.AnonymousClass5z0.A00(r15)
            X.8qa r0 = (X.C148168qa) r0
            r7 = 0
            if (r0 == 0) goto L_0x0240
            X.8qZ r0 = r0.BJe()
            if (r0 == 0) goto L_0x0240
            java.lang.Object r0 = r14.A01
            X.I6I r0 = (X.I6I) r0
            java.lang.Object r1 = X.AnonymousClass5z0.A00(r15)
            X.8qa r1 = (X.C148168qa) r1
            if (r1 == 0) goto L_0x0264
            X.8qZ r1 = r1.BJe()
            if (r1 == 0) goto L_0x0264
            X.8rI r2 = r1.A9Q()
            X.C04220Ms.A06(r2)
            r1 = 0
            r0.A09(r2, r1)
            X.4qz r3 = X.AnonymousClass3J5.A00(r0)
            r1 = 9
            kotlin.coroutines.jvm.internal.KtSLambdaShape13S0101000_I2_10 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape13S0101000_I2_10
            r2.<init>(r0, r7, r1)
            r1 = 3
            X.C25237DiI.A00(r7, r7, r2, r3, r1)
            X.KK5 r2 = r0.A0F
            X.Itt r4 = r0.A02
            X.ItJ r3 = r0.A01
            java.lang.Integer r5 = X.AnonymousClass006.A0u
            java.lang.Integer r6 = X.AnonymousClass006.A01
            java.lang.String r9 = r0.A04
            java.lang.Object r1 = r14.A00
            X.IM8 r1 = (X.IM8) r1
            java.lang.String r11 = r1.A0N
            r13 = 480(0x1e0, float:6.73E-43)
            r8 = r7
            r10 = r7
            r12 = r7
            X.KK5.A03(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0237:
            r2 = 0
            r1.A0l = r2
            X.56r r0 = r0.A0D
            r0.A0G(r1)
            return
        L_0x0240:
            java.lang.Object r0 = r14.A01
            X.I6I r0 = (X.I6I) r0
            X.I6I.A02(r0)
            X.KK5 r2 = r0.A0F
            X.Itt r4 = r0.A02
            X.ItJ r3 = r0.A01
            java.lang.Integer r5 = X.AnonymousClass006.A0j
            java.lang.Integer r6 = X.AnonymousClass006.A01
        L_0x0251:
            java.lang.String r9 = r0.A04
            r8 = 0
            java.lang.Integer r7 = X.AnonymousClass006.A06
            java.lang.Object r1 = r14.A00
            X.IM8 r1 = (X.IM8) r1
            java.lang.String r11 = r1.A0N
            r13 = 416(0x1a0, float:5.83E-43)
            r10 = r8
            r12 = r8
            X.KK5.A03(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0237
        L_0x0264:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxConsumerShape142S0200000_2_I2.accept(java.lang.Object):void");
    }
}
