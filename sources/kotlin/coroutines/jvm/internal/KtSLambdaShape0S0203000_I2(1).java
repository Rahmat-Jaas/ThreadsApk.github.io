package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C122847Ub;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.C83224qz;
import X.C8K;
import X.D0Y;
import kotlin.Unit;

public class KtSLambdaShape0S0203000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0203000_I2(D0Y d0y, C8K c8k, C146958n9 r4, int i, int i2, int i3) {
        super(2, r4);
        this.A05 = i3;
        this.A04 = c8k;
        this.A03 = d0y;
        if (1 - i3 != 0) {
            this.A00 = i;
            this.A01 = i2;
        } else {
            this.A01 = i;
            this.A00 = i2;
        }
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        C8K c8k;
        D0Y d0y;
        int i;
        int i2;
        int i3;
        C146958n9 r3 = r9;
        switch (this.A05) {
            case 0:
                return new KtSLambdaShape0S0203000_I2((C122847Ub) this.A04, r3, (C83224qz) this.A03, this.A00, this.A01);
            case 1:
                c8k = (C8K) this.A04;
                d0y = (D0Y) this.A03;
                i = this.A01;
                i2 = this.A00;
                i3 = 1;
                break;
            default:
                c8k = (C8K) this.A04;
                d0y = (D0Y) this.A03;
                i = this.A00;
                i2 = this.A01;
                i3 = 2;
                break;
        }
        return new KtSLambdaShape0S0203000_I2(d0y, c8k, r3, i, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        X.AnonymousClass0OU.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2(new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0102000_I2(r3, r2, r0), r4);
        r8.A02 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (r5.emit(r0, r8) != r6) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r1 = r8.A05
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A02
            switch(r1) {
                case 0: goto L_0x004d;
                case 1: goto L_0x0032;
                default: goto L_0x0009;
            }
        L_0x0009:
            r7 = 1
            if (r0 != 0) goto L_0x0049
            X.AnonymousClass0OU.A00(r9)
            java.lang.Object r0 = r8.A04
            X.C8K r0 = (X.C8K) r0
            X.4wF r5 = r0.A0N
            java.lang.Integer r4 = X.AnonymousClass006.A0C
            java.lang.Object r3 = r8.A03
            X.D0Y r3 = (X.D0Y) r3
            int r2 = r8.A00
            int r0 = r8.A01
        L_0x001f:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0102000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0102000_I2
            r1.<init>((X.D0Y) r3, (int) r2, (int) r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r0.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0102000_I2) r1, (java.lang.Integer) r4)
            r8.A02 = r7
            java.lang.Object r0 = r5.emit(r0, r8)
            if (r0 != r6) goto L_0x0069
            return r6
        L_0x0032:
            r7 = 1
            if (r0 != 0) goto L_0x0049
            X.AnonymousClass0OU.A00(r9)
            java.lang.Object r0 = r8.A04
            X.C8K r0 = (X.C8K) r0
            X.4wF r5 = r0.A0N
            java.lang.Integer r4 = X.AnonymousClass006.A0N
            java.lang.Object r3 = r8.A03
            X.D0Y r3 = (X.D0Y) r3
            int r2 = r8.A01
            int r0 = r8.A00
            goto L_0x001f
        L_0x0049:
            X.AnonymousClass0OU.A00(r9)
            goto L_0x0069
        L_0x004d:
            r1 = 1
            if (r0 == 0) goto L_0x006c
            X.AnonymousClass0OU.A00(r9)
        L_0x0053:
            java.lang.Object r5 = r8.A03
            X.4qz r5 = (X.C83224qz) r5
            r4 = 0
            java.lang.Object r3 = r8.A04
            X.7Ub r3 = (X.C122847Ub) r3
            int r2 = r8.A00
            int r0 = r8.A01
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0103000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0103000_I2
            r1.<init>(r3, r4, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r4, r4, r1, r5, r0)
        L_0x0069:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x006c:
            X.AnonymousClass0OU.A00(r9)
            r8.A02 = r1
            android.view.Choreographer r2 = X.AnonymousClass6a3.choreographer
            X.8n9 r0 = X.C25598DoY.A02(r8)
            X.EnC r3 = new X.EnC
            r3.<init>(r1, r0)
            if (r2 == 0) goto L_0x0091
            r3.A0D()
            r1 = 2
            com.facebook.redex.IDxFCallbackShape472S0100000_2_I2 r0 = new com.facebook.redex.IDxFCallbackShape472S0100000_2_I2
            r0.<init>(r3, r1)
            r2.postFrameCallback(r0)
        L_0x008a:
            java.lang.Object r0 = r3.A0B()
            if (r0 != r6) goto L_0x0053
            return r6
        L_0x0091:
            r3.A0D()
            X.8bg r2 = X.AnonymousClass6ZB.A00
            X.869 r1 = X.AnonymousClass869.A00
            X.80L r0 = new X.80L
            r0.<init>(r3)
            r2.A05(r0, r1)
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S0203000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S0203000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0203000_I2(C122847Ub r2, C146958n9 r3, C83224qz r4, int i, int i2) {
        super(2, r3);
        this.A05 = 0;
        this.A03 = r4;
        this.A04 = r2;
        this.A00 = i;
        this.A01 = i2;
    }
}
