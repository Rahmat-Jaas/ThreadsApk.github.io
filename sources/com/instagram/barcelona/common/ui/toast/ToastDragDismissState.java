package com.instagram.barcelona.common.ui.toast;

import X.AnonymousClass7UO;
import X.AnonymousClass7WR;
import X.C04220Ms;
import X.C123267Wf;
import X.C142698fR;
import X.C147168nV;
import X.C147368pE;
import X.C81784oM;
import X.C86104wH;
import X.C86124wJ;
import kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6;
import kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11;

public final class ToastDragDismissState {
    public final float A00;
    public final C142698fR A01 = new AnonymousClass7UO(new KtLambdaShape151S0100000_I2_6(this, 8));
    public final C142698fR A02 = new AnonymousClass7UO(new KtLambdaShape151S0100000_I2_6(this, 9));
    public final C147368pE A03;
    public final C147368pE A04;
    public final C81784oM A05 = C123267Wf.A01(new KtLambdaShape31S0100000_I2_11(this, 42));
    public final C81784oM A06 = C123267Wf.A01(new KtLambdaShape31S0100000_I2_11(this, 43));
    public final float A07;
    public final C81784oM A08;
    public final C81784oM A09;
    public final C147168nV A0A;

    public ToastDragDismissState(C81784oM r5, C81784oM r6, C147168nV r7) {
        C04220Ms.A0B(r7, 1);
        this.A0A = r7;
        this.A08 = r5;
        this.A09 = r6;
        this.A07 = r7.CxL((float) 100);
        this.A00 = r7.CxL((float) 300);
        Float A0g = C86124wJ.A0g();
        AnonymousClass7WR r2 = AnonymousClass7WR.A00;
        this.A03 = C86104wH.A0I(r2, A0g, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A04 = C86104wH.A0I(r2, A0g, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C147368pE r15, X.C146958n9 r16, float r17) {
        /*
            r14 = this;
            r5 = 1
            r3 = r16
            boolean r0 = r3 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0301001_I2
            if (r0 == 0) goto L_0x00a5
            r11 = r3
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301001_I2 r11 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0301001_I2) r11
            int r0 = r11.A05
            if (r0 != r5) goto L_0x00a5
            int r2 = r11.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a5
            int r2 = r2 - r1
            r11.A01 = r2
        L_0x0019:
            java.lang.Object r4 = r11.A03
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r11.A01
            r7 = 0
            if (r0 == 0) goto L_0x003d
            if (r0 != r5) goto L_0x00ac
            float r2 = r11.A00
            java.lang.Object r1 = r11.A02
            com.instagram.barcelona.common.ui.toast.ToastDragDismissState r1 = (com.instagram.barcelona.common.ui.toast.ToastDragDismissState) r1
            X.AnonymousClass0OU.A00(r4)
        L_0x002d:
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x003a
            X.4oM r0 = r1.A09
            java.lang.Object r0 = r0.getValue()
            X.C18240wQ.A1G(r0)
        L_0x003a:
            kotlin.Unit r3 = kotlin.Unit.A00
        L_0x003c:
            return r3
        L_0x003d:
            X.AnonymousClass0OU.A00(r4)
            X.8nV r1 = r14.A0A
            X.7Tx r0 = new X.7Tx
            r0.<init>(r1)
            X.7To r1 = new X.7To
            r1.<init>(r0)
            java.lang.Object r0 = r15.getValue()
            float r0 = X.C18240wQ.A00(r0)
            r6 = r17
            float r2 = X.AnonymousClass6DY.A00(r1, r0, r6)
            float r1 = java.lang.Math.abs(r2)
            float r0 = r14.A07
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00a3
            float r0 = r14.A00
            float r2 = java.lang.Math.copySign(r0, r2)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            X.4oM r0 = r14.A08
            java.lang.Object r0 = r0.getValue()
            X.C18240wQ.A1G(r0)
        L_0x0077:
            java.lang.Object r0 = r15.getValue()
            float r4 = X.C18240wQ.A00(r0)
            r13 = 0
            r0 = 28
            r1 = 0
            X.7WW r9 = X.AnonymousClass6DW.A00(r4, r6, r0)
            java.lang.Float r10 = X.C86154wM.A0W(r2)
            r0 = 7
            kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6 r12 = new kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6
            r12.<init>(r15, r0)
            r11.A02 = r14
            r11.A00 = r2
            r11.A01 = r5
            X.7Tu r8 = X.C122777Tu.A00(r1)
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A03(r8, r9, r10, r11, r12, r13)
            if (r0 == r3) goto L_0x003c
            r1 = r14
            goto L_0x002d
        L_0x00a3:
            r2 = 0
            goto L_0x0077
        L_0x00a5:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301001_I2 r11 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0301001_I2
            r11.<init>(r14, r3)
            goto L_0x0019
        L_0x00ac:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.common.ui.toast.ToastDragDismissState.A00(X.8pE, X.8n9, float):java.lang.Object");
    }
}
