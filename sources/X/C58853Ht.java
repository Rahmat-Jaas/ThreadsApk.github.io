package X;

/* renamed from: X.3Ht  reason: invalid class name and case insensitive filesystem */
public final class C58853Ht {
    public final boolean A00;

    public final boolean equals(Object obj) {
        boolean z = this.A00;
        if (!(obj instanceof C58853Ht) || z != ((C58853Ht) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A00;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return AnonymousClass00U.A0H("ErrorState(hasError=", ')', this.A00);
    }

    public /* synthetic */ C58853Ht(boolean z) {
        this.A00 = z;
    }
}
