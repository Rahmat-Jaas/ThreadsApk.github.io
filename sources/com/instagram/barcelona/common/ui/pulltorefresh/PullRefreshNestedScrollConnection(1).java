package com.instagram.barcelona.common.ui.pulltorefresh;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass7HA;
import X.AnonymousClass7KC;
import X.C146088lc;
import X.C146958n9;
import X.C18240wQ;
import X.C86104wH;
import X.C86164wN;
import com.facebook.react.uimanager.BaseViewManager;

public final class PullRefreshNestedScrollConnection implements C146088lc {
    public final AnonymousClass0YY A00;
    public final AnonymousClass0YP A01;

    public final long CBp(long j, long j2, int i) {
        if (i != 1 || AnonymousClass7KC.A02(j2) <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return AnonymousClass7KC.A03;
        }
        return C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, C18240wQ.A00(C86164wN.A0d(this.A00, AnonymousClass7KC.A02(j2))));
    }

    public final long CBu(long j, int i) {
        if (i != 1 || AnonymousClass7KC.A02(j) >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return AnonymousClass7KC.A03;
        }
        return C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, C18240wQ.A00(C86164wN.A0d(this.A00, AnonymousClass7KC.A02(j))));
    }

    public final /* synthetic */ Object CBn(C146958n9 r4, long j, long j2) {
        return new AnonymousClass7HA(AnonymousClass7HA.A01);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object CBr(X.C146958n9 r6, long r7) {
        /*
            r5 = this;
            r3 = 17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r3, r6)
            if (r0 == 0) goto L_0x0046
            r4 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0046
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r2) goto L_0x004b
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            long r0 = X.AnonymousClass7HA.A01
            X.7HA r3 = new X.7HA
            r3.<init>(r0)
            return r3
        L_0x002c:
            X.AnonymousClass0OU.A00(r1)
            X.0YP r1 = r5.A01
            int r0 = X.C86104wH.A08(r7)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = X.C86154wM.A0W(r0)
            r4.A00 = r2
            java.lang.Object r0 = r1.invoke(r0, r4)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x0046:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r4 = X.C18240wQ.A0m(r5, r6, r3)
            goto L_0x0016
        L_0x004b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.common.ui.pulltorefresh.PullRefreshNestedScrollConnection.CBr(X.8n9, long):java.lang.Object");
    }

    public PullRefreshNestedScrollConnection(AnonymousClass0YY r1, AnonymousClass0YP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
