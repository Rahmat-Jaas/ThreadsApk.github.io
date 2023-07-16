package X;

/* renamed from: X.0Ac  reason: invalid class name and case insensitive filesystem */
public final class C02170Ac extends AnonymousClass0DW {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C02170Ac r7 = (C02170Ac) obj;
            if (!(this.A03 == r7.A03 && this.A05 == r7.A05 && this.A09 == r7.A09 && this.A0A == r7.A0A && this.A07 == r7.A07 && this.A08 == r7.A08 && this.A04 == r7.A04 && this.A06 == r7.A06 && this.A00 == r7.A00 && this.A02 == r7.A02 && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A01(AnonymousClass0DW r1) {
        A04((C02170Ac) r1);
        return this;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A02(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        C02170Ac r52 = (C02170Ac) r5;
        C02170Ac r62 = (C02170Ac) r6;
        if (r62 == null) {
            r62 = new C02170Ac();
        }
        if (r52 == null) {
            r62.A04(this);
            return r62;
        }
        r62.A03 = this.A03 - r52.A03;
        r62.A05 = this.A05 - r52.A05;
        r62.A09 = this.A09 - r52.A09;
        r62.A0A = this.A0A - r52.A0A;
        r62.A07 = this.A07 - r52.A07;
        r62.A08 = this.A08 - r52.A08;
        r62.A04 = this.A04 - r52.A04;
        r62.A06 = this.A06 - r52.A06;
        r62.A00 = this.A00 - r52.A00;
        r62.A02 = this.A02 - r52.A02;
        r62.A01 = this.A01 - r52.A01;
        return r62;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        C02170Ac r52 = (C02170Ac) r5;
        C02170Ac r62 = (C02170Ac) r6;
        if (r62 == null) {
            r62 = new C02170Ac();
        }
        if (r52 == null) {
            r62.A04(this);
            return r62;
        }
        r62.A03 = this.A03 + r52.A03;
        r62.A05 = this.A05 + r52.A05;
        r62.A09 = this.A09 + r52.A09;
        r62.A0A = this.A0A + r52.A0A;
        r62.A07 = this.A07 + r52.A07;
        r62.A08 = this.A08 + r52.A08;
        r62.A04 = this.A04 + r52.A04;
        r62.A06 = this.A06 + r52.A06;
        r62.A00 = this.A00 + r52.A00;
        r62.A02 = this.A02 + r52.A02;
        r62.A01 = this.A01 + r52.A01;
        return r62;
    }

    public final void A04(C02170Ac r3) {
        this.A03 = r3.A03;
        this.A05 = r3.A05;
        this.A09 = r3.A09;
        this.A0A = r3.A0A;
        this.A07 = r3.A07;
        this.A08 = r3.A08;
        this.A04 = r3.A04;
        this.A06 = r3.A06;
        this.A00 = r3.A00;
        this.A02 = r3.A02;
        this.A01 = r3.A01;
    }

    public final int hashCode() {
        long j = this.A03;
        long j2 = this.A05;
        long j3 = this.A09;
        long j4 = this.A0A;
        long j5 = this.A07;
        long j6 = this.A08;
        long j7 = this.A04;
        long j8 = this.A06;
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A01;
        return (((((((((((((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (i ^ (i >>> 32))) * 31) + (i2 ^ (i2 >>> 32))) * 31) + (i3 ^ (i3 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatdMetrics{connectedCount=");
        sb.append(this.A03);
        sb.append(", disconnectedCount=");
        sb.append(this.A05);
        sb.append(", sendBytes=");
        sb.append(this.A09);
        sb.append(", sendCount=");
        sb.append(this.A0A);
        sb.append(", receieveBytes=");
        sb.append(this.A07);
        sb.append(", receiveCount=");
        sb.append(this.A08);
        sb.append(", connectedDuration=");
        sb.append(this.A04);
        sb.append(", misfiredEventCount=");
        sb.append(this.A06);
        sb.append(", chatdActiveRadioTimeS=");
        sb.append(this.A00);
        sb.append(", chatdTailRadioTimeS=");
        sb.append(this.A02);
        sb.append(", chatdRadioWakeupCount=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }
}
