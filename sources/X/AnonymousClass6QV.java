package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape0S0222000_I2;

/* renamed from: X.6QV  reason: invalid class name */
public final class AnonymousClass6QV {
    public static final void A00(C147188nY r14, Modifier modifier, AnonymousClass0YY r16, int i, int i2, boolean z, boolean z2) {
        int i3;
        C115286uo A00;
        long j;
        boolean z3 = z2;
        Modifier modifier2 = modifier;
        AnonymousClass0YY r6 = r16;
        C04220Ms.A0B(r6, 0);
        C147188nY r2 = r14;
        r14.Cvd(-316680913);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r14, r6) | i;
        } else {
            i3 = i5;
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0M(r14, z4);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r14, modifier);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0O(r14, z3);
        }
        if ((i3 & 5851) != 1170 || !r14.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            z3 = C86154wM.A1Z(i7, z3);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r2;
            Modifier A002 = AnonymousClass6E2.A00((C142668fO) null, (C147258p3) AnonymousClass7GN.A01(r0, r0.A13()), AnonymousClass6EV.A00(modifier2, C18230wP.A00(z3 ? 1 : 0)), (AnonymousClass799) null, r6, z4, z3);
            if (z4) {
                r2.Cvb(-1363091473);
                A00 = AnonymousClass6QP.A00(r2, R.drawable.instagram_circle_check_pano_filled_24);
                j = C120537Bh.A00(r2).A03;
            } else {
                r2.Cvb(-1363091239);
                A00 = AnonymousClass6QP.A00(r2, R.drawable.checkbox);
                j = C120537Bh.A00(r2).A0l;
            }
            C1190173e.A00(r2, A002, A00, (String) null, 56, 0, j);
            AnonymousClass7W3.A0w(r0, false);
        } else {
            r14.CuJ();
        }
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S0222000_I2(r6, modifier2, i5, i4, 2, z4, z3));
        }
    }
}
