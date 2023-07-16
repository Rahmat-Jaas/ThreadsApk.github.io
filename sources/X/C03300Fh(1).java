package X;

/* renamed from: X.0Fh  reason: invalid class name and case insensitive filesystem */
public final class C03300Fh implements C11730ki, C11680kb {
    public final long A00;
    public final C11730ki A01;

    public final long BKH(C05800Wc r6) {
        if (this.A01.BKH(r6) < this.A00) {
            return 0;
        }
        return 1;
    }

    public final String getName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01.getName());
        sb.append(".if_less_than_");
        sb.append(this.A00);
        return sb.toString();
    }

    public C03300Fh(C11730ki r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final String AdE(C05800Wc r3) {
        return String.valueOf(BKH(r3));
    }
}
