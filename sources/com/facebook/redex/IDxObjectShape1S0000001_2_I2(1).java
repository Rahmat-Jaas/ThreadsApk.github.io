package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass69J;
import X.AnonymousClass7J3;
import X.AnonymousClass8bA;
import X.C145048jk;
import X.C145058jl;
import X.C147168nV;
import X.C147268p4;

public class IDxObjectShape1S0000001_2_I2 implements C145048jk, C147268p4, C145058jl {
    public float A00 = ((float) 0);
    public final int A01;

    public IDxObjectShape1S0000001_2_I2(int i) {
        this.A01 = i;
    }

    public final void A9G(C147168nV r8, int[] iArr, int[] iArr2, int i) {
        switch (this.A01) {
            case 0:
                AnonymousClass0wJ.A1Q(iArr, iArr2);
                int i2 = 0;
                int i3 = 0;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                float f = ((float) (i - i3)) / ((float) 2);
                int i5 = 0;
                while (i2 < r6) {
                    int i6 = iArr[i2];
                    iArr2[i5] = AnonymousClass8bA.A02(f);
                    f += (float) i6;
                    i2++;
                    i5++;
                }
                return;
            case 1:
                AnonymousClass0wJ.A1Q(iArr, iArr2);
                AnonymousClass7J3.A03(iArr, iArr2, i, false);
                return;
            case 2:
                AnonymousClass0wJ.A1Q(iArr, iArr2);
                AnonymousClass7J3.A04(iArr, iArr2, i, false);
                return;
            default:
                AnonymousClass0wJ.A1Q(iArr, iArr2);
                int i7 = 0;
                int i8 = 0;
                for (int i9 : iArr) {
                    i8 += i9;
                }
                float f2 = ((float) (i - i8)) / ((float) (r6 + 1));
                float f3 = f2;
                int i10 = 0;
                while (i7 < r6) {
                    f3 = AnonymousClass7J3.A00(iArr2, f3, f2, i10, iArr[i7]);
                    i7++;
                    i10++;
                }
                return;
        }
    }

    public final void A9H(C147168nV r9, AnonymousClass69J r10, int[] iArr, int[] iArr2, int i) {
        int i2 = this.A01;
        AnonymousClass0wJ.A1Q(iArr, r10);
        switch (i2) {
            case 0:
                boolean A002 = AnonymousClass69J.A00(iArr2, r10);
                int i3 = 0;
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                float f = ((float) (i - i4)) / ((float) 2);
                if (!A002) {
                    int i6 = 0;
                    while (i3 < r6) {
                        int i7 = iArr[i3];
                        iArr2[i6] = AnonymousClass8bA.A02(f);
                        f += (float) i7;
                        i3++;
                        i6++;
                    }
                    return;
                }
                for (int i8 = r6 - 1; -1 < i8; i8--) {
                    int i9 = iArr[i8];
                    iArr2[i8] = AnonymousClass8bA.A02(f);
                    f += (float) i9;
                }
                return;
            case 1:
                AnonymousClass7J3.A03(iArr, iArr2, i, AnonymousClass69J.A00(iArr2, r10));
                return;
            case 2:
                AnonymousClass7J3.A04(iArr, iArr2, i, AnonymousClass69J.A00(iArr2, r10));
                return;
            default:
                boolean A003 = AnonymousClass69J.A00(iArr2, r10);
                int i10 = 0;
                int i11 = 0;
                for (int i12 : iArr) {
                    i11 += i12;
                }
                float f2 = ((float) (i - i11)) / ((float) (r6 + 1));
                float f3 = f2;
                if (!A003) {
                    float f4 = f2;
                    int i13 = 0;
                    while (i10 < r6) {
                        f4 = AnonymousClass7J3.A00(iArr2, f4, f2, i13, iArr[i10]);
                        i10++;
                        i13++;
                    }
                    return;
                }
                for (int i14 = r6 - 1; -1 < i14; i14--) {
                    f3 = AnonymousClass7J3.A00(iArr2, f3, f2, i14, iArr[i14]);
                }
                return;
        }
    }

    public final float BD3() {
        return this.A00;
    }

    public final String toString() {
        switch (this.A01) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
