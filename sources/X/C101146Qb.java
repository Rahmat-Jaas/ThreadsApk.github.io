package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import kotlin.jvm.internal.KtLambdaShape0S0322000_I2;

/* renamed from: X.6Qb  reason: invalid class name and case insensitive filesystem */
public final class C101146Qb {
    public static final void A00(C147258p3 r25, C147188nY r26, Modifier modifier, AnonymousClass0ZU r28, int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3 = z2;
        AnonymousClass0ZU r6 = r28;
        C147258p3 r15 = r25;
        Modifier modifier2 = modifier;
        C147188nY r8 = r26;
        r8.Cvd(-1247451547);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r8, modifier2) | i;
        } else {
            i3 = i6;
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0M(r8, z4);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i6 & 896) == 0) {
            i3 |= C147188nY.A0B(r8, r6);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i3 |= C147188nY.A0O(r8, z3);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & 57344) == 0) {
            i3 |= C147188nY.A0J(r8, r15);
        }
        if ((46811 & i3) != 9362 || !r8.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r6 = null;
            }
            z3 = C86154wM.A1Z(i8, z3);
            if (i9 != 0) {
                r15 = (C147258p3) AnonymousClass7GN.A00((AnonymousClass7W3) r8);
            }
            long j = C120537Bh.A00(r8).A03;
            int i10 = i3 >> 3;
            boolean z5 = z4;
            AnonymousClass0ZU r19 = r6;
            Modifier modifier3 = modifier2;
            C147188nY r17 = r8;
            AnonymousClass74S.A00(r15, AnonymousClass6EF.A00(r8, 0, j, C120537Bh.A00(r8).A03, C121657He.A04(C86154wM.A0G(C120537Bh.A00(r8).A03), AnonymousClass7KE.A03(C120537Bh.A00(r8).A03), AnonymousClass7KE.A02(C120537Bh.A00(r8).A03), AnonymousClass7KE.A01(C120537Bh.A00(r8).A03), 0.3f)), r17, modifier3, r19, C86144wL.A04((i10 & 112) | (i10 & 14) | ((i3 << 6) & 896), i3 & 7168, i3, 57344), 0, z5, z3);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S0322000_I2(r6, modifier2, r15, i6, i4, 2, z4, z3));
        }
    }
}
