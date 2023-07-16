package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import kotlin.jvm.internal.KtLambdaShape0S1402000_I2;
import kotlin.jvm.internal.KtLambdaShape1S1001000_I2;

/* renamed from: X.6Lz  reason: invalid class name and case insensitive filesystem */
public final class C100106Lz {
    public static final void A00(C147258p3 r26, C147188nY r27, Modifier modifier, C968166u r29, String str, AnonymousClass0ZU r31, int i, int i2) {
        int i3;
        long j;
        long j2;
        C147258p3 r2 = r26;
        Modifier modifier2 = modifier;
        String str2 = str;
        AnonymousClass0ZU r22 = r31;
        boolean A1Z = AnonymousClass0wJ.A1Z(str2, r22);
        C968166u r7 = r29;
        C04220Ms.A0B(r7, 2);
        C147188nY r8 = r27;
        r8.Cvd(-736024515);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r8, str2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r8, r22);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r8, r7);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0I(r8, modifier2);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= C147188nY.A0J(r8, r2);
        }
        if ((46811 & i3) != 9362 || !r8.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r2 = (C147258p3) AnonymousClass7GN.A00((AnonymousClass7W3) r8);
            }
            int A07 = C147188nY.A07(r8, r7, 154011488);
            boolean z = true;
            if (A07 == 0) {
                z = false;
            } else if (A07 != A1Z) {
                throw AnonymousClass4VZ.A00();
            }
            Modifier modifier3 = Modifier.A00;
            if (z) {
                modifier3 = AnonymousClass7Ac.A02(modifier3, AnonymousClass7G5.A00((float) 10), A1Z ? 1.0f : 0.0f, C120537Bh.A00(r8).A0p);
            }
            AnonymousClass7W3 A04 = AnonymousClass7W3.A04(r8, false);
            Modifier A00 = AnonymousClass6FI.A00(C1190273f.A00(r2, AnonymousClass7Kq.A05(modifier2), 0.3f, A1Z).Cx6(modifier3), C139318Nm.A00, A1Z);
            C874352s A002 = AnonymousClass7G5.A00((float) 10);
            r8.Cvb(1584306148);
            if (A07 == 0) {
                j = C120537Bh.A01(r8, 975897833).A0h;
            } else if (A07 == A1Z) {
                j = C120537Bh.A01(r8, 975897897).A0d;
            } else {
                r8.Cvb(975894363);
                AnonymousClass7W3.A0w(A04, false);
                throw AnonymousClass4VZ.A00();
            }
            AnonymousClass7W3.A0w(A04, false);
            AnonymousClass7W3.A0w(A04, false);
            r8.Cvb(408158555);
            if (A07 != 0) {
                j2 = C120537Bh.A01(r8, 99609498).A0h;
            } else {
                j2 = C120537Bh.A01(r8, 99609428).A0d;
            }
            AnonymousClass7W3.A0w(A04, false);
            AnonymousClass7W3.A0w(A04, false);
            AnonymousClass70T.A00((AnonymousClass79L) null, (C142668fO) null, r2, r8, A00, A002, r22, AnonymousClass7JR.A00(r8, new KtLambdaShape1S1001000_I2(str2, i3, 3), 837209112), 817889280 | ((i3 >> 3) & 14) | ((i3 << 6) & 3670016), 288, j, j2, false);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            ((AnonymousClass7WO) AKE).A06 = new KtLambdaShape0S1402000_I2(r7, r22, r2, modifier2, str2, i5, i4, A1Z ? 1 : 0);
        }
    }
}
