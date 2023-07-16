package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4;
import kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3;

/* renamed from: X.8aw  reason: invalid class name and case insensitive filesystem */
public final class C141418aw extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ KtCSuperShape0S0100000_I2 A03;
    public final /* synthetic */ C304621k A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ AnonymousClass0ZU A08;
    public final /* synthetic */ AnonymousClass0ZU A09;
    public final /* synthetic */ AnonymousClass0YY A0A;
    public final /* synthetic */ AnonymousClass0YY A0B;
    public final /* synthetic */ AnonymousClass0YY A0C;
    public final /* synthetic */ AnonymousClass0YY A0D;
    public final /* synthetic */ AnonymousClass0YP A0E;
    public final /* synthetic */ boolean A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141418aw(Modifier modifier, KtCSuperShape0S0100000_I2 ktCSuperShape0S0100000_I2, C304621k r4, String str, List list, AnonymousClass0ZU r7, AnonymousClass0ZU r8, AnonymousClass0ZU r9, AnonymousClass0YY r10, AnonymousClass0YY r11, AnonymousClass0YY r12, AnonymousClass0YY r13, AnonymousClass0YP r14, int i, int i2, boolean z) {
        super(4);
        this.A06 = list;
        this.A0A = r10;
        this.A0D = r11;
        this.A00 = i;
        this.A03 = ktCSuperShape0S0100000_I2;
        this.A04 = r4;
        this.A0F = z;
        this.A05 = str;
        this.A02 = modifier;
        this.A01 = i2;
        this.A0E = r14;
        this.A09 = r7;
        this.A08 = r8;
        this.A07 = r9;
        this.A0B = r12;
        this.A0C = r13;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        Modifier A042;
        Modifier A043;
        C141678cb r5 = (C141678cb) obj;
        int A044 = AnonymousClass0wJ.A04(obj2);
        C147188nY r13 = (C147188nY) obj3;
        int A045 = AnonymousClass0wJ.A04(obj4);
        C04220Ms.A0B(r5, 0);
        int i3 = 4;
        if ((A045 & 14) == 0) {
            i = A045 | C147188nY.A0F(r13, r5);
        } else {
            i = A045;
        }
        if ((A045 & 112) == 0) {
            i |= C147188nY.A04(r13, A044);
        }
        if ((i & 731) != 146 || !r13.BCM()) {
            int i4 = i & 14;
            AnonymousClass8iS r1 = (AnonymousClass8iS) this.A06.get(A044);
            r13.Cvb(-1366720198);
            if ((i4 & 14) == 0) {
                if (!r13.ACY(r5)) {
                    i3 = 2;
                }
                i2 = i3 | i4;
            } else {
                i2 = i4;
            }
            if ((i4 & 112) == 0) {
                i2 |= C147188nY.A08(r13, r1);
            }
            if ((i2 & 731) != 146 || !r13.BCM()) {
                if (r1 instanceof C90405Lw) {
                    AnonymousClass0YY r7 = this.A0A;
                    AnonymousClass0YY r6 = this.A0D;
                    KtLambdaShape42S0200000_I2_3 ktLambdaShape42S0200000_I2_3 = new KtLambdaShape42S0200000_I2_3(16, (Object) this.A0B, (Object) r1);
                    KtLambdaShape20S0200000_I2_4 A0y = C86164wN.A0y(this.A0C, r1, 1);
                    int i5 = this.A00;
                    C122107Kg.A04(r13, Modifier.A04(Modifier.A02(r13, -544544766)), (C90405Lw) r1, A0y, r7, r6, ktLambdaShape42S0200000_I2_3, (i5 & 896) | 196608 | (i5 & 112), 0);
                } else if (C04220Ms.A0I(r1, AnonymousClass7pB.A00)) {
                    r13.Cvb(-544544235);
                    int size = ((AnonymousClass8s2) this.A03.A00).size();
                    C123327Wm r10 = Modifier.A00;
                    if (size == 1) {
                        A043 = C97936Dn.A00(r5, r10);
                    } else {
                        A043 = Modifier.A04(r10);
                    }
                    C146288ly A0h = C147188nY.A0h(r13, AnonymousClass7KV.A09);
                    Object A0p = C147188nY.A0p(r13);
                    Object A0n = C147188nY.A0n(r13);
                    Object A0m = C147188nY.A0m(r13);
                    AnonymousClass0ZU r12 = AnonymousClass74X.A00;
                    AnonymousClass0YM A002 = C98236Es.A00(A043);
                    AnonymousClass7W3 r3 = (AnonymousClass7W3) r13;
                    C147188nY.A0w(r13, r3, r12);
                    AnonymousClass7W3.A0a(r13, r3, A0h, A0p);
                    AnonymousClass7KP.A07(r13, A0n, A0m, A002);
                    r13.Cvb(99217011);
                    AnonymousClass6MF.A00(r13, AnonymousClass7K4.A08(AnonymousClass7Kq.A03((Alignment) null, r10, 3), 8), (AnonymousClass5HL) null, 6, 2);
                    AnonymousClass7W3.A0v(r3, true);
                } else if (C04220Ms.A0I(r1, AnonymousClass7p8.A00)) {
                    r13.Cvb(-544543846);
                    C304621k r15 = this.A04;
                    boolean z = this.A0F;
                    String str = this.A05;
                    Modifier modifier = this.A02;
                    int i6 = (this.A00 >> 27) & 14;
                    int i7 = this.A01;
                    String str2 = str;
                    C122107Kg.A06(r13, modifier, r15, str2, (i7 & 7168) | C86154wM.A02(i7, i6), 0, z);
                } else if (r1 instanceof C90395Lv) {
                    r13.Cvb(-544543729);
                    C147188nY r62 = r13;
                    C122107Kg.A03(r62, Modifier.A04(Modifier.A00), (C90395Lv) r1, this.A0E, ((this.A00 >> 6) & 112) | 384, 0);
                } else if (C04220Ms.A0I(r1, AnonymousClass7p9.A00)) {
                    r13.Cvb(-544543617);
                    C122107Kg.A00(r13, 0);
                } else if (C04220Ms.A0I(r1, AnonymousClass7pA.A00)) {
                    r13.Cvb(-544543545);
                    if (((AnonymousClass8s2) this.A03.A00).size() == 1) {
                        A042 = C97936Dn.A00(r5, Modifier.A00);
                    } else {
                        A042 = Modifier.A04(Modifier.A00);
                    }
                    r13.Cvb(1157296644);
                    AnonymousClass0ZU r52 = this.A09;
                    boolean ACY = r13.ACY(r52);
                    AnonymousClass7W3 r4 = (AnonymousClass7W3) r13;
                    Object A13 = r4.A13();
                    if (ACY || A13 == AnonymousClass7GN.A00) {
                        A13 = AnonymousClass7W3.A0K(r4, r52, 6);
                    }
                    C122107Kg.A0A(r13, A042, AnonymousClass7W3.A09(r4, A13, false), 0, 0);
                } else if (r1 instanceof C90385Lu) {
                    r13.Cvb(-544543228);
                    int i8 = ((C90385Lu) r1).A00;
                    C304621k r152 = this.A04;
                    Modifier A046 = Modifier.A04(Modifier.A00);
                    AnonymousClass0ZU r63 = this.A08;
                    AnonymousClass0ZU r53 = this.A07;
                    boolean z2 = this.A0F;
                    int i9 = this.A00;
                    AnonymousClass0ZU r17 = r53;
                    int i10 = i8;
                    AnonymousClass0ZU r16 = r63;
                    C122107Kg.A07(r13, A046, r152, r16, r17, i10, (458752 & (this.A01 << 12)) | C86134wK.A05(i9 >> 12, ((i9 >> 24) & 112) | 384), 0, z2);
                } else {
                    r13.Cvb(-544542886);
                }
                AnonymousClass7W3.A0z(r13, false);
            } else {
                r13.CuJ();
            }
            AnonymousClass7W3.A0z(r13, false);
        } else {
            r13.CuJ();
        }
        return Unit.A00;
    }
}
