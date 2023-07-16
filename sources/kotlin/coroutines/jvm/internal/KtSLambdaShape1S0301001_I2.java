package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C04040Ma;
import X.C142638fL;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape1S0301001_I2 extends C39142Kno implements AnonymousClass0YP {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0301001_I2(Object obj, Object obj2, Object obj3, C146958n9 r5, float f, int i) {
        super(2, r5);
        this.A05 = i;
        this.A00 = f;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public final C146958n9 create(Object obj, C146958n9 r13) {
        int i;
        float f;
        Object obj2;
        Object obj3;
        Object obj4;
        C146958n9 r8 = r13;
        switch (this.A05) {
            case 0:
                return new KtSLambdaShape1S0301001_I2(this.A04, this.A02, r8, this.A00, 0);
            case 1:
                KtSLambdaShape1S0301001_I2 ktSLambdaShape1S0301001_I2 = new KtSLambdaShape1S0301001_I2((C142638fL) this.A02, r13, (C04040Ma) this.A03, this.A00);
                ktSLambdaShape1S0301001_I2.A04 = obj;
                return ktSLambdaShape1S0301001_I2;
            case 2:
                f = this.A00;
                obj4 = this.A04;
                obj3 = this.A03;
                obj2 = this.A02;
                i = 2;
                break;
            case 3:
                obj2 = this.A02;
                obj4 = this.A04;
                f = this.A00;
                obj3 = this.A03;
                i = 3;
                break;
            case 4:
                obj4 = this.A04;
                obj3 = this.A03;
                obj2 = this.A02;
                f = this.A00;
                i = 4;
                break;
            default:
                KtSLambdaShape1S0301001_I2 ktSLambdaShape1S0301001_I22 = new KtSLambdaShape1S0301001_I2(this.A04, this.A02, r8, this.A00, 5);
                ktSLambdaShape1S0301001_I22.A03 = obj;
                return ktSLambdaShape1S0301001_I22;
        }
        return new KtSLambdaShape1S0301001_I2(obj4, obj3, obj2, r8, f, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016f, code lost:
        X.AnonymousClass0OU.A00(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c7, code lost:
        if (r1 != r0) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c9, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01dd, code lost:
        if ((r4 instanceof X.C122917Um) != false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0227, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r11 = r16
            int r0 = r11.A05
            switch(r0) {
                case 0: goto L_0x0085;
                case 1: goto L_0x00dd;
                case 2: goto L_0x0107;
                case 3: goto L_0x0161;
                case 4: goto L_0x020f;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r11.A01
            r10 = 0
            r5 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 != r5) goto L_0x0015
            X.AnonymousClass0OU.A00(r17)     // Catch:{ all -> 0x0074 }
            goto L_0x0063
        L_0x0015:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x001a:
            X.AnonymousClass0OU.A00(r17)
            java.lang.Object r6 = r11.A03
            X.0Ma r4 = new X.0Ma
            r4.<init>()
            java.lang.Object r7 = r11.A04
            com.instagram.compose.core.SwipeableState r7 = (com.instagram.compose.core.SwipeableState) r7
            X.8pE r1 = r7.A04
            java.lang.Object r1 = r1.getValue()
            float r1 = X.C18240wQ.A00(r1)
            r4.A00 = r1
            X.8pE r3 = r7.A06
            float r2 = r11.A00
            java.lang.Float r1 = X.C86154wM.A0W(r2)
            r3.CrC(r1)
            X.8pE r1 = r7.A08
            X.C147368pE.A04(r1, r5)
            float r1 = r4.A00     // Catch:{ all -> 0x0074 }
            X.7JH r7 = X.AnonymousClass6DU.A00(r1)     // Catch:{ all -> 0x0074 }
            java.lang.Float r9 = X.C86154wM.A0W(r2)     // Catch:{ all -> 0x0074 }
            java.lang.Object r8 = r11.A02     // Catch:{ all -> 0x0074 }
            X.8fL r8 = (X.C142638fL) r8     // Catch:{ all -> 0x0074 }
            r1 = 44
            kotlin.jvm.internal.KtLambdaShape43S0200000_I2_4 r12 = new kotlin.jvm.internal.KtLambdaShape43S0200000_I2_4     // Catch:{ all -> 0x0074 }
            r12.<init>(r1, r6, r4)     // Catch:{ all -> 0x0074 }
            r13 = 4
            r11.A01 = r5     // Catch:{ all -> 0x0074 }
            java.lang.Object r1 = X.AnonymousClass7JH.A02(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0074 }
            if (r1 != r0) goto L_0x0063
            return r0
        L_0x0063:
            java.lang.Object r2 = r11.A04
            com.instagram.compose.core.SwipeableState r2 = (com.instagram.compose.core.SwipeableState) r2
            X.8pE r0 = r2.A06
            r0.CrC(r10)
            r1 = 0
            X.8pE r0 = r2.A08
            X.C147368pE.A04(r0, r1)
            goto L_0x0225
        L_0x0074:
            r3 = move-exception
            java.lang.Object r2 = r11.A04
            com.instagram.compose.core.SwipeableState r2 = (com.instagram.compose.core.SwipeableState) r2
            X.8pE r0 = r2.A06
            r0.CrC(r10)
            r1 = 0
            X.8pE r0 = r2.A08
            X.C147368pE.A04(r0, r1)
            throw r3
        L_0x0085:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r11.A01
            r4 = 1
            if (r1 == 0) goto L_0x009c
            if (r1 != r4) goto L_0x00d8
            java.lang.Object r9 = r11.A03
            X.0Ma r9 = (X.C04040Ma) r9
            X.AnonymousClass0OU.A00(r17)
        L_0x0095:
            float r5 = r9.A00
        L_0x0097:
            java.lang.Float r0 = X.C86154wM.A0W(r5)
            return r0
        L_0x009c:
            X.AnonymousClass0OU.A00(r17)
            float r5 = r11.A00
            float r2 = java.lang.Math.abs(r5)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0097
            X.0Ma r9 = new X.0Ma
            r9.<init>()
            r9.A00 = r5
            X.0Ma r7 = new X.0Ma
            r7.<init>()
            r2 = 0
            r3 = 0
            r1 = 28
            X.7WW r2 = X.AnonymousClass6DW.A00(r2, r5, r1)
            java.lang.Object r8 = r11.A04
            X.7UR r8 = (X.AnonymousClass7UR) r8
            X.8cU r1 = r8.A01
            java.lang.Object r10 = r11.A02
            r6 = 2
            kotlin.jvm.internal.KtLambdaShape6S0400000_I2 r5 = new kotlin.jvm.internal.KtLambdaShape6S0400000_I2
            r5.<init>(r6, r7, r8, r9, r10)
            r11.A03 = r9
            r11.A01 = r4
            java.lang.Object r1 = androidx.compose.animation.core.SuspendAnimationKt.A05(r2, r1, r11, r5, r3)
            if (r1 != r0) goto L_0x0095
            return r0
        L_0x00d8:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00dd:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r11.A01
            r3 = 1
            if (r1 == 0) goto L_0x00eb
            if (r1 == r3) goto L_0x016f
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00eb:
            X.AnonymousClass0OU.A00(r17)
            java.lang.Object r2 = r11.A04
            float r14 = r11.A00
            java.lang.Object r10 = r11.A02
            X.8fL r10 = (X.C142638fL) r10
            java.lang.Object r1 = r11.A03
            kotlin.jvm.internal.KtLambdaShape48S0200000_I2 r12 = new kotlin.jvm.internal.KtLambdaShape48S0200000_I2
            r12.<init>(r3, r2, r1)
            r11.A01 = r3
            r13 = 0
            r15 = r13
            java.lang.Object r1 = androidx.compose.animation.core.SuspendAnimationKt.A04(r10, r11, r12, r13, r14, r15)
            goto L_0x01c7
        L_0x0107:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r11.A01
            r7 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0113
            X.AnonymousClass0OU.A00(r17)
        L_0x0112:
            return r17
        L_0x0113:
            X.AnonymousClass0OU.A00(r17)
            float r6 = r11.A00
            float r2 = java.lang.Math.abs(r6)
            java.lang.Object r5 = r11.A04
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r5 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior) r5
            float r1 = r5.A02
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            java.lang.Object r10 = r11.A03
            X.8fT r10 = (X.C142718fT) r10
            java.lang.Object r4 = r11.A02
            X.0YY r4 = (X.AnonymousClass0YY) r4
            if (r1 > 0) goto L_0x015a
            r11.A01 = r3
            X.8kw r2 = r5.A06
            X.8nV r1 = r5.A07
            r3 = 0
            float r13 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A00(r2, r1, r3)
            X.0Ma r2 = new X.0Ma
            r2.<init>()
            r2.A00 = r13
            r1 = 28
            X.7WW r9 = X.AnonymousClass6DW.A00(r3, r6, r1)
            X.8fL r8 = r5.A04
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r12 = X.C86164wN.A10(r4, r2, r1)
            r14 = r13
            java.lang.Object r1 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A01(r8, r9, r10, r11, r12, r13, r14)
        L_0x0155:
            r17 = r1
            if (r1 != r0) goto L_0x0112
            return r0
        L_0x015a:
            r11.A01 = r7
            java.lang.Object r1 = androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.A01(r10, r5, r11, r4, r6)
            goto L_0x0155
        L_0x0161:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r11.A01
            r5 = 1
            if (r1 == 0) goto L_0x0174
            if (r1 == r5) goto L_0x016f
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x016f:
            X.AnonymousClass0OU.A00(r17)
            goto L_0x0225
        L_0x0174:
            X.AnonymousClass0OU.A00(r17)
            java.lang.Object r7 = r11.A02
            X.7JH r7 = (X.AnonymousClass7JH) r7
            X.8pE r1 = r7.A0A
            java.lang.Object r1 = r1.getValue()
            X.7yT r1 = (X.C134847yT) r1
            float r3 = r1.A00
            java.lang.Object r2 = r11.A04
            X.7Vy r2 = (X.C123227Vy) r2
            float r1 = r2.A03
            int r1 = java.lang.Float.compare(r3, r1)
            boolean r1 = X.C18180wK.A1W(r1)
            r4 = 0
            if (r1 == 0) goto L_0x01eb
            long r1 = X.AnonymousClass7KC.A03
            X.7Uv r4 = new X.7Uv
            r4.<init>(r1)
        L_0x019d:
            float r3 = r11.A00
            java.lang.Object r2 = r11.A03
            r11.A01 = r5
            if (r2 == 0) goto L_0x01ca
            boolean r1 = r2 instanceof X.C122987Uv
            if (r1 != 0) goto L_0x01b5
            boolean r1 = r2 instanceof X.C122907Ul
            if (r1 != 0) goto L_0x01b5
            boolean r1 = r2 instanceof X.C122927Un
            if (r1 != 0) goto L_0x01b5
            boolean r1 = r2 instanceof X.C122917Um
            if (r1 == 0) goto L_0x01e2
        L_0x01b5:
            X.7Tr r8 = X.AnonymousClass6a8.A00
        L_0x01b7:
            X.7yT r9 = X.C134847yT.A00(r3)
            r10 = 0
            r13 = 12
            r12 = r10
            java.lang.Object r1 = X.AnonymousClass7JH.A02(r7, r8, r9, r10, r11, r12, r13)
        L_0x01c3:
            if (r1 == r0) goto L_0x01c7
            kotlin.Unit r1 = kotlin.Unit.A00
        L_0x01c7:
            if (r1 != r0) goto L_0x0225
            return r0
        L_0x01ca:
            if (r4 == 0) goto L_0x01e2
            boolean r1 = r4 instanceof X.C122987Uv
            if (r1 != 0) goto L_0x01df
            boolean r1 = r4 instanceof X.C122907Ul
            if (r1 != 0) goto L_0x01df
            boolean r1 = r4 instanceof X.C122927Un
            if (r1 == 0) goto L_0x01db
            X.7Tr r8 = X.AnonymousClass6a8.A02
            goto L_0x01b7
        L_0x01db:
            boolean r1 = r4 instanceof X.C122917Um
            if (r1 == 0) goto L_0x01e2
        L_0x01df:
            X.7Tr r8 = X.AnonymousClass6a8.A01
            goto L_0x01b7
        L_0x01e2:
            X.7yT r1 = X.C134847yT.A00(r3)
            java.lang.Object r1 = r7.A05(r1, r11)
            goto L_0x01c3
        L_0x01eb:
            float r1 = r2.A02
            int r1 = java.lang.Float.compare(r3, r1)
            boolean r1 = X.C18180wK.A1W(r1)
            if (r1 == 0) goto L_0x01fd
            X.7Un r4 = new X.7Un
            r4.<init>()
            goto L_0x019d
        L_0x01fd:
            float r1 = r2.A01
            int r1 = java.lang.Float.compare(r3, r1)
            boolean r1 = X.C18180wK.A1W(r1)
            if (r1 == 0) goto L_0x019d
            X.7Um r4 = new X.7Um
            r4.<init>()
            goto L_0x019d
        L_0x020f:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r11.A01
            r4 = 1
            if (r1 == 0) goto L_0x0228
            if (r1 != r4) goto L_0x025c
            X.AnonymousClass0OU.A00(r17)
        L_0x021b:
            java.lang.Object r0 = r11.A04
            androidx.compose.material.SwipeableV2State r0 = (androidx.compose.material.SwipeableV2State) r0
            r1 = 0
            X.8pE r0 = r0.A07
            X.C147368pE.A02(r0, r1)
        L_0x0225:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0228:
            X.AnonymousClass0OU.A00(r17)
            java.lang.Object r3 = r11.A04
            androidx.compose.material.SwipeableV2State r3 = (androidx.compose.material.SwipeableV2State) r3
            java.lang.Object r2 = r11.A03
            X.8pE r1 = r3.A05
            r1.CrC(r2)
            X.0Ma r2 = new X.0Ma
            r2.<init>()
            X.8pE r1 = r3.A08
            float r13 = X.C86114wI.A00(r1)
            r2.A00 = r13
            java.lang.Object r1 = r11.A02
            float r14 = X.C18240wQ.A00(r1)
            float r15 = r11.A00
            X.8fL r10 = r3.A02
            r1 = 4
            kotlin.jvm.internal.KtLambdaShape48S0200000_I2 r12 = new kotlin.jvm.internal.KtLambdaShape48S0200000_I2
            r12.<init>(r1, r2, r3)
            r11.A01 = r4
            java.lang.Object r1 = androidx.compose.animation.core.SuspendAnimationKt.A04(r10, r11, r12, r13, r14, r15)
            if (r1 != r0) goto L_0x021b
            return r0
        L_0x025c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape1S0301001_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape1S0301001_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0301001_I2(Object obj, Object obj2, C146958n9 r4, float f, int i) {
        super(2, r4);
        this.A05 = i;
        this.A00 = f;
        this.A04 = obj;
        this.A02 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0301001_I2(C142638fL r2, C146958n9 r3, C04040Ma r4, float f) {
        super(2, r3);
        this.A05 = 1;
        this.A00 = f;
        this.A02 = r2;
        this.A03 = r4;
    }
}
