package X;

/* renamed from: X.1ol  reason: invalid class name */
public final class AnonymousClass1ol extends C35122Me {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1ol) {
                AnonymousClass1ol r5 = (AnonymousClass1ol) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A03 = C18180wK.A03(this.A00);
        boolean z = this.A01;
        if (z) {
            z = true;
        }
        return A03 + (z ? 1 : 0);
    }

    public AnonymousClass1ol(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
