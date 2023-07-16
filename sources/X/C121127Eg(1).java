package X;

/* renamed from: X.7Eg  reason: invalid class name and case insensitive filesystem */
public final class C121127Eg {
    public static final long A01 = AnonymousClass7Hh.A00(0, 0);
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C121127Eg) || j != ((C121127Eg) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        return C86134wK.A0l(C86104wH.A07(j), C86104wH.A08(j), "(", ", ");
    }

    public /* synthetic */ C121127Eg(long j) {
        this.A00 = j;
    }

    public static final int A00(long j) {
        return C86104wH.A08(j);
    }
}
