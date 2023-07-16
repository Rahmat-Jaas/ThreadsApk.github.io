package com.facebook.redex;

import X.AnonymousClass72B;
import X.C141498bi;
import X.C146958n9;
import X.C83234r0;
import X.C84714tk;
import X.D0E;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0301000_I2_6;

public class IDxFlowShape251S0100000_2_I2 implements C84714tk {
    public Object A00;
    public final int A01;

    public IDxFlowShape251S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final Object A00(IDxFlowShape251S0100000_2_I2 iDxFlowShape251S0100000_2_I2, C146958n9 r4, C83234r0 r5) {
        KtSLambdaShape14S0301000_I2_6 ktSLambdaShape14S0301000_I2_6 = new KtSLambdaShape14S0301000_I2_6(iDxFlowShape251S0100000_2_I2.A00, r5, (C146958n9) null, 24);
        C141498bi r0 = new C141498bi(r4, r4.getContext());
        Object A002 = AnonymousClass72B.A00(r0, ktSLambdaShape14S0301000_I2_6, r0);
        if (A002 != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0141, code lost:
        r2 = new com.facebook.redex.IDxFCollectorShape230S0100000_2_I2(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0146, code lost:
        r6 = r3.collect(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014c, code lost:
        if (r6 != X.D0E.COROUTINE_SUSPENDED) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014e, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0151, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(X.C83234r0 r8, X.C146958n9 r9) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x013c;
                case 1: goto L_0x0135;
                case 2: goto L_0x012e;
                case 3: goto L_0x0127;
                case 4: goto L_0x0120;
                case 5: goto L_0x0119;
                case 6: goto L_0x0102;
                case 7: goto L_0x00fb;
                case 8: goto L_0x00f4;
                case 9: goto L_0x00ed;
                case 10: goto L_0x00e6;
                case 11: goto L_0x00df;
                case 12: goto L_0x00d8;
                case 13: goto L_0x00d1;
                case 14: goto L_0x00ca;
                case 15: goto L_0x00c3;
                case 16: goto L_0x00bc;
                case 17: goto L_0x00b4;
                case 18: goto L_0x00ac;
                case 19: goto L_0x00a4;
                case 20: goto L_0x009c;
                case 21: goto L_0x0094;
                case 22: goto L_0x008c;
                case 23: goto L_0x002b;
                case 24: goto L_0x001e;
                case 25: goto L_0x000c;
                case 26: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            r6 = 0
            return r6
        L_0x0007:
            java.lang.Object r6 = A00(r7, r9, r8)
            return r6
        L_0x000c:
            X.0MZ r1 = new X.0MZ
            r1.<init>()
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 78
            com.facebook.redex.IDxFCollectorShape86S0200000_4_I2 r2 = new com.facebook.redex.IDxFCollectorShape86S0200000_4_I2
            r2.<init>((X.AnonymousClass0MZ) r1, (X.C83234r0) r8, (int) r0)
            goto L_0x0146
        L_0x001e:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 179(0xb3, float:2.51E-43)
            com.facebook.redex.IDxFCollectorShape232S0100000_4_I2 r2 = new com.facebook.redex.IDxFCollectorShape232S0100000_4_I2
            r2.<init>((java.lang.Object) r8, (int) r0)
            goto L_0x0146
        L_0x002b:
            r5 = 1
            boolean r0 = r9 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0403000_I2
            if (r0 == 0) goto L_0x0081
            r4 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape0S0403000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0403000_I2) r4
            int r0 = r4.A07
            if (r0 != r5) goto L_0x0081
            int r2 = r4.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0081
            int r2 = r2 - r1
            r4.A02 = r2
        L_0x0042:
            java.lang.Object r1 = r4.A05
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A02
            if (r0 == 0) goto L_0x0076
            if (r0 != r5) goto L_0x0087
            int r0 = r4.A01
            int r3 = r4.A00
            java.lang.Object r8 = r4.A04
            X.4r0 r8 = (X.C83234r0) r8
            java.lang.Object r2 = r4.A03
            com.facebook.redex.IDxFlowShape251S0100000_2_I2 r2 = (com.facebook.redex.IDxFlowShape251S0100000_2_I2) r2
            X.AnonymousClass0OU.A00(r1)
        L_0x005b:
            int r3 = r3 + 1
        L_0x005d:
            if (r3 >= r0) goto L_0x014f
            java.lang.Object r1 = r2.A00
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r1 = r1[r3]
            r4.A03 = r2
            r4.A04 = r8
            r4.A00 = r3
            r4.A01 = r0
            r4.A02 = r5
            java.lang.Object r1 = r8.emit(r1, r4)
            if (r1 != r6) goto L_0x005b
            return r6
        L_0x0076:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r0 = r7.A00
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r0.length
            r2 = r7
            r3 = 0
            goto L_0x005d
        L_0x0081:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0403000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0403000_I2
            r4.<init>(r7, r9, r5)
            goto L_0x0042
        L_0x0087:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x008c:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 83
            goto L_0x0141
        L_0x0094:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 75
            goto L_0x0141
        L_0x009c:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 74
            goto L_0x0141
        L_0x00a4:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 73
            goto L_0x0141
        L_0x00ac:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 71
            goto L_0x0141
        L_0x00b4:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 70
            goto L_0x0141
        L_0x00bc:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 69
            goto L_0x0141
        L_0x00c3:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 68
            goto L_0x0141
        L_0x00ca:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 67
            goto L_0x0141
        L_0x00d1:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 66
            goto L_0x0141
        L_0x00d8:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 61
            goto L_0x0141
        L_0x00df:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 43
            goto L_0x0141
        L_0x00e6:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 36
            goto L_0x0141
        L_0x00ed:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 35
            goto L_0x0141
        L_0x00f4:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 28
            goto L_0x0141
        L_0x00fb:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 27
            goto L_0x0141
        L_0x0102:
            java.lang.Object r4 = r7.A00
            X.4tk[] r4 = (X.C84714tk[]) r4
            r0 = 44
            kotlin.jvm.internal.KtLambdaShape28S0100000_I2_8 r3 = new kotlin.jvm.internal.KtLambdaShape28S0100000_I2_8
            r3.<init>(r4, r0)
            r2 = 0
            r1 = 2
            kotlin.coroutines.jvm.internal.KtSLambdaShape25S0201000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape25S0201000_I2
            r0.<init>((int) r1, (X.C146958n9) r2)
            java.lang.Object r6 = X.AnonymousClass6W4.A00(r9, r3, r0, r8, r4)
            goto L_0x014a
        L_0x0119:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 25
            goto L_0x0141
        L_0x0120:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 20
            goto L_0x0141
        L_0x0127:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 19
            goto L_0x0141
        L_0x012e:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 11
            goto L_0x0141
        L_0x0135:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 10
            goto L_0x0141
        L_0x013c:
            java.lang.Object r3 = r7.A00
            X.4tk r3 = (X.C84714tk) r3
            r0 = 3
        L_0x0141:
            com.facebook.redex.IDxFCollectorShape230S0100000_2_I2 r2 = new com.facebook.redex.IDxFCollectorShape230S0100000_2_I2
            r2.<init>(r8, r0)
        L_0x0146:
            java.lang.Object r6 = r3.collect(r2, r9)
        L_0x014a:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            if (r6 != r0) goto L_0x014f
            return r6
        L_0x014f:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFlowShape251S0100000_2_I2.collect(X.4r0, X.8n9):java.lang.Object");
    }
}
