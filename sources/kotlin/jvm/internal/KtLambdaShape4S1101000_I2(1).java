package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.C02220Ah;

public class KtLambdaShape4S1101000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S1101000_I2(Object obj, String str, int i, int i2) {
        super(2);
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = str;
        this.A00 = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c7, code lost:
        r9.CuJ();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
        /*
            r27 = this;
            r7 = r27
            r9 = r28
            int r0 = r7.A03
            r1 = r29
            switch(r0) {
                case 0: goto L_0x018f;
                case 1: goto L_0x017a;
                case 2: goto L_0x0165;
                case 3: goto L_0x0150;
                case 4: goto L_0x013b;
                case 5: goto L_0x0126;
                case 6: goto L_0x00f6;
                case 7: goto L_0x00e1;
                case 8: goto L_0x00cc;
                case 9: goto L_0x004a;
                case 10: goto L_0x0021;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.8nY r3 = X.C86104wH.A0H(r9, r1)
            java.lang.String r2 = r7.A02
            java.lang.Object r1 = r7.A01
            X.0ZU r1 = (X.AnonymousClass0ZU) r1
            int r0 = r7.A00
            int r0 = X.C115796vv.A00(r0)
            X.AnonymousClass7KS.A0A(r1, r2, r3, r0)
        L_0x001e:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0021:
            X.8nY r9 = (X.C147188nY) r9
            int r0 = X.AnonymousClass0wJ.A04(r1)
            r1 = r0 & 11
            r0 = 2
            if (r1 != r0) goto L_0x0032
            boolean r0 = r9.BCM()
            if (r0 != 0) goto L_0x00c7
        L_0x0032:
            X.7If r6 = X.AnonymousClass7J9.A04(r9)
            r5 = 77433538(0x49d8ac2, float:3.703795E-36)
            java.lang.Object r4 = r7.A01
            java.lang.String r3 = r7.A02
            int r2 = r7.A00
            r1 = 9
            kotlin.jvm.internal.KtLambdaShape4S1101000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape4S1101000_I2
            r0.<init>(r4, r3, r2, r1)
            X.AnonymousClass7JR.A04(r9, r6, r0, r5)
            goto L_0x001e
        L_0x004a:
            X.8nY r9 = (X.C147188nY) r9
            int r0 = X.AnonymousClass0wJ.A04(r1)
            r0 = r0 & 11
            r3 = 2
            if (r0 != r3) goto L_0x005b
            boolean r0 = r9.BCM()
            if (r0 != 0) goto L_0x00c7
        L_0x005b:
            X.7Wm r2 = androidx.compose.ui.Modifier.A00
            java.lang.Object r1 = r7.A01
            X.8m5 r1 = (X.C146348m5) r1
            X.66z r0 = X.C968666z.SMALL
            float r0 = r1.BgG(r0)
            androidx.compose.ui.Modifier r2 = X.AnonymousClass7Kq.A07(r2, r0)
            r0 = 12
            float r1 = (float) r0
            r0 = 5
            androidx.compose.ui.Modifier r2 = X.AnonymousClass7K4.A06(r2, r1, r0)
            X.8p4 r1 = X.AnonymousClass7J3.A02
            X.8cu r0 = X.AnonymousClass7KV.A04
            java.lang.String r15 = r7.A02
            int r6 = r7.A00
            X.8ly r8 = X.C147188nY.A0e(r1, r9, r0)
            java.lang.Object r7 = X.C147188nY.A0p(r9)
            java.lang.Object r5 = X.C147188nY.A0n(r9)
            java.lang.Object r4 = X.C147188nY.A0m(r9)
            X.0ZU r1 = X.AnonymousClass74X.A00
            X.0YM r0 = X.C98236Es.A00(r2)
            r2 = r9
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            X.C147188nY.A0w(r9, r2, r1)
            r16 = 0
            X.AnonymousClass7W3.A0a(r9, r2, r8, r7)
            X.AnonymousClass7KP.A07(r9, r5, r4, r0)
            r0 = -548119842(0xffffffffdf545ade, float:-1.5301787E19)
            r9.Cvb(r0)
            r10 = 0
            r22 = 0
            r1 = 1
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r19 = r6 & 14
            r19 = r19 | r0
            r20 = 6
            r21 = 2558(0x9fe, float:3.585E-42)
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r17 = r1
            r18 = r3
            r24 = r22
            r26 = r16
            X.AnonymousClass7I9.A02(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26)
            X.AnonymousClass7W3.A0v(r2, r1)
            goto L_0x001e
        L_0x00c7:
            r9.CuJ()
            goto L_0x001e
        L_0x00cc:
            X.8nY r3 = X.C86104wH.A0H(r9, r1)
            java.lang.String r2 = r7.A02
            java.lang.Object r1 = r7.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            int r0 = r7.A00
            int r0 = X.C115796vv.A00(r0)
            X.C122087Kb.A08(r3, r2, r1, r0)
            goto L_0x001e
        L_0x00e1:
            X.8nY r3 = X.C86104wH.A0H(r9, r1)
            java.lang.String r2 = r7.A02
            java.lang.Object r1 = r7.A01
            X.21p r1 = (X.C305121p) r1
            int r0 = r7.A00
            int r0 = X.C115796vv.A00(r0)
            X.AnonymousClass7Hx.A04(r3, r1, r2, r0)
            goto L_0x001e
        L_0x00f6:
            X.8nY r5 = X.C86104wH.A0H(r9, r1)
            java.lang.Object r4 = r7.A01
            X.6uo r4 = (X.C115286uo) r4
            java.lang.String r3 = r7.A02
            int r0 = r7.A00
            int r2 = X.C115796vv.A00(r0)
            X.AnonymousClass0wJ.A1N(r4, r3)
            r0 = -496698969(0xffffffffe264f9a7, float:-1.05596175E21)
            r5.Cvd(r0)
            float r1 = X.C103826an.A01
            int r0 = r2 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | 56
            X.C121417Fv.A02(r5, r4, r3, r1, r0)
            X.8nW r1 = r5.AKE()
            if (r1 == 0) goto L_0x001e
            r0 = 6
            X.C147178nW.A06(r1, r4, r3, r2, r0)
            goto L_0x001e
        L_0x0126:
            X.8nY r3 = X.C86104wH.A0H(r9, r1)
            java.lang.String r2 = r7.A02
            java.lang.Object r1 = r7.A01
            X.8ms r1 = (X.C146798ms) r1
            int r0 = r7.A00
            int r0 = X.C115796vv.A00(r0)
            X.C121747Hv.A03(r3, r1, r2, r0)
            goto L_0x001e
        L_0x013b:
            X.8nY r3 = X.C86104wH.A0H(r9, r1)
            java.lang.String r2 = r7.A02
            java.lang.Object r1 = r7.A01
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = r7.A00
            int r0 = X.C115796vv.A00(r0)
            X.C117846zL.A01(r3, r1, r2, r0)
            goto L_0x001e
        L_0x0150:
            X.8nY r3 = X.C86104wH.A0H(r9, r1)
            java.lang.String r2 = r7.A02
            java.lang.Object r1 = r7.A01
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = r7.A00
            int r0 = X.C115796vv.A00(r0)
            X.C100236Mn.A00(r3, r1, r2, r0)
            goto L_0x001e
        L_0x0165:
            X.8nY r3 = X.C86104wH.A0H(r9, r1)
            java.lang.Object r2 = r7.A01
            X.0ZU r2 = (X.AnonymousClass0ZU) r2
            java.lang.String r1 = r7.A02
            int r0 = r7.A00
            int r0 = X.C115796vv.A00(r0)
            X.C117726z9.A01(r2, r1, r3, r0)
            goto L_0x001e
        L_0x017a:
            X.8nY r3 = X.C86104wH.A0H(r9, r1)
            java.lang.String r2 = r7.A02
            java.lang.Object r1 = r7.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            int r0 = r7.A00
            int r0 = X.C115796vv.A00(r0)
            X.C120867Cw.A01(r3, r2, r1, r0)
            goto L_0x001e
        L_0x018f:
            X.8nY r3 = X.C86104wH.A0H(r9, r1)
            java.lang.String r2 = r7.A02
            java.lang.Object r1 = r7.A01
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = r7.A00
            int r0 = X.C115796vv.A00(r0)
            X.AnonymousClass7BT.A01(r3, r1, r2, r0)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape4S1101000_I2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
