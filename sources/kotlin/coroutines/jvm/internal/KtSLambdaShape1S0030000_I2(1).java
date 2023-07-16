package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YC;
import X.AnonymousClass0wJ;
import X.C146958n9;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape1S0030000_I2 extends C39142Kno implements AnonymousClass0YC {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0030000_I2(int i, C146958n9 r3) {
        super(4, r3);
        this.A03 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.A03;
        boolean A1X = AnonymousClass0wJ.A1X(obj);
        boolean A1X2 = AnonymousClass0wJ.A1X(obj2);
        boolean A1X3 = AnonymousClass0wJ.A1X(obj3);
        C146958n9 r9 = (C146958n9) obj4;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        KtSLambdaShape1S0030000_I2 ktSLambdaShape1S0030000_I2 = new KtSLambdaShape1S0030000_I2(i, r9);
        ktSLambdaShape1S0030000_I2.A00 = A1X;
        ktSLambdaShape1S0030000_I2.A01 = A1X2;
        ktSLambdaShape1S0030000_I2.A02 = A1X3;
        return ktSLambdaShape1S0030000_I2.invokeSuspend(Unit.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A03
            X.AnonymousClass0OU.A00(r6)
            if (r0 == 0) goto L_0x0014
            boolean r4 = r5.A00
            boolean r3 = r5.A01
            boolean r2 = r5.A02
            r1 = 4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2
            r0.<init>(r1, r4, r3, r2)
            return r0
        L_0x0014:
            boolean r2 = r5.A00
            boolean r0 = r5.A01
            boolean r1 = r5.A02
            if (r2 == 0) goto L_0x0021
            if (r0 == 0) goto L_0x0021
            r0 = 1
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape1S0030000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
