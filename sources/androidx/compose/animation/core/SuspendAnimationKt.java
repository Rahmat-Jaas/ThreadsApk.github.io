package androidx.compose.animation.core;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass6EJ;
import X.AnonymousClass7U0;
import X.AnonymousClass7WW;
import X.AnonymousClass8cU;
import X.AnonymousClass8cW;
import X.C04220Ms;
import X.C103866ar;
import X.C113076qg;
import X.C1203479u;
import X.C122657Ti;
import X.C122667Tj;
import X.C142638fL;
import X.C146448mG;
import X.C146958n9;
import X.C147368pE;
import X.C148788sB;
import X.C148818sE;
import X.C18180wK;
import X.C27952Ew2;
import X.C86104wH;
import X.C86154wM;
import X.C86164wN;
import X.D0E;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2;
import kotlin.jvm.internal.KtLambdaShape145S0100000_I2;

public final class SuspendAnimationKt {
    public static final float A00(C27952Ew2 ew2) {
        C04220Ms.A0B(ew2, 0);
        C148818sE r0 = (C148818sE) ew2.AOA(C148818sE.A00);
        if (r0 == null) {
            return 1.0f;
        }
        float B8n = r0.B8n();
        if (B8n >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return B8n;
        }
        throw C18180wK.A0a("Check failed.");
    }

    public static final Object A03(C142638fL r8, AnonymousClass7WW r9, Object obj, C146958n9 r11, AnonymousClass0YY r12, boolean z) {
        long j;
        AnonymousClass7WW r6 = r9;
        Object value = r9.A05.getValue();
        C142638fL r1 = r8;
        C122667Tj r0 = new C122667Tj(r1, r9.A02, r9.A04, value, obj);
        if (z) {
            j = r9.A01;
        } else {
            j = Long.MIN_VALUE;
        }
        return C86164wN.A0U(A01(r0, r6, r11, r12, j));
    }

    public static final Object A05(AnonymousClass7WW r7, AnonymousClass8cU r8, C146958n9 r9, AnonymousClass0YY r10, boolean z) {
        long j;
        AnonymousClass7WW r4 = r7;
        C122657Ti r3 = new C122657Ti(r7.A02, r8, r7.A04, r7.A05.getValue());
        if (z) {
            j = r7.A01;
        } else {
            j = Long.MIN_VALUE;
        }
        return C86164wN.A0U(A01(r3, r4, r9, r10, j));
    }

