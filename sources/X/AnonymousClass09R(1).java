package X;

/* renamed from: X.09R  reason: invalid class name */
public final class AnonymousClass09R extends AnonymousClass0DW {
    public double A00;
    public double A01;
    public double A02;
    public double A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass09R r6 = (AnonymousClass09R) obj;
            if (!(Double.compare(r6.A02, this.A02) == 0 && Double.compare(r6.A03, this.A03) == 0 && Double.compare(r6.A00, this.A00) == 0 && Double.compare(r6.A01, this.A01) == 0)) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A01(AnonymousClass0DW r1) {
        A06((AnonymousClass09R) r1);
        return this;
    }

    /* renamed from: A04 */
    public final AnonymousClass09R A02(AnonymousClass09R r5, AnonymousClass09R r6) {
        if (r6 == null) {
            r6 = new AnonymousClass09R();
        }
        if (r5 == null) {
            r6.A06(this);
            return r6;
        }
        r6.A02 = this.A02 - r5.A02;
        r6.A03 = this.A03 - r5.A03;
        r6.A00 = this.A00 - r5.A00;
        r6.A01 = this.A01 - r5.A01;
        return r6;
    }

    /* renamed from: A05 */
    public final AnonymousClass09R A03(AnonymousClass09R r5, AnonymousClass09R r6) {
        if (r6 == null) {
            r6 = new AnonymousClass09R();
        }
        if (r5 == null) {
            r6.A06(this);
            return r6;
        }
        r6.A02 = this.A02 + r5.A02;
        r6.A03 = this.A03 + r5.A03;
        r6.A00 = this.A00 + r5.A00;
        r6.A01 = this.A01 + r5.A01;
        return r6;
    }

    public final void A06(AnonymousClass09R r3) {
        this.A03 = r3.A03;
        this.A02 = r3.A02;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A02);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.A03);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.A00);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.A01);
        return (i3 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CpuMetrics{userTimeS=");
        sb.append(this.A03);
        sb.append(", systemTimeS=");
        sb.append(this.A02);
        sb.append(", childUserTimeS=");
        sb.append(this.A01);
        sb.append(", childSystemTimeS=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
