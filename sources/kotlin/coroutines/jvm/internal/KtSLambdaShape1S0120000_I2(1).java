package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape1S0120000_I2 extends C39142Kno implements AnonymousClass0YP {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0120000_I2(Object obj, C146958n9 r3, int i, boolean z, boolean z2) {
        super(2, r3);
        this.A03 = i;
        this.A00 = obj;
        this.A01 = z;
        this.A02 = z2;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        int i;
        int i2 = this.A03;
        Object obj2 = this.A00;
        boolean z = this.A01;
        boolean z2 = this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new KtSLambdaShape1S0120000_I2(obj2, r8, i, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3.A02 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A03
            if (r0 == 0) goto L_0x0021
            X.AnonymousClass0OU.A00(r4)
            java.lang.Object r2 = r3.A00
            androidx.compose.animation.core.MutableTransitionState r2 = (androidx.compose.animation.core.MutableTransitionState) r2
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0014
            boolean r1 = r3.A02
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.8pE r0 = r2.A02
            r0.CrC(r1)
        L_0x001e:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0021:
            X.AnonymousClass0OU.A00(r4)
            boolean r1 = r3.A01
            boolean r0 = r3.A02
            if (r1 != 0) goto L_0x002c
            if (r0 == 0) goto L_0x001e
        L_0x002c:
            r0 = 0
            X.C04220Ms.A0A(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape1S0120000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape1S0120000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
