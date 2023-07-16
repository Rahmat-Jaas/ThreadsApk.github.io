package X;

/* renamed from: X.18g  reason: invalid class name */
public final class AnonymousClass18g extends AnonymousClass0Sf implements C82134p8 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public AnonymousClass18g(int i, String str, String str2, int i2) {
        C04220Ms.A0B(str2, 3);
        this.A00 = i;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = i2;
    }

    public final AnonymousClass18g D0d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18g) {
                AnonymousClass18g r5 = (AnonymousClass18g) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A03, ((this.A00 * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + this.A01;
    }
}
