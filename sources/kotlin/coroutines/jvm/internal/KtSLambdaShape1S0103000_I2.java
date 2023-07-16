package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C122847Ub;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.C8K;
import kotlin.Unit;

public class KtSLambdaShape1S0103000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0103000_I2(C122847Ub r2, C146958n9 r3, int i, int i2) {
        super(2, r3);
        this.A04 = 0;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final C146958n9 create(Object obj, C146958n9 r11) {
        C8K c8k;
        int i;
        int i2;
        int i3;
        C146958n9 r5 = r11;
        switch (this.A04) {
            case 0:
                return new KtSLambdaShape1S0103000_I2((C122847Ub) this.A03, r11, this.A00, this.A01);
            case 1:
                c8k = (C8K) this.A03;
                i = this.A01;
                i2 = this.A00;
                i3 = 1;
                break;
            case 2:
                c8k = (C8K) this.A03;
                i = this.A01;
                i2 = this.A00;
                i3 = 2;
                break;
            case 3:
                c8k = (C8K) this.A03;
                i = this.A00;
                i2 = this.A01;
                i3 = 3;
                break;
            default:
                c8k = (C8K) this.A03;
                i = this.A00;
                i2 = this.A01;
                i3 = 4;
                break;
        }
        return new KtSLambdaShape1S0103000_I2(c8k, r5, i, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ae, code lost:
        r7.A02 = r5;
        r0 = r6.emit(r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b6, code lost:
        X.AnonymousClass0OU.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bb, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r0 != r4) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A04
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x0057;
                case 2: goto L_0x0071;
                case 3: goto L_0x008c;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A02
            r3 = 1
            if (r0 != 0) goto L_0x00b6
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r0 = r7.A03
            X.C8K r0 = (X.C8K) r0
            X.4wF r2 = r0.A0P
            int r1 = r7.A00
            int r0 = r7.A01
            int r1 = r1 - r0
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r7.A02 = r3
            java.lang.Object r0 = r2.emit(r0, r7)
        L_0x0025:
            if (r0 != r4) goto L_0x00b9
            return r4
        L_0x0028:
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A02
            r1 = 1
            if (r0 != 0) goto L_0x00b6
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r3 = r7.A03
            X.7Ub r3 = (X.C122847Ub) r3
            int r2 = r7.A00
            int r0 = r7.A01
            int r2 = r2 - r0
            r0 = 0
            r7.A02 = r1
            X.7Tu r1 = X.C122777Tu.A00(r0)
            X.8pE r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            int r2 = r2 - r0
            float r0 = (float) r2
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollExtensionsKt.A00(r1, r3, r7, r0)
            if (r0 == r4) goto L_0x0025
            kotlin.Unit r0 = kotlin.Unit.A00
            goto L_0x0025
        L_0x0057:
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A02
            r5 = 1
            if (r0 != 0) goto L_0x00b6
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r0 = r7.A03
            X.C8K r0 = (X.C8K) r0
            X.4wF r6 = r0.A0Q
            int r1 = r7.A01
            int r0 = r7.A00
            X.Cf0 r3 = new X.Cf0
            r3.<init>(r1, r0, r5)
            goto L_0x00ae
        L_0x0071:
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A02
            r5 = 1
            if (r0 != 0) goto L_0x00b6
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r0 = r7.A03
            X.C8K r0 = (X.C8K) r0
            X.4wF r6 = r0.A0Q
            int r2 = r7.A01
            int r1 = r7.A00
            r0 = 0
            X.Cf0 r3 = new X.Cf0
            r3.<init>(r2, r1, r0)
            goto L_0x00ae
        L_0x008c:
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A02
            r5 = 1
            if (r0 != 0) goto L_0x00b6
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r0 = r7.A03
            X.C8K r0 = (X.C8K) r0
            X.4wF r6 = r0.A0R
            int r0 = r7.A00
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            int r1 = r7.A01
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            kotlin.Pair r3 = X.C18180wK.A0p(r2, r0)
        L_0x00ae:
            r7.A02 = r5
            java.lang.Object r0 = r6.emit(r3, r7)
            goto L_0x0025
        L_0x00b6:
            X.AnonymousClass0OU.A00(r8)
        L_0x00b9:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape1S0103000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape1S0103000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0103000_I2(C8K c8k, C146958n9 r3, int i, int i2, int i3) {
        super(2, r3);
        this.A04 = i3;
        this.A03 = c8k;
        switch (i3) {
            case 1:
            case 2:
                this.A01 = i;
                this.A00 = i2;
                break;
            default:
                this.A00 = i;
                this.A01 = i2;
                break;
        }
    }
}
