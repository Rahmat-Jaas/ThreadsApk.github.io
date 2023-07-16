package X;

/* renamed from: X.0Fi  reason: invalid class name and case insensitive filesystem */
public final class C03310Fi implements C11730ki {
    public final long A00;
    public final C11730ki A01 = new C03320Fj();

    public final long BKH(C05800Wc r8) {
        long BKH = this.A01.BKH(r8);
        if (BKH >= this.A00) {
            return BKH;
        }
        return 0;
    }

    public final String getName() {
        return AnonymousClass00U.A08(this.A00, "durations_more_than_");
    }

    public C03310Fi(long j) {
        this.A00 = j;
    }
}
