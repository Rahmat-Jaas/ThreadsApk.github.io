package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape0S1312000_I2;

/* renamed from: X.6Nr  reason: invalid class name and case insensitive filesystem */
public final class C100536Nr {
    public static final void A00(C147188nY r22, Modifier modifier, Integer num, String str, AnonymousClass0ZU r26, int i, int i2, boolean z) {
        int i3;
        C115286uo r19;
        boolean z2 = z;
        String str2 = str;
        AnonymousClass0ZU r7 = r26;
        boolean A1Z = AnonymousClass0wJ.A1Z(r7, str2);
        Modifier modifier2 = modifier;
        C04220Ms.A0B(modifier2, 3);
        C147188nY r9 = r22;
        r9.Cvd(1396762330);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r9, r7) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r9, str2);
        }
        Integer num2 = num;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r9, num2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0I(r9, modifier2);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= C147188nY.A0P(r9, z2);
        }
        if ((46811 & i3) != 9362 || !r9.BCM()) {
            z2 = C18240wQ.A1R(i6, z2);
            Modifier A03 = AnonymousClass7HZ.A03(modifier2, r7, false);
            C146288ly A06 = AnonymousClass7KV.A06(r9);
            Object A0p = C147188nY.A0p(r9);
            Object A0n = C147188nY.A0n(r9);
            Object A0m = C147188nY.A0m(r9);
            AnonymousClass0ZU r2 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A03);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r9;
            C147188nY.A0w(r9, r3, r2);
            AnonymousClass7W3.A0a(r9, r3, A06, A0p);
            AnonymousClass7KP.A07(r9, A0n, A0m, A00);
            AnonymousClass7VA r23 = AnonymousClass7VA.A00;
            C123327Wm A02 = Modifier.A02(r9, -528237762);
            Modifier A002 = C146818mu.A00(r23, A02, A1Z);
            if (num != null) {
                r19 = AnonymousClass6QP.A00(r9, num2.intValue());
            } else {
                r19 = null;
            }
            C147188nY r17 = r9;
            AnonymousClass70S.A00(r17, A002, r19, (C142508ey) null, str2, (String) null, 32768 | ((i3 >> 3) & 14), 44, false);
            int i7 = R.drawable.chevron_right;
            if (z2) {
                i7 = R.drawable.instagram_external_link_pano_outline_16;
            }
            AnonymousClass7KB.A05(r9, AnonymousClass7K4.A08(r23.A00(AnonymousClass7KV.A04, A02), 16), AnonymousClass6QP.A00(r9, i7));
            AnonymousClass7W3.A0v(r3, A1Z);
        } else {
            r9.CuJ();
        }
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S1312000_I2(modifier2, num2, r7, str2, i5, i4, 2, z2));
        }
    }
}
