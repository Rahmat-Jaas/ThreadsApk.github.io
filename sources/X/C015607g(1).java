package X;

/* renamed from: X.07g  reason: invalid class name and case insensitive filesystem */
public final class C015607g extends AnonymousClass0DW {
    public double A00;
    public long A01;
    public long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C015607g r7 = (C015607g) obj;
            if (!(Double.compare(r7.A00, this.A00) == 0 && this.A01 == r7.A01 && this.A02 == r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A01(AnonymousClass0DW r1) {
        A06((C015607g) r1);
        return this;
    }

    /* renamed from: A04 */
    public final C015607g A02(C015607g r5, C015607g r6) {
        if (r6 == null) {
            r6 = new C015607g();
        }
        if (r5 == null) {
            r6.A06(this);
            return r6;
        }
        r6.A00 = this.A00 - r5.A00;
        r6.A01 = this.A01 - r5.A01;
        r6.A02 = this.A02 - r5.A02;
        return r6;
    }

    /* renamed from: A05 */
    public final C015607g A03(C015607g r5, C015607g r6) {
        if (r6 == null) {
            r6 = new C015607g();
        }
        if (r5 == null) {
            r6.A06(this);
            return r6;
        }
        r6.A00 = r5.A00 + this.A00;
        r6.A01 = r5.A01 + this.A01;
        r6.A02 = r5.A02 + this.A02;
        return r6;
    }

    public final void A06(C015607g r3) {
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A02 = r3.A02;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A00);
        long j = this.A01;
        long j2 = this.A02;
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Consumption{powerMah=");
        sb.append(this.A00);
        sb.append(", activeTimeMs=");
        sb.append(this.A01);
        sb.append(", wakeUpTimeMs=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
