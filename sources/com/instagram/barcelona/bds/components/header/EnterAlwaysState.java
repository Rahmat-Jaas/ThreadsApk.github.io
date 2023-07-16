package com.instagram.barcelona.bds.components.header;

import X.AnonymousClass6DW;
import X.AnonymousClass7WR;
import X.AnonymousClass7XH;
import X.AnonymousClass8bI;
import X.AnonymousClass8cU;
import X.C04220Ms;
import X.C122777Tu;
import X.C146088lc;
import X.C146958n9;
import X.C147368pE;
import X.C18240wQ;
import X.C86104wH;
import X.C86154wM;
import X.C86164wN;
import X.D0E;
import androidx.compose.animation.core.SuspendAnimationKt;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;

public final class EnterAlwaysState {
    public boolean A00;
    public final int A01;
    public final AnonymousClass8cU A02;
    public final C147368pE A03;
    public final C146088lc A04 = new AnonymousClass7XH(this);

    public EnterAlwaysState(AnonymousClass8cU r4, float f, int i, boolean z) {
        C04220Ms.A0B(r4, 3);
        this.A01 = i;
        this.A00 = z;
        this.A02 = r4;
        this.A03 = C86104wH.A0I(AnonymousClass7WR.A00, Float.valueOf(AnonymousClass8bI.A01(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i)), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public static final float A00(EnterAlwaysState enterAlwaysState) {
        return C18240wQ.A00(enterAlwaysState.A03.getValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ae, code lost:
        if (androidx.compose.animation.core.SuspendAnimationKt.A03(r9, r10, r11, r12, r13, false) == r4) goto L_0x00b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass8cU r16, X.C146958n9 r17, float r18) {
        /*
            r15 = this;
            r3 = 23
            r4 = r17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r4)
            if (r0 == 0) goto L_0x00b1
            r12 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r12 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b1
            int r2 = r2 - r1
            r12.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r12.A03
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r12.A00
            r8 = 1
            r3 = 0
            r5 = 2
            if (r0 == 0) goto L_0x0046
            if (r0 == r8) goto L_0x003a
            if (r0 != r5) goto L_0x00b8
            java.lang.Object r2 = r12.A01
            X.0Ma r2 = (X.C04040Ma) r2
            X.AnonymousClass0OU.A00(r1)
        L_0x002e:
            float r0 = r2.A00
            long r1 = X.C86104wH.A0C(r3, r0)
            X.7HA r0 = new X.7HA
            r0.<init>(r1)
            return r0
        L_0x003a:
            java.lang.Object r2 = r12.A02
            X.0Ma r2 = (X.C04040Ma) r2
            java.lang.Object r6 = r12.A01
            com.instagram.barcelona.bds.components.header.EnterAlwaysState r6 = (com.instagram.barcelona.bds.components.header.EnterAlwaysState) r6
            X.AnonymousClass0OU.A00(r1)
            goto L_0x0070
        L_0x0046:
            X.AnonymousClass0OU.A00(r1)
            X.0Ma r2 = new X.0Ma
            r2.<init>()
            r1 = r18
            r2.A00 = r1
            X.0Ma r7 = new X.0Ma
            r7.<init>()
            r6 = 0
            r0 = 28
            X.7WW r1 = X.AnonymousClass6DW.A00(r3, r1, r0)
            r0 = 35
            kotlin.jvm.internal.KtLambdaShape10S0300000_I2 r0 = X.C86154wM.A0y(r7, r15, r2, r0)
            X.C86124wJ.A1S(r15, r2, r12, r8)
            r7 = r16
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A05(r1, r7, r12, r0, r6)
            if (r0 == r4) goto L_0x00b0
            r6 = r15
        L_0x0070:
            float r0 = A00(r6)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
            float r0 = A00(r6)
            int r9 = r6.A01
            float r8 = (float) r9
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
            float r7 = A00(r6)
            r14 = 0
            r0 = 30
            r1 = 0
            X.7WW r10 = X.AnonymousClass6DW.A00(r7, r3, r0)
            float r7 = A00(r6)
            int r0 = r9 >> 1
            float r0 = (float) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x009b
            r8 = 0
        L_0x009b:
            java.lang.Float r11 = X.C86154wM.A0W(r8)
            X.7Tr r9 = X.AnonymousClass7CW.A00
            r0 = 45
            kotlin.jvm.internal.KtLambdaShape150S0100000_I2_5 r13 = X.C86164wN.A0s(r6, r0)
            X.C86124wJ.A1S(r2, r1, r12, r5)
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A03(r9, r10, r11, r12, r13, r14)
            if (r0 != r4) goto L_0x002e
        L_0x00b0:
            return r4
        L_0x00b1:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r12 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r12.<init>(r15, r4, r3)
            goto L_0x0018
        L_0x00b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.bds.components.header.EnterAlwaysState.A02(X.8cU, X.8n9, float):java.lang.Object");
    }

    public final float A01(float f) {
        float A002 = A00(this);
        C147368pE.A02(this.A03, AnonymousClass8bI.A01(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A01));
        return A002 - A00(this);
    }

    public final Object A03(C146958n9 r8, float f) {
        Object A032 = SuspendAnimationKt.A03(C122777Tu.A00((Object) null), AnonymousClass6DW.A00(A00(this), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 30), C86154wM.A0W(f), r8, C86164wN.A0s(this, 44), false);
        if (A032 != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return A032;
    }
}
