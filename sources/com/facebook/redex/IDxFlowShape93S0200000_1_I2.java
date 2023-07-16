package com.facebook.redex;

import X.AnonymousClass0YP;
import X.C84714tk;
import com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource;

public class IDxFlowShape93S0200000_1_I2 implements C84714tk {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxFlowShape93S0200000_1_I2(AnonymousClass0YP r1, C84714tk r2, int i) {
        this.A02 = i;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 32:
            case 33:
                this.A00 = r2;
                this.A01 = r1;
                break;
            default:
                this.A01 = r2;
                this.A00 = r1;
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0124, code lost:
        r1 = X.AnonymousClass6W4.A00(r8, r4, new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0301000_I2(r3, r2, r1), r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0144, code lost:
        r2 = new com.facebook.redex.IDxFCollectorShape83S0200000_1_I2(r1, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r1 = r3.collect(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01c5, code lost:
        r2 = new com.facebook.redex.IDxFCollectorShape83S0200000_1_I2(r0, (java.lang.Object) r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1 == X.D0E.A01) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(X.C83234r0 r7, X.C146958n9 r8) {
        /*
            r6 = this;
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x002d;
                case 2: goto L_0x0036;
                case 3: goto L_0x003f;
                case 4: goto L_0x0049;
                case 5: goto L_0x0053;
                case 6: goto L_0x005d;
                case 7: goto L_0x0067;
                case 8: goto L_0x0071;
                case 9: goto L_0x007b;
                case 10: goto L_0x008d;
                case 11: goto L_0x009d;
                case 12: goto L_0x00ad;
                case 13: goto L_0x00bd;
                case 14: goto L_0x00cd;
                case 15: goto L_0x00dd;
                case 16: goto L_0x00ed;
                case 17: goto L_0x00f7;
                case 18: goto L_0x0101;
                case 19: goto L_0x010b;
                case 20: goto L_0x0115;
                case 21: goto L_0x012f;
                case 22: goto L_0x013a;
                case 23: goto L_0x014b;
                case 24: goto L_0x0154;
                case 25: goto L_0x015d;
                case 26: goto L_0x0166;
                case 27: goto L_0x016f;
                case 28: goto L_0x0178;
                case 29: goto L_0x0187;
                case 30: goto L_0x0190;
                case 31: goto L_0x01ab;
                case 32: goto L_0x01b4;
                case 33: goto L_0x01bd;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r6.A01
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A00
            X.0YP r1 = (X.AnonymousClass0YP) r1
            r0 = 77
            com.facebook.redex.IDxFCollectorShape86S0200000_4_I2 r2 = new com.facebook.redex.IDxFCollectorShape86S0200000_4_I2
            r2.<init>((X.AnonymousClass0YP) r1, (X.C83234r0) r7, (int) r0)
        L_0x0014:
            java.lang.Object r1 = r3.collect(r2, r8)
        L_0x0018:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            if (r1 == r0) goto L_0x001e
            kotlin.Unit r1 = kotlin.Unit.A00
        L_0x001e:
            return r1
        L_0x001f:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 34
            com.facebook.redex.IDxFCollectorShape84S0200000_2_I2 r2 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2
            r2.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r7)
            goto L_0x0014
        L_0x002d:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 6
            goto L_0x01c5
        L_0x0036:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 7
            goto L_0x01c5
        L_0x003f:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 8
            goto L_0x01c5
        L_0x0049:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 9
            goto L_0x01c5
        L_0x0053:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 10
            goto L_0x01c5
        L_0x005d:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 11
            goto L_0x01c5
        L_0x0067:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 12
            goto L_0x01c5
        L_0x0071:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 13
            goto L_0x01c5
        L_0x007b:
            java.lang.Object r5 = r6.A00
            X.4tk[] r5 = (X.C84714tk[]) r5
            r0 = 49
            kotlin.jvm.internal.KtLambdaShape68S0100000_I2_48 r4 = new kotlin.jvm.internal.KtLambdaShape68S0100000_I2_48
            r4.<init>(r5, r0)
            java.lang.Object r3 = r6.A01
            r2 = 0
            r1 = 21
            goto L_0x0124
        L_0x008d:
            java.lang.Object r5 = r6.A00
            X.4tk[] r5 = (X.C84714tk[]) r5
            r0 = 3
            kotlin.jvm.internal.KtLambdaShape69S0100000_I2_49 r4 = X.C18250wR.A0f(r5, r0)
            java.lang.Object r3 = r6.A01
            r2 = 0
            r1 = 22
            goto L_0x0124
        L_0x009d:
            java.lang.Object r5 = r6.A00
            X.4tk[] r5 = (X.C84714tk[]) r5
            r0 = 33
            kotlin.jvm.internal.KtLambdaShape69S0100000_I2_49 r4 = X.C18250wR.A0f(r5, r0)
            java.lang.Object r3 = r6.A01
            r2 = 0
            r1 = 23
            goto L_0x0124
        L_0x00ad:
            java.lang.Object r5 = r6.A00
            X.4tk[] r5 = (X.C84714tk[]) r5
            r0 = 8
            kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50 r4 = X.C18250wR.A0g(r5, r0)
            java.lang.Object r3 = r6.A01
            r2 = 0
            r1 = 24
            goto L_0x0124
        L_0x00bd:
            java.lang.Object r5 = r6.A00
            X.4tk[] r5 = (X.C84714tk[]) r5
            r0 = 9
            kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50 r4 = X.C18250wR.A0g(r5, r0)
            java.lang.Object r3 = r6.A01
            r2 = 0
            r1 = 25
            goto L_0x0124
        L_0x00cd:
            java.lang.Object r5 = r6.A00
            X.4tk[] r5 = (X.C84714tk[]) r5
            r0 = 10
            kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50 r4 = X.C18250wR.A0g(r5, r0)
            java.lang.Object r3 = r6.A01
            r2 = 0
            r1 = 26
            goto L_0x0124
        L_0x00dd:
            java.lang.Object r5 = r6.A00
            X.4tk[] r5 = (X.C84714tk[]) r5
            r0 = 17
            kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50 r4 = X.C18250wR.A0g(r5, r0)
            java.lang.Object r3 = r6.A01
            r2 = 0
            r1 = 27
            goto L_0x0124
        L_0x00ed:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 17
            goto L_0x01c5
        L_0x00f7:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 18
            goto L_0x01c5
        L_0x0101:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 20
            goto L_0x01c5
        L_0x010b:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 21
            goto L_0x01c5
        L_0x0115:
            java.lang.Object r5 = r6.A00
            X.4tk[] r5 = (X.C84714tk[]) r5
            r0 = 32
            kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50 r4 = X.C18250wR.A0g(r5, r0)
            java.lang.Object r3 = r6.A01
            r2 = 0
            r1 = 28
        L_0x0124:
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0301000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0301000_I2
            r0.<init>((java.lang.Object) r3, (X.C146958n9) r2, (int) r1)
            java.lang.Object r1 = X.AnonymousClass6W4.A00(r8, r4, r0, r7, r5)
            goto L_0x0018
        L_0x012f:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r1 = (com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource) r1
            r0 = 22
            goto L_0x0144
        L_0x013a:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r1 = (com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource) r1
            r0 = 23
        L_0x0144:
            com.facebook.redex.IDxFCollectorShape83S0200000_1_I2 r2 = new com.facebook.redex.IDxFCollectorShape83S0200000_1_I2
            r2.<init>((com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource) r1, (X.C83234r0) r7, (int) r0)
            goto L_0x0014
        L_0x014b:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 24
            goto L_0x01c5
        L_0x0154:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 25
            goto L_0x01c5
        L_0x015d:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 26
            goto L_0x01c5
        L_0x0166:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 27
            goto L_0x01c5
        L_0x016f:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 28
            goto L_0x01c5
        L_0x0178:
            java.lang.Object r3 = r6.A01
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A00
            r0 = 29
            com.facebook.redex.IDxFCollectorShape83S0200000_1_I2 r2 = new com.facebook.redex.IDxFCollectorShape83S0200000_1_I2
            r2.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r7)
            goto L_0x0014
        L_0x0187:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 30
            goto L_0x01c5
        L_0x0190:
            java.lang.Object r5 = r6.A00
            X.4tk[] r5 = (X.C84714tk[]) r5
            r0 = 19
            kotlin.jvm.internal.KtLambdaShape100S0100000_I2_80 r4 = new kotlin.jvm.internal.KtLambdaShape100S0100000_I2_80
            r4.<init>(r5, r0)
            java.lang.Object r3 = r6.A01
            r2 = 0
            r1 = 31
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0301000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0301000_I2
            r0.<init>((X.C146958n9) r2, (java.lang.Object) r3, (int) r1)
            java.lang.Object r1 = X.AnonymousClass6W4.A00(r8, r4, r0, r7, r5)
            goto L_0x0018
        L_0x01ab:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 31
            goto L_0x01c5
        L_0x01b4:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 34
            goto L_0x01c5
        L_0x01bd:
            java.lang.Object r3 = r6.A00
            X.4tk r3 = (X.C84714tk) r3
            java.lang.Object r1 = r6.A01
            r0 = 35
        L_0x01c5:
            com.facebook.redex.IDxFCollectorShape83S0200000_1_I2 r2 = new com.facebook.redex.IDxFCollectorShape83S0200000_1_I2
            r2.<init>((int) r0, (java.lang.Object) r7, (java.lang.Object) r1)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFlowShape93S0200000_1_I2.collect(X.4r0, X.8n9):java.lang.Object");
    }

    public IDxFlowShape93S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public IDxFlowShape93S0200000_1_I2(FlashMediaLocalDataSource flashMediaLocalDataSource, C84714tk r2, int i) {
        this.A02 = i;
        this.A00 = r2;
        this.A01 = flashMediaLocalDataSource;
    }
}
