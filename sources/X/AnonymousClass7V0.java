package X;

/* renamed from: X.7V0  reason: invalid class name */
public final class AnonymousClass7V0 implements C147268p4 {
    public final float A00;
    public final float A01;
    public final AnonymousClass0YP A02;
    public final boolean A03;

    public final void A9G(C147168nV r7, int[] iArr, int[] iArr2, int i) {
        C04220Ms.A0B(r7, 0);
        AnonymousClass0wJ.A1Q(iArr, iArr2);
        A9H(r7, AnonymousClass69J.Ltr, iArr, iArr2, i);
    }

    public final void A9H(C147168nV r11, AnonymousClass69J r12, int[] iArr, int[] iArr2, int i) {
        int i2;
        int i3;
        AnonymousClass0YP r1;
        C04220Ms.A0B(r11, 0);
        AnonymousClass0wJ.A1Q(iArr, r12);
        C04220Ms.A0B(iArr2, 4);
        int length = iArr.length;
        if (length != 0) {
            int CfL = r11.CfL(this.A00);
            if (this.A03) {
                i3 = 0;
                i2 = 0;
                if (r12 == AnonymousClass69J.Rtl) {
                    for (int i4 = length - 1; -1 < i4; i4--) {
                        int i5 = iArr[i4];
                        int min = Math.min(i3, i - i5);
                        iArr2[i4] = min;
                        i2 = Math.min(CfL, (i - min) - i5);
                        i3 = min + i5 + i2;
                    }
                    int i6 = i3 - i2;
                    r1 = this.A02;
                    if (r1 != null && i6 < i) {
                        int A04 = AnonymousClass0wJ.A04(r1.invoke(Integer.valueOf(i - i6), r12));
                        int length2 = iArr2.length;
                        for (int i7 = 0; i7 < length2; i7++) {
                            iArr2[i7] = iArr2[i7] + A04;
                        }
                        return;
                    }
                }
            }
            int i8 = 0;
            i3 = 0;
            int i9 = 0;
            do {
                int i10 = iArr[i8];
                int min2 = Math.min(i3, i - i10);
                iArr2[i9] = min2;
                i2 = Math.min(CfL, (i - min2) - i10);
                i3 = min2 + i10 + i2;
                i8++;
                i9++;
            } while (i8 < length);
            int i62 = i3 - i2;
            r1 = this.A02;
            if (r1 != null) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7V0) {
                AnonymousClass7V0 r5 = (AnonymousClass7V0) obj;
                if (!C18180wK.A1W(Float.compare(this.A00, r5.A00)) || this.A03 != r5.A03 || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final float BD3() {
        return this.A01;
    }

    public final int hashCode() {
        int A032 = C86134wK.A03(this.A00);
        boolean z = this.A03;
        if (z) {
            z = true;
        }
        return ((A032 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A02);
    }

    public AnonymousClass7V0(AnonymousClass0YP r1, float f, boolean z) {
        this.A00 = f;
        this.A03 = z;
        this.A02 = r1;
        this.A01 = f;
    }

    public final String toString() {
        String str;
        StringBuilder A0r = C18200wM.A0r();
        if (this.A03) {
            str = "";
        } else {
            str = "Absolute";
        }
        A0r.append(str);
        A0r.append("Arrangement#spacedAligned(");
        C134847yT.A02(A0r, this.A00);
        C86144wL.A1T(A0r);
        return C86104wH.A0y(this.A02, A0r);
    }
}
