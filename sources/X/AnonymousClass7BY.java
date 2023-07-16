package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape27S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0402000_I2;
import kotlin.jvm.internal.KtLambdaShape3S1201000_I2;
import kotlin.jvm.internal.KtLambdaShape7S0501000_I2;

/* renamed from: X.7BY  reason: invalid class name */
public final class AnonymousClass7BY {
    public static final void A02(C147188nY r30, Modifier modifier, C971468c r32, C169839tz r33, AnonymousClass0YY r34, int i, int i2) {
        int i3;
        int i4;
        Modifier modifier2 = modifier;
        C169839tz r13 = r33;
        AnonymousClass0YY r3 = r34;
        boolean A1Z = AnonymousClass0wJ.A1Z(r13, r3);
        C971468c r15 = r32;
        C04220Ms.A0B(r15, 2);
        C147188nY r0 = r30;
        r0.Cvd(951247070);
        int i5 = i2;
        int i6 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r0, r13) | i;
        } else {
            i3 = i6;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r0, r3);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 896) == 0) {
            i3 |= C147188nY.A0H(r0, r15);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i3 |= C147188nY.A0I(r0, modifier2);
        }
        if ((i3 & 5851) != 1170 || !r0.BCM()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            Object AEA = r0.AEA(AnonymousClass7DE.A05);
            AnonymousClass7W3 A0Y = C147188nY.A0Y(r0);
            Object A13 = A0Y.A13();
            Object obj = AnonymousClass7GN.A00;
            if (A13 == obj) {
                A13 = AnonymousClass7WR.A00(A0Y, false);
            }
            AnonymousClass7W3.A0w(A0Y, false);
            C81784oM r7 = (C81784oM) A13;
            r0.Cvb(418586927);
            if (C86104wH.A1X(r7)) {
                boolean A0z = C147188nY.A0z(r0, r7, 1157296644);
                Object A132 = A0Y.A13();
                if (A0z || A132 == obj) {
                    A132 = AnonymousClass7W3.A0G(A0Y, r7, 18);
                }
                AnonymousClass6DO.A00(r0, AnonymousClass7W3.A09(A0Y, A132, false), 0, A1Z ? 1 : 0, false);
                Alignment alignment = AnonymousClass7KV.A08;
                boolean A0z2 = C147188nY.A0z(r0, r7, 1157296644);
                Object A133 = A0Y.A13();
                if (A0z2 || A133 == obj) {
                    A133 = AnonymousClass7W3.A0G(A0Y, r7, 19);
                }
                A00(r0, alignment, r15, r13, AnonymousClass7W3.A08(A0Y, A133, false), C86154wM.A0y(AEA, r7, r3, 38), (i3 & 14) | 48 | ((i3 << 6) & 57344));
            }
            AnonymousClass7W3.A0w(A0Y, false);
            int ordinal = r15.ordinal();
            if (ordinal == 0) {
                r0.Cvb(418587641);
                i4 = 2131821891;
                if (r13 == C169839tz.PrivacyStatusPrivate) {
                    i4 = 2131821898;
                }
            } else if (ordinal == A1Z) {
                r0.Cvb(418587943);
                i4 = 2131821897;
            } else if (ordinal == 2) {
                r0.Cvb(418588072);
                i4 = 2131821892;
            } else {
                r0.Cvb(418584553);
                AnonymousClass7W3.A0w(A0Y, false);
                throw AnonymousClass4VZ.A00();
            }
            String A01 = AnonymousClass7JS.A01(r0, i4);
            AnonymousClass7W3.A0w(A0Y, false);
            boolean A0z3 = C147188nY.A0z(r0, r7, 1157296644);
            Object A134 = A0Y.A13();
            if (A0z3 || A134 == obj) {
                A134 = AnonymousClass7W3.A0G(A0Y, r7, 20);
            }
            C147188nY r16 = r0;
            AnonymousClass7I9.A02(r16, C117646z1.A00(modifier2, (AnonymousClass799) null, (String) null, AnonymousClass7W3.A08(A0Y, A134, false), 15, false), (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, A01, 0, 0, 0, 0, 0, 4088, AnonymousClass7KB.A03(r0), 0, false);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0402000_I2(modifier2, r13, r15, r3, i6, i5, 10));
        }
    }

    public static final void A00(C147188nY r16, Alignment alignment, C971468c r18, C169839tz r19, AnonymousClass0ZU r20, AnonymousClass0YY r21, int i) {
        int i2;
        C147188nY r10 = r16;
        r10.Cvd(-537559695);
        int i3 = i;
        C169839tz r4 = r19;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r10, r4) | i;
        } else {
            i2 = i3;
        }
        AnonymousClass0ZU r7 = r20;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0B(r10, r7);
        }
        AnonymousClass0YY r8 = r21;
        if ((i3 & 7168) == 0) {
            i2 |= C147188nY.A0C(r10, r8);
        }
        if ((i2 & 5771) != 1154 || !r10.BCM()) {
            C1188572n.A00(r10, AnonymousClass7ZP.A00, (C1201478v) null, r7, AnonymousClass7JR.A00(r10, new KtLambdaShape27S0201000_I2(i2, 37, r4, r8), -417751921), ((i2 >> 3) & 112) | 3078, 4);
        } else {
            r10.CuJ();
        }
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape7S0501000_I2(r4, r18, alignment, r7, r8, i3, 1));
        }
    }

    public static final void A01(C147188nY r38, Modifier modifier, C115286uo r40, String str, int i) {
        C147188nY r5 = r38;
        r5.Cvd(1270167808);
        float f = (float) 44;
        Modifier A07 = AnonymousClass7Kq.A07(modifier, f);
        C146288ly A0g = C147188nY.A0g(r5, AnonymousClass7KV.A04);
        AnonymousClass534 A0b = C147188nY.A0b(r5, -1323940314);
        Object AEA = r5.AEA(A0b);
        AnonymousClass534 r8 = AnonymousClass7DE.A07;
        Object AEA2 = r5.AEA(r8);
        AnonymousClass534 r7 = AnonymousClass7DE.A0B;
        Object AEA3 = r5.AEA(r7);
        AnonymousClass0ZU r20 = AnonymousClass74X.A00;
        AnonymousClass0YM A00 = C98236Es.A00(A07);
        AnonymousClass7W3 r4 = (AnonymousClass7W3) r5;
        C147188nY.A0w(r5, r4, r20);
        r4.A0T = false;
        AnonymousClass0YP r15 = AnonymousClass74X.A03;
        AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r5, A0g, AEA, r15);
        AnonymousClass0YP r6 = AnonymousClass74X.A02;
        AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r5, AEA2, r6);
        Integer A05 = AnonymousClass7KP.A05(r5, AEA3, A01, A00);
        r5.Cvb(2058660585);
        AnonymousClass7VA r13 = AnonymousClass7VA.A00;
        C123327Wm A02 = Modifier.A02(r5, 2116341020);
        int i2 = i;
        String str2 = str;
        C147188nY r21 = r5;
        AnonymousClass7I9.A02(r21, AnonymousClass7K4.A06(r13.DB5(A02, 1.0f, true), (float) 16, 6), (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 0, 0, i & 14, 0, 4092, 0, 0, false);
        Modifier A09 = AnonymousClass7Kq.A09(A02, f);
        C146288ly A0h = C147188nY.A0h(r5, AnonymousClass7KV.A09);
        Object A0t = C147188nY.A0t(r5, A0b, -1323940314);
        Object AEA4 = r5.AEA(r8);
        Object AEA5 = r5.AEA(r7);
        AnonymousClass0YM A003 = C98236Es.A00(A09);
        C147188nY.A0w(r5, r4, r20);
        r4.A0T = false;
        AnonymousClass7Ak.A02(r5, A0h, r15);
        AnonymousClass7Ak.A02(r5, A0t, A002);
        A003.invoke(AnonymousClass7KP.A03(r5, AEA4, AEA5, r6, A01), r5, A05);
        r5.Cvb(2058660585);
        r5.Cvb(-528936106);
        C115286uo r72 = r40;
        C1190173e.A00(r5, AnonymousClass7Kq.A0F(A02, 18), r72, (String) null, 440, 8, 0);
        AnonymousClass7W3.A0v(r4, true);
        AnonymousClass7W3.A0v(r4, true);
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S1201000_I2((Object) r72, (Object) modifier, str2, i2, 6));
        }
    }
}
