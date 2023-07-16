package X;

/* renamed from: X.0Fk  reason: invalid class name and case insensitive filesystem */
public final class C03330Fk extends C11580kR implements C11690kc {
    public final double BKG(C05800Wc r3) {
        try {
            String AQn = r3.AQn(this.A00);
            if (AQn == null) {
                return 0.0d;
            }
            return Double.parseDouble(AQn);
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    public C03330Fk(String str) {
        super(str);
    }
}
