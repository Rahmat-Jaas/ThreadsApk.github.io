package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.C02220Ah;

public class KtLambdaShape2S0301100_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S0301100_I2(Object obj, Object obj2, Object obj3, int i, int i2, long j) {
        super(2);
        this.A05 = i2;
        this.A01 = j;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A00 = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int r0 = r10.A05
            switch(r0) {
                case 0: goto L_0x00c7;
                case 1: goto L_0x00aa;
                case 2: goto L_0x0032;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.8nY r11 = (X.C147188nY) r11
            int r0 = X.AnonymousClass0wJ.A04(r12)
            r0 = r0 & 11
            r7 = 2
            if (r0 != r7) goto L_0x0016
            boolean r0 = r11.BCM()
            if (r0 != 0) goto L_0x00a6
        L_0x0016:
            X.7If r1 = X.AnonymousClass7J9.A04(r11)
            r0 = 1239759876(0x49e53c04, float:1877888.5)
            long r8 = r10.A01
            java.lang.Object r3 = r10.A02
            java.lang.Object r4 = r10.A04
            java.lang.Object r5 = r10.A03
            int r6 = r10.A00
            kotlin.jvm.internal.KtLambdaShape2S0301100_I2 r2 = new kotlin.jvm.internal.KtLambdaShape2S0301100_I2
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.AnonymousClass7JR.A04(r11, r1, r2, r0)
        L_0x002f:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0032:
            X.8nY r11 = (X.C147188nY) r11
            int r0 = X.AnonymousClass0wJ.A04(r12)
            r1 = r0 & 11
            r0 = 2
            if (r1 != r0) goto L_0x0043
            boolean r0 = r11.BCM()
            if (r0 != 0) goto L_0x00a6
        L_0x0043:
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            long r2 = r10.A01
            java.lang.Object r1 = r10.A02
            X.7X6 r1 = (X.AnonymousClass7X6) r1
            androidx.compose.ui.Modifier r0 = X.C115656vh.A01(r0, r1, r2)
            androidx.compose.ui.Modifier r1 = X.C115826vy.A01(r0, r1)
            java.lang.Object r0 = r10.A04
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.ui.Modifier r3 = r1.Cx6(r0)
            X.8p4 r2 = X.AnonymousClass7J3.A02
            X.8cu r1 = X.AnonymousClass7KV.A04
            java.lang.Object r8 = r10.A03
            X.0YM r8 = (X.AnonymousClass0YM) r8
            int r0 = r10.A00
            int r0 = r0 >> 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r9 = r0 | 432(0x1b0, float:6.05E-43)
            X.8ly r7 = X.C147188nY.A0e(r2, r11, r1)
            int r0 = r9 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            java.lang.Object r6 = X.C147188nY.A0p(r11)
            java.lang.Object r5 = X.C147188nY.A0n(r11)
            java.lang.Object r4 = X.C147188nY.A0m(r11)
            X.0ZU r2 = X.AnonymousClass74X.A00
            X.0YM r1 = X.C98236Es.A00(r3)
            int r0 = X.C86114wI.A01(r0)
            r3 = r11
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            X.C147188nY.A0w(r11, r3, r2)
            r2 = 0
            X.AnonymousClass7W3.A0a(r11, r3, r7, r6)
            X.AnonymousClass7KP.A08(r11, r5, r4, r1, r0)
            X.7VA r1 = X.AnonymousClass7VA.A00
            int r0 = X.C86124wJ.A05(r9)
            X.C86104wH.A1R(r1, r11, r8, r0)
            X.AnonymousClass7W3.A0d(r3)
            X.AnonymousClass7W3.A0w(r3, r2)
            goto L_0x002f
        L_0x00a6:
            r11.CuJ()
            goto L_0x002f
        L_0x00aa:
            X.8nY r1 = X.C86104wH.A0H(r11, r12)
            java.lang.Object r2 = r10.A02
            X.17I r2 = (X.AnonymousClass17I) r2
            long r6 = r10.A01
            java.lang.Object r3 = r10.A03
            X.0YY r3 = (X.AnonymousClass0YY) r3
            java.lang.Object r4 = r10.A04
            X.0YY r4 = (X.AnonymousClass0YY) r4
            int r0 = r10.A00
            int r5 = X.C115796vv.A00(r0)
            X.C121397Ft.A01(r1, r2, r3, r4, r5, r6)
            goto L_0x002f
        L_0x00c7:
            X.8nY r1 = X.C86104wH.A0H(r11, r12)
            java.lang.Object r2 = r10.A02
            java.util.List r2 = (java.util.List) r2
            long r6 = r10.A01
            java.lang.Object r3 = r10.A03
            X.0YY r3 = (X.AnonymousClass0YY) r3
            java.lang.Object r4 = r10.A04
            X.0YY r4 = (X.AnonymousClass0YY) r4
            int r0 = r10.A00
            int r5 = X.C115796vv.A00(r0)
            X.C121397Ft.A03(r1, r2, r3, r4, r5, r6)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape2S0301100_I2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
