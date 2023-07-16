package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.internal.IDxRImplShape181S0000000_1_I2;

/* renamed from: X.8Yw  reason: invalid class name and case insensitive filesystem */
public final class C140888Yw extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass3CI A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ AnonymousClass0YP A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140888Yw(AnonymousClass3CI r2, Integer num, AnonymousClass0YP r4, int i, int i2, boolean z) {
        super(3);
        this.A05 = z;
        this.A03 = num;
        this.A02 = r2;
        this.A00 = i;
        this.A04 = r4;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147188nY r6 = (C147188nY) obj2;
        int A042 = AnonymousClass0wJ.A04(obj3);
        C04220Ms.A0B(obj, 0);
        if ((A042 & 81) != 16 || !r6.BCM()) {
            if (this.A05) {
                r6.Cvb(1443306760);
                r6.Cvb(1443306774);
                Integer num = this.A03;
                if (num != null) {
                    float f = (float) 0;
                    Modifier A052 = AnonymousClass7K4.A05(Modifier.A00, f, f, (float) 4, f);
                    AnonymousClass3CI r3 = this.A02;
                    boolean A0z = C147188nY.A0z(r6, r3, 1157296644);
                    AnonymousClass7W3 r1 = (AnonymousClass7W3) r6;
                    Object A13 = r1.A13();
                    if (A0z || A13 == AnonymousClass7GN.A00) {
                        A13 = new IDxRImplShape181S0000000_1_I2(r3, 9);
                        r1.A14(A13);
                    }
                    AnonymousClass7W3.A0w(r1, false);
                    AnonymousClass7KS.A04(r6, A052, AnonymousClass70Q.A00(r6), AnonymousClass7JS.A01(r6, num.intValue()), (AnonymousClass0ZU) ((AnonymousClass0A8) A13), 384, 0);
                }
                AnonymousClass7W3 A043 = AnonymousClass7W3.A04(r6, false);
                AnonymousClass3CI r2 = this.A02;
                boolean A0z2 = C147188nY.A0z(r6, r2, 1157296644);
                Object A132 = A043.A13();
                if (A0z2 || A132 == AnonymousClass7GN.A00) {
                    A132 = new IDxRImplShape181S0000000_1_I2(r2, 10);
                    A043.A14(A132);
                }
                AnonymousClass7W3.A0w(A043, false);
                C147188nY r7 = r6;
                AnonymousClass7KS.A04(r7, (Modifier) null, AnonymousClass70Q.A01(r6, 1, false), AnonymousClass7JS.A01(r6, 2131824870), (AnonymousClass0ZU) ((AnonymousClass0A8) A132), 0, 4);
            } else {
                r6.Cvb(1443307315);
                C86104wH.A1S(r6, this.A04, this.A01);
            }
            AnonymousClass7W3.A0z(r6, false);
        } else {
            r6.CuJ();
        }
        return Unit.A00;
    }
}
