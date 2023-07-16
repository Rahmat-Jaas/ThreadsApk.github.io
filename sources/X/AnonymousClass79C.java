package X;

/* renamed from: X.79C  reason: invalid class name */
public final class AnonymousClass79C {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass79C) || j != ((AnonymousClass79C) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0G("Size(packedValue=", ')', this.A00);
    }

    public /* synthetic */ AnonymousClass79C(long j) {
        this.A00 = j;
    }

    public static final float A00(long j) {
        return Float.intBitsToFloat(C86104wH.A08(j));
    }
}
