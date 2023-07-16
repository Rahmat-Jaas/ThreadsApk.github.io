package X;

/* renamed from: X.18c  reason: invalid class name */
public final class AnonymousClass18c extends AnonymousClass0Sf implements C21545Bw9 {
    public final int A00;
    public final String A01;
    public final String A02;

    public final AnonymousClass18c D0H() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18c) {
                AnonymousClass18c r5 = (AnonymousClass18c) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int getCount() {
        return this.A00;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, AnonymousClass0wJ.A07(this.A01, this.A00 * 31));
    }

    public AnonymousClass18c(int i, String str, String str2) {
        AnonymousClass0wJ.A1Q(str, str2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }
}
