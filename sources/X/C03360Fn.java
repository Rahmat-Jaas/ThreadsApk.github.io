package X;

/* renamed from: X.0Fn  reason: invalid class name and case insensitive filesystem */
public final class C03360Fn implements C11730ki {
    public final long A00;
    public final C11730ki A01;

    public final long BKH(C05800Wc r5) {
        return Math.min(this.A01.BKH(r5), this.A00);
    }

    public final String getName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01.getName());
        sb.append(".capped_");
        sb.append(this.A00);
        return sb.toString();
    }

    public C03360Fn(C11730ki r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
