package X;

/* renamed from: X.19N  reason: invalid class name */
public final class AnonymousClass19N extends AnonymousClass0Sf implements C82534pr {
    public final int A00;
    public final long A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass19N(String str, int i, long j, boolean z) {
        C04220Ms.A0B(str, 4);
        this.A03 = z;
        this.A01 = j;
        this.A00 = i;
        this.A02 = str;
    }

    public final AnonymousClass19N D4A() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass19N) {
                AnonymousClass19N r8 = (AnonymousClass19N) obj;
                if (!(this.A03 == r8.A03 && this.A01 == r8.A01 && this.A00 == r8.A00 && C04220Ms.A0I(this.A02, r8.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A03;
        if (z) {
            z = true;
        }
        return C18210wN.A05(this.A02, (((((z ? 1 : 0) * true) + C18190wL.A02(this.A01)) * 31) + this.A00) * 31);
    }
}
