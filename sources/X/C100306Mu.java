package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape0S1312000_I2;

/* renamed from: X.6Mu  reason: invalid class name and case insensitive filesystem */
public final class C100306Mu {
    public static final void A00(C147188nY r31, Modifier modifier, AnonymousClass67X r33, String str, AnonymousClass0ZU r35, int i, int i2, boolean z) {
        int i3;
        String str2;
        Modifier modifier2 = modifier;
        AnonymousClass67X r8 = r33;
        AnonymousClass0ZU r7 = r35;
        AnonymousClass0wJ.A1M(r7, 0, r8);
        C147188nY r0 = r31;
        r0.Cvd(-569434336);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r0, r7) | i;
        } else {
            i3 = i5;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r0, str3);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r0, r8);
        }
        int i6 = i2 & 8;
        boolean z2 = z;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0O(r0, z2);
        }
        int i7 = i4 & 16;
        if (i7 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= C147188nY.A0J(r0, modifier2);
        }
        if ((46811 & i3) != 9362 || !r0.BCM()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            float f = (float) 16;
            float f2 = (float) 0;
            Modifier A05 = AnonymousClass7K4.A05(C100346My.A00(r0, modifier2, z2), f2, f, f, f);
            C146288ly A0g = C147188nY.A0g(r0, AnonymousClass7KV.A04);
            Object A0p = C147188nY.A0p(r0);
            Object A0n = C147188nY.A0n(r0);
            Object A0m = C147188nY.A0m(r0);
            AnonymousClass0ZU r9 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A05);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r2, r9);
            AnonymousClass7W3.A0a(r0, r2, A0g, A0p);
            AnonymousClass7KP.A07(r0, A0n, A0m, A00);
            AnonymousClass7VA r10 = AnonymousClass7VA.A00;
            r0.Cvb(39550596);
            C115286uo A002 = AnonymousClass6QP.A00(r0, R.drawable.instagram_error_pano_outline_24);
            C123327Wm r5 = Modifier.A00;
            C147188nY r17 = r0;
            C1190173e.A00(r17, AnonymousClass7Kq.A0F(AnonymousClass7Kq.A03((Alignment) null, AnonymousClass7Kq.A04(r5), 3), 18), A002, (String) null, 56, 8, 0);
            if (r8 == AnonymousClass67X.WaitingForAutoRetry) {
                str2 = AnonymousClass7JS.A01(r0, 2131822082);
            } else if (str == null) {
                str2 = AnonymousClass7JS.A01(r0, 2131822080);
            } else {
                str2 = str3;
            }
            AnonymousClass7I9.A02(r17, r10.DB5(r5, 1.0f, true), (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 0, 0, 0, 0, 4092, 0, 0, false);
            if (r8 == AnonymousClass67X.CanManualRetry) {
                String A01 = AnonymousClass7JS.A01(r0, 2131822081);
                Modifier A052 = AnonymousClass7K4.A05(r5, f, f2, f2, f2);
                boolean A0y = C147188nY.A0y(r0, r7);
                Object A13 = r2.A13();
                if (A0y || A13 == AnonymousClass7GN.A00) {
                    A13 = AnonymousClass7W3.A0H(r2, r7, 9);
                }
                AnonymousClass7I9.A02(r0, C117646z1.A00(A052, (AnonymousClass799) null, (String) null, AnonymousClass7W3.A08(r2, A13, false), 15, false), (C121807If) null, (C114236su) null, C134817yQ.A01, (C121117Ee) null, A01, 0, 0, 0, 196608, 0, 4060, 0, 0, false);
            }
            AnonymousClass7W3.A0v(r2, true);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S1312000_I2(r7, modifier2, r8, str3, i5, i4, 0, z2));
        }
    }
}
