package X;

/* renamed from: X.5MZ  reason: invalid class name */
public final class AnonymousClass5MZ extends AnonymousClass0Sf implements C27636Eqn {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MZ) {
                AnonymousClass5MZ r8 = (AnonymousClass5MZ) obj;
                if (!C04220Ms.A0I(this.A02, r8.A02) || this.A01 != r8.A01 || !C04220Ms.A0I(this.A03, r8.A03) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Ae0() {
        return this.A02;
    }

    public final int hashCode() {
        return ((C86104wH.A06(C18180wK.A03(this.A02), this.A01) + AnonymousClass0wJ.A06(this.A03)) * 31) + this.A00;
    }

    public AnonymousClass5MZ(int i, String str, String str2, long j) {
        this.A02 = str;
        this.A01 = j;
        this.A03 = str2;
        this.A00 = i;
    }
}
