package X;

/* renamed from: X.5HP  reason: invalid class name */
public final class AnonymousClass5HP extends AnonymousClass0Sf {
    public final long A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5HP) {
                AnonymousClass5HP r8 = (AnonymousClass5HP) obj;
                if (!C04220Ms.A0I(this.A02, r8.A02) || !C04220Ms.A0I(this.A01, r8.A01) || this.A00 != r8.A00 || this.A03 != r8.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A06 = C86104wH.A06(AnonymousClass0wJ.A07(this.A01, C18180wK.A03(this.A02)), this.A00);
        boolean z = this.A03;
        if (z) {
            z = true;
        }
        return A06 + (z ? 1 : 0);
    }

    public AnonymousClass5HP(long j, String str, boolean z, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
        this.A03 = z;
    }
}
