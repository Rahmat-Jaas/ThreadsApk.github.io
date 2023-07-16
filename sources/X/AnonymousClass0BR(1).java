package X;

/* renamed from: X.0BR  reason: invalid class name */
public final class AnonymousClass0BR {
    public final C02290Ao A00;
    public final C02540Bv A01;
    public final AnonymousClass0BQ A02;

    public final void A01(long[] jArr, AnonymousClass0LH[] r9, int i) {
        int i2 = 0;
        while (i > 0) {
            C02290Ao r6 = this.A00;
            int i3 = i;
            C02280An r0 = r6.A02;
            if (r0 == null) {
                i3 = Math.min(i, r6.A04);
            } else {
                int i4 = r0.A00;
                int i5 = i4 + i;
                int i6 = r6.A04;
                if (i5 > i6) {
                    if (i4 < i6) {
                        i3 = i6 - i4;
                    } else {
                        int i7 = r6.A03;
                        if (i7 <= i5) {
                            i3 = Math.max(1, i7 - i4);
                        }
                    }
                }
            }
            r6.A05(r9, i2, i3);
            int i8 = i2 + i3;
            C02540Bv r1 = this.A01;
            r1.CmS(r6.A07());
            r1.Bi3(jArr, i2, i8);
            A00(this);
            i -= i3;
            i2 = i8;
        }
    }

    public static void A00(AnonymousClass0BR r2) {
        C02290Ao r22 = r2.A00;
        C02280An r0 = r22.A02;
        if (r0 != null && r0.A00 >= r22.A03) {
            r22.A02();
        }
    }

    public AnonymousClass0BR(C02290Ao r1, AnonymousClass0BQ r2, C02540Bv r3) {
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r2;
    }
}
