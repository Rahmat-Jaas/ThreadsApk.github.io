package X;

/* renamed from: X.7yT  reason: invalid class name and case insensitive filesystem */
public final class C134847yT implements Comparable {
    public final float A00;

    public static C134847yT A00(float f) {
        return new C134847yT(f);
    }

    public static final boolean A03(float f) {
        return C18180wK.A1W(Float.compare(f, Float.NaN));
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.compare(this.A00, ((C134847yT) obj).A00);
    }

    public final boolean equals(Object obj) {
        float f = this.A00;
        if (!(obj instanceof C134847yT) || Float.compare(f, ((C134847yT) obj).A00) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return A01(this.A00);
    }

    public /* synthetic */ C134847yT(float f) {
        this.A00 = f;
    }

    public static String A01(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(f);
        return C18180wK.A0i(".dp", A0r);
    }

    public static void A02(StringBuilder sb, float f) {
        sb.append(A01(f));
    }
}
