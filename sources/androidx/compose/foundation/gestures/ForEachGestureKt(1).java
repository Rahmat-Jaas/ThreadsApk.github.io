package androidx.compose.foundation.gestures;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C147818py;
import X.C86164wN;
import kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2;

public final class ForEachGestureKt {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075 A[EDGE_INSN: B:28:0x0075->B:25:0x0075 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C147828pz r7, X.C146958n9 r8) {
        /*
            r5 = 1
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r5, r8)
            if (r0 == 0) goto L_0x006a
            r4 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            if (r0 == 0) goto L_0x003b
            if (r0 != r5) goto L_0x0070
            java.lang.Object r0 = r4.A01
            X.8pz r7 = X.C86164wN.A0H(r0, r1)
        L_0x0025:
            X.6kM r1 = (X.C109656kM) r1
            java.util.List r3 = r1.A03
            int r2 = r3.size()
            r1 = 0
        L_0x002e:
            if (r1 >= r2) goto L_0x0075
            X.7Es r0 = X.C86124wJ.A0P(r3, r1)
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x005d
            int r1 = r1 + 1
            goto L_0x002e
        L_0x003b:
            X.AnonymousClass0OU.A00(r1)
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            r0 = r7
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r0
            X.54D r0 = r0.A04
            X.6kM r0 = r0.A01
            java.util.List r3 = r0.A03
            int r2 = r3.size()
            r1 = 0
        L_0x0050:
            if (r1 >= r2) goto L_0x0075
            X.7Es r0 = X.C86124wJ.A0P(r3, r1)
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x005d
            int r1 = r1 + 1
            goto L_0x0050
        L_0x005d:
            X.67C r0 = X.AnonymousClass67C.Final
            r4.A01 = r7
            r4.A00 = r5
            java.lang.Object r1 = r7.AA5(r0, r4)
            if (r1 != r6) goto L_0x0025
            return r6
        L_0x006a:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2
            r4.<init>(r5, r8)
            goto L_0x0015
        L_0x0070:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0075:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.A00(X.8pz, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[SYNTHETIC, Splitter:B:13:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d A[Catch:{ CancellationException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C147818py r9, X.C146958n9 r10, X.AnonymousClass0YP r11) {
        /*
            r7 = 1
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r7, r10)
            if (r0 == 0) goto L_0x00a9
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a9
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A04
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r5 = 3
            r4 = 2
            if (r0 == 0) goto L_0x00a1
            if (r0 == r7) goto L_0x0059
            if (r0 == r4) goto L_0x0049
            if (r0 != r5) goto L_0x00b4
            java.lang.Object r3 = r6.A03
            X.Ew2 r3 = (X.C27952Ew2) r3
            java.lang.Object r11 = r6.A02
            X.0YP r11 = (X.AnonymousClass0YP) r11
            java.lang.Object r9 = r6.A01
            X.8py r9 = (X.C147818py) r9
            X.AnonymousClass0OU.A00(r1)
        L_0x0034:
            boolean r0 = X.AnonymousClass7C2.A02(r3)
            if (r0 == 0) goto L_0x00b1
            r6.A01 = r9     // Catch:{ CancellationException -> 0x0080 }
            r6.A02 = r11     // Catch:{ CancellationException -> 0x0080 }
            r6.A03 = r3     // Catch:{ CancellationException -> 0x0080 }
            r6.A00 = r7     // Catch:{ CancellationException -> 0x0080 }
            java.lang.Object r0 = r11.invoke(r9, r6)     // Catch:{ CancellationException -> 0x0080 }
            if (r0 != r8) goto L_0x0068
            goto L_0x00b0
        L_0x0049:
            java.lang.Object r3 = r6.A03
            X.Ew2 r3 = (X.C27952Ew2) r3
            java.lang.Object r11 = r6.A02
            X.0YP r11 = (X.AnonymousClass0YP) r11
            java.lang.Object r9 = r6.A01
            X.8py r9 = (X.C147818py) r9
            X.AnonymousClass0OU.A00(r1)     // Catch:{ CancellationException -> 0x0080 }
            goto L_0x0034
        L_0x0059:
            java.lang.Object r3 = r6.A03
            X.Ew2 r3 = (X.C27952Ew2) r3
            java.lang.Object r11 = r6.A02
            X.0YP r11 = (X.AnonymousClass0YP) r11
            java.lang.Object r9 = r6.A01
            X.8py r9 = (X.C147818py) r9
            X.AnonymousClass0OU.A00(r1)     // Catch:{ CancellationException -> 0x0080 }
        L_0x0068:
            r6.A01 = r9     // Catch:{ CancellationException -> 0x0080 }
            r6.A02 = r11     // Catch:{ CancellationException -> 0x0080 }
            r6.A03 = r3     // Catch:{ CancellationException -> 0x0080 }
            r6.A00 = r4     // Catch:{ CancellationException -> 0x0080 }
            r2 = 0
            r1 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0101000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0101000_I2     // Catch:{ CancellationException -> 0x0080 }
            r0.<init>(r1, r2)     // Catch:{ CancellationException -> 0x0080 }
            java.lang.Object r0 = r9.AA6(r6, r0)     // Catch:{ CancellationException -> 0x0080 }
            if (r0 == r8) goto L_0x009e
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ CancellationException -> 0x0080 }
            goto L_0x009e
        L_0x0080:
            r1 = move-exception
            boolean r0 = X.AnonymousClass7C2.A02(r3)
            if (r0 == 0) goto L_0x00b8
            r6.A01 = r9
            r6.A02 = r11
            r6.A03 = r3
            r6.A00 = r5
            r2 = 0
            r1 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0101000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0101000_I2
            r0.<init>(r1, r2)
            java.lang.Object r0 = r9.AA6(r6, r0)
            if (r0 == r8) goto L_0x009e
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x009e:
            if (r0 != r8) goto L_0x0034
            return r8
        L_0x00a1:
            X.AnonymousClass0OU.A00(r1)
            X.Ew2 r3 = r6.getContext()
            goto L_0x0034
        L_0x00a9:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r6.<init>(r10)
            goto L_0x0015
        L_0x00b0:
            return r8
        L_0x00b1:
            kotlin.Unit r8 = kotlin.Unit.A00
            return r8
        L_0x00b4:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0a()
        L_0x00b8:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.A02(X.8py, X.8n9, X.0YP):java.lang.Object");
    }

    public static final Object A01(C147818py r4, C146958n9 r5, AnonymousClass0YP r6) {
        return C86164wN.A0U(r4.AA6(r5, new KtSLambdaShape7S0301000_I2(r6, r5.getContext(), (C146958n9) null, 0)));
    }
}
