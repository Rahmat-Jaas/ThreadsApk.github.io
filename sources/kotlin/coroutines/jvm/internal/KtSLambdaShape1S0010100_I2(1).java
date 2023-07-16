package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.C146958n9;
import X.C18190wL;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape1S0010100_I2 extends C39142Kno implements AnonymousClass0YM {
    public long A00;
    public boolean A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0010100_I2(int i, C146958n9 r3) {
        super(3, r3);
        this.A02 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A02;
        boolean A1X = AnonymousClass0wJ.A1X(obj);
        long A08 = C18190wL.A08(obj2);
        C146958n9 r8 = (C146958n9) obj3;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        KtSLambdaShape1S0010100_I2 ktSLambdaShape1S0010100_I2 = new KtSLambdaShape1S0010100_I2(i, r8);
        ktSLambdaShape1S0010100_I2.A01 = A1X;
        ktSLambdaShape1S0010100_I2.A00 = A08;
        return ktSLambdaShape1S0010100_I2.invokeSuspend(Unit.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r3 < 10000) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A02
            X.AnonymousClass0OU.A00(r6)
            if (r0 == 0) goto L_0x0017
            boolean r3 = r5.A01
            long r0 = r5.A00
            java.lang.String r1 = X.C19591Ayr.A03(r0)
            r0 = 20
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r2.<init>((int) r0, (java.lang.String) r1, (boolean) r3)
            return r2
        L_0x0017:
            boolean r0 = r5.A01
            long r3 = r5.A00
            if (r0 == 0) goto L_0x0024
            r1 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            r0 = 13
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0010000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0010000_I2
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape1S0010100_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
