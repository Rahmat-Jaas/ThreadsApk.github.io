package androidx.compose.foundation.gestures.snapping;

public final class SnapFlingBehaviorKt {
    public static final float A00 = ((float) 400);

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C142638fL r15, X.AnonymousClass7WW r16, X.C142718fT r17, X.C146958n9 r18, X.AnonymousClass0YY r19, float r20, float r21) {
        /*
            r4 = r18
            r12 = r16
            r3 = r20
            boolean r0 = r4 instanceof X.C137788Ac
            if (r0 == 0) goto L_0x00c0
            r14 = r4
            X.8Ac r14 = (X.C137788Ac) r14
            int r2 = r14.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c0
            int r2 = r2 - r1
            r14.A02 = r2
        L_0x0018:
            java.lang.Object r1 = r14.A05
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r14.A02
            r5 = 1
            if (r0 == 0) goto L_0x007c
            if (r0 != r5) goto L_0x00c7
            float r2 = r14.A01
            float r3 = r14.A00
            java.lang.Object r9 = r14.A04
            X.0Ma r9 = (X.C04040Ma) r9
            java.lang.Object r12 = r14.A03
            X.7WW r12 = (X.AnonymousClass7WW) r12
            X.AnonymousClass0OU.A00(r1)
        L_0x0032:
            java.lang.Object r0 = r12.A01()
            float r1 = X.C18240wQ.A00(r0)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x006d
            r1 = 0
        L_0x0040:
            float r0 = r9.A00
            float r3 = r3 - r0
            java.lang.Float r2 = X.C86154wM.A0W(r3)
            X.8pE r0 = r12.A05
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            long r7 = r12.A01
            long r9 = r12.A00
            boolean r11 = r12.A03
            X.8cW r5 = r12.A04
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            X.52a r4 = new X.52a
            r4.<init>(r1)
            X.7WW r3 = new X.7WW
            r3.<init>(r4, r5, r6, r7, r9, r11)
            X.6fU r0 = new X.6fU
            r0.<init>(r3, r2)
            return r0
        L_0x006d:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0077
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0040
        L_0x0075:
            r1 = r2
            goto L_0x0040
        L_0x0077:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
            goto L_0x0075
        L_0x007c:
            X.AnonymousClass0OU.A00(r1)
            X.0Ma r9 = new X.0Ma
            r9.<init>()
            java.lang.Object r0 = r12.A01()
            float r2 = X.C18240wQ.A00(r0)
            java.lang.Float r13 = X.C86154wM.A0W(r3)
            java.lang.Object r0 = r12.A01()
            float r1 = X.C18240wQ.A00(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C18180wK.A1W(r0)
            r16 = r0 ^ 1
            r11 = 3
            kotlin.jvm.internal.KtLambdaShape0S0300001_I2 r6 = new kotlin.jvm.internal.KtLambdaShape0S0300001_I2
            r7 = r17
            r8 = r19
            r10 = r21
            r6.<init>((X.C142718fT) r7, (X.AnonymousClass0YY) r8, (X.C04040Ma) r9, (float) r10, (int) r11)
            r14.A03 = r12
            r14.A04 = r9
            r14.A00 = r3
            r14.A01 = r2
            r14.A02 = r5
            r11 = r15
            r15 = r6
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A03(r11, r12, r13, r14, r15, r16)
            if (r0 != r4) goto L_0x0032
            return r4
        L_0x00c0:
            X.8Ac r14 = new X.8Ac
            r14.<init>(r4)
            goto L_0x0018
        L_0x00c7:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A01(X.8fL, X.7WW, X.8fT, X.8n9, X.0YY, float, float):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.AnonymousClass7WW r11, X.AnonymousClass8cU r12, X.C142718fT r13, X.C146958n9 r14, X.AnonymousClass0YY r15, float r16) {
        /*
            r9 = r16
            r1 = 0
            boolean r0 = r14 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0301001_I2
            if (r0 == 0) goto L_0x006e
            r4 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301001_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0301001_I2) r4
            int r0 = r4.A05
            if (r0 != r1) goto L_0x006e
            int r2 = r4.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006e
            int r2 = r2 - r1
            r4.A01 = r2
        L_0x0019:
            java.lang.Object r1 = r4.A04
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A01
            r2 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r2) goto L_0x0074
            float r9 = r4.A00
            java.lang.Object r8 = r4.A03
            X.0Ma r8 = (X.C04040Ma) r8
            java.lang.Object r11 = r4.A02
            X.7WW r11 = (X.AnonymousClass7WW) r11
            X.AnonymousClass0OU.A00(r1)
        L_0x0031:
            float r0 = r8.A00
            float r9 = r9 - r0
            java.lang.Float r1 = X.C86154wM.A0W(r9)
            X.6fU r0 = new X.6fU
            r0.<init>(r11, r1)
            return r0
        L_0x003e:
            X.AnonymousClass0OU.A00(r1)
            X.0Ma r8 = new X.0Ma
            r8.<init>()
            java.lang.Object r0 = r11.A01()
            float r1 = X.C18240wQ.A00(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C18180wK.A1W(r0)
            r0 = r0 ^ 1
            r10 = 2
            kotlin.jvm.internal.KtLambdaShape0S0300001_I2 r5 = new kotlin.jvm.internal.KtLambdaShape0S0300001_I2
            r6 = r13
            r7 = r15
            r5.<init>((X.C142718fT) r6, (X.AnonymousClass0YY) r7, (X.C04040Ma) r8, (float) r9, (int) r10)
            r4.A02 = r11
            r4.A03 = r8
            r4.A00 = r9
            r4.A01 = r2
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A05(r11, r12, r4, r5, r0)
            if (r0 != r3) goto L_0x0031
            return r3
        L_0x006e:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301001_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0301001_I2
            r4.<init>(r14)
            goto L_0x0019
        L_0x0074:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A02(X.7WW, X.8cU, X.8fT, X.8n9, X.0YY, float):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.C142718fT r8, X.C142728fU r9, X.C145698kw r10, X.C147168nV r11, X.C146958n9 r12, X.AnonymousClass0YY r13, float r14, float r15) {
        /*
            r3 = 10
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r12)
            if (r0 == 0) goto L_0x0061
            r7 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r7.A03
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r7.A00
            r0 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 != r0) goto L_0x0067
            java.lang.Object r11 = r7.A02
            X.8nV r11 = (X.C147168nV) r11
            java.lang.Object r10 = r7.A01
            X.8kw r10 = (X.C145698kw) r10
            X.AnonymousClass0OU.A00(r3)
        L_0x002c:
            X.6fU r3 = (X.C106716fU) r3
            X.7WW r2 = r3.A00
            java.lang.Object r0 = r2.A01()
            float r0 = X.C18240wQ.A00(r0)
            float r0 = A00(r10, r11, r0)
            java.lang.Float r1 = X.C86154wM.A0W(r0)
            X.6fU r0 = new X.6fU
            r0.<init>(r2, r1)
            return r0
        L_0x0046:
            X.AnonymousClass0OU.A00(r3)
            java.lang.Float r5 = X.C86154wM.A0W(r14)
            java.lang.Float r6 = X.C86154wM.A0W(r15)
            r7.A01 = r10
            r7.A02 = r11
            r7.A00 = r0
            r4 = r8
            r3 = r9
            r8 = r13
            java.lang.Object r3 = r3.A97(r4, r5, r6, r7, r8)
            if (r3 != r2) goto L_0x002c
            return r2
        L_0x0061:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2
            r7.<init>(r3, r12)
            goto L_0x0016
        L_0x0067:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A03(X.8fT, X.8fU, X.8kw, X.8nV, X.8n9, X.0YY, float, float):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (java.lang.Math.abs(r3) <= java.lang.Math.abs(r4)) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float A00(X.C145698kw r3, X.C147168nV r4, float r5) {
        /*
            X.AnonymousClass0wJ.A1O(r3, r4)
            X.86X r0 = r3.ABg(r4)
            float r4 = r0.A01
            float r3 = r0.A00
            float r1 = java.lang.Math.signum(r5)
            r2 = 0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
            float r1 = java.lang.Math.abs(r3)
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0021
        L_0x0020:
            r4 = r3
        L_0x0021:
            r0 = 2139095040(0x7f800000, float:Infinity)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x002d
            r0 = -8388608(0xffffffffff800000, float:-Infinity)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x003b
        L_0x002d:
            return r2
        L_0x002e:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0020
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0021
            r4 = 0
        L_0x003b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A00(X.8kw, X.8nV, float):float");
    }
}
