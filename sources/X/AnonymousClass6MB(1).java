package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;

/* renamed from: X.6MB  reason: invalid class name */
public final class AnonymousClass6MB {
    public static final void A00(C147188nY r38, Modifier modifier, AnonymousClass0ZU r40, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r39 = r40;
        C04220Ms.A0B(r39, 0);
        C147188nY r0 = r38;
        r0.Cvd(1085670741);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r0, r39) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r0, modifier2);
        }
        if ((i3 & 91) != 18 || !r0.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            int i7 = ((i3 >> 3) & 14) | 384;
            C146288ly A0g = C147188nY.A0g(r0, AnonymousClass7KV.A04);
            AnonymousClass534 A0a = C147188nY.A0a(r0);
            Object AEA = r0.AEA(A0a);
            AnonymousClass534 r11 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r11);
            AnonymousClass534 r10 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r10);
            AnonymousClass0ZU r8 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01((i7 << 3) & 112);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r1, r8);
            r1.A0T = false;
            AnonymousClass0YP r5 = AnonymousClass74X.A03;
            AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r0, A0g, AEA, r5);
            AnonymousClass0YP r4 = AnonymousClass74X.A02;
            AnonymousClass0YP A012 = AnonymousClass7Ak.A01(r0, AEA2, r4);
            int A003 = AnonymousClass7KP.A00(r0, AEA3, A012, A00, A01);
            int A05 = C86124wJ.A05(i7);
            r0.Cvb(-1103790663);
            if ((A05 & 81) != 16 || !r0.BCM()) {
                C142878fk r9 = AnonymousClass7KV.A00;
                C123327Wm r13 = Modifier.A00;
                Modifier A04 = Modifier.A04(r13);
                C146288ly A004 = AnonymousClass72M.A00(C147188nY.A0V(r0), r0, r9);
                Object A0s = C147188nY.A0s(r0, A0a);
                Object AEA4 = r0.AEA(r11);
                Object AEA5 = r0.AEA(r10);
                AnonymousClass0YM A005 = C98236Es.A00(A04);
                C147188nY.A0w(r0, r1, r8);
                r1.A0T = false;
                AnonymousClass7Ak.A02(r0, A004, r5);
                AnonymousClass7Ak.A02(r0, A0s, A002);
                C86104wH.A1R(AnonymousClass7KP.A03(r0, AEA4, AEA5, r4, A012), r0, A005, 0);
                r0.Cvb(A003);
                r0.Cvb(676303023);
                C147188nY r18 = r0;
                AnonymousClass7I9.A02(r18, (Modifier) null, AnonymousClass7J9.A02(r0), (C114236su) null, (C134817yQ) null, (C121117Ee) null, AnonymousClass7JS.A01(r0, 2131836072), 0, 0, 0, 0, 0, 2042, AnonymousClass7KB.A03(r0), 0, false);
                float f = (float) 0;
                Modifier A052 = AnonymousClass7K4.A05(r13, f, (float) 4, f, f);
                boolean A0y = C147188nY.A0y(r0, r39);
                Object A13 = r1.A13();
                if (A0y || A13 == AnonymousClass7GN.A00) {
                    A13 = AnonymousClass7W3.A0F(r1, r39, 34);
                }
                C147188nY r20 = r0;
                AnonymousClass7I9.A02(r20, C117646z1.A00(A052, (AnonymousClass799) null, (String) null, AnonymousClass7W3.A08(r1, A13, false), 15, false), AnonymousClass7J9.A04(r0), (C114236su) null, (C134817yQ) null, (C121117Ee) null, AnonymousClass7JS.A01(r0, 2131836953), 0, 0, 0, 0, 0, 2040, AnonymousClass7KB.A03(r0), 0, false);
                AnonymousClass7W3.A0f(r1);
            } else {
                r0.CuJ();
            }
            AnonymousClass7W3.A0f(r1);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(modifier2, i5, r39, i4, 11));
        }
    }
}
