package X;

import java.io.Serializable;

/* renamed from: X.4Nl  reason: invalid class name and case insensitive filesystem */
public final class C72314Nl implements Serializable {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C72314Nl) {
            C72314Nl r4 = (C72314Nl) obj;
            if (this.A00 == r4.A00 && this.A01 == r4.A01) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public C72314Nl(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
