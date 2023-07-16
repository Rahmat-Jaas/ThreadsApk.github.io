package androidx.compose.foundation.gestures;

import X.AnonymousClass7KC;
import X.AnonymousClass7WR;
import X.C04220Ms;
import X.C142708fS;
import X.C142718fT;
import X.C146058lZ;
import X.C146258lv;
import X.C147368pE;
import X.C18180wK;
import X.C18190wL;
import X.C81784oM;
import X.C86104wH;
import X.C86124wJ;
import X.C967266l;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape31S0201000_I2;

public final class ScrollingLogic {
    public final C146058lZ A00;
    public final C142708fS A01;
    public final C967266l A02;
    public final C146258lv A03;
    public final C147368pE A04 = C86104wH.A0I(AnonymousClass7WR.A00, C18180wK.A0X(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    public final C81784oM A05;
    public final boolean A06;

    public ScrollingLogic(C146058lZ r4, C142708fS r5, C967266l r6, C146258lv r7, C81784oM r8, boolean z) {
        C18190wL.A1S(r8, 3, r5);
        this.A02 = r6;
        this.A06 = z;
        this.A05 = r8;
        this.A03 = r7;
        this.A01 = r5;
        this.A00 = r4;
    }

    public final long A00(float f) {
        if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return AnonymousClass7KC.A03;
        }
        if (this.A02 == C967266l.Horizontal) {
            return C86104wH.A0C(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        return C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f);
    }

    public final long A01(C142718fT r7, int i, long j) {
        long A0C;
        C04220Ms.A0B(r7, 0);
        if (this.A02 == C967266l.Horizontal) {
            A0C = C86104wH.A0C(AnonymousClass7KC.A01(j), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        } else {
            A0C = C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, AnonymousClass7KC.A02(j));
        }
        KtLambdaShape31S0201000_I2 ktLambdaShape31S0201000_I2 = new KtLambdaShape31S0201000_I2(i, 1, this, r7);
        C146058lZ r4 = this.A00;
        if (r4 != null) {
            C146258lv r3 = this.A03;
            if (r3.AVo() || r3.AVn()) {
                return r4.A93(ktLambdaShape31S0201000_I2, i, A0C);
            }
        }
        return ((AnonymousClass7KC) ktLambdaShape31S0201000_I2.invoke(C86124wJ.A0O(A0C))).A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C146958n9 r12, long r13) {
        /*
            r11 = this;
            r3 = 6
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r12)
            r6 = r11
            if (r0 == 0) goto L_0x0050
            r4 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0050
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r0) goto L_0x0055
            java.lang.Object r8 = r4.A01
            X.0MQ r8 = (X.AnonymousClass0MQ) r8
            X.AnonymousClass0OU.A00(r3)
        L_0x0028:
            long r0 = r8.A00
            X.7HA r2 = new X.7HA
            r2.<init>(r0)
            return r2
        L_0x0030:
            X.AnonymousClass0OU.A00(r3)
            X.0MQ r8 = new X.0MQ
            r8.<init>()
            r9 = r13
            r8.A00 = r13
            X.8lv r1 = r11.A03
            r7 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r5 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r5.<init>(r6, r7, r8, r9)
            r4.A01 = r8
            r4.A00 = r0
            X.66k r0 = X.C967166k.Default
            java.lang.Object r0 = r1.CgB(r0, r4, r5)
            if (r0 != r2) goto L_0x0028
            return r2
        L_0x0050:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = X.C86164wN.A0n(r11, r12, r3)
            goto L_0x0016
        L_0x0055:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.A02(X.8n9, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C146958n9 r11, long r12) {
        /*
            r10 = this;
            r3 = 7
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r11)
            if (r0 == 0) goto L_0x0028
            r7 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r7.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r9) goto L_0x002d
            if (r0 == r8) goto L_0x002d
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0028:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = X.C86164wN.A0n(r10, r11, r3)
            goto L_0x0015
        L_0x002d:
            java.lang.Object r0 = r7.A01
            androidx.compose.foundation.gestures.ScrollingLogic r0 = (androidx.compose.foundation.gestures.ScrollingLogic) r0
            X.AnonymousClass0OU.A00(r1)
            goto L_0x006f
        L_0x0035:
            X.AnonymousClass0OU.A00(r1)
            X.8pE r0 = r10.A04
            X.C147368pE.A04(r0, r9)
            X.66l r1 = r10.A02
            X.66l r0 = X.C967266l.Horizontal
            if (r1 != r0) goto L_0x0086
            float r1 = X.C86104wH.A00(r12)
            r0 = 0
            long r1 = X.C86104wH.A0C(r1, r0)
        L_0x004c:
            r0 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101200_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101200_I2
            r5.<init>(r10, r0)
            X.8lZ r4 = r10.A00
            if (r4 == 0) goto L_0x0078
            X.8lv r3 = r10.A03
            boolean r0 = r3.AVo()
            if (r0 != 0) goto L_0x0064
            boolean r0 = r3.AVn()
            if (r0 == 0) goto L_0x0078
        L_0x0064:
            r7.A01 = r10
            r7.A00 = r9
            java.lang.Object r0 = r4.A92(r7, r5, r1)
        L_0x006c:
            if (r0 == r6) goto L_0x0077
            r0 = r10
        L_0x006f:
            r1 = 0
            X.8pE r0 = r0.A04
            X.C147368pE.A04(r0, r1)
            kotlin.Unit r6 = kotlin.Unit.A00
        L_0x0077:
            return r6
        L_0x0078:
            X.7HA r0 = new X.7HA
            r0.<init>(r1)
            r7.A01 = r10
            r7.A00 = r8
            java.lang.Object r0 = r5.invoke(r0, r7)
            goto L_0x006c
        L_0x0086:
            int r0 = X.C86104wH.A08(r12)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            r0 = 0
            long r1 = X.C86104wH.A0C(r0, r1)
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.A03(X.8n9, long):java.lang.Object");
    }
}
