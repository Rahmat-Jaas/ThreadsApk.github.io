package androidx.compose.foundation.gestures;

import X.AnonymousClass7UT;
import X.AnonymousClass7UU;
import X.C109656kM;
import X.C121197Es;
import X.C145688kv;
import java.util.List;

public final class DragGestureDetectorKt {
    public static final float A00 = (((float) 0.125d) / ((float) 18));
    public static final C145688kv A01 = new AnonymousClass7UT();
    public static final C145688kv A02 = new AnonymousClass7UU();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (X.AnonymousClass7KC.A04(r8.A05, r8.A06) == X.AnonymousClass7KC.A03) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0047 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C147828pz r14, X.C146958n9 r15, long r16) {
        /*
            r6 = 1
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r6, r15)
            if (r0 == 0) goto L_0x00a8
            r5 = r15
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a8
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A03
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r13 = 0
            if (r0 == 0) goto L_0x0076
            if (r0 != r6) goto L_0x00af
            java.lang.Object r7 = r5.A02
            X.0MQ r7 = (X.AnonymousClass0MQ) r7
            java.lang.Object r0 = r5.A01
            X.8pz r14 = X.C86164wN.A0H(r0, r1)
        L_0x002a:
            X.6kM r1 = (X.C109656kM) r1
            java.util.List r9 = r1.A03
            int r12 = r9.size()
            r11 = 0
        L_0x0033:
            if (r11 >= r12) goto L_0x0047
            java.lang.Object r8 = r9.get(r11)
            r0 = r8
            X.7Es r0 = (X.C121197Es) r0
            long r2 = r0.A04
            long r0 = r7.A00
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0048
            int r11 = r11 + 1
            goto L_0x0033
        L_0x0047:
            r8 = r13
        L_0x0048:
            X.7Es r8 = (X.C121197Es) r8
            if (r8 == 0) goto L_0x00bb
            boolean r0 = X.C121667Hg.A02(r8)
            if (r0 == 0) goto L_0x0067
            int r3 = r9.size()
            r2 = 0
        L_0x0057:
            if (r2 >= r3) goto L_0x0090
            java.lang.Object r1 = r9.get(r2)
            r0 = r1
            X.7Es r0 = (X.C121197Es) r0
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x0091
            int r2 = r2 + 1
            goto L_0x0057
        L_0x0067:
            long r2 = r8.A06
            long r0 = r8.A05
            long r9 = X.AnonymousClass7KC.A04(r0, r2)
            long r1 = X.AnonymousClass7KC.A03
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b4
            goto L_0x0099
        L_0x0076:
            X.AnonymousClass0OU.A00(r1)
            r0 = r14
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r0
            X.54D r0 = r0.A04
            X.6kM r0 = r0.A01
            r1 = r16
            boolean r0 = A05(r0, r1)
            if (r0 != 0) goto L_0x00bb
            X.0MQ r7 = new X.0MQ
            r7.<init>()
            r7.A00 = r1
            goto L_0x0099
        L_0x0090:
            r1 = r13
        L_0x0091:
            X.7Es r1 = (X.C121197Es) r1
            if (r1 == 0) goto L_0x00b4
            long r0 = r1.A04
            r7.A00 = r0
        L_0x0099:
            r5.A01 = r14
            r5.A02 = r7
            r5.A00 = r6
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r1 = r14.AA5(r0, r5)
            if (r1 != r4) goto L_0x002a
            return r4
        L_0x00a8:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2
            r5.<init>(r6, r15)
            goto L_0x0015
        L_0x00af:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00b4:
            boolean r0 = r8.A02()
            if (r0 != 0) goto L_0x00bb
            return r8
        L_0x00bb:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A00(X.8pz, X.8n9, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C147828pz r12, X.C146958n9 r13, long r14) {
        /*
            r3 = 2
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r13)
            if (r0 == 0) goto L_0x0028
            r7 = r13
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r7.A03
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r7.A00
            r8 = 1
            r0 = 0
            if (r1 == 0) goto L_0x0037
            if (r1 != r8) goto L_0x0032
            java.lang.Object r9 = r7.A02
            X.0MJ r9 = (X.AnonymousClass0MJ) r9
            java.lang.Object r5 = r7.A01
            goto L_0x002e
        L_0x0028:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2
            r7.<init>(r3, r13)
            goto L_0x0015
        L_0x002e:
            X.AnonymousClass0OU.A00(r2)     // Catch:{ 89x -> 0x008b }
            return r0
        L_0x0032:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0037:
            X.AnonymousClass0OU.A00(r2)
            r1 = r12
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r1 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r1
            X.54D r10 = r1.A04
            X.6kM r1 = r10.A01
            boolean r1 = A05(r1, r14)
            if (r1 != 0) goto L_0x0090
            X.6kM r1 = r10.A01
            java.util.List r11 = r1.A03
            r9 = 0
            int r4 = r11.size()
        L_0x0050:
            if (r9 >= r4) goto L_0x0066
            java.lang.Object r5 = r11.get(r9)
            r1 = r5
            X.7Es r1 = (X.C121197Es) r1
            long r1 = r1.A04
            int r3 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            boolean r1 = X.C18180wK.A1W(r3)
            if (r1 != 0) goto L_0x0067
            int r9 = r9 + 1
            goto L_0x0050
        L_0x0066:
            r5 = r0
        L_0x0067:
            if (r5 == 0) goto L_0x0090
            X.0MJ r9 = X.C86144wL.A17()
            X.0MJ r4 = X.C86144wL.A17()
            r4.A00 = r5
            X.8lf r1 = r10.A05
            long r2 = r1.At7()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch:{ 89x -> 0x008b }
            r1.<init>(r0, r4, r9)     // Catch:{ 89x -> 0x008b }
            r7.A01 = r5     // Catch:{ 89x -> 0x008b }
            r7.A02 = r9     // Catch:{ 89x -> 0x008b }
            r7.A00 = r8     // Catch:{ 89x -> 0x008b }
            java.lang.Object r1 = r12.DBE(r7, r1, r2)     // Catch:{ 89x -> 0x008b }
            if (r1 != r6) goto L_0x0090
            return r6
        L_0x008b:
            java.lang.Object r0 = r9.A00
            if (r0 != 0) goto L_0x0090
            return r5
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A01(X.8pz, X.8n9, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C147828pz r5, X.C146958n9 r6, X.AnonymousClass0YY r7, long r8) {
        /*
            r3 = 3
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r6)
            if (r0 == 0) goto L_0x0050
            r4 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0050
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A03
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r1) goto L_0x0056
            java.lang.Object r7 = r4.A02
            X.0YY r7 = (X.AnonymousClass0YY) r7
            java.lang.Object r0 = r4.A01
            X.8pz r5 = X.C86164wN.A0H(r0, r3)
        L_0x002a:
            X.7Es r3 = (X.C121197Es) r3
            if (r3 != 0) goto L_0x0034
            r1 = 0
        L_0x002f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        L_0x0034:
            boolean r0 = X.C121667Hg.A02(r3)
            if (r0 != 0) goto L_0x002f
            r7.invoke(r3)
            long r8 = r3.A04
            goto L_0x0043
        L_0x0040:
            X.AnonymousClass0OU.A00(r3)
        L_0x0043:
            r4.A01 = r5
            r4.A02 = r7
            r4.A00 = r1
            java.lang.Object r3 = A00(r5, r4, r8)
            if (r3 != r2) goto L_0x002a
            return r2
        L_0x0050:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2
            r4.<init>(r3, r6)
            goto L_0x0015
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(X.8pz, X.8n9, X.0YY, long):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        if (X.AnonymousClass7KC.A02(X.AnonymousClass7KC.A04(r10.A05, r10.A06)) == com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (A05(((androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r15).A04.A01, r0) != false) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0055 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.C147828pz r15, X.C146958n9 r16, X.AnonymousClass0YY r17, long r18) {
        /*
            r0 = r18
            r4 = r17
            r7 = 1
            r8 = r16
            boolean r2 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r7, r8)
            if (r2 == 0) goto L_0x00d5
            r6 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r6
            int r5 = r6.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r5 & r3
            if (r2 == 0) goto L_0x00d5
            int r5 = r5 - r3
            r6.A00 = r5
        L_0x001b:
            java.lang.Object r3 = r6.A05
            X.D0E r9 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r6.A00
            if (r2 == 0) goto L_0x0087
            if (r2 != r7) goto L_0x00dc
            java.lang.Object r5 = r6.A04
            X.0MQ r5 = (X.AnonymousClass0MQ) r5
            java.lang.Object r8 = r6.A03
            X.8pz r8 = (X.C147828pz) r8
            java.lang.Object r15 = r6.A02
            X.8pz r15 = (X.C147828pz) r15
            java.lang.Object r4 = r6.A01
            X.0YY r4 = (X.AnonymousClass0YY) r4
            X.AnonymousClass0OU.A00(r3)
        L_0x0038:
            X.6kM r3 = (X.C109656kM) r3
            java.util.List r11 = r3.A03
            int r14 = r11.size()
            r13 = 0
        L_0x0041:
            if (r13 >= r14) goto L_0x0055
            java.lang.Object r10 = r11.get(r13)
            r0 = r10
            X.7Es r0 = (X.C121197Es) r0
            long r2 = r0.A04
            long r0 = r5.A00
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 == 0) goto L_0x0056
            int r13 = r13 + 1
            goto L_0x0041
        L_0x0055:
            r10 = 0
        L_0x0056:
            X.7Es r10 = (X.C121197Es) r10
            if (r10 == 0) goto L_0x0097
            boolean r0 = X.C121667Hg.A02(r10)
            if (r0 == 0) goto L_0x0075
            int r3 = r11.size()
            r2 = 0
        L_0x0065:
            if (r2 >= r3) goto L_0x00ab
            java.lang.Object r1 = r11.get(r2)
            r0 = r1
            X.7Es r0 = (X.C121197Es) r0
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x00ac
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0075:
            long r2 = r10.A06
            long r0 = r10.A05
            long r0 = X.AnonymousClass7KC.A04(r0, r2)
            float r1 = X.AnonymousClass7KC.A02(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00c7
            goto L_0x00b4
        L_0x0087:
            X.AnonymousClass0OU.A00(r3)
            r2 = r15
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r2 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r2
            X.54D r2 = r2.A04
            X.6kM r2 = r2.A01
            boolean r2 = A05(r2, r0)
            if (r2 == 0) goto L_0x00a2
        L_0x0097:
            r0 = 0
        L_0x0098:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x009d:
            r4.invoke(r10)
            long r0 = r10.A04
        L_0x00a2:
            X.0MQ r5 = new X.0MQ
            r5.<init>()
            r5.A00 = r0
            r8 = r15
            goto L_0x00b4
        L_0x00ab:
            r1 = 0
        L_0x00ac:
            X.7Es r1 = (X.C121197Es) r1
            if (r1 == 0) goto L_0x00c7
            long r0 = r1.A04
            r5.A00 = r0
        L_0x00b4:
            r6.A01 = r4
            r6.A02 = r15
            r6.A03 = r8
            r6.A04 = r5
            r6.A00 = r7
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r3 = r8.AA5(r0, r6)
            if (r3 != r9) goto L_0x0038
            return r9
        L_0x00c7:
            boolean r0 = r10.A02()
            if (r0 != 0) goto L_0x0097
            boolean r0 = X.C121667Hg.A02(r10)
            if (r0 == 0) goto L_0x009d
            r0 = 1
            goto L_0x0098
        L_0x00d5:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r6.<init>(r7, r8)
            goto L_0x001b
        L_0x00dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A03(X.8pz, X.8n9, X.0YY, long):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        if (r2.A02() == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
        if (r1 != r21) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(X.C147828pz r19, X.C146958n9 r20, X.AnonymousClass0YP r21, int r22, long r23) {
        /*
            r5 = r20
            r3 = r21
            r4 = r19
            boolean r0 = r5 instanceof X.C137858Ao
            if (r0 == 0) goto L_0x0187
            r9 = r5
            X.8Ao r9 = (X.C137858Ao) r9
            int r2 = r9.A04
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0187
            int r2 = r2 - r1
            r9.A04 = r2
        L_0x0018:
            java.lang.Object r1 = r9.A0A
            X.D0E r21 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r9.A04
            r14 = 2
            r20 = 1
            r19 = 0
            if (r2 == 0) goto L_0x0051
            r0 = r20
            if (r2 == r0) goto L_0x00a3
            if (r2 != r14) goto L_0x018e
            float r8 = r9.A02
            float r11 = r9.A01
            float r7 = r9.A00
            int r10 = r9.A03
            java.lang.Object r2 = r9.A09
            X.7Es r2 = (X.C121197Es) r2
            java.lang.Object r5 = r9.A08
            X.0MQ r5 = (X.AnonymousClass0MQ) r5
            java.lang.Object r4 = r9.A07
            X.8pz r4 = (X.C147828pz) r4
            java.lang.Object r6 = r9.A06
            X.8kv r6 = (X.C145688kv) r6
            java.lang.Object r3 = r9.A05
            X.0YP r3 = (X.AnonymousClass0YP) r3
            X.AnonymousClass0OU.A00(r1)
        L_0x004a:
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0080
        L_0x0050:
            return r19
        L_0x0051:
            X.AnonymousClass0OU.A00(r1)
            X.8kv r6 = A02
            r0 = r4
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r0
            X.54D r5 = r0.A04
            X.6kM r2 = r5.A01
            r0 = r23
            boolean r2 = A05(r2, r0)
            if (r2 != 0) goto L_0x0050
            X.8lf r5 = r5.A05
            r2 = r22
            boolean r2 = X.AnonymousClass0wJ.A1T(r2, r14)
            float r7 = r5.BHh()
            if (r2 == 0) goto L_0x0076
            float r2 = A00
            float r7 = r7 * r2
        L_0x0076:
            X.0MQ r5 = new X.0MQ
            r5.<init>()
            r5.A00 = r0
            r10 = 1
            r11 = 0
            r8 = 0
        L_0x0080:
            r9.A05 = r3
            r9.A06 = r6
            r9.A07 = r4
            r9.A08 = r5
            r0 = r19
            r9.A09 = r0
            r9.A03 = r10
            r9.A00 = r7
            r9.A01 = r11
            r9.A02 = r8
            r0 = r20
            r9.A04 = r0
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r1 = r4.AA5(r0, r9)
            r0 = r21
            if (r1 != r0) goto L_0x00be
        L_0x00a2:
            return r21
        L_0x00a3:
            float r8 = r9.A02
            float r11 = r9.A01
            float r7 = r9.A00
            int r10 = r9.A03
            java.lang.Object r5 = r9.A08
            X.0MQ r5 = (X.AnonymousClass0MQ) r5
            java.lang.Object r4 = r9.A07
            X.8pz r4 = (X.C147828pz) r4
            java.lang.Object r6 = r9.A06
            X.8kv r6 = (X.C145688kv) r6
            java.lang.Object r3 = r9.A05
            X.0YP r3 = (X.AnonymousClass0YP) r3
            X.AnonymousClass0OU.A00(r1)
        L_0x00be:
            X.6kM r1 = (X.C109656kM) r1
            java.util.List r13 = r1.A03
            int r18 = r13.size()
            r12 = 0
        L_0x00c7:
            r0 = r18
            if (r12 >= r0) goto L_0x00df
            java.lang.Object r2 = r13.get(r12)
            r0 = r2
            X.7Es r0 = (X.C121197Es) r0
            long r0 = r0.A04
            r16 = r0
            long r0 = r5.A00
            int r15 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r15 == 0) goto L_0x00e0
            int r12 = r12 + 1
            goto L_0x00c7
        L_0x00df:
            r2 = 0
        L_0x00e0:
            X.7Es r2 = (X.C121197Es) r2
            if (r2 == 0) goto L_0x0050
            boolean r0 = r2.A02()
            if (r0 != 0) goto L_0x0050
            boolean r0 = X.C121667Hg.A02(r2)
            if (r0 == 0) goto L_0x0110
            int r12 = r13.size()
            r2 = 0
        L_0x00f5:
            if (r2 >= r12) goto L_0x0105
            java.lang.Object r1 = r13.get(r2)
            r0 = r1
            X.7Es r0 = (X.C121197Es) r0
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x0106
            int r2 = r2 + 1
            goto L_0x00f5
        L_0x0105:
            r1 = 0
        L_0x0106:
            X.7Es r1 = (X.C121197Es) r1
            if (r1 == 0) goto L_0x0050
            long r0 = r1.A04
            r5.A00 = r0
            goto L_0x0080
        L_0x0110:
            long r0 = r2.A05
            r16 = r0
            long r12 = r2.A06
            float r15 = r6.BeQ(r0)
            float r0 = r6.BeQ(r12)
            float r15 = r15 - r0
            r0 = r16
            float r1 = r6.AGj(r0)
            float r0 = r6.AGj(r12)
            float r1 = r1 - r0
            float r15 = r15 + r11
            float r8 = r8 + r1
            if (r10 == 0) goto L_0x0157
            float r1 = java.lang.Math.abs(r15)
        L_0x0132:
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0160
            X.67C r0 = X.AnonymousClass67C.Final
            r9.A05 = r3
            r9.A06 = r6
            r9.A07 = r4
            r9.A08 = r5
            r9.A09 = r2
            r9.A03 = r10
            r9.A00 = r7
            r9.A01 = r15
            r9.A02 = r8
            r9.A04 = r14
            java.lang.Object r1 = r4.AA5(r0, r9)
            r0 = r21
            if (r1 == r0) goto L_0x00a2
            r11 = r15
            goto L_0x004a
        L_0x0157:
            long r0 = r6.Biq(r15, r8)
            float r1 = X.AnonymousClass7KC.A00(r0)
            goto L_0x0132
        L_0x0160:
            if (r10 == 0) goto L_0x017e
            float r0 = java.lang.Math.signum(r15)
            float r0 = r0 * r7
            float r15 = r15 - r0
            long r0 = r6.Biq(r15, r8)
        L_0x016c:
            float r0 = X.AnonymousClass7KC.A02(r0)
            java.lang.Float r0 = X.C86154wM.A0W(r0)
            r3.invoke(r2, r0)
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0183
            return r2
        L_0x017e:
            long r0 = X.AnonymousClass7FN.A01(r6, r15, r8, r1, r7)
            goto L_0x016c
        L_0x0183:
            r8 = 0
            r11 = 0
            goto L_0x0080
        L_0x0187:
            X.8Ao r9 = new X.8Ao
            r9.<init>(r5)
            goto L_0x0018
        L_0x018e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A04(X.8pz, X.8n9, X.0YP, int, long):java.lang.Object");
    }

    public static final boolean A05(C109656kM r7, long j) {
        Object obj;
        List list = r7.A03;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((C121197Es) obj).A04 == j) {
                break;
            }
            i++;
        }
        C121197Es r3 = (C121197Es) obj;
        if (r3 != null && r3.A0A) {
            z = true;
        }
        return !z;
    }
}
