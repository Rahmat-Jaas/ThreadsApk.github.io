package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass55C;
import X.AnonymousClass7GN;
import X.AnonymousClass7IK;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C111346nB;
import X.C147188nY;
import X.C86104wH;

public class KtLambdaShape3S0000000_I2 extends C02220Ah implements AnonymousClass0YM {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S0000000_I2(int i) {
        super(3);
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.A00;
        C147188nY A0H = C86104wH.A0H(obj2, obj3);
        A0H.Cvb(359872873);
        C111346nB r0 = AnonymousClass7IK.A0N;
        switch (i) {
            case 0:
                AnonymousClass7IK A002 = r0.A00(A0H);
                boolean A0y = C147188nY.A0y(A0H, A002);
                AnonymousClass7W3 r3 = (AnonymousClass7W3) A0H;
                Object A13 = r3.A13();
                if (A0y || A13 == AnonymousClass7GN.A00) {
                    A13 = new AnonymousClass55C(A002.A03);
                    r3.A14(A13);
                }
                AnonymousClass7W3.A0g(r3);
                return A13;
            case 1:
                AnonymousClass7IK A003 = r0.A00(A0H);
                boolean A0y2 = C147188nY.A0y(A0H, A003);
                AnonymousClass7W3 r32 = (AnonymousClass7W3) A0H;
                Object A132 = r32.A13();
                if (A0y2 || A132 == AnonymousClass7GN.A00) {
                    A132 = new AnonymousClass55C(A003.A05);
                    r32.A14(A132);
                }
                AnonymousClass7W3.A0g(r32);
                return A132;
            case 2:
                AnonymousClass7IK A004 = r0.A00(A0H);
                boolean A0y3 = C147188nY.A0y(A0H, A004);
                AnonymousClass7W3 r33 = (AnonymousClass7W3) A0H;
                Object A133 = r33.A13();
                if (A0y3 || A133 == AnonymousClass7GN.A00) {
                    A133 = new AnonymousClass55C(A004.A06);
                    r33.A14(A133);
                }
                AnonymousClass7W3.A0g(r33);
                return A133;
            default:
                AnonymousClass7IK A005 = r0.A00(A0H);
                boolean A0y4 = C147188nY.A0y(A0H, A005);
                AnonymousClass7W3 r34 = (AnonymousClass7W3) A0H;
                Object A134 = r34.A13();
                if (A0y4 || A134 == AnonymousClass7GN.A00) {
                    A134 = new AnonymousClass55C(A005.A07);
                    r34.A14(A134);
                }
                AnonymousClass7W3.A0g(r34);
                return A134;
        }
    }
}
