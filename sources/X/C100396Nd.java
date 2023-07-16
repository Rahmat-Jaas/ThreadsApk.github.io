package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape0S1212000_I2;

/* renamed from: X.6Nd  reason: invalid class name and case insensitive filesystem */
public final class C100396Nd {
    public static final void A00(C147188nY r26, Modifier modifier, String str, AnonymousClass0ZU r29, int i, int i2, boolean z) {
        int i3;
        long j;
        String str2 = str;
        AnonymousClass0ZU r3 = r29;
        Modifier modifier2 = modifier;
        boolean A1Y = AnonymousClass0wJ.A1Y(r3, str2);
        C147188nY r11 = r26;
        r11.Cvd(1753180333);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r11, r3) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r11, str2);
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0N(r11, z2);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0I(r11, modifier2);
        }
        if ((i3 & 5851) != 1170 || !r11.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            AnonymousClass799 A00 = AnonymousClass799.A00(4);
            boolean A0y = C147188nY.A0y(r11, r3);
            AnonymousClass7W3 r8 = (AnonymousClass7W3) r11;
            Object A13 = r8.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0K(r8, r3, 24);
            }
            Modifier A03 = AnonymousClass7Kq.A03((Alignment) null, AnonymousClass7K4.A08(AnonymousClass7HZ.A02(modifier2, A00, AnonymousClass7W3.A08(r8, A13, A1Y), 3, A1Y), 8), 3);
            AnonymousClass7KB A002 = C120537Bh.A00(r11);
            if (z) {
                j = A002.A0h;
            } else {
                j = A002.A0m;
            }
            long A032 = AnonymousClass7Hi.A03(15);
            int i7 = A1Y ? 1 : 0;
            int i8 = A1Y ? 1 : 0;
            int i9 = A1Y ? 1 : 0;
            AnonymousClass7I9.A02(r11, A03, AnonymousClass7J9.A04(r11), (C114236su) null, C134817yQ.A05, C121117Ee.A01(3), str2, A1Y ? 1 : 0, i7, i8, ((i3 >> 3) & 14) | 199680, i9, 1936, j, A032, A1Y);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S1212000_I2(r3, modifier2, str2, i5, i4, 3, z2));
        }
    }
}
