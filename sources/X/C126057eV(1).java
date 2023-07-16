package X;

/* renamed from: X.7eV  reason: invalid class name and case insensitive filesystem */
public final class C126057eV implements C03870Ld {
    public final /* synthetic */ C126077eX A00;

    public final void C05(long j) {
        C126077eX r8 = this.A00;
        double d = r8.A04;
        long max = Math.max(Math.round(((double) j) / d), 1);
        long min = Math.min(max - 1, 100);
        double d2 = (double) min;
        r8.A01 += d2;
        if (min > 4) {
            r8.A00 += d2 / 4.0d;
        }
        r8.A02 = (long) (((double) r8.A02) + (d * ((double) max)));
    }

    public C126057eV(C126077eX r1) {
        this.A00 = r1;
    }
}
