package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.C146958n9;
import X.C18220wO;
import X.C39144Knq;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import kotlin.Unit;

public class KtSLambdaShape13S0201000_I2 extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape13S0201000_I2(C146958n9 r2, AnonymousClass0YY r3) {
        super(2, r2);
        this.A01 = r3;
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        if (this.A03 != 0) {
            KtSLambdaShape13S0201000_I2 ktSLambdaShape13S0201000_I2 = new KtSLambdaShape13S0201000_I2(r4, (AnonymousClass0YY) this.A01);
            ktSLambdaShape13S0201000_I2.A02 = obj;
            return ktSLambdaShape13S0201000_I2;
        }
        KtSLambdaShape13S0201000_I2 ktSLambdaShape13S0201000_I22 = new KtSLambdaShape13S0201000_I2((AndroidEdgeEffectOverscrollEffect) this.A02, r4);
        ktSLambdaShape13S0201000_I22.A01 = obj;
        return ktSLambdaShape13S0201000_I22;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0080 A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A03
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            if (r0 == 0) goto L_0x0030
            int r1 = r14.A00
            r0 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 != r0) goto L_0x00e1
            X.AnonymousClass0OU.A00(r15)
        L_0x0010:
            X.7Es r15 = (X.C121197Es) r15
            if (r15 == 0) goto L_0x001b
            java.lang.Object r0 = r14.A01
            X.0YY r0 = (X.AnonymousClass0YY) r0
            X.C121197Es.A00(r15, r0)
        L_0x001b:
            kotlin.Unit r7 = kotlin.Unit.A00
            return r7
        L_0x001e:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r1 = r14.A02
            X.8pz r1 = (X.C147828pz) r1
            r14.A00 = r0
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r15 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(r1, r0, r14)
            if (r15 != r7) goto L_0x0010
            return r7
        L_0x0030:
            int r3 = r14.A00
            r6 = 2
            r5 = 0
            r1 = 1
            if (r3 == 0) goto L_0x00a8
            java.lang.Object r0 = r14.A01
            X.8pz r2 = X.C86164wN.A0H(r0, r15)
            if (r3 == r1) goto L_0x00bd
        L_0x003f:
            X.6kM r15 = (X.C109656kM) r15
            java.util.List r8 = r15.A03
            java.util.ArrayList r9 = X.C18200wM.A0t(r8)
            int r4 = r8.size()
            r13 = 0
            r3 = 0
        L_0x004d:
            if (r3 >= r4) goto L_0x0060
            java.lang.Object r1 = r8.get(r3)
            r0 = r1
            X.7Es r0 = (X.C121197Es) r0
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x005d
            r9.add(r1)
        L_0x005d:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0060:
            java.lang.Object r8 = r14.A02
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r8 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r8
            int r12 = r9.size()
        L_0x0068:
            if (r13 >= r12) goto L_0x0080
            java.lang.Object r10 = r9.get(r13)
            r0 = r10
            X.7Es r0 = (X.C121197Es) r0
            long r3 = r0.A04
            X.6sr r0 = r8.A02
            if (r0 == 0) goto L_0x007d
            long r0 = r0.A00
            int r11 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x0081
        L_0x007d:
            int r13 = r13 + 1
            goto L_0x0068
        L_0x0080:
            r10 = r5
        L_0x0081:
            X.7Es r10 = (X.C121197Es) r10
            if (r10 != 0) goto L_0x008d
            java.lang.Object r10 = X.AnonymousClass00J.A0D(r9)
            X.7Es r10 = (X.C121197Es) r10
            if (r10 == 0) goto L_0x009e
        L_0x008d:
            long r0 = r10.A04
            X.6sr r3 = new X.6sr
            r3.<init>(r0)
            r8.A02 = r3
            long r0 = r10.A05
            X.7KC r0 = X.C86124wJ.A0O(r0)
            r8.A01 = r0
        L_0x009e:
            boolean r0 = X.C18250wR.A1K(r9)
            if (r0 != 0) goto L_0x00d4
            r8.A02 = r5
            goto L_0x001b
        L_0x00a8:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r2 = r14.A01
            X.8pz r2 = (X.C147828pz) r2
            r14.A01 = r2
            r14.A00 = r1
            r1 = 0
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r15 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r2, r0, r14, r1)
            if (r15 != r7) goto L_0x00bd
            return r7
        L_0x00bd:
            X.7Es r15 = (X.C121197Es) r15
            java.lang.Object r4 = r14.A02
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r4 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r4
            long r0 = r15.A04
            X.6sr r3 = new X.6sr
            r3.<init>(r0)
            r4.A02 = r3
            long r0 = r15.A05
            X.7KC r0 = X.C86124wJ.A0O(r0)
            r4.A01 = r0
        L_0x00d4:
            r14.A01 = r2
            r14.A00 = r6
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r15 = r2.AA5(r0, r14)
            if (r15 != r7) goto L_0x003f
            return r7
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape13S0201000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape13S0201000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape13S0201000_I2(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C146958n9 r3) {
        super(2, r3);
        this.A02 = androidEdgeEffectOverscrollEffect;
    }
}
