package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape0S0201001_I2 extends C39142Kno implements AnonymousClass0YP {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        r11.A01 = r1;
        r0 = X.AnonymousClass7JH.A02(r4, r5, r6, (java.lang.Object) null, r8, (X.AnonymousClass0YY) null, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c3, code lost:
        X.AnonymousClass0OU.A00(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c8, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0047, code lost:
        r11.A01 = r6;
        r0 = r7.emit(r5, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
        if (r0 != r2) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r8 = r11
            int r0 = r11.A04
            switch(r0) {
                case 0: goto L_0x0056;
                case 1: goto L_0x0071;
                case 2: goto L_0x0096;
                default: goto L_0x0006;
            }
        L_0x0006:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r11.A01
            r6 = 1
            if (r0 != 0) goto L_0x00c3
            X.AnonymousClass0OU.A00(r12)
            java.lang.Object r1 = r11.A03
            X.C85 r1 = (X.C85) r1
            X.4wE r7 = r1.A02
            java.lang.Object r0 = r7.getValue()
            X.5I6 r0 = (X.AnonymousClass5I6) r0
            java.util.List r5 = r1.A00
            int r4 = r0.A01
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r4)
            int r1 = r5.indexOf(r0)
            java.lang.Object r3 = r11.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r3 != r0) goto L_0x0050
            int r1 = r1 + 1
        L_0x0033:
            int r0 = r5.size()
            int r1 = r1 % r0
            java.lang.Object r0 = r5.get(r1)
            int r1 = X.AnonymousClass0wJ.A04(r0)
            float r0 = r11.A00
            X.5I6 r5 = new X.5I6
            r5.<init>(r3, r0, r4, r1)
        L_0x0047:
            r11.A01 = r6
            java.lang.Object r0 = r7.emit(r5, r11)
        L_0x004d:
            if (r0 != r2) goto L_0x00c6
            return r2
        L_0x0050:
            int r1 = r1 - r6
            int r1 = X.C86164wN.A06(r5, r1)
            goto L_0x0033
        L_0x0056:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r11.A01
            r1 = 1
            if (r0 != 0) goto L_0x00c3
            X.AnonymousClass0OU.A00(r12)
            java.lang.Object r0 = r11.A03
            X.6lJ r0 = (X.C110216lJ) r0
            X.7JH r4 = r0.A01
            float r0 = r11.A00
            java.lang.Float r6 = X.C86154wM.A0W(r0)
            java.lang.Object r5 = r11.A02
            X.8fL r5 = (X.C142638fL) r5
            goto L_0x008b
        L_0x0071:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r11.A01
            r1 = 1
            if (r0 != 0) goto L_0x00c3
            X.AnonymousClass0OU.A00(r12)
            java.lang.Object r4 = r11.A02
            X.7JH r4 = (X.AnonymousClass7JH) r4
            float r0 = r11.A00
            java.lang.Float r6 = X.C86154wM.A0W(r0)
            java.lang.Object r0 = r11.A03
            X.5Hn r0 = (X.C89915Hn) r0
            X.8fL r5 = r0.A04
        L_0x008b:
            r7 = 0
            r10 = 12
            r11.A01 = r1
            r9 = r7
            java.lang.Object r0 = X.AnonymousClass7JH.A02(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x004d
        L_0x0096:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r11.A01
            r6 = 1
            if (r0 != 0) goto L_0x00c3
            X.AnonymousClass0OU.A00(r12)
            java.lang.Object r0 = r11.A03
            X.C85 r0 = (X.C85) r0
            X.4wE r7 = r0.A02
            java.lang.Object r1 = r7.getValue()
            X.5I6 r1 = (X.AnonymousClass5I6) r1
            java.lang.Object r4 = r11.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r4 != r0) goto L_0x00c0
            int r3 = r1.A02
        L_0x00b6:
            int r1 = r1.A02
            float r0 = r11.A00
            X.5I6 r5 = new X.5I6
            r5.<init>(r4, r0, r3, r1)
            goto L_0x0047
        L_0x00c0:
            int r3 = r1.A01
            goto L_0x00b6
        L_0x00c3:
            X.AnonymousClass0OU.A00(r12)
        L_0x00c6:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S0201001_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0201001_I2(Object obj, Object obj2, C146958n9 r4, float f, int i) {
        super(2, r4);
        this.A04 = i;
        this.A02 = obj;
        this.A00 = f;
        this.A03 = obj2;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        Object obj2;
        float f;
        Object obj3;
        int i;
        C146958n9 r3 = r8;
        switch (this.A04) {
            case 0:
                obj2 = this.A03;
                f = this.A00;
                obj3 = this.A02;
                i = 0;
                break;
            case 1:
                obj3 = this.A02;
                f = this.A00;
                obj2 = this.A03;
                i = 1;
                break;
            case 2:
                obj2 = this.A03;
                obj3 = this.A02;
                f = this.A00;
                i = 2;
                break;
            default:
                obj2 = this.A03;
                obj3 = this.A02;
                f = this.A00;
                i = 3;
                break;
        }
        return new KtSLambdaShape0S0201001_I2(obj3, obj2, r3, f, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S0201001_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