    public static final void A06(C146448mG r4, C113076qg r5, AnonymousClass7WW r6, AnonymousClass0YY r7, float f, long j) {
        long j2;
        if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            j2 = r4.AeL();
        } else {
            j2 = (long) (((float) (j - r5.A03)) / f);
        }
        r5.A01 = j;
        r5.A06.CrC(r4.BKK(j2));
        C1203479u BKY = r4.BKY(j2);
        C04220Ms.A0B(BKY, 0);
        r5.A02 = BKY;
        if (r4.BUF(j2)) {
            r5.A00 = r5.A01;
            C147368pE.A04(r5.A05, false);
        }
        A07(r5, r6);
        r7.invoke(r5);
    }

    public static final void A07(C113076qg r5, AnonymousClass7WW r6) {
        C04220Ms.A0B(r6, 1);
        r6.A05.CrC(r5.A06.getValue());
        C1203479u r4 = r6.A02;
        C1203479u r3 = r5.A02;
        int A02 = r4.A02();
        for (int i = 0; i < A02; i++) {
            r4.A04(i, r3.A01(i));
        }
        r6.A00 = r5.A00;
        r6.A01 = r5.A01;
        r6.A03 = C86104wH.A1X(r5.A05);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b2 A[Catch:{ CancellationException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C146448mG r24, X.AnonymousClass7WW r25, X.C146958n9 r26, X.AnonymousClass0YY r27, long r28) {
        /*
            r10 = r25
            r9 = r24
            r13 = r27
            r5 = 0
            r4 = r26
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r5, r4)
            if (r0 == 0) goto L_0x00f6
            r0 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r0 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r0
            int r3 = r0.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x00f6
            int r3 = r3 - r2
            r0.A00 = r3
        L_0x001d:
            java.lang.Object r2 = r0.A05
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r6 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0044
            if (r1 == r3) goto L_0x0030
            if (r1 == r6) goto L_0x0030
            java.lang.IllegalStateException r4 = X.AnonymousClass0wJ.A0a()
        L_0x002f:
            throw r4
        L_0x0030:
            java.lang.Object r14 = r0.A04
            X.0MJ r14 = (X.AnonymousClass0MJ) r14
            java.lang.Object r13 = r0.A03
            X.0YY r13 = (X.AnonymousClass0YY) r13
            java.lang.Object r9 = r0.A02
            X.8mG r9 = (X.C146448mG) r9
            java.lang.Object r10 = r0.A01
            X.7WW r10 = (X.AnonymousClass7WW) r10
            X.AnonymousClass0OU.A00(r2)     // Catch:{ CancellationException -> 0x00d5 }
            goto L_0x00a3
        L_0x0044:
            X.AnonymousClass0OU.A00(r2)
            r1 = 0
            java.lang.Object r12 = r9.BKK(r1)
            X.79u r11 = r9.BKY(r1)
            X.0MJ r14 = X.C86144wL.A17()
            r7 = -9223372036854775808
            r21 = r28
            int r1 = (r28 > r7 ? 1 : (r28 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0078
            X.Ew2 r1 = r0.getContext()     // Catch:{ CancellationException -> 0x00d5 }
            float r15 = A00(r1)     // Catch:{ CancellationException -> 0x00d5 }
            X.8JP r8 = new X.8JP     // Catch:{ CancellationException -> 0x00d5 }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ CancellationException -> 0x00d5 }
            r0.A01 = r10     // Catch:{ CancellationException -> 0x00d5 }
            r0.A02 = r9     // Catch:{ CancellationException -> 0x00d5 }
            r0.A03 = r13     // Catch:{ CancellationException -> 0x00d5 }
            java.lang.Object r1 = A02(r9, r14, r0, r8, r3)     // Catch:{ CancellationException -> 0x00d5 }
            if (r1 != r4) goto L_0x00a3
            goto L_0x00fd
        L_0x0078:
            X.8cW r17 = r9.BJ4()     // Catch:{ CancellationException -> 0x00d5 }
            java.lang.Object r19 = r9.BFi()     // Catch:{ CancellationException -> 0x00d5 }
            r1 = 3
            kotlin.jvm.internal.KtLambdaShape20S0100000_I2 r20 = X.C86154wM.A12(r10, r1)     // Catch:{ CancellationException -> 0x00d5 }
            X.6qg r15 = new X.6qg     // Catch:{ CancellationException -> 0x00d5 }
            r16 = r11
            r18 = r12
            r23 = r21
            r15.<init>(r16, r17, r18, r19, r20, r21, r23)     // Catch:{ CancellationException -> 0x00d5 }
            X.Ew2 r1 = r0.getContext()     // Catch:{ CancellationException -> 0x00d5 }
            float r27 = A00(r1)     // Catch:{ CancellationException -> 0x00d5 }
            r23 = r9
            r24 = r15
            r26 = r13
            A06(r23, r24, r25, r26, r27, r28)     // Catch:{ CancellationException -> 0x00d5 }
            r14.A00 = r15     // Catch:{ CancellationException -> 0x00d5 }
        L_0x00a3:
            java.lang.Object r1 = r14.A00     // Catch:{ CancellationException -> 0x00d5 }
            X.C04220Ms.A0A(r1)     // Catch:{ CancellationException -> 0x00d5 }
            X.6qg r1 = (X.C113076qg) r1     // Catch:{ CancellationException -> 0x00d5 }
            X.8pE r1 = r1.A05     // Catch:{ CancellationException -> 0x00d5 }
            boolean r1 = X.C86104wH.A1X(r1)     // Catch:{ CancellationException -> 0x00d5 }
            if (r1 == 0) goto L_0x00ff
            X.Ew2 r1 = r0.getContext()     // Catch:{ CancellationException -> 0x00d5 }
            float r20 = A00(r1)     // Catch:{ CancellationException -> 0x00d5 }
            X.8Iv r1 = new X.8Iv     // Catch:{ CancellationException -> 0x00d5 }
            r15 = r1
            r16 = r9
            r17 = r10
            r18 = r13
            r19 = r14
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ CancellationException -> 0x00d5 }
            r0.A01 = r10     // Catch:{ CancellationException -> 0x00d5 }
            r0.A02 = r9     // Catch:{ CancellationException -> 0x00d5 }
            r0.A03 = r13     // Catch:{ CancellationException -> 0x00d5 }
            java.lang.Object r1 = A02(r9, r14, r0, r1, r6)     // Catch:{ CancellationException -> 0x00d5 }
            if (r1 != r4) goto L_0x00a3
            goto L_0x00fe
        L_0x00d5:
            r4 = move-exception
            java.lang.Object r0 = r14.A00
            X.6qg r0 = (X.C113076qg) r0
            if (r0 == 0) goto L_0x00e1
            X.8pE r0 = r0.A05
            X.C147368pE.A04(r0, r5)
        L_0x00e1:
            java.lang.Object r0 = r14.A00
            X.6qg r0 = (X.C113076qg) r0
            if (r0 == 0) goto L_0x00f4
            long r6 = r0.A01
            long r1 = r10.A01
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00f4
        L_0x00ef:
            if (r3 == 0) goto L_0x002f
            r10.A03 = r5
            throw r4
        L_0x00f4:
            r3 = 0
            goto L_0x00ef
        L_0x00f6:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r0 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r0.<init>(r5, r4)
            goto L_0x001d
        L_0x00fd:
            return r4
        L_0x00fe:
            return r4
        L_0x00ff:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.A01(X.8mG, X.7WW, X.8n9, X.0YY, long):java.lang.Object");
    }

    public static Object A02(C146448mG r0, Object obj, KtCImplShape1S0501000_I2 ktCImplShape1S0501000_I2, AnonymousClass0YY r3, int i) {
        ktCImplShape1S0501000_I2.A04 = obj;
        ktCImplShape1S0501000_I2.A00 = i;
        if (!r0.BV1()) {
            return AnonymousClass6EJ.A00(ktCImplShape1S0501000_I2, new KtLambdaShape145S0100000_I2(r3, 16));
        }
        ktCImplShape1S0501000_I2.getContext().AOA(C148788sB.A00);
        return AnonymousClass6EJ.A00(ktCImplShape1S0501000_I2, r3);
    }

    public static final Object A04(C142638fL r17, C146958n9 r18, AnonymousClass0YP r19, float f, float f2, float f3) {
        AnonymousClass8cW r4 = C103866ar.A02;
        Float A0W = C86154wM.A0W(f);
        Float A0W2 = C86154wM.A0W(f2);
        Float A0W3 = C86154wM.A0W(f3);
        AnonymousClass0YY r0 = ((AnonymousClass7U0) r4).A01;
        C1203479u r3 = (C1203479u) r0.invoke(A0W3);
        if (r3 == null) {
            C1203479u r1 = (C1203479u) r0.invoke(A0W);
            C04220Ms.A0B(r1, 0);
            r3 = C1203479u.A00(r1);
        }
        C122667Tj r11 = new C122667Tj(r17, r3, r4, A0W, A0W2);
        C122667Tj r10 = r11;
        AnonymousClass7WW r112 = new AnonymousClass7WW(r3, r4, A0W, Long.MIN_VALUE, Long.MIN_VALUE, false);
        Object A01 = A01(r10, r112, r18, C86164wN.A10(r19, r4, 12), Long.MIN_VALUE);
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (A01 != d0e) {
            A01 = Unit.A00;
        }
        if (A01 != d0e) {
            return Unit.A00;
        }
        return A01;
    }
}
