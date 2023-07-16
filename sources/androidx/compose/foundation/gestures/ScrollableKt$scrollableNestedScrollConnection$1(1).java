package androidx.compose.foundation.gestures;

import X.AnonymousClass7HA;
import X.AnonymousClass7KC;
import X.C146088lc;
import X.C146258lv;
import X.C146958n9;
import X.C147368pE;
import X.C81784oM;
import X.C967266l;

public final class ScrollableKt$scrollableNestedScrollConnection$1 implements C146088lc {
    public final /* synthetic */ C81784oM A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object CBn(X.C146958n9 r6, long r7, long r9) {
        /*
            r5 = this;
            r4 = 1
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2.A00(r4, r6)
            if (r0 == 0) goto L_0x0066
            r3 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0066
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r3.A03
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            if (r0 == 0) goto L_0x0044
            if (r0 != r4) goto L_0x006c
            long r9 = r3.A01
            java.lang.Object r3 = r3.A02
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1) r3
            X.AnonymousClass0OU.A00(r2)
        L_0x0028:
            X.7HA r2 = (X.AnonymousClass7HA) r2
            long r0 = r2.A00
            long r0 = X.AnonymousClass7HA.A00(r9, r0)
        L_0x0030:
            X.7HA r2 = new X.7HA
            r2.<init>(r0)
            X.4oM r0 = r3.A00
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = (androidx.compose.foundation.gestures.ScrollingLogic) r0
            r1 = 0
            X.8pE r0 = r0.A04
            X.C147368pE.A04(r0, r1)
            return r2
        L_0x0044:
            X.AnonymousClass0OU.A00(r2)
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0062
            X.4oM r0 = r5.A00
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = (androidx.compose.foundation.gestures.ScrollingLogic) r0
            r3.A02 = r5
            r3.A01 = r9
            r3.A00 = r4
            java.lang.Object r2 = r0.A02(r3, r9)
            if (r2 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r3 = r5
            goto L_0x0028
        L_0x0062:
            long r0 = X.AnonymousClass7HA.A01
            r3 = r5
            goto L_0x0030
        L_0x0066:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2
            r3.<init>(r5, r6, r4)
            goto L_0x0015
        L_0x006c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1.CBn(X.8n9, long, long):java.lang.Object");
    }

    public final long CBu(long j, int i) {
        if (i == 2) {
            C147368pE.A04(((ScrollingLogic) this.A00.getValue()).A04, true);
        }
        return AnonymousClass7KC.A03;
    }

    public ScrollableKt$scrollableNestedScrollConnection$1(C81784oM r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final long CBp(long j, long j2, int i) {
        float A02;
        if (this.A01) {
            ScrollingLogic scrollingLogic = (ScrollingLogic) this.A00.getValue();
            C146258lv r3 = scrollingLogic.A03;
            if (!r3.BY9()) {
                if (scrollingLogic.A02 == C967266l.Horizontal) {
                    A02 = AnonymousClass7KC.A01(j2);
                } else {
                    A02 = AnonymousClass7KC.A02(j2);
                }
                boolean z = scrollingLogic.A06;
                if (z) {
                    A02 *= (float) -1;
                }
                float AII = r3.AII(A02);
                if (z) {
                    AII *= (float) -1;
                }
                return scrollingLogic.A00(AII);
            }
        }
        return AnonymousClass7KC.A03;
    }

    public final /* synthetic */ Object CBr(C146958n9 r4, long j) {
        return new AnonymousClass7HA(AnonymousClass7HA.A01);
    }
}
