package androidx.compose.foundation.gestures.snapping;

import X.AnonymousClass0wJ;
import X.AnonymousClass8cU;
import X.C04220Ms;
import X.C142638fL;
import X.C142708fS;
import X.C142718fT;
import X.C145698kw;
import X.C146958n9;
import X.C147168nV;
import X.C148818sE;
import X.C18180wK;
import X.C18210wN;
import X.C77654hA;
import X.C86144wL;
import androidx.compose.foundation.gestures.ScrollableKt;

public final class SnapFlingBehavior implements C142708fS {
    public C148818sE A00 = ScrollableKt.A01;
    public final float A01;
    public final float A02;
    public final C142638fL A03;
    public final C142638fL A04;
    public final AnonymousClass8cU A05;
    public final C145698kw A06;
    public final C147168nV A07;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C142718fT r10, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r11, X.C146958n9 r12, X.AnonymousClass0YY r13, float r14) {
        /*
            r8 = r13
            r3 = 9
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r12)
            r6 = r11
            if (r0 == 0) goto L_0x004c
            r4 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0018:
            java.lang.Object r0 = r4.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r1) goto L_0x0051
            java.lang.Object r8 = r4.A01
            X.0YY r8 = (X.AnonymousClass0YY) r8
            X.AnonymousClass0OU.A00(r0)
        L_0x002a:
            r1 = 0
            java.lang.Float r1 = X.C86154wM.A0W(r1)
            r8.invoke(r1)
            return r0
        L_0x0033:
            X.AnonymousClass0OU.A00(r0)
            X.8sE r0 = r11.A00
            r9 = 0
            r11 = 2
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0301001_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0301001_I2
            r7 = r10
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.A01 = r13
            r4.A00 = r1
            java.lang.Object r0 = X.C25599DoZ.A00(r4, r0, r5)
            if (r0 != r3) goto L_0x002a
            return r3
        L_0x004c:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = X.C86164wN.A0n(r11, r12, r3)
            goto L_0x0018
        L_0x0051:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.A00(X.8fT, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, X.8n9, X.0YY, float):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C142718fT r14, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r15, X.C146958n9 r16, X.AnonymousClass0YY r17, float r18) {
        /*
            r7 = r15
            r11 = r14
            r6 = r17
            r5 = 2
            r3 = r16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2.A00(r5, r3)
            if (r0 == 0) goto L_0x00ca
            r15 = r3
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r15 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2) r15
            int r2 = r15.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ca
            int r2 = r2 - r1
            r15.A00 = r2
        L_0x001b:
            java.lang.Object r1 = r15.A05
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r15.A00
            r8 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 == r8) goto L_0x008b
            if (r0 != r5) goto L_0x00d1
            X.AnonymousClass0OU.A00(r1)
        L_0x002b:
            return r1
        L_0x002c:
            X.AnonymousClass0OU.A00(r1)
            X.8kw r13 = r7.A06
            X.8nV r14 = r7.A07
            r2 = r18
            float r0 = r13.ABV(r14, r2)
            float r1 = java.lang.Math.abs(r0)
            float r0 = java.lang.Math.signum(r2)
            float r1 = r1 * r0
            X.0Ma r3 = new X.0Ma
            r3.<init>()
            r3.A00 = r1
            java.lang.Float r0 = X.C86154wM.A0W(r1)
            r6.invoke(r0)
            r0 = 26
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r16 = X.C86164wN.A10(r6, r3, r0)
            X.C86154wM.A1S(r7, r11, r6, r3, r15)
            r15.A00 = r8
            X.8cU r8 = r7.A05
            r0 = 0
            float r0 = X.AnonymousClass6DY.A00(r8, r0, r2)
            float r10 = r13.ABf(r14)
            float r9 = java.lang.Math.abs(r0)
            float r0 = java.lang.Math.abs(r1)
            float r0 = r0 + r10
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0083
            X.7Uh r12 = new X.7Uh
            r12.<init>(r8)
        L_0x0078:
            X.8fU r12 = (X.C142728fU) r12
            r17 = r1
            java.lang.Object r1 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A03(r11, r12, r13, r14, r15, r16, r17, r18)
            if (r1 != r4) goto L_0x009c
            return r4
        L_0x0083:
            X.8fL r0 = r7.A03
            X.7Ui r12 = new X.7Ui
            r12.<init>(r0, r13, r14)
            goto L_0x0078
        L_0x008b:
            java.lang.Object r3 = r15.A04
            X.0Ma r3 = (X.C04040Ma) r3
            java.lang.Object r6 = r15.A03
            java.lang.Object r11 = r15.A02
            X.8fT r11 = (X.C142718fT) r11
            java.lang.Object r7 = r15.A01
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r7 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior) r7
            X.AnonymousClass0OU.A00(r1)
        L_0x009c:
            X.6fU r1 = (X.C106716fU) r1
            java.lang.Object r0 = r1.A01
            float r2 = X.C18240wQ.A00(r0)
            X.7WW r0 = r1.A00
            r3.A00 = r2
            r1 = 0
            X.7WW r9 = X.AnonymousClass7WW.A00(r0)
            X.8fL r8 = r7.A04
            r0 = 27
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r12 = X.C86164wN.A10(r6, r3, r0)
            r15.A01 = r1
            r15.A02 = r1
            r15.A03 = r1
            r15.A04 = r1
            r15.A00 = r5
            r10 = r11
            r11 = r15
            r13 = r2
            r14 = r2
            java.lang.Object r1 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A01(r8, r9, r10, r11, r12, r13, r14)
            if (r1 != r4) goto L_0x002b
            return r4
        L_0x00ca:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r15 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2
            r15.<init>(r7, r3, r5)
            goto L_0x001b
        L_0x00d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.A01(X.8fT, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, X.8n9, X.0YY, float):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C142718fT r6, X.C146958n9 r7, X.AnonymousClass0YY r8, float r9) {
        /*
            r5 = this;
            r3 = 5
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r7)
            if (r0 == 0) goto L_0x004b
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x003f
            if (r1 != r0) goto L_0x0050
            X.AnonymousClass0OU.A00(r3)
        L_0x0023:
            X.6fU r3 = (X.C106716fU) r3
            java.lang.Object r0 = r3.A01
            float r0 = X.C18240wQ.A00(r0)
            X.7WW r2 = r3.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r2.A01()
            float r1 = X.C18240wQ.A00(r0)
        L_0x003a:
            java.lang.Float r2 = X.C86154wM.A0W(r1)
            return r2
        L_0x003f:
            X.AnonymousClass0OU.A00(r3)
            r4.A00 = r0
            java.lang.Object r3 = A00(r6, r5, r4, r8, r9)
            if (r3 != r2) goto L_0x0023
            return r2
        L_0x004b:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = X.C86114wI.A0x(r5, r7, r3)
            goto L_0x0015
        L_0x0050:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.A02(X.8fT, X.8n9, X.0YY, float):java.lang.Object");
    }

    public /* synthetic */ SnapFlingBehavior(C142638fL r2, C142638fL r3, AnonymousClass8cU r4, C145698kw r5, C147168nV r6) {
        float f = SnapFlingBehaviorKt.A00;
        this.A06 = r5;
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = r3;
        this.A07 = r6;
        this.A01 = f;
        this.A02 = r6.CxL(f);
    }

    public final Object CWZ(C142718fT r2, C146958n9 r3, float f) {
        return A02(r2, r3, C77654hA.A00, f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        if (!C04220Ms.A0I(snapFlingBehavior.A04, this.A04) || !C04220Ms.A0I(snapFlingBehavior.A05, this.A05) || !C04220Ms.A0I(snapFlingBehavior.A03, this.A03) || !C04220Ms.A0I(snapFlingBehavior.A06, this.A06) || !C04220Ms.A0I(snapFlingBehavior.A07, this.A07) || !C18180wK.A1W(Float.compare(snapFlingBehavior.A01, this.A01))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86144wL.A03(AnonymousClass0wJ.A05(this.A07, AnonymousClass0wJ.A05(this.A06, AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A05(this.A05, C18210wN.A04(this.A04))))), this.A01);
    }
}
