package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape0S1112000_I2;

/* renamed from: X.6Mk  reason: invalid class name and case insensitive filesystem */
public final class C100206Mk {
    public static final void A00(C147188nY r34, Modifier modifier, String str, int i, int i2, boolean z) {
        int i3;
        String A02;
        Modifier modifier2 = modifier;
        C147188nY r3 = r34;
        r3.Cvd(231267578);
        int i4 = i2;
        String str2 = str;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r3, str2) | i;
        } else {
            i3 = i5;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0M(r3, z2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r3, modifier2);
        }
        if ((i3 & 731) != 146 || !r3.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (z) {
                r3.Cvb(604119832);
                A02 = AnonymousClass7JS.A01(r3, 2131822229);
            } else {
                r3.Cvb(604119909);
                A02 = AnonymousClass7JS.A02(r3, str2, 2131822192);
            }
            AnonymousClass7W3 A04 = AnonymousClass7W3.A04(r3, false);
            int i7 = ((i3 >> 6) & 14) | 384;
            C146288ly A0g = C147188nY.A0g(r3, AnonymousClass7KV.A04);
            Object A0p = C147188nY.A0p(r3);
            Object A0n = C147188nY.A0n(r3);
            Object A0m = C147188nY.A0m(r3);
            AnonymousClass0ZU r7 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01((i7 << 3) & 112);
            C147188nY.A0w(r3, A04, r7);
            AnonymousClass7W3.A0a(r3, A04, A0g, A0p);
            AnonymousClass7KP.A08(r3, A0n, A0m, A00, A01);
            int A05 = C86124wJ.A05(i7);
            r3.Cvb(-1958193826);
            if ((A05 & 81) != 16 || !r3.BCM()) {
                float f = (float) 0;
                AnonymousClass7KB.A06(r3, AnonymousClass7Kq.A0F(AnonymousClass7K4.A05(AnonymousClass7Kq.A03(AnonymousClass7KV.A0A, AnonymousClass7Kq.A0A(Modifier.A00, (float) 20), 2), f, f, (float) 4, f), 16), AnonymousClass6QP.A00(r3, R.drawable.instagram_reshare_pano_outline_24));
                C147188nY r17 = r3;
                AnonymousClass7I9.A02(r17, (Modifier) null, AnonymousClass7J9.A02(r3), (C114236su) null, (C134817yQ) null, (C121117Ee) null, A02, 0, 1, 2, 805306368, 6, 506, AnonymousClass7KB.A03(r3), 0, false);
            } else {
                r3.CuJ();
            }
            AnonymousClass7W3.A0f(A04);
        } else {
            r3.CuJ();
        }
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S1112000_I2(modifier2, str2, i5, i4, 0, z2));
        }
    }
}
