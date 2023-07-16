package androidx.compose.material.ripple;

import X.AnonymousClass6DU;
import X.AnonymousClass7JH;
import X.AnonymousClass7KC;
import X.AnonymousClass7WR;
import X.C147368pE;
import X.C18180wK;
import X.C27438EnU;
import X.C86034wA;
import X.C86104wH;
import com.facebook.react.uimanager.BaseViewManager;

public final class RippleAnimation {
    public AnonymousClass7KC A00;
    public AnonymousClass7KC A01;
    public Float A02;
    public Float A03;
    public final float A04;
    public final AnonymousClass7JH A05 = AnonymousClass6DU.A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public final AnonymousClass7JH A06 = AnonymousClass6DU.A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public final AnonymousClass7JH A07 = AnonymousClass6DU.A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public final C147368pE A08;
    public final C147368pE A09;
    public final C86034wA A0A = new C27438EnU();
    public final boolean A0B;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146958n9 r9) {
        /*
            r8 = this;
            r3 = 13
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r9)
            if (r0 == 0) goto L_0x0071
            r7 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 == r3) goto L_0x0042
            if (r0 == r4) goto L_0x005b
            if (r0 != r5) goto L_0x0076
            X.AnonymousClass0OU.A00(r1)
        L_0x002a:
            kotlin.Unit r6 = kotlin.Unit.A00
        L_0x002c:
            return r6
        L_0x002d:
            X.AnonymousClass0OU.A00(r1)
            r7.A01 = r8
            r7.A00 = r3
            r1 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r0.<init>(r8, r1, r3)
            java.lang.Object r0 = X.AnonymousClass7Ja.A00(r6, r7, r0)
            if (r0 == r6) goto L_0x002c
            r2 = r8
            goto L_0x0049
        L_0x0042:
            java.lang.Object r2 = r7.A01
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            X.AnonymousClass0OU.A00(r1)
        L_0x0049:
            X.8pE r0 = r2.A09
            X.C147368pE.A04(r0, r3)
            X.4wA r0 = r2.A0A
            r7.A01 = r2
            r7.A00 = r4
            java.lang.Object r0 = r0.AA2(r7)
            if (r0 != r6) goto L_0x0060
            return r6
        L_0x005b:
            java.lang.Object r2 = r7.A01
            X.AnonymousClass0OU.A00(r1)
        L_0x0060:
            r1 = 0
            r7.A01 = r1
            r7.A00 = r5
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r0.<init>(r2, r1, r4)
            java.lang.Object r0 = X.AnonymousClass7Ja.A00(r6, r7, r0)
            if (r0 != r6) goto L_0x002a
            return r6
        L_0x0071:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = X.C86164wN.A0n(r8, r9, r3)
            goto L_0x0016
        L_0x0076:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.A00(X.8n9):java.lang.Object");
    }

    public RippleAnimation(AnonymousClass7KC r5, float f, boolean z) {
        this.A00 = r5;
        this.A04 = f;
        this.A0B = z;
        Boolean A0X = C18180wK.A0X();
        AnonymousClass7WR r2 = AnonymousClass7WR.A00;
        this.A09 = C86104wH.A0I(r2, A0X, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A08 = C86104wH.A0I(r2, A0X, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }
}
