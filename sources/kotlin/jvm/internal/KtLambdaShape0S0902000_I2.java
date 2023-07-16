package kotlin.jvm.internal;

import X.AnonymousClass0YC;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass5I9;
import X.AnonymousClass7GN;
import X.AnonymousClass7W3;
import X.AnonymousClass7p1;
import X.AnonymousClass8iT;
import X.C02220Ah;
import X.C04220Ms;
import X.C100366Na;
import X.C100386Nc;
import X.C121947Ix;
import X.C130247oz;
import X.C147188nY;
import X.C147368pE;
import X.C23894D0g;
import X.C86104wH;
import X.C86124wJ;
import X.C86154wM;
import X.C86164wN;
import X.C89945Hq;
import X.C90425Ly;
import X.C90435Lz;
import androidx.compose.ui.Modifier;
import com.instagram.barcelona.profile.ui.ProfileViewModel;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape0S0902000_I2 extends C02220Ah implements AnonymousClass0YC {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public final int A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0902000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i, int i2, int i3) {
        super(4);
        this.A0B = i3;
        this.A0A = obj;
        this.A05 = obj2;
        this.A01 = i;
        this.A08 = obj3;
        this.A07 = obj4;
        this.A04 = obj5;
        this.A06 = obj6;
        this.A03 = obj7;
        this.A02 = obj8;
        this.A00 = i2;
        this.A09 = obj9;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Boolean bool;
        Object obj5 = obj3;
        Object obj6 = obj;
        Object obj7 = obj2;
        Object obj8 = obj4;
        if (this.A0B != 0) {
            int A042 = AnonymousClass0wJ.A04(obj7);
            C147188nY r3 = (C147188nY) obj5;
            int A043 = AnonymousClass0wJ.A04(obj8);
            C04220Ms.A0B(obj6, 0);
            if ((A043 & 14) == 0) {
                i = A043 | C147188nY.A0F(r3, obj6);
            } else {
                i = A043;
            }
            if ((A043 & 112) == 0) {
                i |= C147188nY.A04(r3, A042);
            }
            if ((i & 731) != 146 || !r3.BCM()) {
                int i2 = i & 14;
                AnonymousClass8iT r4 = (AnonymousClass8iT) C86124wJ.A0p(this.A04, A042);
                r3.Cvb(-225898042);
                if ((i2 & 112) == 0) {
                    i2 |= C147188nY.A08(r3, r4);
                }
                if ((i2 & 721) != 144 || !r3.BCM()) {
                    if (r4 instanceof C90435Lz) {
                        r3.Cvb(-239354192);
                        C90435Lz r11 = (C90435Lz) r4;
                        String str = r11.A07;
                        ImageUrl imageUrl = r11.A00;
                        String str2 = r11.A03;
                        boolean z = r11.A0A;
                        String str3 = r11.A02;
                        String str4 = r11.A05;
                        String str5 = r11.A04;
                        Integer num = r11.A01;
                        List list = r11.A08;
                        KtLambdaShape20S0200000_I2_4 A0y = C86164wN.A0y(this.A06, r4, 7);
                        r3.Cvb(1157296644);
                        Object obj9 = this.A08;
                        boolean ACY = r3.ACY(obj9);
                        AnonymousClass7W3 r12 = (AnonymousClass7W3) r3;
                        Object A13 = r12.A13();
                        if (ACY || A13 == AnonymousClass7GN.A00) {
                            A13 = new KtLambdaShape153S0100000_I2_8(obj9, 1);
                            r12.A14(A13);
                        }
                        AnonymousClass0YY A0A2 = AnonymousClass7W3.A0A(r12, A13, false);
                        boolean A0z = C147188nY.A0z(r3, obj9, 1157296644);
                        Object A132 = r12.A13();
                        if (A0z || A132 == AnonymousClass7GN.A00) {
                            A132 = new KtLambdaShape153S0100000_I2_8(obj9, 2);
                            r12.A14(A132);
                        }
                        AnonymousClass0YY A0A3 = AnonymousClass7W3.A0A(r12, A132, false);
                        r3.Cvb(511388516);
                        Object obj10 = this.A05;
                        boolean ACY2 = r3.ACY(obj10);
                        Object obj11 = this.A09;
                        boolean A12 = C147188nY.A12(r3, obj11, ACY2);
                        Object A133 = r12.A13();
                        if (A12 || A133 == AnonymousClass7GN.A00) {
                            A133 = C86164wN.A0y(obj10, obj11, 8);
                            r12.A14(A133);
                        }
                        AnonymousClass0ZU A082 = AnonymousClass7W3.A08(r12, A133, false);
                        boolean z2 = z;
                        String str6 = str2;
                        String str7 = str3;
                        String str8 = str4;
                        C147188nY r8 = r3;
                        Modifier modifier = (Modifier) this.A03;
                        C121947Ix.A01(r8, modifier, imageUrl, num, str, str6, str7, str8, str5, list, A0y, A082, A0A2, A0A3, 134217728, 3072, 0, z2);
                    } else if (r4 instanceof C90425Ly) {
                        r3.Cvb(-239352981);
                        C90425Ly r9 = (C90425Ly) r4;
                        boolean z3 = r9.A02;
                        r3.Cvb(511388516);
                        Object obj12 = this.A0A;
                        boolean ACY3 = r3.ACY(obj12);
                        Object obj13 = this.A07;
                        boolean A122 = C147188nY.A12(r3, obj13, ACY3);
                        AnonymousClass7W3 r82 = (AnonymousClass7W3) r3;
                        Object A134 = r82.A13();
                        if (A122 || A134 == AnonymousClass7GN.A00) {
                            A134 = C86164wN.A0y(obj13, obj12, 9);
                            r82.A14(A134);
                        }
                        AnonymousClass0ZU A083 = AnonymousClass7W3.A08(r82, A134, false);
                        boolean z4 = r9.A04;
                        boolean A0z2 = C147188nY.A0z(r3, obj12, 1157296644);
                        Object A135 = r82.A13();
                        if (A0z2 || A135 == AnonymousClass7GN.A00) {
                            A135 = AnonymousClass7W3.A0K(r82, obj12, 20);
                        }
                        AnonymousClass0ZU A084 = AnonymousClass7W3.A08(r82, A135, false);
                        boolean z5 = r9.A03;
                        C23894D0g d0g = r9.A00;
                        boolean z6 = r9.A05;
                        Object obj14 = this.A02;
                        KtLambdaShape5S0300000_I2 A15 = C86154wM.A15(obj14, obj12, r4, 46);
                        C89945Hq r92 = (C89945Hq) C86104wH.A0f(this.A09);
                        if (r92 != null) {
                            bool = Boolean.valueOf(r92.A0A);
                        } else {
                            bool = null;
                        }
                        KtLambdaShape5S0300000_I2 A152 = C86154wM.A15(obj14, obj12, r4, 47);
                        C147188nY r93 = r3;
                        Modifier modifier2 = (Modifier) this.A03;
                        C100366Na.A00(r93, modifier2, d0g, bool, A083, A084, A15, A152, 0, 6, z3, z4, z5, z6);
                    } else {
                        r3.Cvb(-239351756);
                    }
                    AnonymousClass7W3.A0z(r3, false);
                } else {
                    r3.CuJ();
                }
                AnonymousClass7W3.A0z(r3, false);
            } else {
                r3.CuJ();
            }
        } else {
            C147188nY A0H = C86104wH.A0H(obj5, obj8);
            boolean A1Y = AnonymousClass0wJ.A1Y(obj6, obj7);
            String userId = ((UserSession) this.A0A).getUserId();
            Modifier A052 = Modifier.A05(Modifier.A00);
            C147368pE r112 = AnonymousClass5I9.A08.A03;
            Object obj15 = this.A05;
            boolean A0y2 = C147188nY.A0y(A0H, obj15);
            AnonymousClass7W3 r32 = (AnonymousClass7W3) A0H;
            Object A136 = r32.A13();
            if (A0y2 || A136 == AnonymousClass7GN.A00) {
                A136 = AnonymousClass7W3.A0I(r32, obj15, 23);
            }
            AnonymousClass0ZU A085 = AnonymousClass7W3.A08(r32, A136, A1Y);
            Object obj16 = this.A09;
            KtLambdaShape34S0100000_I2_14 A0z3 = C86164wN.A0z(obj16, 24);
            KtLambdaShape152S0100000_I2_7 A0t = C86164wN.A0t(obj16, 21);
            int i3 = this.A01;
            int i4 = i3 >> 6;
            int i5 = this.A00;
            AnonymousClass0YY r24 = (AnonymousClass0YY) this.A04;
            AnonymousClass0YY r25 = (AnonymousClass0YY) this.A03;
            AnonymousClass0YY r26 = (AnonymousClass0YY) this.A02;
            C100386Nc.A00(A0H, r112, A052, (C130247oz) this.A08, (AnonymousClass7p1) null, (ProfileViewModel) null, userId, (String) null, A085, A0z3, (AnonymousClass0ZU) this.A07, (AnonymousClass0ZU) this.A06, (AnonymousClass0ZU) null, A0t, r24, r25, r26, (3670016 & i4) | 48 | (i4 & 29360128) | ((i5 << 24) & 234881024) | ((i3 << 6) & 1879048192), ((i5 >> 3) & 14) | 196656, 94208, A1Y);
        }
        return Unit.A00;
    }
}
