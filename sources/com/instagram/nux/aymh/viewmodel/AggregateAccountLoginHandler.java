package com.instagram.nux.aymh.viewmodel;

import X.AnonymousClass3Tz;
import X.C62483a6;
import com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder;
import kotlin.coroutines.jvm.internal.KtCImplShape0S01101000_I2;

public final class AggregateAccountLoginHandler {
    public final AnonymousClass3Tz A00;
    public final C62483a6 A01;

    public static Object A00(HandlerExecutorAndBuilder handlerExecutorAndBuilder, KtCImplShape0S01101000_I2 ktCImplShape0S01101000_I2, int i) {
        ktCImplShape0S01101000_I2.A04 = null;
        ktCImplShape0S01101000_I2.A05 = null;
        ktCImplShape0S01101000_I2.A06 = null;
        ktCImplShape0S01101000_I2.A07 = null;
        ktCImplShape0S01101000_I2.A08 = null;
        ktCImplShape0S01101000_I2.A09 = null;
        ktCImplShape0S01101000_I2.A0A = null;
        ktCImplShape0S01101000_I2.A00 = i;
        return handlerExecutorAndBuilder.A01(ktCImplShape0S01101000_I2);
    }

    public AggregateAccountLoginHandler(AnonymousClass3Tz r1, C62483a6 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.3b6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.3b6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.3b6} */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e4, code lost:
        if (r13.A08 == false) goto L_0x0227;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010d A[LOOP:0: B:27:0x0107->B:29:0x010d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0243 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r33, X.C62903b6 r34, X.C209216q r35, X.C58593Gj r36, X.C07530bf r37, X.C146958n9 r38) {
        /*
            r32 = this;
            r7 = r37
            r4 = r35
            r2 = r36
            r5 = 1
            r8 = r38
            boolean r0 = r8 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S01101000_I2
            r12 = r32
            if (r0 == 0) goto L_0x0045
            r0 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S01101000_I2 r0 = (kotlin.coroutines.jvm.internal.KtCImplShape0S01101000_I2) r0
            int r1 = r0.A0C
            if (r1 != r5) goto L_0x0045
            int r6 = r0.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r3
            if (r1 == 0) goto L_0x0045
            int r6 = r6 - r3
            r0.A00 = r6
        L_0x0021:
            java.lang.Object r3 = r0.A0B
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r22 = 4
            r21 = 3
            r20 = 2
            r19 = 1
            r11 = 0
            if (r1 == 0) goto L_0x004b
            if (r1 == r5) goto L_0x00c5
            r0 = r20
            if (r1 == r0) goto L_0x02a6
            r0 = r21
            if (r1 == r0) goto L_0x02a6
            r0 = r22
            if (r1 == r0) goto L_0x02a6
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0045:
            kotlin.coroutines.jvm.internal.KtCImplShape0S01101000_I2 r0 = new kotlin.coroutines.jvm.internal.KtCImplShape0S01101000_I2
            r0.<init>(r12, r8, r5)
            goto L_0x0021
        L_0x004b:
            X.AnonymousClass0OU.A00(r3)
            X.0MJ r1 = new X.0MJ
            r1.<init>()
            r3 = r34
            r1.A00 = r3
            X.0MJ r5 = new X.0MJ
            r5.<init>()
            X.4Y2 r10 = X.AnonymousClass4Y2.A00
            r3 = r33
            java.lang.Object r9 = r3.A00
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r8 = 5
            com.facebook.redex.IDxComparatorShape302S0100000_1_I2 r3 = new com.facebook.redex.IDxComparatorShape302S0100000_1_I2
            r3.<init>((java.lang.Object) r10, (int) r8)
            java.util.List r9 = X.AnonymousClass00J.A0W(r9, r3)
            java.lang.Iterable r3 = X.AnonymousClass00J.A06(r9)
            java.util.Iterator r10 = r3.iterator()
            r8 = r12
        L_0x0077:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x024e
            java.lang.Object r12 = r10.next()
            X.3I2 r12 = (X.AnonymousClass3I2) r12
            java.lang.Object r13 = r12.A01
            X.16q r13 = (X.C209216q) r13
            r0.A01 = r8
            r0.A02 = r7
            r0.A04 = r4
            r0.A05 = r2
            r0.A06 = r1
            r0.A07 = r5
            r0.A08 = r9
            r0.A09 = r10
            r0.A0A = r12
            r3 = r19
            r0.A00 = r3
            X.3Tz r3 = r8.A00
            X.4qD r23 = r3.A00(r13)
            java.lang.Object r14 = r13.A02
            android.content.Context r3 = X.C10600ic.A00
            java.lang.String r26 = X.C09140ev.A00(r3)
            X.C04220Ms.A06(r26)
            X.0ev r13 = X.C09140ev.A02
            android.content.Context r3 = X.C10600ic.A00
            java.lang.String r27 = r13.A05(r3)
            r24 = r7
            r25 = r14
            r28 = r11
            r29 = r0
            java.lang.Object r3 = r23.BeO(r24, r25, r26, r27, r28, r29)
            if (r3 != r6) goto L_0x00ec
            return r6
        L_0x00c5:
            java.lang.Object r12 = r0.A0A
            X.3I2 r12 = (X.AnonymousClass3I2) r12
            java.lang.Object r10 = r0.A09
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r9 = r0.A08
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r5 = r0.A07
            X.0MJ r5 = (X.AnonymousClass0MJ) r5
            java.lang.Object r1 = r0.A06
            X.0MJ r1 = (X.AnonymousClass0MJ) r1
            java.lang.Object r2 = r0.A05
            X.3Gj r2 = (X.C58593Gj) r2
            java.lang.Object r4 = r0.A04
            X.16q r4 = (X.C209216q) r4
            java.lang.Object r7 = r0.A02
            X.0bf r7 = (X.C07530bf) r7
            java.lang.Object r8 = r0.A01
            com.instagram.nux.aymh.viewmodel.AggregateAccountLoginHandler r8 = (com.instagram.nux.aymh.viewmodel.AggregateAccountLoginHandler) r8
            X.AnonymousClass0OU.A00(r3)
        L_0x00ec:
            X.3b6 r3 = (X.C62903b6) r3
            java.lang.Object r13 = r12.A01
            r31 = r13
            r18 = r13
            r13 = r18
            X.16q r13 = (X.C209216q) r13
            r18 = r13
            int r12 = r12.A00
            int r30 = r12 + 1
            r13 = r3
            java.util.ArrayList r17 = X.AnonymousClass0wJ.A0w(r9)
            java.util.Iterator r15 = r9.iterator()
        L_0x0107:
            boolean r12 = r15.hasNext()
            if (r12 == 0) goto L_0x011f
            java.lang.Object r12 = r15.next()
            X.16q r12 = (X.C209216q) r12
            java.lang.Integer r12 = r12.A01
            java.lang.String r14 = X.C59973Nd.A00(r12)
            r12 = r17
            r12.add(r14)
            goto L_0x0107
        L_0x011f:
            boolean r12 = r3 instanceof X.AnonymousClass1jA
            r16 = r12
            if (r12 == 0) goto L_0x0219
            X.3U4 r23 = X.AnonymousClass3U4.A00
            java.lang.String r25 = "aymh"
            r12 = r18
            java.lang.Integer r12 = r12.A01
            java.lang.String r26 = X.C59973Nd.A00(r12)
            java.lang.String r27 = "success"
            r24 = r7
            r28 = r11
            r29 = r17
            r23.A00(r24, r25, r26, r27, r28, r29, r30)
            if (r2 == 0) goto L_0x0216
            X.0nS r12 = r2.A00
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r14 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A02(r12)
            java.lang.String r13 = "multiple_account"
            java.lang.String r12 = "flow_name"
            r14.A0T(r12, r13)
            java.lang.String r12 = "login_success"
            X.C18200wM.A1I(r14, r12)
            java.lang.String r13 = "NDX_IG4A_MA_FEATURE"
            java.lang.String r12 = "ig_ndx_source"
            r14.A0T(r12, r13)
            r14.Bb4()
            kotlin.Unit r12 = kotlin.Unit.A00
        L_0x015c:
            X.1jA r13 = X.AnonymousClass1jA.A00(r12)
        L_0x0160:
            boolean r12 = r13 instanceof X.AnonymousClass1jA
            if (r12 != 0) goto L_0x01c2
            boolean r12 = r13 instanceof X.AnonymousClass1jB
            if (r12 == 0) goto L_0x0249
            X.2L8 r13 = X.AnonymousClass1jB.A00(r13)
            boolean r12 = r13 instanceof X.AnonymousClass1j9
            if (r12 == 0) goto L_0x01f4
            X.1j9 r13 = (X.AnonymousClass1j9) r13
            X.8mT r14 = r13.A00
            X.1j3 r14 = (X.AnonymousClass1j3) r14
            java.lang.String r15 = r14.mErrorType
            r13 = 58
            java.lang.String r12 = r14.getErrorMessage()
            java.lang.String r13 = X.AnonymousClass00U.A0N(r15, r12, r13)
            java.lang.String r12 = "AYMH Sign In Error"
            X.C10450iM.A03(r12, r13)
            java.lang.String r13 = r14.mErrorType
        L_0x0189:
            r12 = r18
            java.lang.Integer r12 = r12.A01
            java.lang.Integer r14 = X.AnonymousClass006.A00
            if (r12 == r14) goto L_0x01a4
            X.3U4 r23 = X.AnonymousClass3U4.A00
            java.lang.String r25 = "aymh"
            java.lang.String r26 = X.C59973Nd.A00(r12)
            java.lang.String r27 = "failure"
            r24 = r7
            r28 = r13
            r29 = r17
            r23.A00(r24, r25, r26, r27, r28, r29, r30)
        L_0x01a4:
            if (r2 == 0) goto L_0x01c2
            X.0nS r12 = r2.A00
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r14 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A02(r12)
            java.lang.String r13 = "multiple_account"
            java.lang.String r12 = "flow_name"
            r14.A0T(r12, r13)
            java.lang.String r12 = "login_failure"
            X.C18200wM.A1I(r14, r12)
            java.lang.String r13 = "NDX_IG4A_MA_FEATURE"
            java.lang.String r12 = "ig_ndx_source"
            r14.A0T(r12, r13)
            r14.Bb4()
        L_0x01c2:
            if (r16 != 0) goto L_0x0227
            java.lang.Object r13 = X.C59983Ne.A00(r3)
            X.2L8 r13 = (X.AnonymousClass2L8) r13
            boolean r12 = r13 instanceof X.AnonymousClass1j8
            if (r12 != 0) goto L_0x01e6
            boolean r12 = r13 instanceof X.AnonymousClass1j9
            if (r12 == 0) goto L_0x0222
            X.3GF r13 = X.C67323zM.A02(r13)
            boolean r12 = r13.A02
            if (r12 != 0) goto L_0x01e6
            boolean r12 = r13.A06
            if (r12 != 0) goto L_0x01e6
            boolean r12 = r13.A05
            if (r12 != 0) goto L_0x01e6
            boolean r12 = r13.A08
            if (r12 == 0) goto L_0x0227
        L_0x01e6:
            java.lang.Object r12 = r1.A00
            if (r12 != 0) goto L_0x01f2
            r12 = r31
            r5.A00 = r12
        L_0x01ee:
            r1.A00 = r3
            goto L_0x0077
        L_0x01f2:
            r3 = r12
            goto L_0x01ee
        L_0x01f4:
            boolean r12 = r13 instanceof X.AnonymousClass1j8
            if (r12 == 0) goto L_0x0244
            X.1j8 r13 = (X.AnonymousClass1j8) r13
            java.lang.Throwable r14 = r13.A00
            java.lang.String r12 = "AYMH Sign In Exception"
            X.C10450iM.A07(r12, r14)
            java.lang.String r13 = "exception:"
            java.lang.Class r14 = r14.getClass()
            r12 = r19
            X.C04220Ms.A0B(r14, r12)
            java.lang.String r12 = X.AnonymousClass0N8.A00(r14)
            java.lang.String r13 = X.AnonymousClass00U.A0L(r13, r12)
            goto L_0x0189
        L_0x0216:
            r12 = r11
            goto L_0x015c
        L_0x0219:
            boolean r12 = r3 instanceof X.AnonymousClass1jB
            if (r12 != 0) goto L_0x0160
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0222:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0227:
            boolean r14 = X.AnonymousClass0wJ.A1W(r2)
            r12 = 0
            r13 = 4032(0xfc0, float:5.65E-42)
            r8 = r3
            r9 = r18
            r10 = r7
            r15 = r12
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r2 = X.C36502Ro.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.A01 = r11
            r0.A02 = r11
            r1 = r20
            java.lang.Object r3 = A00(r2, r0, r1)
            if (r3 != r6) goto L_0x02a9
            return r6
        L_0x0244:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0249:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x024e:
            java.lang.Object r1 = r1.A00
            X.3b6 r1 = (X.C62903b6) r1
            if (r1 == 0) goto L_0x0281
            if (r4 != 0) goto L_0x0262
            java.lang.Object r4 = r5.A00
            if (r4 != 0) goto L_0x0260
            java.lang.String r0 = "firstAttemptedAccount"
            X.C04220Ms.A0E(r0)
            throw r11
        L_0x0260:
            X.16q r4 = (X.C209216q) r4
        L_0x0262:
            boolean r18 = X.AnonymousClass0wJ.A1W(r2)
            r16 = 0
            r17 = 4032(0xfc0, float:5.65E-42)
            r12 = r1
            r13 = r4
            r14 = r7
            r15 = r11
            r19 = r16
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r2 = X.C36502Ro.A00(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.A01 = r8
            r0.A02 = r7
            r1 = r21
            java.lang.Object r3 = A00(r2, r0, r1)
            if (r3 != r6) goto L_0x02a9
            return r6
        L_0x0281:
            java.lang.String r4 = "error_empty_aggregate_state"
            X.265 r3 = X.AnonymousClass265.A0G
            r1 = r19
            X.C04220Ms.A0B(r7, r1)
            r2 = 21
            kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1 r1 = new kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1
            r1.<init>(r7, r3, r4, r2)
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r2 = new com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder
            r2.<init>()
            r1.invoke(r2)
            r0.A01 = r11
            r0.A02 = r11
            r1 = r22
            java.lang.Object r3 = A00(r2, r0, r1)
            if (r3 != r6) goto L_0x02a9
            return r6
        L_0x02a6:
            X.AnonymousClass0OU.A00(r3)
        L_0x02a9:
            X.3aS r3 = (X.C62643aS) r3
            java.lang.Object r6 = r3.A03()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.aymh.viewmodel.AggregateAccountLoginHandler.A01(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2, X.3b6, X.16q, X.3Gj, X.0bf, X.8n9):java.lang.Object");
    }

    public AggregateAccountLoginHandler() {
        this(AnonymousClass3Tz.A00, C62483a6.A00);
    }
}
