package X;

import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2;
import com.instagram.barcelona.profile.ui.ProfileViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape153S0100000_I2_8;
import kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3;
import kotlin.jvm.internal.KtLambdaShape51S0200000_I2;
import kotlin.jvm.internal.KtLambdaShape5S0300000_I2;

/* renamed from: X.8at  reason: invalid class name and case insensitive filesystem */
public final class C141398at extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C147368pE A01;
    public final /* synthetic */ C81784oM A02;
    public final /* synthetic */ C81784oM A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ C105496dW A05;
    public final /* synthetic */ AnonymousClass75b A06;
    public final /* synthetic */ C146638ma A07;
    public final /* synthetic */ AnonymousClass7p1 A08;
    public final /* synthetic */ ProfileViewModel A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ C83224qz A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141398at(C147368pE r2, C81784oM r3, C81784oM r4, Modifier modifier, C105496dW r6, AnonymousClass75b r7, C146638ma r8, AnonymousClass7p1 r9, ProfileViewModel profileViewModel, List list, C83224qz r12, int i) {
        super(4);
        this.A0A = list;
        this.A05 = r6;
        this.A08 = r9;
        this.A09 = profileViewModel;
        this.A02 = r3;
        this.A00 = i;
        this.A07 = r8;
        this.A04 = modifier;
        this.A03 = r4;
        this.A01 = r2;
        this.A0B = r12;
        this.A06 = r7;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int A042 = AnonymousClass0wJ.A04(obj2);
        C147188nY r4 = (C147188nY) obj3;
        int A043 = AnonymousClass0wJ.A04(obj4);
        Object obj5 = obj;
        C04220Ms.A0B(obj5, 0);
        if ((A043 & 14) == 0) {
            i = A043 | C147188nY.A0F(r4, obj5);
        } else {
            i = A043;
        }
        int i3 = 32;
        if ((A043 & 112) == 0) {
            i |= C147188nY.A04(r4, A042);
        }
        if ((i & 731) != 146 || !r4.BCM()) {
            int i4 = (i & 112) | (i & 14);
            AnonymousClass5HK r2 = (AnonymousClass5HK) this.A0A.get(A042);
            r4.Cvb(707980414);
            if ((i4 & 112) == 0) {
                if (!r4.ACW(A042)) {
                    i3 = 16;
                }
                i2 = i4 | i3;
            } else {
                i2 = i4;
            }
            if ((i4 & 896) == 0) {
                i2 |= C147188nY.A0H(r4, r2);
            }
            if ((i2 & 5841) == 1168 && r4.BCM()) {
                r4.CuJ();
            } else if (r2 != null) {
                C81784oM r42 = this.A03;
                Object obj6 = ((KtCSuperShape0S0510000_I2) r42.getValue()).A03;
                C146628mY r15 = r2.A00;
                C147258p3 A002 = AnonymousClass6MD.A00(r4, this.A05, r15.B2L());
                boolean A1T = AnonymousClass0wJ.A1T(A042, AnonymousClass0wJ.A04(this.A01.getValue()));
                AnonymousClass7p1 r20 = this.A08;
                r4.Cvb(511388516);
                ProfileViewModel profileViewModel = this.A09;
                boolean ACY = r4.ACY(profileViewModel);
                C81784oM r7 = this.A02;
                boolean A12 = C147188nY.A12(r4, r7, ACY);
                AnonymousClass7W3 r9 = (AnonymousClass7W3) r4;
                Object A13 = r9.A13();
                if (A12 || A13 == AnonymousClass7GN.A00) {
                    A13 = new KtLambdaShape51S0200000_I2(13, profileViewModel, r7);
                    r9.A14(A13);
                }
                AnonymousClass7W3.A0w(r9, false);
                AnonymousClass0YC r5 = (AnonymousClass0YC) A13;
                boolean A0z = C147188nY.A0z(r4, profileViewModel, 511388516);
                C146638ma r13 = this.A07;
                boolean A122 = C147188nY.A12(r4, r13, A0z);
                Object A132 = r9.A13();
                if (A122 || A132 == AnonymousClass7GN.A00) {
                    A132 = AnonymousClass7W3.A0M(r9, r13, profileViewModel, 33);
                }
                AnonymousClass7W3.A0w(r9, false);
                AnonymousClass0YP r11 = (AnonymousClass0YP) A132;
                boolean A10 = C147188nY.A10(r4, profileViewModel, r13, 511388516);
                Object A133 = r9.A13();
                if (A10 || A133 == AnonymousClass7GN.A00) {
                    A133 = new KtLambdaShape51S0200000_I2(14, profileViewModel, r13);
                    r9.A14(A133);
                }
                AnonymousClass7W3.A0w(r9, false);
                AnonymousClass0YC r0 = (AnonymousClass0YC) A133;
                KtLambdaShape5S0300000_I2 A15 = C86154wM.A15(r7, this.A06, this.A0B, 49);
                boolean A0y = C147188nY.A0y(r4, profileViewModel);
                Object A134 = r9.A13();
                if (A0y || A134 == AnonymousClass7GN.A00) {
                    A134 = new KtLambdaShape153S0100000_I2_8(profileViewModel, 3);
                    r9.A14(A134);
                }
                AnonymousClass0YY A0A2 = AnonymousClass7W3.A0A(r9, A134, false);
                boolean A102 = C147188nY.A10(r4, profileViewModel, obj6, 511388516);
                Object A135 = r9.A13();
                if (A102 || A135 == AnonymousClass7GN.A00) {
                    A135 = new KtLambdaShape42S0200000_I2_3(21, obj6, (Object) profileViewModel);
                    r9.A14(A135);
                }
                AnonymousClass0YY A0B2 = AnonymousClass7W3.A0B(r9, A135, false);
                boolean A103 = C147188nY.A10(r4, profileViewModel, r7, 511388516);
                Object A136 = r9.A13();
                if (A103 || A136 == AnonymousClass7GN.A00) {
                    A136 = AnonymousClass7W3.A0M(r9, r7, profileViewModel, 34);
                }
                AnonymousClass7W3.A0w(r9, false);
                AnonymousClass0YP r10 = (AnonymousClass0YP) A136;
                boolean A104 = C147188nY.A10(r4, profileViewModel, r7, 511388516);
                Object A137 = r9.A13();
                if (A104 || A137 == AnonymousClass7GN.A00) {
                    A137 = AnonymousClass7W3.A0M(r9, r7, profileViewModel, 35);
                }
                AnonymousClass7W3.A0w(r9, false);
                AnonymousClass0YP r6 = (AnonymousClass0YP) A137;
                Modifier modifier = this.A04;
                boolean A0y2 = C147188nY.A0y(r4, profileViewModel);
                Object A138 = r9.A13();
                if (A0y2 || A138 == AnonymousClass7GN.A00) {
                    A138 = new KtLambdaShape153S0100000_I2_8(profileViewModel, 4);
                    r9.A14(A138);
                }
                C147188nY r17 = r4;
                Modifier modifier2 = modifier;
                C146628mY r19 = r15;
                AnonymousClass6N1.A00(A002, r17, modifier2, r19, r20, A15, A0A2, A0B2, (AnonymousClass0YY) null, (AnonymousClass0YY) null, (AnonymousClass0YY) null, AnonymousClass7W3.A0A(r9, A138, false), (AnonymousClass0YY) null, r11, r10, r6, (AnonymousClass0YP) null, r5, r0, (this.A00 >> 9) & 112, 384, 0, 2023424, A1T, false, false);
                if (r15 instanceof C90335Ll) {
                    AnonymousClass7K5.A05(r4, Unit.A00, new KtSLambdaShape1S0300000_I2(profileViewModel, r42, r2, (C146958n9) null, 15));
                }
            }
            AnonymousClass7W3.A0z(r4, false);
        } else {
            r4.CuJ();
        }
        return Unit.A00;
    }
}
