package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0MJ;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.C146958n9;
import X.C18220wO;
import X.C39144Knq;
import X.C83224qz;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import kotlin.Unit;

public class KtSLambdaShape1S0601000_I2 extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0601000_I2(PressGestureScopeImpl pressGestureScopeImpl, C146958n9 r3, AnonymousClass0YY r4, AnonymousClass0YY r5, AnonymousClass0MJ r6, C83224qz r7) {
        super(2, r3);
        this.A01 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A04 = pressGestureScopeImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r7 = r12
            int r0 = r12.A07
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r12.A00
            if (r0 == 0) goto L_0x006d
            r0 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0056
            if (r1 != r0) goto L_0x0068
            X.AnonymousClass0OU.A00(r13)
        L_0x0012:
            X.7Es r13 = (X.C121197Es) r13
            if (r13 == 0) goto L_0x0033
            r13.A01()
            java.lang.Object r3 = r12.A01
            X.4qz r3 = (X.C83224qz) r3
            java.lang.Object r2 = r12.A04
            r0 = 7
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2
            r1.<init>(r2, r4, r0)
            r0 = 3
            X.C25237DiI.A00(r4, r4, r1, r3, r0)
            java.lang.Object r0 = r12.A02
            X.0YY r0 = (X.AnonymousClass0YY) r0
            X.C121197Es.A00(r13, r0)
        L_0x0030:
            kotlin.Unit r4 = kotlin.Unit.A00
        L_0x0032:
            return r4
        L_0x0033:
            java.lang.Object r3 = r12.A01
            X.4qz r3 = (X.C83224qz) r3
            java.lang.Object r2 = r12.A04
            r0 = 8
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2
            r1.<init>(r2, r4, r0)
            r0 = 3
            X.C25237DiI.A00(r4, r4, r1, r3, r0)
            java.lang.Object r1 = r12.A03
            X.0YY r1 = (X.AnonymousClass0YY) r1
            if (r1 == 0) goto L_0x0032
            java.lang.Object r0 = r12.A05
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r0 = r0.A00
            X.7Es r0 = (X.C121197Es) r0
            X.C121197Es.A00(r0, r1)
            goto L_0x0030
        L_0x0056:
            X.AnonymousClass0OU.A00(r13)
            java.lang.Object r1 = r12.A06
            X.8pz r1 = (X.C147828pz) r1
            r12.A00 = r0
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(r1, r0, r12)
            if (r13 != r5) goto L_0x0012
            return r5
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x006d:
            r4 = 3
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L_0x008a
            if (r1 == r0) goto L_0x009f
            if (r1 == r3) goto L_0x00c2
            X.AnonymousClass0OU.A00(r13)
        L_0x0079:
            boolean r0 = X.AnonymousClass0wJ.A1X(r13)
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r12.A02
        L_0x0081:
            X.C18240wQ.A1G(r0)
        L_0x0084:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x0087:
            java.lang.Object r0 = r12.A01
            goto L_0x0081
        L_0x008a:
            X.AnonymousClass0OU.A00(r13)
            java.lang.Object r6 = r12.A05
            X.8pz r6 = (X.C147828pz) r6
            r12.A05 = r6
            r12.A00 = r0
            r1 = 0
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r6, r0, r12, r1)
            if (r13 != r5) goto L_0x00a5
            return r5
        L_0x009f:
            java.lang.Object r0 = r12.A05
            X.8pz r6 = X.C86164wN.A0H(r0, r13)
        L_0x00a5:
            X.7Es r13 = (X.C121197Es) r13
            X.0Ma r2 = new X.0Ma
            r2.<init>()
            long r10 = r13.A04
            int r9 = r13.A03
            r0 = 0
            kotlin.jvm.internal.KtLambdaShape167S0100000_I2 r8 = X.C86164wN.A0u(r2, r0)
            r12.A05 = r6
            r12.A06 = r2
            r12.A00 = r3
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A04(r6, r7, r8, r9, r10)
            if (r13 != r5) goto L_0x00cc
            return r5
        L_0x00c2:
            java.lang.Object r2 = r12.A06
            X.0Ma r2 = (X.C04040Ma) r2
            java.lang.Object r0 = r12.A05
            X.8pz r6 = X.C86164wN.A0H(r0, r13)
        L_0x00cc:
            X.7Es r13 = (X.C121197Es) r13
            if (r13 == 0) goto L_0x0084
            java.lang.Object r0 = r12.A03
            X.0YY r0 = (X.AnonymousClass0YY) r0
            X.C121197Es.A00(r13, r0)
            java.lang.Object r1 = r12.A04
            X.0YP r1 = (X.AnonymousClass0YP) r1
            float r0 = r2.A00
            java.lang.Float r0 = X.C86154wM.A0W(r0)
            r1.invoke(r13, r0)
            long r2 = r13.A04
            r0 = 30
            kotlin.jvm.internal.KtLambdaShape145S0100000_I2 r1 = X.C86144wL.A16(r1, r0)
            r0 = 0
            r12.A05 = r0
            r12.A06 = r0
            r12.A00 = r4
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A03(r6, r12, r1, r2)
            if (r13 != r5) goto L_0x0079
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape1S0601000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        C146958n9 r2 = r9;
        if (this.A07 != 0) {
            AnonymousClass0YY r3 = (AnonymousClass0YY) this.A02;
            AnonymousClass0YY r4 = (AnonymousClass0YY) this.A03;
            AnonymousClass0MJ r5 = (AnonymousClass0MJ) this.A05;
            KtSLambdaShape1S0601000_I2 ktSLambdaShape1S0601000_I2 = new KtSLambdaShape1S0601000_I2((PressGestureScopeImpl) this.A04, r2, r3, r4, r5, (C83224qz) this.A01);
            ktSLambdaShape1S0601000_I2.A06 = obj;
            return ktSLambdaShape1S0601000_I2;
        }
        KtSLambdaShape1S0601000_I2 ktSLambdaShape1S0601000_I22 = new KtSLambdaShape1S0601000_I2(r2, (AnonymousClass0ZU) this.A02, (AnonymousClass0ZU) this.A01, (AnonymousClass0YY) this.A03, (AnonymousClass0YP) this.A04);
        ktSLambdaShape1S0601000_I22.A05 = obj;
        return ktSLambdaShape1S0601000_I22;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape1S0601000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0601000_I2(C146958n9 r2, AnonymousClass0ZU r3, AnonymousClass0ZU r4, AnonymousClass0YY r5, AnonymousClass0YP r6) {
        super(2, r2);
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r3;
        this.A01 = r4;
    }
}
