package X;

/* renamed from: X.6tN  reason: invalid class name and case insensitive filesystem */
public final class C114486tN {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114486tN) {
                C114486tN r5 = (C114486tN) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return C86134wK.A0l(this.A01, this.A00, "Interval(start=", ", end=");
    }

    public C114486tN(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (!C86114wI.A1S(i)) {
            throw C18190wL.A0a("Failed requirement.");
        } else if (i2 < i) {
            throw C18190wL.A0a("Failed requirement.");
        }
    }
}
