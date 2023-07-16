package X;

/* renamed from: X.0W5  reason: invalid class name */
public abstract class AnonymousClass0W5 {
    public long A00;
    public long A01;
    public final AnonymousClass0Wg[] A02;
    public final AnonymousClass0K1 A03;
    public final AnonymousClass0K1 A04;
    public final C12020lB A05;
    public final C12440lu A06;

    public int A03(AnonymousClass0Wg r2) {
        return 0;
    }

    public abstract int[] A04(AnonymousClass0Wg r1);

    public AnonymousClass0W5(C12020lB r19, C12440lu r20, AnonymousClass0Wg[] r21) {
        int length;
        AnonymousClass0Wg[] r13 = r21;
        this.A02 = r13;
        C12020lB r2 = r19;
        this.A05 = r2;
        this.A06 = r20;
        if (r21 == null || (length = r13.length) == 0) {
            this.A04 = null;
            this.A03 = null;
            this.A00 = 0;
            this.A01 = 0;
        } else if (length <= 64) {
            if (length > 58 && r19 != null) {
                r2.A06(new IllegalArgumentException(AnonymousClass00U.A0S("We are reaching limit of listeners: ", " registered", length)));
            }
            C12390lo r11 = new C12390lo(30);
            this.A04 = r11;
            C12390lo r10 = new C12390lo(4);
            this.A03 = r10;
            long j = 1;
            int i = 0;
            long j2 = 0;
            long j3 = 0;
            do {
                int[] A042 = A04(r21[i]);
                if (A042 != null) {
                    for (int i2 : A042) {
                        if (i2 == -1) {
                            j2 |= j;
                        } else if (i2 != -2) {
                            r11.put(i2, r11.get(i2, 0) | j);
                        }
                        j3 |= j;
                    }
                }
                i++;
                j <<= 1;
            } while (i < length);
            this.A00 = j2;
            this.A01 = j3;
            long j4 = 1;
            int i3 = 0;
            do {
                int A032 = A03(r21[i3]);
                if (A032 != 0) {
                    r10.put(A032, r10.get(A032, 0) | j4);
                }
                i3++;
                j4 <<= 1;
            } while (i3 < length);
        } else {
            throw new UnsupportedOperationException("We support up to 64 listeners");
        }
    }

    public final long A01(int i) {
        AnonymousClass0K1 r1 = this.A04;
        if (r1 == null || this.A02 == null) {
            return 0;
        }
        return r1.get(i, 0) | this.A01;
    }

    public final long A02(int i, int i2) {
        AnonymousClass0K1 r6;
        AnonymousClass0K1 r4 = this.A04;
        if (r4 == null || this.A02 == null || (r6 = this.A03) == null) {
            return 0;
        }
        return r6.get(i2, 0) | this.A00 | r4.get(i, 0);
    }
}
