package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0402000_I2;
import kotlin.jvm.internal.KtLambdaShape9S0401000_I2;

/* renamed from: X.6vt  reason: invalid class name and case insensitive filesystem */
public final class C115776vt {
    public static final void A00(C114886u3 r12, C147188nY r13, Modifier modifier, AnonymousClass0YY r15, AnonymousClass0YP r16, int i, int i2) {
        int i3;
        AnonymousClass0YY r7 = r15;
        AnonymousClass0YP r6 = r16;
        Modifier modifier2 = modifier;
        AnonymousClass0wJ.A1Q(r15, r6);
        C147188nY r2 = r13;
        r13.Cvd(2078139907);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r13, modifier) | i;
        } else {
            i3 = i6;
        }
        C114886u3 r8 = r12;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r13, r12);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 896) == 0) {
            i3 |= C147188nY.A0B(r13, r15);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i3 |= C147188nY.A0C(r13, r6);
        }
        if ((i3 & 5851) != 1170 || !r13.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            AnonymousClass7W3 A0Z = C147188nY.A0Z(r13, -492369756);
            Object A13 = A0Z.A13();
            Object obj = AnonymousClass7GN.A00;
            if (A13 == obj) {
                A13 = new C123207Vw();
                A0Z.A14(A13);
            }
            AnonymousClass7W3.A0w(A0Z, false);
            C123207Vw r132 = (C123207Vw) A13;
            Object A0r = C147188nY.A0r(r2, A0Z, -492369756);
            if (A0r == obj) {
                A0r = new AnonymousClass7F8(r132);
                A0Z.A14(A0r);
            }
            AnonymousClass7W3.A0w(A0Z, false);
            AnonymousClass7F8 r3 = (AnonymousClass7F8) A0r;
            r3.A02 = (C142938fq) r2.AEA(AnonymousClass7DE.A05);
            r3.A04 = (C143038g0) r2.AEA(AnonymousClass7DE.A01);
            r3.A05 = (C143048g1) r2.AEA(AnonymousClass7DE.A0A);
            r3.A06 = r15;
            r3.A08.CrC(r12);
            if (r12 != null) {
                AnonymousClass7F8.A01(r3);
            }
            C115756vr.A00(r3, r2, AnonymousClass7JR.A00(r2, new KtLambdaShape9S0401000_I2(r132, r6, modifier2, r3, i3, 1), -123806316), 56);
            AnonymousClass7K5.A04(r2, r3, C86154wM.A0z(r3, 29));
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0402000_I2(r6, r7, r8, modifier2, i6, i4, 1));
        }
    }

    public static final void A01(C147188nY r13, Modifier modifier, AnonymousClass0YP r15, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0YP r10 = r15;
        C04220Ms.A0B(r15, 1);
        C147188nY r7 = r13;
        r13.Cvd(-1075498320);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r7, modifier) | i;
        } else {
            i3 = i6;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r7, r10);
        }
        if ((i3 & 91) != 18 || !r7.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            AnonymousClass7W3 A0Y = C147188nY.A0Y(r7);
            Object A13 = A0Y.A13();
            Object obj = AnonymousClass7GN.A00;
            if (A13 == obj) {
                A13 = AnonymousClass7WR.A00(A0Y, (Object) null);
            }
            AnonymousClass7W3.A0w(A0Y, false);
            C81784oM r4 = (C81784oM) A13;
            C114886u3 r6 = (C114886u3) r4.getValue();
            boolean A0y = C147188nY.A0y(r7, r4);
            Object A132 = A0Y.A13();
            if (A0y || A132 == obj) {
                A132 = C86154wM.A0z(r4, 28);
                A0Y.A14(A132);
            }
            A00(r6, r7, modifier2, AnonymousClass7W3.A0A(A0Y, A132, false), r10, (i3 & 14) | ((i3 << 6) & 7168), 0);
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(r10, i6, modifier2, i4, 0));
        }
    }
}
