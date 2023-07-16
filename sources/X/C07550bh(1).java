package X;

/* renamed from: X.0bh  reason: invalid class name and case insensitive filesystem */
public final class C07550bh implements C05190Ru {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final C07560bi A04;
    public final C07710bx A05;
    public final String A06;
    public final int A07;
    public final long A08;
    public final C07690bv A09;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C07550bh r8 = (C07550bh) obj;
            return this.A08 == r8.A08 && this.A07 == r8.A07;
        }
        return false;
    }

    public final Object AyK(int i, int i2) {
        return this.A05.AyJ(i);
    }

    public final boolean BOQ() {
        if (this.A03 != -1) {
            return true;
        }
        return false;
    }

    public final boolean BOa(C05190Ru r4) {
        if (!(r4 instanceof C07550bh)) {
            return false;
        }
        C07550bh r42 = (C07550bh) r4;
        if (!this.A09.equals(r42.A09) || !this.A05.equals(r42.A05)) {
            return false;
        }
        return true;
    }

    public final boolean BUI(int i) {
        if ((i & this.A00) != 0) {
            return true;
        }
        return false;
    }

    public final void close() {
        int i;
        ThreadLocal threadLocal = this.A04.A00;
        C07660bs r4 = (C07660bs) threadLocal.get();
        if (r4 != null && (i = r4.A00) != 0) {
            Object[] objArr = r4.A01;
            int i2 = i - 1;
            if (objArr[i2] == this) {
                objArr[i2] = null;
                r4.A00 = i2;
                if (i2 == 0 && objArr.length > 64) {
                    threadLocal.set((Object) null);
                }
                C07620bo r0 = C07650br.A02;
                if (r0 != null) {
                    r0.BtC(this);
                }
            }
        }
    }

    public final int hashCode() {
        long j = this.A08;
        return (((int) (j ^ (j >>> 32))) * 31) + this.A07;
    }

    public C07550bh(C07560bi r1, C07690bv r2, C07710bx r3, String str, int i, int i2, int i3, int i4, long j, long j2) {
        this.A06 = str;
        this.A03 = j;
        this.A01 = i;
        this.A08 = j2;
        this.A07 = i2;
        this.A00 = i3;
        this.A09 = r2;
        this.A05 = r3;
        this.A02 = i4;
        this.A04 = r1;
    }

    public final int Abd() {
        return this.A07;
    }

    public final long Abj() {
        return this.A08;
    }

    public final int B04() {
        return this.A01;
    }

    public final long B06() {
        return this.A03;
    }

    public final int BIZ() {
        return this.A02;
    }

    public final String getTag() {
        return this.A06;
    }
}
