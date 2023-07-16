package androidx.compose.foundation.pager;

import X.C142708fS;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;

public final class PagerWrapperFlingBehavior implements C142708fS {
    public final PagerState A00;
    public final SnapFlingBehavior A01;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object CWZ(X.C142718fT r6, X.C146958n9 r7, float r8) {
        /*
            r5 = this;
            r3 = 7
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r7)
            if (r0 == 0) goto L_0x0040
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0040
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A01
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r2) goto L_0x0045
            X.AnonymousClass0OU.A00(r1)
        L_0x0023:
            float r0 = X.C18240wQ.A00(r1)
            java.lang.Float r0 = X.C86154wM.A0W(r0)
            return r0
        L_0x002c:
            X.AnonymousClass0OU.A00(r1)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r1 = r5.A01
            r0 = 8
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r0 = X.C86154wM.A0z(r5, r0)
            r4.A00 = r2
            java.lang.Object r1 = r1.A02(r6, r4, r0, r8)
            if (r1 != r3) goto L_0x0023
            return r3
        L_0x0040:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = X.C86114wI.A0x(r5, r7, r3)
            goto L_0x0015
        L_0x0045:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerWrapperFlingBehavior.CWZ(X.8fT, X.8n9, float):java.lang.Object");
    }

    public PagerWrapperFlingBehavior(SnapFlingBehavior snapFlingBehavior, PagerState pagerState) {
        this.A01 = snapFlingBehavior;
        this.A00 = pagerState;
    }
}
