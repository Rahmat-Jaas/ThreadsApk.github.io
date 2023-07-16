package X;

/* renamed from: X.5LU  reason: invalid class name */
public final class AnonymousClass5LU extends AnonymousClass0Sf implements C142298ed {
    public final AnonymousClass3I0 A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LU) {
                AnonymousClass5LU r5 = (AnonymousClass5LU) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A05 = AnonymousClass0wJ.A05(this.A00, C18180wK.A03(this.A01));
        boolean z = this.A02;
        if (z) {
            z = true;
        }
        return A05 + (z ? 1 : 0);
    }

    public AnonymousClass5LU(AnonymousClass3I0 r1, String str, boolean z) {
        this.A01 = str;
        this.A00 = r1;
        this.A02 = z;
    }
}
