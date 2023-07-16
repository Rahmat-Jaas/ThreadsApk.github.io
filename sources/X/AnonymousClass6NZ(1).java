package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;

/* renamed from: X.6NZ  reason: invalid class name */
public final class AnonymousClass6NZ {
    public static final void A00(C147188nY r17, Modifier modifier, AnonymousClass0ZU r19, int i) {
        int i2;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r1 = r19;
        boolean A1Z = AnonymousClass0wJ.A1Z(r1, modifier2);
        C147188nY r12 = r17;
        r12.Cvd(-469252191);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r12, r1) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r12, modifier2);
        }
        if ((i2 & 91) != 18 || !r12.BCM()) {
            Modifier A04 = AnonymousClass7K4.A04(AnonymousClass73S.A00(r12, modifier2), (float) 0, (float) 16);
            C146288ly A05 = AnonymousClass7KV.A05(r12);
            Object A0p = C147188nY.A0p(r12);
            Object A0n = C147188nY.A0n(r12);
            Object A0m = C147188nY.A0m(r12);
            AnonymousClass0ZU r3 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A04);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r12;
            C147188nY.A0w(r12, r0, r3);
            AnonymousClass7W3.A0a(r12, r0, A05, A0p);
            AnonymousClass7KP.A07(r12, A0n, A0m, A00);
            r12.Cvb(1643878635);
            String A01 = AnonymousClass7JS.A01(r12, 2131830412);
            C123327Wm r32 = Modifier.A00;
            AnonymousClass54z r2 = AnonymousClass7Kq.A02;
            Modifier Cx6 = r32.Cx6(r2);
            boolean A0y = C147188nY.A0y(r12, r1);
            Object A13 = r0.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0K(r0, r1, 12);
            }
            AnonymousClass70S.A00(r12, AnonymousClass7HZ.A03(Cx6, AnonymousClass7W3.A08(r0, A13, false), false), AnonymousClass6QP.A00(r12, R.drawable.instagram_settings_pano_outline_24), (C142508ey) null, A01, (String) null, 32768, 44, false);
            AnonymousClass70S.A00(r12, r32.Cx6(r2), AnonymousClass6QP.A00(r12, R.drawable.instagram_clock_dotted_pano_outline_24), (C142508ey) null, AnonymousClass7JS.A01(r12, 2131830413), (String) null, 32816, 44, false);
            AnonymousClass70S.A00(r12, r32.Cx6(r2), AnonymousClass6QP.A00(r12, R.drawable.instagram_app_instagram_pano_outline_24), (C142508ey) null, AnonymousClass7JS.A01(r12, 2131830409), (String) null, 32816, 44, false);
            AnonymousClass7W3.A0v(r0, A1Z);
        } else {
            r12.CuJ();
        }
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, modifier2, r1, i3, 6);
        }
    }
}
