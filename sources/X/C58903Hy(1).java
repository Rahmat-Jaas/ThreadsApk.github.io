package X;

/* renamed from: X.3Hy  reason: invalid class name and case insensitive filesystem */
public final class C58903Hy {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C58903Hy) {
                C58903Hy r5 = (C58903Hy) obj;
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
        return AnonymousClass00U.A0P("CdsColorData(lightColor=", ", darkColor=", ')', this.A01, this.A00);
    }

    public C58903Hy(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
