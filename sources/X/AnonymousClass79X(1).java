package X;

/* renamed from: X.79X  reason: invalid class name */
public final class AnonymousClass79X {
    public static final AnonymousClass79X A02 = new AnonymousClass79X(2, false);
    public static final AnonymousClass79X A03 = new AnonymousClass79X(1, true);
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass79X) {
                AnonymousClass79X r5 = (AnonymousClass79X) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + C86124wJ.A04(this.A01 ? 1 : 0);
    }

    public final String toString() {
        if (equals(A02)) {
            return "TextMotion.Static";
        }
        if (equals(A03)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }

    public AnonymousClass79X(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
