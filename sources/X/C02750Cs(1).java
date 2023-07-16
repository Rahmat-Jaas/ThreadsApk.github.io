package X;

/* renamed from: X.0Cs  reason: invalid class name and case insensitive filesystem */
public final class C02750Cs {
    public static final String[] A07 = {"rchar:", "wchar:", "syscr:", "syscw:", "read_bytes:", "write_bytes:", "cancelled_write_bytes:"};
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;

    public static C02750Cs A00() {
        String[] strArr = A07;
        long[] jArr = new long[strArr.length];
        if (C03620Ka.A02("/proc/self/io", jArr, strArr)) {
            return new C02750Cs(jArr[0], jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]);
        }
        return null;
    }

    public final C02750Cs A01(C02750Cs r19) {
        C02750Cs r2 = r19;
        return new C02750Cs(this.A02 - r2.A02, this.A05 - r2.A05, this.A03 - r2.A03, this.A06 - r2.A06, this.A01 - r2.A01, this.A04 - r2.A04, this.A00 - r2.A00);
    }

    public C02750Cs(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.A02 = j;
        this.A05 = j2;
        this.A03 = j3;
        this.A06 = j4;
        this.A01 = j5;
        this.A04 = j6;
        this.A00 = j7;
    }
}
