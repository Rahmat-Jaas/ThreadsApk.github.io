package X;

/* renamed from: X.3I2  reason: invalid class name */
public final class AnonymousClass3I2 {
    public final int A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I2) {
                AnonymousClass3I2 r5 = (AnonymousClass3I2) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AnonymousClass0wJ.A03(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("IndexedValue(index=");
        A0s.append(this.A00);
        A0s.append(", value=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass3I2(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }
}
