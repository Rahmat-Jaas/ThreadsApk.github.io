package X;

/* renamed from: X.0eK  reason: invalid class name and case insensitive filesystem */
public final class C08800eK {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public final C03710Kk A04;
    public final C08810eL A05;
    public final C08810eL A06;
    public final C08810eL A07;
    public final C08810eL A08;

    public static void A00(C08800eK r6, long j) {
        C08810eL r0 = r6.A05;
        long A002 = r0.A00(j);
        r0.A00 = 0;
        r6.A00 = Math.max(A002, r6.A00);
        C08810eL r02 = r6.A06;
        long A003 = r02.A00(j);
        r02.A00 = 0;
        r6.A01 = Math.max(A003, r6.A01);
        C08810eL r03 = r6.A07;
        long A004 = r03.A00(j);
        r03.A00 = 0;
        r6.A02 = Math.max(A004, r6.A02);
        C08810eL r04 = r6.A08;
        long A005 = r04.A00(j);
        r04.A00 = 0;
        r6.A03 = Math.max(A005, r6.A03);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeenStateTimeInfo{mPhoto10ViewedDuration=");
        sb.append(this.A00);
        sb.append(", mPhoto25ViewedDuration=");
        sb.append(this.A01);
        sb.append(", mPhoto50ViewedDuration=");
        sb.append(this.A02);
        sb.append(", mPhoto75ViewedDuration=");
        sb.append(this.A03);
        sb.append('}');
        return sb.toString();
    }

    public C08800eK(C08800eK r3) {
        this.A04 = r3.A04;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A02 = r3.A02;
        this.A03 = r3.A03;
        this.A05 = new C08810eL(r3.A05);
        this.A06 = new C08810eL(r3.A06);
        this.A07 = new C08810eL(r3.A07);
        this.A08 = new C08810eL(r3.A08);
    }

    public C08800eK() {
        this.A04 = C08820eM.A00();
        this.A05 = new C08810eL(0.1f);
        this.A06 = new C08810eL(0.25f);
        this.A07 = new C08810eL(0.5f);
        this.A08 = new C08810eL(0.75f);
    }
}
