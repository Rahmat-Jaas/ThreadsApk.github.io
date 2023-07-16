package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.6Nf  reason: invalid class name and case insensitive filesystem */
public final class C100416Nf {
    public static final void A00(C147188nY r33, Modifier modifier, String str, float f, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        C04220Ms.A0B(str, 0);
        C147188nY r2 = r33;
        r2.Cvd(1459571419);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r2, str) | i;
        } else {
            i3 = i5;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0M(r2, z2);
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C86124wJ.A06(r2.ACV(f2) ? 1 : 0);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0I(r2, modifier2);
        }
        if ((i3 & 5851) != 1170 || !r2.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            int i7 = ((i3 >> 9) & 14) | 384;
            C146288ly A0g = C147188nY.A0g(r2, AnonymousClass7KV.A04);
            Object A0p = C147188nY.A0p(r2);
            Object A0n = C147188nY.A0n(r2);
            Object A0m = C147188nY.A0m(r2);
            AnonymousClass0ZU r9 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01((i7 << 3) & 112);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r2;
            C147188nY.A0w(r2, r0, r9);
            AnonymousClass7W3.A0a(r2, r0, A0g, A0p);
            AnonymousClass7KP.A08(r2, A0n, A0m, A00, A01);
            AnonymousClass7VA r92 = AnonymousClass7VA.A00;
            int A05 = C86124wJ.A05(i7);
            r2.Cvb(557659639);
            if ((A05 & 14) == 0) {
                A05 |= C147188nY.A0F(r2, r92);
            }
            if ((A05 & 91) != 18 || !r2.BCM()) {
                C123327Wm r6 = Modifier.A00;
                C147188nY r16 = r2;
                AnonymousClass7I9.A02(r16, r92.DB5(r6, 1.0f, false), (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, str, 0, 0, 0, i3 & 14, 0, 4092, 0, 0, false);
                if (z) {
                    C115286uo A002 = AnonymousClass6QP.A00(r2, R.drawable.instagram_verified_pano_filled_24);
                    float f3 = (float) 0;
                    C147188nY r17 = r2;
                    C97846Dc.A00(r17, (Alignment) null, AnonymousClass7K4.A05(AnonymousClass7Kq.A09(r6, f2), (float) 2, f3, f3, f3), C115866w2.A01(C120537Bh.A00(r2).A0D), A002, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 56);
                }
            } else {
                r2.CuJ();
            }
            AnonymousClass7W3.A0f(r0);
        } else {
            r2.CuJ();
        }
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8Rb(modifier2, str, f2, i5, i4, z2));
        }
    }
}
