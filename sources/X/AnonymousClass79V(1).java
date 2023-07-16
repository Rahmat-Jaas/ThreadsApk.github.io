package X;

/* renamed from: X.79V  reason: invalid class name */
public final class AnonymousClass79V {
    public static final AnonymousClass79V A02 = new AnonymousClass79V(AnonymousClass7HB.A01);
    public final long A00;
    public final boolean A01 = true;

    public AnonymousClass79V(long j) {
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass79V) && this.A00 == ((AnonymousClass79V) obj).A00 && C18180wK.A1W(Float.compare(Float.NaN, Float.NaN)));
    }

    public final int hashCode() {
        int A06 = C86104wH.A06(C86124wJ.A04(1) * 31, this.A00);
        int floatToIntBits = Float.floatToIntBits(Float.NaN);
        return ((((((A06 + floatToIntBits) * 31) + floatToIntBits) * 31) + 1231) * 31) + 1237;
    }

    public final String toString() {
        return "MagnifierStyle.TextDefault";
    }
}
