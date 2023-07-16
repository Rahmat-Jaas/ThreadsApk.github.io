package X;

/* renamed from: X.7HB  reason: invalid class name */
public final class AnonymousClass7HB {
    public static final long A01 = C86104wH.A0C(Float.NaN, Float.NaN);
    public static final long A02;
    public final long A00;

    static {
        float f = (float) 0;
        A02 = C86104wH.A0C(f, f);
    }

    public static final float A00(long j) {
        if (j != A01) {
            return Float.intBitsToFloat(C86104wH.A08(j));
        }
        throw C18180wK.A0a("DpSize is unspecified");
    }

    public static final float A01(long j) {
        if (j != A01) {
            return C86104wH.A00(j);
        }
        throw C18180wK.A0a("DpSize is unspecified");
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass7HB) || j != ((AnonymousClass7HB) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        if (j == A01) {
            return "DpSize.Unspecified";
        }
        StringBuilder A0r = C18200wM.A0r();
        C134847yT.A02(A0r, A01(j));
        A0r.append(" x ");
        return C18200wM.A0m(C134847yT.A01(A00(j)), A0r);
    }

    public /* synthetic */ AnonymousClass7HB(long j) {
        this.A00 = j;
    }
}
