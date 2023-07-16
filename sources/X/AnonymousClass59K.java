package X;

/* renamed from: X.59K  reason: invalid class name */
public final class AnonymousClass59K extends C104236bS {
    public static final AnonymousClass59K A00 = new AnonymousClass59K(true);
    public static final AnonymousClass59K A01 = new AnonymousClass59K(false);

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass59K) || this.A00 != ((C104236bS) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A04(this.A00 ? 1 : 0);
    }

    public final String toString() {
        return AnonymousClass00U.A0H("NotLoading(endOfPaginationReached=", ')', this.A00);
    }

    public AnonymousClass59K(boolean z) {
        super(z);
    }
}
