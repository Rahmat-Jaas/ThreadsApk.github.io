package com.facebook.redex;

import X.AnonymousClass6E8;
import X.AnonymousClass6FM;
import X.AnonymousClass74R;
import X.AnonymousClass7AW;
import X.AnonymousClass8bI;
import X.C121767Ia;
import X.C134747yH;
import X.C146848mx;
import X.C86104wH;
import X.C86134wK;
import X.C86154wM;
import kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2;

public class IDxSAdjustmentShape145S0000000_2_I2 implements C146848mx {
    public final int A00;

    public IDxSAdjustmentShape145S0000000_2_I2(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r9 != X.C86104wH.A08(r1)) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.AnonymousClass7AW r6, int r7, int r8, int r9, int r10, boolean r11, boolean r12) {
        /*
            r5 = this;
            if (r7 != r8) goto L_0x0003
            return r9
        L_0x0003:
            int r3 = r6.A04(r7)
            int r0 = r6.A04(r9)
            if (r3 != r0) goto L_0x0028
            r0 = -1
            if (r8 == r0) goto L_0x0018
            if (r7 == r8) goto L_0x005e
            r0 = r11 ^ r12
            if (r0 == 0) goto L_0x005a
            if (r7 >= r8) goto L_0x005e
        L_0x0018:
            long r1 = r6.A08(r9)
            int r0 = X.C86104wH.A07(r1)
            if (r9 == r0) goto L_0x0028
            int r0 = X.C86104wH.A08(r1)
            if (r9 != r0) goto L_0x005e
        L_0x0028:
            long r1 = r6.A08(r7)
            int r4 = X.C86104wH.A07(r1)
            int r0 = r6.A04(r4)
            if (r0 == r3) goto L_0x003a
            int r4 = r6.A05(r3)
        L_0x003a:
            int r2 = X.C86104wH.A08(r1)
            int r0 = r6.A04(r2)
            r1 = 2
            if (r0 == r3) goto L_0x004a
            r0 = 0
            int r2 = r6.A06(r3, r0)
        L_0x004a:
            if (r4 == r10) goto L_0x005d
            if (r2 == r10) goto L_0x0056
            int r0 = r4 + r2
            int r0 = r0 / r1
            r11 = r11 ^ r12
            if (r11 == 0) goto L_0x0057
            if (r7 > r0) goto L_0x0059
        L_0x0056:
            return r4
        L_0x0057:
            if (r7 < r0) goto L_0x0056
        L_0x0059:
            return r2
        L_0x005a:
            if (r7 <= r8) goto L_0x005e
            goto L_0x0018
        L_0x005d:
            return r2
        L_0x005e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxSAdjustmentShape145S0000000_2_I2.A00(X.7AW, int, int, int, int, boolean, boolean):int");
    }

    public final long A82(AnonymousClass7AW r20, C121767Ia r21, int i, long j, boolean z) {
        int A07;
        int A002;
        boolean z2;
        IDxRImplShape189S0000000_2_I2 iDxRImplShape189S0000000_2_I2;
        long j2;
        long j3;
        long j4 = j;
        C121767Ia r5 = r21;
        boolean z3 = z;
        AnonymousClass7AW r9 = r20;
        switch (this.A00) {
            case 0:
                if (!C121767Ia.A02(j4)) {
                    return j4;
                }
                if (r21 != null) {
                    long j5 = r5.A00;
                    z2 = C86134wK.A1X(C86104wH.A07(j5), C86104wH.A08(j5));
                } else {
                    z2 = false;
                }
                C134747yH r0 = r9.A04.A03;
                return AnonymousClass6E8.A00(r0.A00, C86104wH.A07(j4), r0.length() - 1, z3, z2);
            case 1:
                int i2 = i;
                if (r21 == null) {
                    return AnonymousClass74R.A04.A82(r9, r5, i2, j4, z3);
                }
                if (C121767Ia.A02(j4)) {
                    C134747yH r02 = r9.A04.A03;
                    long j6 = r5.A00;
                    return AnonymousClass6E8.A00(r02.A00, C86104wH.A07(j4), r02.length() - 1, z3, C86134wK.A1X(C86104wH.A07(j6), C86104wH.A08(j6)));
                }
                if (z) {
                    A002 = C86104wH.A08(j4);
                    A07 = A00(r9, (int) (j >> 32), i2, (int) (r5.A00 >> 32), A002, true, C86134wK.A1X(C86104wH.A07(j4), C86104wH.A08(j4)));
                } else {
                    A07 = C86104wH.A07(j4);
                    A002 = A00(r9, (int) (j & 4294967295L), i2, (int) (r5.A00 & 4294967295L), A07, false, C86134wK.A1X(C86104wH.A07(j4), C86104wH.A08(j4)));
                }
                return AnonymousClass6FM.A00(A07, A002);
            case 2:
                return j4;
            case 3:
                iDxRImplShape189S0000000_2_I2 = new IDxRImplShape189S0000000_2_I2(r9.A04.A03, 1);
                break;
            default:
                iDxRImplShape189S0000000_2_I2 = new IDxRImplShape189S0000000_2_I2(r9, 2);
                break;
        }
        C134747yH r1 = r9.A04.A03;
        if (r1.length() == 0) {
            return C121767Ia.A01;
        }
        int length = r1.length() - 1;
        long j7 = ((C121767Ia) C86154wM.A0f(iDxRImplShape189S0000000_2_I2, AnonymousClass8bI.A02((int) (j >> 32), 0, length))).A00;
        long j8 = ((C121767Ia) C86154wM.A0f(iDxRImplShape189S0000000_2_I2, AnonymousClass8bI.A02((int) (j & 4294967295L), 0, length))).A00;
        boolean A1X = C86134wK.A1X(C86104wH.A07(j4), C86104wH.A08(j4));
        if (A1X) {
            j2 = j7 & 4294967295L;
        } else {
            j2 = j7 >> 32;
        }
        int i3 = (int) j2;
        if (A1X) {
            j3 = j8 >> 32;
        } else {
            j3 = j8 & 4294967295L;
        }
        return AnonymousClass6FM.A00(i3, (int) j3);
    }
}
