package X;

/* renamed from: X.79F  reason: invalid class name */
public final class AnonymousClass79F {
    public static final long A01 = C86104wH.A0C(0.5f, 0.5f);
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass79F) || j != ((AnonymousClass79F) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0G("TransformOrigin(packedValue=", ')', this.A00);
    }

    public /* synthetic */ AnonymousClass79F(long j) {
        this.A00 = j;
    }
}
