package X;

/* renamed from: X.0fg  reason: invalid class name and case insensitive filesystem */
public final class C09540fg {
    public double A00 = -1.0d;
    public boolean A01;
    public int A02;
    public final int A03 = ((int) Math.ceil(((double) 1) / 0.18181818181818182d));

    public final void A00(double d) {
        double d2;
        this.A01 = true;
        double d3 = (double) 1;
        double d4 = d3 - 0.18181818181818182d;
        int i = this.A02;
        int i2 = this.A03;
        double d5 = this.A00;
        if (i > i2) {
            d2 = (d5 * d4) + (0.18181818181818182d * d);
        } else {
            double d6 = (double) i;
            d2 = (((d5 * d6) * d4) + d) / ((d6 * d4) + d3);
        }
        this.A00 = d2;
        this.A02 = i + 1;
    }
}
