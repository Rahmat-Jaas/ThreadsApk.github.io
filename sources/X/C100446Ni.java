package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;

/* renamed from: X.6Ni  reason: invalid class name and case insensitive filesystem */
public final class C100446Ni {
    public static final void A00(C147188nY r43, Modifier modifier, AnonymousClass0ZU r45, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r4 = r45;
        C04220Ms.A0B(r4, 0);
        C147188nY r10 = r43;
        r10.Cvd(527201657);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r10, r4) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r10, modifier2);
        }
        if ((i3 & 91) != 18 || !r10.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            Modifier A07 = AnonymousClass7Kq.A07(modifier2, (float) 40);
            C146288ly A072 = AnonymousClass7KV.A07(r10, false);
            Object A0p = C147188nY.A0p(r10);
            Object A0n = C147188nY.A0n(r10);
            Object A0m = C147188nY.A0m(r10);
            AnonymousClass0ZU r2 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A07);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r10;
            C147188nY.A0w(r10, r0, r2);
            AnonymousClass7W3.A0a(r10, r0, A072, A0p);
            AnonymousClass7KP.A07(r10, A0n, A0m, A00);
            AnonymousClass7V3 r22 = AnonymousClass7V3.A00;
            r10.Cvb(935714483);
            String A01 = AnonymousClass7JS.A01(r10, 2131822177);
            C134817yQ r14 = C134817yQ.A08;
            C123327Wm r1 = Modifier.A00;
            AnonymousClass7I9.A02(r10, r22.A86(AnonymousClass7KV.A0B, r1), AnonymousClass7J9.A04(r10), (C114236su) null, r14, (C121117Ee) null, A01, 0, 0, 0, 196608, 0, 2012, 0, 0, false);
            String A012 = AnonymousClass7JS.A01(r10, 2131822176);
            long A04 = AnonymousClass7KB.A04(r10);
            Modifier A86 = r22.A86(AnonymousClass7KV.A0A, r1);
            boolean A0y = C147188nY.A0y(r10, r4);
            Object A13 = r0.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0K(r0, r4, 29);
            }
            AnonymousClass7I9.A02(r10, C117646z1.A00(A86, (AnonymousClass799) null, (String) null, AnonymousClass7W3.A08(r0, A13, false), 15, false), AnonymousClass7J9.A04(r10), (C114236su) null, r14, (C121117Ee) null, A012, 0, 0, 0, 196608, 0, 2008, A04, 0, false);
            AnonymousClass7W3.A0f(r0);
        } else {
            r10.CuJ();
        }
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(modifier2, i5, r4, i4, 22));
        }
    }
}
