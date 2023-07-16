package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape3S0001000_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public final int A01;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        if (X.AnonymousClass0wJ.A1X(((X.C139808Pj) X.C103206Yf.A00).invoke(r5)) == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c6, code lost:
        r5.A8U(r1, r0);
        r5.A8S("scan limit ", r14.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d0, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        return java.lang.Integer.valueOf(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            r5 = r15
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x011c;
                case 1: goto L_0x0060;
                case 2: goto L_0x0053;
                case 3: goto L_0x0046;
                case 4: goto L_0x011c;
                case 5: goto L_0x0060;
                case 6: goto L_0x0053;
                case 7: goto L_0x0046;
                case 8: goto L_0x003e;
                case 9: goto L_0x010b;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0006;
                case 12: goto L_0x0006;
                case 13: goto L_0x00bc;
                case 14: goto L_0x00b1;
                case 15: goto L_0x00a6;
                case 16: goto L_0x0029;
                case 17: goto L_0x0026;
                case 18: goto L_0x007d;
                case 19: goto L_0x0020;
                case 20: goto L_0x0012;
                case 21: goto L_0x006d;
                default: goto L_0x0006;
            }
        L_0x0006:
            int r2 = X.AnonymousClass0wJ.A04(r15)
            int r0 = r14.A00
            int r2 = r2 + r0
        L_0x000d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            return r5
        L_0x0012:
            int r1 = X.AnonymousClass0wJ.A04(r15)
            r2 = 100
            if (r1 < 0) goto L_0x000d
            int r0 = r14.A00
            if (r1 >= r0) goto L_0x000d
            r2 = 1
            goto L_0x000d
        L_0x0020:
            X.C86144wL.A1M(r15)
            int r2 = r14.A00
            goto L_0x000d
        L_0x0026:
            int r2 = r14.A00
            goto L_0x000d
        L_0x0029:
            X.Cg2 r5 = (X.C22775Cg2) r5
            if (r5 == 0) goto L_0x003c
            int r1 = r14.A00
            int r0 = r5.A04()
            double r2 = (double) r0
            double r0 = (double) r1
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)
            int r2 = (int) r0
            goto L_0x000d
        L_0x003c:
            r2 = 0
            goto L_0x000d
        L_0x003e:
            r0 = 0
            X.C04220Ms.A0B(r15, r0)
            int r0 = r14.A00
            int r2 = -r0
            goto L_0x000d
        L_0x0046:
            X.8nT r5 = (X.C147148nT) r5
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            int r0 = r14.A00
            int r2 = r5.BgM(r0)
            goto L_0x000d
        L_0x0053:
            X.8nT r5 = (X.C147148nT) r5
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            int r0 = r14.A00
            int r2 = r5.BgJ(r0)
            goto L_0x000d
        L_0x0060:
            X.8nT r5 = (X.C147148nT) r5
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            int r0 = r14.A00
            int r2 = r5.BfB(r0)
            goto L_0x000d
        L_0x006d:
            android.content.Context r1 = X.C86154wM.A0A(r15)
            int r0 = r14.A00
            int r0 = r1.getColor(r0)
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
            r5.<init>(r0)
            return r5
        L_0x007d:
            X.GV7 r5 = (X.GV7) r5
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            int r1 = r14.A00
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r0) goto L_0x0091
            X.HEL r0 = r5.A0I
            int r0 = r0.A00()
            if (r0 != r1) goto L_0x00a0
        L_0x0091:
            X.0YY r0 = X.C103206Yf.A00
            X.8Pj r0 = (X.C139808Pj) r0
            java.lang.Object r0 = r0.invoke(r5)
            boolean r1 = X.AnonymousClass0wJ.A1X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x00a6:
            X.0oo r5 = (X.C14100oo) r5
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            java.lang.String r1 = "profile"
            java.lang.String r0 = "unknown profile"
            goto L_0x00c6
        L_0x00b1:
            X.0oo r5 = (X.C14100oo) r5
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            java.lang.String r1 = "profile"
            java.lang.String r0 = "e15"
            goto L_0x00c6
        L_0x00bc:
            X.0oo r5 = (X.C14100oo) r5
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            java.lang.String r1 = "profile"
            java.lang.String r0 = "e35"
        L_0x00c6:
            r5.A8U(r1, r0)
            int r1 = r14.A00
            java.lang.String r0 = "scan limit "
            r5.A8S(r0, r1)
            return r5
        L_0x00d1:
            X.5J1 r5 = (X.AnonymousClass5J1) r5
            r10 = 0
            X.C04220Ms.A0B(r5, r10)
            X.8s2 r0 = r5.A05
            int r4 = r14.A00
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x00e3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r1 = r2.next()
            X.8lm r1 = (X.C146178lm) r1
            int r0 = r1.AnQ()
            if (r0 == r4) goto L_0x00e3
            r3.add(r1)
            goto L_0x00e3
        L_0x00f9:
            X.8s2 r8 = X.AnonymousClass7C0.A00(r3)
            r3 = 0
            r9 = 991(0x3df, float:1.389E-42)
            r4 = r3
            r6 = r3
            r7 = r3
            r11 = r10
            r12 = r10
            r13 = r10
            X.5J1 r5 = X.AnonymousClass5J1.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        L_0x010b:
            X.I0o r5 = (X.C34094I0o) r5
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            int r1 = r14.A00
            X.K01 r5 = (X.K01) r5
            android.database.sqlite.SQLiteDatabase r0 = r5.A00
            r0.setVersion(r1)
            r5 = 0
            return r5
        L_0x011c:
            X.8nT r5 = (X.C147148nT) r5
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            int r0 = r14.A00
            int r0 = r5.Bf8(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape3S0001000_I2.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S0001000_I2(int i, int i2) {
        super(1);
        this.A01 = i2;
        this.A00 = i;
    }
}
