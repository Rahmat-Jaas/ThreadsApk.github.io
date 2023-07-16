package X;

/* renamed from: X.19O  reason: invalid class name */
public final class AnonymousClass19O extends AnonymousClass0Sf implements C82684q6 {
    public final int A00;
    public final int A01;
    public final String A02;

    public AnonymousClass19O(int i, String str, int i2) {
        C04220Ms.A0B(str, 2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }

    public final AnonymousClass19O D5D() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass19O) {
                AnonymousClass19O r5 = (AnonymousClass19O) obj;
                if (!(this.A00 == r5.A00 && C04220Ms.A0I(this.A02, r5.A02) && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A02, this.A00 * 31) + this.A01;
    }
}
