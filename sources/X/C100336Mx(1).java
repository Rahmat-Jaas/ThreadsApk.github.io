package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape0S1112000_I2;

/* renamed from: X.6Mx  reason: invalid class name and case insensitive filesystem */
public final class C100336Mx {
    public static final void A00(C147188nY r33, Modifier modifier, String str, int i, int i2, boolean z) {
        int i3;
        String A02;
        Modifier modifier2 = modifier;
        C147188nY r4 = r33;
        r4.Cvd(-33652774);
        int i4 = i2;
        String str2 = str;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r4, str2) | i;
        } else {
            i3 = i5;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0M(r4, z2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r4, modifier2);
        }
        if ((i3 & 731) != 146 || !r4.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (z) {
                r4.Cvb(286755722);
                A02 = AnonymousClass7JS.A01(r4, 2131822229);
            } else {
                r4.Cvb(286755799);
                A02 = AnonymousClass7JS.A02(r4, str2, 2131822192);
            }
            AnonymousClass7W3 A04 = AnonymousClass7W3.A04(r4, false);
            float f = (float) 0;
            Modifier A06 = AnonymousClass7Kq.A06(AnonymousClass7K4.A05(modifier2, f, (float) 12, f, f), (float) 28);
            C146288ly A0g = C147188nY.A0g(r4, AnonymousClass7KV.A04);
            Object A0p = C147188nY.A0p(r4);
            Object A0n = C147188nY.A0n(r4);
            Object A0m = C147188nY.A0m(r4);
            AnonymousClass0ZU r6 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A06);
            C147188nY.A0w(r4, A04, r6);
            AnonymousClass7W3.A0a(r4, A04, A0g, A0p);
            AnonymousClass7KP.A07(r4, A0n, A0m, A00);
            r4.Cvb(-3903938);
            C115286uo A002 = AnonymousClass6QP.A00(r4, R.drawable.instagram_reshare_pano_outline_24);
            C123327Wm r62 = Modifier.A00;
            C107766hH r7 = C103106Xv.A00;
            AnonymousClass7KB.A05(r4, AnonymousClass7Kq.A0F(AnonymousClass7K4.A05(AnonymousClass7Kq.A03(AnonymousClass7KV.A0A, AnonymousClass7Kq.A0A(r62, r7.A01), 2), f, f, r7.A00, f), 16), A002);
            C147188nY r16 = r4;
            AnonymousClass7I9.A02(r16, (Modifier) null, AnonymousClass7J9.A02(r4), (C114236su) null, (C134817yQ) null, (C121117Ee) null, A02, 0, 1, 2, 805306368, 6, 506, AnonymousClass7KB.A03(r4), 0, false);
            AnonymousClass7W3.A0v(A04, true);
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S1112000_I2(modifier2, str2, i5, i4, 1, z2));
        }
    }
}
