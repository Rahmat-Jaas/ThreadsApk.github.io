package X;

/* renamed from: X.08a  reason: invalid class name and case insensitive filesystem */
public final class C016808a extends AnonymousClass0DW {
    public long A00;
    public long A01;
    public long A02;
    public long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C016808a r7 = (C016808a) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00 && this.A03 == r7.A03 && this.A02 == r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A01(AnonymousClass0DW r1) {
        A04((C016808a) r1);
        return this;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A02(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        C016808a r52 = (C016808a) r5;
        C016808a r62 = (C016808a) r6;
        if (r62 == null) {
            r62 = new C016808a();
        }
        if (r52 == null) {
            r62.A04(this);
            return r62;
        }
        r62.A01 = this.A01 - r52.A01;
        r62.A00 = this.A00 - r52.A00;
        r62.A03 = this.A03 - r52.A03;
        r62.A02 = this.A02 - r52.A02;
        return r62;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        C016808a r52 = (C016808a) r5;
        C016808a r62 = (C016808a) r6;
        if (r62 == null) {
            r62 = new C016808a();
        }
        if (r52 == null) {
            r62.A04(this);
            return r62;
        }
        r62.A01 = this.A01 + r52.A01;
        r62.A00 = this.A00 + r52.A00;
        r62.A03 = this.A03 + r52.A03;
        r62.A02 = this.A02 + r52.A02;
        return r62;
    }

    public final void A04(C016808a r3) {
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A02 = r3.A02;
        this.A03 = r3.A03;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = this.A00;
        long j3 = this.A03;
        long j4 = this.A02;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkMetrics{mobileBytesTx=");
        sb.append(this.A01);
        sb.append(", mobileBytesRx=");
        sb.append(this.A00);
        sb.append(", wifiBytesTx=");
        sb.append(this.A03);
        sb.append(", wifiBytesRx=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
