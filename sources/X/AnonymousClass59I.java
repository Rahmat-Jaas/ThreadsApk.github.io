package X;

/* renamed from: X.59I  reason: invalid class name */
public final class AnonymousClass59I extends C104236bS {
    public final Throwable A00;

    public AnonymousClass59I(Throwable th) {
        super(false);
        this.A00 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass59I) {
            AnonymousClass59I r3 = (AnonymousClass59I) obj;
            if (this.A00 != r3.A00 || !C04220Ms.A0I(this.A00, r3.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C86124wJ.A04(this.A00 ? 1 : 0));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Error(endOfPaginationReached=");
        A0s.append(this.A00);
        A0s.append(", error=");
        return C86104wH.A0y(this.A00, A0s);
    }
}
