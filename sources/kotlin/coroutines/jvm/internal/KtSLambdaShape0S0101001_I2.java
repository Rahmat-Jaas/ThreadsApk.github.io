package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape0S0101001_I2 extends C39142Kno implements AnonymousClass0YP {
    public float A00;
    public int A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d6, code lost:
        r13.A01 = r1;
        r0 = X.AnonymousClass7JH.A02(r4, (X.C142638fL) null, r6, (java.lang.Object) null, r8, (X.AnonymousClass0YY) null, 14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e3, code lost:
        X.AnonymousClass0OU.A00(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e8, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r0 == r3) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r0 = kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r0 != r3) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r8 = r13
            int r0 = r13.A03
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x003f;
                case 2: goto L_0x0073;
                case 3: goto L_0x0088;
                case 4: goto L_0x00b1;
                case 5: goto L_0x00c4;
                default: goto L_0x0008;
            }
        L_0x0008:
            int r1 = r13.A01
            r0 = 1
            if (r1 != 0) goto L_0x00e3
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A02
            com.instagram.compose.core.SwipeableState r4 = (com.instagram.compose.core.SwipeableState) r4
            float r2 = r13.A00
            r13.A01 = r0
            X.4tk r1 = r4.A0F
            X.874 r0 = new X.874
            r0.<init>(r4, r2)
            java.lang.Object r0 = r1.collect(r0, r13)
        L_0x0023:
            if (r0 == r3) goto L_0x0027
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x0027:
            if (r0 != r3) goto L_0x00e6
            return r3
        L_0x002a:
            int r0 = r13.A01
            r2 = 1
            if (r0 != 0) goto L_0x00e3
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A02
            X.8lw r1 = (X.C146268lw) r1
            float r0 = r13.A00
            r13.A01 = r2
            java.lang.Object r0 = r1.A8Q(r13, r0)
            goto L_0x0027
        L_0x003f:
            int r1 = r13.A01
            r0 = 1
            if (r1 != 0) goto L_0x00e3
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r5 = r13.A02
            androidx.compose.material.SwipeableV2State r5 = (androidx.compose.material.SwipeableV2State) r5
            float r4 = r13.A00
            r13.A01 = r0
            X.8pE r0 = r5.A06
            java.lang.Object r2 = r0.getValue()
            float r0 = r5.A01()
            java.lang.Object r1 = androidx.compose.material.SwipeableV2State.A00(r5, r2, r0, r4)
            X.0YY r0 = r5.A0D
            java.lang.Object r0 = r0.invoke(r1)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r5.A02(r1, r13, r4)
            goto L_0x0023
        L_0x006e:
            java.lang.Object r0 = r5.A02(r2, r13, r4)
            goto L_0x0023
        L_0x0073:
            int r0 = r13.A01
            r2 = 1
            if (r0 != 0) goto L_0x00e3
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A02
            X.7A5 r1 = (X.AnonymousClass7A5) r1
            float r0 = r13.A00
            r13.A01 = r2
            java.lang.Object r0 = r1.A03(r13, r0)
            goto L_0x0027
        L_0x0088:
            int r0 = r13.A01
            r2 = 1
            if (r0 != 0) goto L_0x00e3
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A02
            X.6my r1 = (X.C111216my) r1
            X.8pE r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            float r10 = X.C18240wQ.A00(r0)
            float r11 = r13.A00
            X.8fL r7 = r1.A02
            r0 = 2
            kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1 r9 = new kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1
            r9.<init>(r1, r0)
            r13.A01 = r2
            r12 = 0
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A04(r7, r8, r9, r10, r11, r12)
            goto L_0x0027
        L_0x00b1:
            int r0 = r13.A01
            r1 = 1
            if (r0 != 0) goto L_0x00e3
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A02
            X.7JH r4 = (X.AnonymousClass7JH) r4
            float r0 = r13.A00
            X.7yT r6 = X.C134847yT.A00(r0)
            goto L_0x00d6
        L_0x00c4:
            int r0 = r13.A01
            r1 = 1
            if (r0 != 0) goto L_0x00e3
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A02
            X.7JH r4 = (X.AnonymousClass7JH) r4
            float r0 = r13.A00
            java.lang.Float r6 = X.C86154wM.A0W(r0)
        L_0x00d6:
            r5 = 0
            r10 = 14
            r13.A01 = r1
            r7 = r5
            r9 = r5
            java.lang.Object r0 = X.AnonymousClass7JH.A02(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0027
        L_0x00e3:
            X.AnonymousClass0OU.A00(r14)
        L_0x00e6:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101001_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0101001_I2(Object obj, C146958n9 r3, float f, int i) {
        super(2, r3);
        this.A03 = i;
        this.A02 = obj;
        this.A00 = f;
    }

    public final C146958n9 create(Object obj, C146958n9 r6) {
        int i;
        int i2 = this.A03;
        Object obj2 = this.A02;
        float f = this.A00;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            default:
                i = 6;
                break;
        }
        return new KtSLambdaShape0S0101001_I2(obj2, r6, f, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S0101001_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
