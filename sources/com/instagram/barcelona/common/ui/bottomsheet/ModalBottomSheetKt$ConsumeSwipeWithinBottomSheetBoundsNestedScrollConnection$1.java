package com.instagram.barcelona.common.ui.bottomsheet;

import X.AnonymousClass7A5;
import X.AnonymousClass7KC;
import X.C146088lc;
import X.C147368pE;
import X.C86104wH;
import X.C86114wI;
import X.C967266l;
import com.facebook.react.uimanager.BaseViewManager;

public final class ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements C146088lc {
    public final /* synthetic */ AnonymousClass7A5 A00;
    public final /* synthetic */ C967266l A01;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object CBn(X.C146958n9 r6, long r7, long r9) {
        /*
            r5 = this;
            r3 = 0
            boolean r0 = r6 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0201100_I2
            if (r0 == 0) goto L_0x0045
            r4 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape0S0201100_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0201100_I2) r4
            int r0 = r4.A04
            if (r0 != r3) goto L_0x0045
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0045
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r4.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r2) goto L_0x004b
            long r9 = r4.A01
            X.AnonymousClass0OU.A00(r1)
        L_0x0027:
            X.7HA r0 = new X.7HA
            r0.<init>(r9)
            return r0
        L_0x002d:
            X.AnonymousClass0OU.A00(r1)
            X.7A5 r1 = r5.A00
            int r0 = X.C86104wH.A08(r9)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r4.A01 = r9
            r4.A00 = r2
            java.lang.Object r0 = r1.A03(r4, r0)
            if (r0 != r3) goto L_0x0027
            return r3
        L_0x0045:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0201100_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0201100_I2
            r4.<init>(r5, r6, r3)
            goto L_0x0017
        L_0x004b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.common.ui.bottomsheet.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.CBn(X.8n9, long, long):java.lang.Object");
    }

    public final long CBp(long j, long j2, int i) {
        if (i != 1) {
            return AnonymousClass7KC.A03;
        }
        AnonymousClass7A5 r1 = this.A00;
        C967266l r3 = this.A01;
        float A02 = r1.A02(AnonymousClass7KC.A02(j2));
        C147368pE r12 = r1.A06;
        float A002 = C86114wI.A00(r12);
        C147368pE.A02(r12, A02);
        float f = A02 - A002;
        if (r3 != C967266l.Vertical) {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object CBr(X.C146958n9 r8, long r9) {
        /*
            r7 = this;
            r6 = 1
            boolean r0 = r8 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0201100_I2
            if (r0 == 0) goto L_0x005e
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S0201100_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0201100_I2) r5
            int r0 = r5.A04
            if (r0 != r6) goto L_0x005e
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r5.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            if (r0 == 0) goto L_0x002c
            if (r0 != r6) goto L_0x0064
            long r9 = r5.A01
            X.AnonymousClass0OU.A00(r1)
        L_0x0026:
            X.7HA r0 = new X.7HA
            r0.<init>(r9)
            return r0
        L_0x002c:
            X.AnonymousClass0OU.A00(r1)
            int r0 = X.C86104wH.A08(r9)
            float r3 = java.lang.Float.intBitsToFloat(r0)
            X.7A5 r2 = r7.A00
            float r1 = r2.A01()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
            X.4oM r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x005b
            r5.A01 = r9
            r5.A00 = r6
            java.lang.Object r0 = r2.A03(r5, r3)
            if (r0 != r4) goto L_0x0026
            return r4
        L_0x005b:
            long r9 = X.AnonymousClass7HA.A01
            goto L_0x0026
        L_0x005e:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0201100_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0201100_I2
            r5.<init>(r7, r8, r6)
            goto L_0x0017
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.common.ui.bottomsheet.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.CBr(X.8n9, long):java.lang.Object");
    }

    public ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(C967266l r1, AnonymousClass7A5 r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public final long CBu(long j, int i) {
        C967266l r4 = this.A01;
        float A02 = AnonymousClass7KC.A02(j);
        if (A02 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || i != 1) {
            return AnonymousClass7KC.A03;
        }
        AnonymousClass7A5 r0 = this.A00;
        float A022 = r0.A02(A02);
        C147368pE r1 = r0.A06;
        float A002 = C86114wI.A00(r1);
        C147368pE.A02(r1, A022);
        float f = A022 - A002;
        if (r4 != C967266l.Vertical) {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f);
    }
}
