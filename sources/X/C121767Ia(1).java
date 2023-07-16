package X;

/* renamed from: X.7Ia  reason: invalid class name and case insensitive filesystem */
public final class C121767Ia {
    public static final long A01 = AnonymousClass6FM.A00(0, 0);
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C121767Ia) || j != ((C121767Ia) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        return C86134wK.A0l(C86104wH.A07(j), C86104wH.A08(j), "TextRange(", ", ");
    }

    public /* synthetic */ C121767Ia(long j) {
        this.A00 = j;
    }

    public static final int A00(long j) {
        int A07 = C86104wH.A07(j);
        int A08 = C86104wH.A08(j);
        if (A07 > A08) {
            return A07;
        }
        return A08;
    }

    public static final int A01(long j) {
        int A07 = C86104wH.A07(j);
        int A08 = C86104wH.A08(j);
        if (A07 > A08) {
            return A08;
        }
        return A07;
    }

    public static final boolean A02(long j) {
        return AnonymousClass0wJ.A1T(C86104wH.A07(j), C86104wH.A08(j));
    }
}
