package X;

/* renamed from: X.0BJ  reason: invalid class name */
public final class AnonymousClass0BJ extends AnonymousClass0DW {
    public int A00;
    public int A01;
    public long A02;
    public long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AnonymousClass0BJ r8 = (AnonymousClass0BJ) obj;
                if (!(this.A01 == r8.A01 && this.A03 == r8.A03 && this.A00 == r8.A00 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A01(AnonymousClass0DW r1) {
        A04((AnonymousClass0BJ) r1);
        return this;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A02(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        AnonymousClass0BJ r52 = (AnonymousClass0BJ) r5;
        AnonymousClass0BJ r62 = (AnonymousClass0BJ) r6;
        if (r62 == null) {
            r62 = new AnonymousClass0BJ();
        }
        if (r52 == null) {
            r62.A04(this);
            return r62;
        }
        r62.A01 = this.A01 - r52.A01;
        r62.A03 = this.A03 - r52.A03;
        r62.A00 = this.A00 - r52.A00;
        r62.A02 = this.A02 - r52.A02;
        return r62;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        AnonymousClass0BJ r52 = (AnonymousClass0BJ) r5;
        AnonymousClass0BJ r62 = (AnonymousClass0BJ) r6;
        if (r62 == null) {
            r62 = new AnonymousClass0BJ();
        }
        if (r52 == null) {
            r62.A04(this);
            return r62;
        }
        r62.A01 = this.A01 + r52.A01;
        r62.A03 = this.A03 + r52.A03;
        r62.A00 = this.A00 + r52.A00;
        r62.A02 = this.A02 + r52.A02;
        return r62;
    }

    public final void A04(AnonymousClass0BJ r3) {
        this.A01 = r3.A01;
        this.A03 = r3.A03;
        this.A00 = r3.A00;
        this.A02 = r3.A02;
    }

    public final int hashCode() {
        long j = this.A03;
        long j2 = this.A02;
        return (((((this.A01 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A00) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BluetoothMetrics{bleScanCount=");
        sb.append(this.A01);
        sb.append(", bleScanDurationMs=");
        sb.append(this.A03);
        sb.append(", bleOpportunisticScanCount=");
        sb.append(this.A00);
        sb.append(", bleOpportunisticScanDurationMs=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
