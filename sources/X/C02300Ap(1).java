package X;

/* renamed from: X.0Ap  reason: invalid class name and case insensitive filesystem */
public final class C02300Ap {
    public final C02290Ao A00;
    public final C02540Bv A01;

    public final void A01(AnonymousClass0LH[] r8, int i) {
        int i2 = 0;
        while (i > 0) {
            C02290Ao r5 = this.A00;
            int i3 = i;
            C02280An r0 = r5.A02;
            if (r0 == null) {
                i3 = Math.min(i, r5.A04);
            } else {
                int i4 = r0.A00;
                int i5 = i4 + i;
                int i6 = r5.A04;
                if (i5 > i6) {
                    if (i4 < i6) {
                        i3 = i6 - i4;
                    } else {
                        int i7 = r5.A03;
                        if (i7 <= i5) {
                            i3 = Math.max(1, i7 - i4);
                        }
                    }
                }
            }
            r5.A05(r8, i2, i3);
            A00(this);
            i2 += i3;
            i -= i3;
        }
    }

    public static void A00(C02300Ap r4) {
        C02540Bv r3 = r4.A01;
        C02290Ao r2 = r4.A00;
        r3.CmS(r2.A07());
        r3.Bi1();
        C02280An r0 = r2.A02;
        if (r0 != null && r0.A00 >= r2.A04) {
            r3.Bhx();
        }
        C02280An r02 = r2.A02;
        if (r02 != null && r02.A00 >= r2.A03) {
            r2.A02();
        }
    }

    public C02300Ap(C02290Ao r1, C02540Bv r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
