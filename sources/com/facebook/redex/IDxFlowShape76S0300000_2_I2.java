package com.facebook.redex;

import X.C84714tk;

public class IDxFlowShape76S0300000_2_I2 implements C84714tk {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxFlowShape76S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A00 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a5, code lost:
        r3 = new com.facebook.redex.IDxFCollectorShape60S0300000_2_I2(r0, r9, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c8, code lost:
        r3 = new com.facebook.redex.IDxFCollectorShape60S0300000_2_I2(r0, r9, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cd, code lost:
        r6 = r4.collect(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d3, code lost:
        if (r6 != X.D0E.COROUTINE_SUSPENDED) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d5, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(X.C83234r0 r9, X.C146958n9 r10) {
        /*
            r8 = this;
            int r0 = r8.A03
            switch(r0) {
                case 0: goto L_0x00bf;
                case 1: goto L_0x00b5;
                case 2: goto L_0x00ab;
                case 3: goto L_0x009c;
                case 4: goto L_0x0092;
                case 5: goto L_0x0077;
                default: goto L_0x0005;
            }
        L_0x0005:
            r3 = 8
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1.A00(r3, r10)
            if (r0 == 0) goto L_0x0071
            r7 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001b:
            java.lang.Object r2 = r7.A04
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r1) goto L_0x004a
            if (r0 != r5) goto L_0x00d6
            X.AnonymousClass0OU.A00(r2)
        L_0x002c:
            kotlin.Unit r6 = kotlin.Unit.A00
        L_0x002e:
            return r6
        L_0x002f:
            X.AnonymousClass0OU.A00(r2)
            X.0MJ r4 = X.C86144wL.A17()
            java.lang.Object r0 = r8.A00
            r4.A00 = r0
            r7.A01 = r8
            r7.A02 = r9
            r7.A03 = r4
            r7.A00 = r1
            java.lang.Object r0 = r9.emit(r0, r7)
            if (r0 == r6) goto L_0x002e
            r0 = r8
            goto L_0x0055
        L_0x004a:
            java.lang.Object r4 = r7.A03
            java.lang.Object r9 = r7.A02
            java.lang.Object r0 = r7.A01
            com.facebook.redex.IDxFlowShape76S0300000_2_I2 r0 = (com.facebook.redex.IDxFlowShape76S0300000_2_I2) r0
            X.AnonymousClass0OU.A00(r2)
        L_0x0055:
            java.lang.Object r3 = r0.A02
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r2 = r0.A01
            r0 = 4
            com.facebook.redex.IDxFCollectorShape62S0300000_4_I2 r1 = new com.facebook.redex.IDxFCollectorShape62S0300000_4_I2
            r1.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r4, (java.lang.Object) r9)
            r0 = 0
            r7.A01 = r0
            r7.A02 = r0
            r7.A03 = r0
            r7.A00 = r5
            java.lang.Object r0 = r3.collect(r1, r7)
            if (r0 != r6) goto L_0x002c
            return r6
        L_0x0071:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1
            r7.<init>(r8, r10, r3)
            goto L_0x001b
        L_0x0077:
            java.lang.Object r6 = r8.A00
            X.4tk[] r6 = (X.C84714tk[]) r6
            r0 = 30
            kotlin.jvm.internal.KtLambdaShape44S0100000_I2_24 r5 = new kotlin.jvm.internal.KtLambdaShape44S0100000_I2_24
            r5.<init>(r6, r0)
            java.lang.Object r4 = r8.A01
            java.lang.Object r3 = r8.A02
            r2 = 0
            r1 = 4
            kotlin.coroutines.jvm.internal.KtSLambdaShape7S0401000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0401000_I2
            r0.<init>((X.C146958n9) r2, (java.lang.Object) r3, (java.lang.Object) r4, (int) r1)
            java.lang.Object r6 = X.AnonymousClass6W4.A00(r10, r5, r0, r9, r6)
            goto L_0x00d1
        L_0x0092:
            java.lang.Object r4 = r8.A01
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r2 = r8.A00
            java.lang.Object r1 = r8.A02
            r0 = 6
            goto L_0x00a5
        L_0x009c:
            java.lang.Object r4 = r8.A01
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r2 = r8.A00
            java.lang.Object r1 = r8.A02
            r0 = 5
        L_0x00a5:
            com.facebook.redex.IDxFCollectorShape60S0300000_2_I2 r3 = new com.facebook.redex.IDxFCollectorShape60S0300000_2_I2
            r3.<init>(r0, r9, r1, r2)
            goto L_0x00cd
        L_0x00ab:
            java.lang.Object r4 = r8.A01
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r2 = r8.A02
            java.lang.Object r1 = r8.A00
            r0 = 4
            goto L_0x00c8
        L_0x00b5:
            java.lang.Object r4 = r8.A01
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r2 = r8.A02
            java.lang.Object r1 = r8.A00
            r0 = 2
            goto L_0x00c8
        L_0x00bf:
            java.lang.Object r4 = r8.A01
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r2 = r8.A02
            java.lang.Object r1 = r8.A00
            r0 = 1
        L_0x00c8:
            com.facebook.redex.IDxFCollectorShape60S0300000_2_I2 r3 = new com.facebook.redex.IDxFCollectorShape60S0300000_2_I2
            r3.<init>(r0, r9, r2, r1)
        L_0x00cd:
            java.lang.Object r6 = r4.collect(r3, r10)
        L_0x00d1:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            if (r6 != r0) goto L_0x002c
            return r6
        L_0x00d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFlowShape76S0300000_2_I2.collect(X.4r0, X.8n9):java.lang.Object");
    }
}
