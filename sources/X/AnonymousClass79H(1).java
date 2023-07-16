package X;

/* renamed from: X.79H  reason: invalid class name */
public final class AnonymousClass79H {
    public static final long A01;
    public final long A00;

    static {
        long floatToIntBits = (long) Float.floatToIntBits(Float.NaN);
        A01 = (floatToIntBits & 4294967295L) | (floatToIntBits << 32);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass79H) || j != ((AnonymousClass79H) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        long j2 = A01;
        if (j == j2) {
            return "DpOffset.Unspecified";
        }
        StringBuilder A0s = C18190wL.A0s("(");
        if (j != j2) {
            C134847yT.A02(A0s, C86104wH.A00(j));
            C86144wL.A1T(A0s);
            if (j != j2) {
                return C86104wH.A0y(C134847yT.A01(Float.intBitsToFloat(C86104wH.A08(j))), A0s);
            }
            throw C18180wK.A0a("DpOffset is unspecified");
        }
        throw C18180wK.A0a("DpOffset is unspecified");
    }

    public /* synthetic */ AnonymousClass79H(long j) {
        this.A00 = j;
    }
}
