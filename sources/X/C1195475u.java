package X;

/* renamed from: X.75u  reason: invalid class name and case insensitive filesystem */
public final class C1195475u {
    public final float A00;
    public final float A01;
    public final C147168nV A02;

    public static final double A00(C1195475u r5, float f) {
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (r5.A00 * r5.A01)));
    }

    public C1195475u(C147168nV r4, float f) {
        this.A00 = f;
        this.A02 = r4;
        this.A01 = r4.Acr() * 386.0878f * 160.0f * 0.84f;
    }
}
