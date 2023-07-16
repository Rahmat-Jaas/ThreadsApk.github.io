package com.facebook.redex;

import X.AnonymousClass0YP;
import X.C84714tk;

public class IDxFlowShape94S0200000_2_I2 implements C84714tk {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxFlowShape94S0200000_2_I2(AnonymousClass0YP r1, C84714tk r2, int i) {
        this.A02 = i;
        switch (i) {
            case 0:
            case 30:
                this.A01 = r2;
                this.A00 = r1;
                break;
            case 1:
                this.A00 = r2;
                this.A01 = r1;
                break;
            default:
                this.A00 = r1;
                this.A01 = r2;
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007f, code lost:
        r4 = X.AnonymousClass6W4.A00(r11, r4, r3, r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x012b, code lost:
        r3 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2(r0, r1, (java.lang.Object) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0139, code lost:
        r3 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2(r0, (java.lang.Object) r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0154, code lost:
        r3 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2(r1, r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0159, code lost:
        r4 = r4.collect(r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x015f, code lost:
        if (r4 != X.D0E.COROUTINE_SUSPENDED) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0161, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0200, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01d2 A[Catch:{ all -> 0x0255 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0246 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(X.C83234r0 r10, X.C146958n9 r11) {
        /*
            r9 = this;
            int r0 = r9.A02
            switch(r0) {
                case 0: goto L_0x014a;
                case 1: goto L_0x013f;
                case 2: goto L_0x0131;
                case 3: goto L_0x0123;
                case 4: goto L_0x011a;
                case 5: goto L_0x0111;
                case 6: goto L_0x0108;
                case 7: goto L_0x00ff;
                case 8: goto L_0x00f6;
                case 9: goto L_0x00ed;
                case 10: goto L_0x00e4;
                case 11: goto L_0x00db;
                case 12: goto L_0x00d2;
                case 13: goto L_0x00c9;
                case 14: goto L_0x00c0;
                case 15: goto L_0x00b7;
                case 16: goto L_0x00ad;
                case 17: goto L_0x00a3;
                case 18: goto L_0x0099;
                case 19: goto L_0x008f;
                case 20: goto L_0x0085;
                case 21: goto L_0x006b;
                case 22: goto L_0x0061;
                case 23: goto L_0x0057;
                case 24: goto L_0x004d;
                case 25: goto L_0x0037;
                case 26: goto L_0x0029;
                case 27: goto L_0x001a;
                case 28: goto L_0x0162;
                case 29: goto L_0x01d8;
                case 30: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            r4 = 0
        L_0x0006:
            return r4
        L_0x0007:
            X.0Mo r2 = new X.0Mo
            r2.<init>()
            java.lang.Object r4 = r9.A01
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A00
            r0 = 3
            com.facebook.redex.IDxFCollectorShape62S0300000_4_I2 r3 = new com.facebook.redex.IDxFCollectorShape62S0300000_4_I2
            r3.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r2, (java.lang.Object) r10)
            goto L_0x0159
        L_0x001a:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 70
            com.facebook.redex.IDxFCollectorShape86S0200000_4_I2 r3 = new com.facebook.redex.IDxFCollectorShape86S0200000_4_I2
            r3.<init>((int) r0, (java.lang.Object) r10, (java.lang.Object) r1)
            goto L_0x0159
        L_0x0029:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 7
            com.facebook.redex.IDxFCollectorShape85S0200000_3_I2 r3 = new com.facebook.redex.IDxFCollectorShape85S0200000_3_I2
            r3.<init>(r0, r1, r10)
            goto L_0x0159
        L_0x0037:
            java.lang.Object r5 = r9.A00
            X.4tk[] r5 = (X.C84714tk[]) r5
            r0 = 21
            kotlin.jvm.internal.KtLambdaShape100S0100000_I2_80 r4 = new kotlin.jvm.internal.KtLambdaShape100S0100000_I2_80
            r4.<init>(r5, r0)
            java.lang.Object r2 = r9.A01
            r1 = 0
            r0 = 33
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0301000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0301000_I2
            r3.<init>((X.C146958n9) r1, (java.lang.Object) r2, (int) r0)
            goto L_0x007f
        L_0x004d:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 37
            goto L_0x012b
        L_0x0057:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 36
            goto L_0x012b
        L_0x0061:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 35
            goto L_0x012b
        L_0x006b:
            java.lang.Object r5 = r9.A00
            X.4tk[] r5 = (X.C84714tk[]) r5
            r0 = 11
            kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16 r4 = new kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16
            r4.<init>(r5, r0)
            java.lang.Object r2 = r9.A01
            r1 = 0
            r0 = 5
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0301000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0301000_I2
            r3.<init>((java.lang.Object) r2, (X.C146958n9) r1, (int) r0)
        L_0x007f:
            java.lang.Object r4 = X.AnonymousClass6W4.A00(r11, r4, r3, r10, r5)
            goto L_0x015d
        L_0x0085:
            java.lang.Object r4 = r9.A01
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A00
            r0 = 33
            goto L_0x0139
        L_0x008f:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 32
            goto L_0x012b
        L_0x0099:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 30
            goto L_0x012b
        L_0x00a3:
            java.lang.Object r4 = r9.A01
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A00
            r0 = 28
            goto L_0x0139
        L_0x00ad:
            java.lang.Object r4 = r9.A01
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A00
            r0 = 27
            goto L_0x0139
        L_0x00b7:
            java.lang.Object r4 = r9.A01
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A00
            r0 = 25
            goto L_0x0139
        L_0x00c0:
            java.lang.Object r4 = r9.A01
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A00
            r0 = 23
            goto L_0x0139
        L_0x00c9:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 22
            goto L_0x012b
        L_0x00d2:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 21
            goto L_0x012b
        L_0x00db:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 19
            goto L_0x012b
        L_0x00e4:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 18
            goto L_0x012b
        L_0x00ed:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 17
            goto L_0x012b
        L_0x00f6:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 16
            goto L_0x012b
        L_0x00ff:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 15
            goto L_0x012b
        L_0x0108:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 14
            goto L_0x012b
        L_0x0111:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 13
            goto L_0x012b
        L_0x011a:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 12
            goto L_0x012b
        L_0x0123:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            r0 = 11
        L_0x012b:
            com.facebook.redex.IDxFCollectorShape84S0200000_2_I2 r3 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2
            r3.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r10)
            goto L_0x0159
        L_0x0131:
            java.lang.Object r4 = r9.A01
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A00
            r0 = 10
        L_0x0139:
            com.facebook.redex.IDxFCollectorShape84S0200000_2_I2 r3 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2
            r3.<init>((int) r0, (java.lang.Object) r10, (java.lang.Object) r1)
            goto L_0x0159
        L_0x013f:
            java.lang.Object r4 = r9.A00
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            r0 = 9
            goto L_0x0154
        L_0x014a:
            java.lang.Object r4 = r9.A01
            X.4tk r4 = (X.C84714tk) r4
            java.lang.Object r1 = r9.A00
            X.0YP r1 = (X.AnonymousClass0YP) r1
            r0 = 8
        L_0x0154:
            com.facebook.redex.IDxFCollectorShape84S0200000_2_I2 r3 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2
            r3.<init>((X.AnonymousClass0YP) r1, (X.C83234r0) r10, (int) r0)
        L_0x0159:
            java.lang.Object r4 = r4.collect(r3, r11)
        L_0x015d:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            if (r4 != r0) goto L_0x01fe
            return r4
        L_0x0162:
            r3 = 49
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2.A00(r3, r11)
            if (r0 == 0) goto L_0x018f
            r5 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x018f
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0178:
            java.lang.Object r8 = r5.A03
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r7 = 3
            r6 = 2
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L_0x01a5
            if (r0 == r1) goto L_0x0199
            if (r0 == r6) goto L_0x0272
            if (r0 != r7) goto L_0x024d
            java.lang.Object r2 = r5.A01
            X.EjA r2 = (X.C27236EjA) r2
            goto L_0x0195
        L_0x018f:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2
            r5.<init>(r9, r11, r3)
            goto L_0x0178
        L_0x0195:
            X.AnonymousClass0OU.A00(r8)     // Catch:{ all -> 0x0255 }
            goto L_0x01d4
        L_0x0199:
            java.lang.Object r10 = r5.A02
            X.4r0 r10 = (X.C83234r0) r10
            java.lang.Object r1 = r5.A01
            com.facebook.redex.IDxFlowShape94S0200000_2_I2 r1 = (com.facebook.redex.IDxFlowShape94S0200000_2_I2) r1
            X.AnonymousClass0OU.A00(r8)     // Catch:{ all -> 0x0252 }
            goto L_0x01b9
        L_0x01a5:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r0 = r9.A01     // Catch:{ all -> 0x025a }
            X.4tk r0 = (X.C84714tk) r0     // Catch:{ all -> 0x025a }
            r5.A01 = r9     // Catch:{ all -> 0x025a }
            r5.A02 = r10     // Catch:{ all -> 0x025a }
            r5.A00 = r1     // Catch:{ all -> 0x025a }
            java.lang.Object r0 = r0.collect(r10, r5)     // Catch:{ all -> 0x025a }
            if (r0 == r4) goto L_0x0006
            r1 = r9
        L_0x01b9:
            X.Ew2 r0 = r5.getContext()
            X.Egl r2 = new X.Egl
            r2.<init>(r0, r10)
            java.lang.Object r0 = r1.A00     // Catch:{ all -> 0x0255 }
            X.0YM r0 = (X.AnonymousClass0YM) r0     // Catch:{ all -> 0x0255 }
            r5.A01 = r2     // Catch:{ all -> 0x0255 }
            r5.A02 = r3     // Catch:{ all -> 0x0255 }
            r5.A00 = r7     // Catch:{ all -> 0x0255 }
            java.lang.Object r0 = r0.invoke(r2, r3, r5)     // Catch:{ all -> 0x0255 }
            if (r0 != r4) goto L_0x01d4
            goto L_0x0254
        L_0x01d4:
            r2.releaseIntercepted()
            goto L_0x01fe
        L_0x01d8:
            r3 = 7
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1.A00(r3, r11)
            if (r0 == 0) goto L_0x0247
            r6 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0247
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x01ed:
            java.lang.Object r5 = r6.A04
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0211
            if (r0 == r2) goto L_0x0201
            if (r0 != r3) goto L_0x027a
            X.AnonymousClass0OU.A00(r5)
        L_0x01fe:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x0201:
            java.lang.Object r1 = r6.A03
            X.EjA r1 = (X.C27236EjA) r1
            java.lang.Object r10 = r6.A02
            X.4r0 r10 = (X.C83234r0) r10
            java.lang.Object r0 = r6.A01
            com.facebook.redex.IDxFlowShape94S0200000_2_I2 r0 = (com.facebook.redex.IDxFlowShape94S0200000_2_I2) r0
            X.AnonymousClass0OU.A00(r5)     // Catch:{ all -> 0x027f }
            goto L_0x0230
        L_0x0211:
            X.AnonymousClass0OU.A00(r5)
            X.Ew2 r0 = r6.getContext()
            X.Egl r1 = new X.Egl
            r1.<init>(r0, r10)
            java.lang.Object r0 = r9.A00     // Catch:{ all -> 0x027f }
            X.0YP r0 = (X.AnonymousClass0YP) r0     // Catch:{ all -> 0x027f }
            r6.A01 = r9     // Catch:{ all -> 0x027f }
            r6.A02 = r10     // Catch:{ all -> 0x027f }
            r6.A03 = r1     // Catch:{ all -> 0x027f }
            r6.A00 = r2     // Catch:{ all -> 0x027f }
            java.lang.Object r0 = r0.invoke(r1, r6)     // Catch:{ all -> 0x027f }
            if (r0 == r4) goto L_0x0006
            r0 = r9
        L_0x0230:
            r1.releaseIntercepted()
            java.lang.Object r1 = r0.A01
            X.4tk r1 = (X.C84714tk) r1
            r0 = 0
            r6.A01 = r0
            r6.A02 = r0
            r6.A03 = r0
            r6.A00 = r3
            java.lang.Object r0 = r1.collect(r10, r6)
            if (r0 != r4) goto L_0x01fe
            return r4
        L_0x0247:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1
            r6.<init>(r9, r11, r3)
            goto L_0x01ed
        L_0x024d:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0252:
            r0 = move-exception
            goto L_0x025c
        L_0x0254:
            return r4
        L_0x0255:
            r0 = move-exception
            r2.releaseIntercepted()
            throw r0
        L_0x025a:
            r0 = move-exception
            r1 = r9
        L_0x025c:
            X.872 r2 = new X.872
            r2.<init>(r0)
            java.lang.Object r1 = r1.A00
            X.0YM r1 = (X.AnonymousClass0YM) r1
            r5.A01 = r0
            r5.A02 = r3
            r5.A00 = r6
            java.lang.Object r1 = X.DHF.A00(r0, r5, r1, r2)
            if (r1 != r4) goto L_0x0279
            return r4
        L_0x0272:
            java.lang.Object r0 = r5.A01
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.AnonymousClass0OU.A00(r8)
        L_0x0279:
            throw r0
        L_0x027a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x027f:
            r0 = move-exception
            r1.releaseIntercepted()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFlowShape94S0200000_2_I2.collect(X.4r0, X.8n9):java.lang.Object");
    }

    public IDxFlowShape94S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }
}
