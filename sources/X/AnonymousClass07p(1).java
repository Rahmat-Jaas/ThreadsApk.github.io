package X;

/* renamed from: X.07p  reason: invalid class name */
public final class AnonymousClass07p extends AnonymousClass0DW {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AnonymousClass07p r8 = (AnonymousClass07p) obj;
                if (!(this.A04 == r8.A04 && this.A05 == r8.A05 && this.A0D == r8.A0D && this.A0C == r8.A0C && this.A06 == r8.A06 && this.A07 == r8.A07 && this.A00 == r8.A00 && this.A01 == r8.A01 && this.A0B == r8.A0B && this.A0A == r8.A0A && this.A02 == r8.A02 && this.A03 == r8.A03 && this.A08 == r8.A08 && this.A09 == r8.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A01(AnonymousClass0DW r1) {
        A04((AnonymousClass07p) r1);
        return this;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A02(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        AnonymousClass07p r52 = (AnonymousClass07p) r5;
        AnonymousClass07p r62 = (AnonymousClass07p) r6;
        if (r62 == null) {
            r62 = new AnonymousClass07p();
        }
        if (r52 == null) {
            r62.A04(this);
            return r62;
        }
        r62.A04 = this.A04 - r52.A04;
        r62.A05 = this.A05 - r52.A05;
        r62.A0D = this.A0D - r52.A0D;
        r62.A0C = this.A0C - r52.A0C;
        r62.A06 = this.A06 - r52.A06;
        r62.A07 = this.A07 - r52.A07;
        r62.A00 = this.A00 - r52.A00;
        r62.A01 = this.A01 - r52.A01;
        r62.A0B = this.A0B - r52.A0B;
        r62.A0A = this.A0A - r52.A0A;
        r62.A02 = this.A02 - r52.A02;
        r62.A03 = this.A03 - r52.A03;
        r62.A08 = this.A08 - r52.A08;
        r62.A09 = this.A09 - r52.A09;
        return r62;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        AnonymousClass07p r52 = (AnonymousClass07p) r5;
        AnonymousClass07p r62 = (AnonymousClass07p) r6;
        if (r62 == null) {
            r62 = new AnonymousClass07p();
        }
        if (r52 == null) {
            r62.A04(this);
            return r62;
        }
        r62.A04 = this.A04 + r52.A04;
        r62.A05 = this.A05 + r52.A05;
        r62.A0D = this.A0D + r52.A0D;
        r62.A0C = this.A0C + r52.A0C;
        r62.A06 = this.A06 + r52.A06;
        r62.A07 = this.A07 + r52.A07;
        r62.A00 = this.A00 + r52.A00;
        r62.A01 = this.A01 + r52.A01;
        r62.A0B = this.A0B + r52.A0B;
        r62.A0A = this.A0A + r52.A0A;
        r62.A02 = this.A02 + r52.A02;
        r62.A03 = this.A03 + r52.A03;
        r62.A08 = this.A08 + r52.A08;
        r62.A09 = this.A09 + r52.A09;
        return r62;
    }

    public final void A04(AnonymousClass07p r3) {
        this.A04 = r3.A04;
        this.A05 = r3.A05;
        this.A0D = r3.A0D;
        this.A0C = r3.A0C;
        this.A06 = r3.A06;
        this.A07 = r3.A07;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A0B = r3.A0B;
        this.A0A = r3.A0A;
        this.A02 = r3.A02;
        this.A03 = r3.A03;
        this.A08 = r3.A08;
        this.A09 = r3.A09;
    }

    public final int hashCode() {
        long j = this.A0D;
        long j2 = this.A0C;
        long j3 = this.A0B;
        long j4 = this.A0A;
        return (((((((((((((((((((((((((this.A04 * 31) + this.A05) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A06) * 31) + this.A07) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.A02) * 31) + this.A03) * 31) + this.A08) * 31) + this.A09;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProxygenMetrics{mqttFullPowerTimeS=");
        sb.append(this.A04);
        sb.append(", mqttLowPowerTimeS=");
        sb.append(this.A05);
        sb.append(", mqttTxBytes=");
        sb.append(this.A0D);
        sb.append(", mqttRxBytes=");
        sb.append(this.A0C);
        sb.append(", mqttRequestCount=");
        sb.append(this.A06);
        sb.append(", mqttWakeupCount=");
        sb.append(this.A07);
        sb.append(", ligerFullPowerTimeS=");
        sb.append(this.A00);
        sb.append(", ligerLowPowerTimeS=");
        sb.append(this.A01);
        sb.append(", ligerTxBytes=");
        sb.append(this.A0B);
        sb.append(", ligerRxBytes=");
        sb.append(this.A0A);
        sb.append(", ligerRequestCount=");
        sb.append(this.A02);
        sb.append(", ligerWakeupCount=");
        sb.append(this.A03);
        sb.append(", proxygenActiveRadioTimeS=");
        sb.append(this.A08);
        sb.append(", proxygenTailRadioTimeS=");
        sb.append(this.A09);
        sb.append('}');
        return sb.toString();
    }
}
