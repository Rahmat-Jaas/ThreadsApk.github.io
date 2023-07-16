package X;

/* renamed from: X.3I7  reason: invalid class name */
public final class AnonymousClass3I7 {
    public Object A00;
    public boolean A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C18190wL.A1Y(this, obj)) {
                AnonymousClass3I7 r5 = (AnonymousClass3I7) obj;
                if (this.A01 != r5.A01 || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A01) {
            return C18230wP.A05(this.A00);
        }
        return super.hashCode();
    }

    public final String toString() {
        if (this.A01) {
            return String.valueOf(this.A00);
        }
        return "[Error] Uninitialized";
    }

    public AnonymousClass3I7(String str) {
        this.A02 = str;
    }
}
