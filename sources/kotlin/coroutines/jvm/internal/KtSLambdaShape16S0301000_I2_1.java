package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YM;
import X.C146958n9;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape16S0301000_I2_1 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape16S0301000_I2_1(Object obj, C146958n9 r3, int i) {
        super(3, r3);
        this.A04 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A04;
        C146958n9 r6 = (C146958n9) obj3;
        Object obj4 = this.A01;
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
            default:
                i = 4;
                break;
        }
        KtSLambdaShape16S0301000_I2_1 ktSLambdaShape16S0301000_I2_1 = new KtSLambdaShape16S0301000_I2_1(obj4, r6, i);
        ktSLambdaShape16S0301000_I2_1.A02 = obj;
        ktSLambdaShape16S0301000_I2_1.A03 = obj2;
        return ktSLambdaShape16S0301000_I2_1.invokeSuspend(Unit.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        X.AnonymousClass0OU.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0 != r6) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A04
            switch(r0) {
                case 2: goto L_0x003a;
                case 3: goto L_0x0061;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0022
            if (r0 != r3) goto L_0x0084
            java.lang.Object r2 = r7.A02
            X.4r0 r2 = (X.C83234r0) r2
            X.AnonymousClass0OU.A00(r8)
        L_0x0016:
            r0 = 0
            r7.A02 = r0
            r7.A00 = r4
            java.lang.Object r0 = r2.emit(r8, r7)
        L_0x001f:
            if (r0 != r6) goto L_0x0087
            return r6
        L_0x0022:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r2 = r7.A02
            X.4r0 r2 = (X.C83234r0) r2
            java.lang.Object r1 = r7.A03
            java.lang.Object r0 = r7.A01
            X.0YP r0 = (X.AnonymousClass0YP) r0
            r7.A02 = r2
            r7.A00 = r3
            java.lang.Object r8 = r0.invoke(r1, r7)
            if (r8 != r6) goto L_0x0016
            return r6
        L_0x003a:
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 == r5) goto L_0x0084
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0048:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r4 = r7.A02
            java.lang.Object r3 = r7.A03
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object r2 = r7.A01
            X.0YC r2 = (X.AnonymousClass0YC) r2
            r0 = 0
            r1 = r3[r0]
            r0 = r3[r5]
            r7.A00 = r5
            java.lang.Object r0 = r2.invoke(r4, r1, r0, r7)
            goto L_0x001f
        L_0x0061:
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r4 = 1
            if (r0 == 0) goto L_0x006f
            if (r0 == r4) goto L_0x0084
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x006f:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r3 = r7.A02
            java.lang.Object r2 = r7.A03
            java.lang.Object r1 = r7.A01
            X.0YM r1 = (X.AnonymousClass0YM) r1
            r0 = 0
            r7.A02 = r0
            r7.A00 = r4
            java.lang.Object r0 = r1.invoke(r3, r2, r7)
            goto L_0x001f
        L_0x0084:
            X.AnonymousClass0OU.A00(r8)
        L_0x0087:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape16S0301000_I2_1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
